package fight

import element.ELEMENT
import element.RELATIONSHIP_TYPE
import element.elementMultiple
import element.relationship
import skill.Growl
import skill.Pound
import skill.Skill
import kotlin.math.roundToInt

class Pokefighter {
    var skill : List<Skill> = mutableListOf()
    var race : String = "default_race"
    var element : ELEMENT = ELEMENT.NORMAL
    var level : Int = 1
    var name : String = "default_name"
    var physicalAttack : Int = 0
    var specialAttack : Int = 0
    var physicalDefense : Int = 0
    var specialDefense : Int = 0
    var speed : Int = 0
    var life : Int = 0
    var accuracy : Double = 1.0
    var evasion : Double = 1.0
    var physicalAttackState : Int = 0
    var specialAttackState : Int = 0
    var physicalDefenseState : Int = 0
    var specialDefenseState : Int = 0
    var speedState : Int = 0
    var accuracyState : Int = 0
    var evasionState : Int = 0

    fun alive() : Boolean{return this.life > 0}
    fun useSkill(skill: Skill, component: Pokefighter) {
        val basicHurt : Int = (((level*2/5+2))*skill.skill_might*physicalAttack/component.physicalDefense/50+2)*(85..100).random()/100
        val finalHurt : Int = (basicHurt * elementMultiple(relationship(element,component.element))).roundToInt()
        println(name + "对" + component.name + "使用了" + skill.skill_name + "！")
        Thread.sleep(1000)
        if (skill is Pound){
            if (checkHit(skill,component)){
                component.life -= finalHurt
                println("对" + component.name + "造成了" + finalHurt + "点伤害！")
                Thread.sleep(1000)
                checkEffect(skill, component)
            } else {
                println("没有命中...")
                Thread.sleep(1000)
            }
        } else if (skill is Growl){
            if (checkHit(skill,component)){
                component.physicalAttackState--
                println(component.name + "的攻击下降了！")
                Thread.sleep(1000)
            } else {
                println("没有命中...")
                Thread.sleep(1000)
            }
        }
        skill.skill_pp--
    }
    private fun checkHit(skill: Skill, component: Pokefighter) : Boolean{
        return if ((0..100).random()<skill.skill_hit_rate*accuracy/component.evasion){
            true
        } else {
            false
        }
    }
    private fun checkEffect(skill: Skill, component: Pokefighter){
        if (relationship(skill.skill_element,component.element) == RELATIONSHIP_TYPE.STRONG) {
            println("效果拔群！")
            Thread.sleep(1000)
        } else if (relationship(skill.skill_element,component.element) == RELATIONSHIP_TYPE.WEAK){
            println("效果不是很好...")
            Thread.sleep(1000)
        }
    }
    private fun physicalSkill(skill: Skill, component: Pokefighter){

    }
}
