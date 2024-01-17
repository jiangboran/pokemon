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
        val basicHurt : Int
        val finalHurt : Int
        var hit : Boolean = true
        if (skill is Pound){
            println(name + "使用了撞击！")
            Thread.sleep(1000)
            basicHurt = (((level*2/5+2))*skill.skill_might*physicalAttack/component.physicalDefense/50+2)*(85..100).random()/100
            finalHurt = (basicHurt * elementMultiple(relationship(element,component.element))).roundToInt()
            if ((0..100).random()<skill.skill_hit_rate*accuracy/component.evasion){
                hit = true
            } else {
                hit = false
            }
            if (hit){
                component.life -= finalHurt
                println("对" + component.name + "造成了" + finalHurt + "点伤害！")
                Thread.sleep(1000)
                if (relationship(element,component.element) == RELATIONSHIP_TYPE.STRONG) {
                    println("效果拔群！")
                    Thread.sleep(1000)
                } else if (relationship(element,component.element) == RELATIONSHIP_TYPE.WEAK){
                    println("效果不是很好...")
                    Thread.sleep(1000)
                }
            } else {
                println("没有命中...")
                Thread.sleep(1000)
            }
        } else if (skill is Growl){
            println(name + "使用了鸣叫！")
            Thread.sleep(1000)
            if ((0..100).random()<skill.skill_hit_rate*accuracy/component.evasion){
                hit = true
            } else {
                hit = false
            }
            if (hit){
                component.physicalAttack--
                println(component.name + "的攻击下降了！")
                Thread.sleep(1000)
            } else {
                println("没有命中...")
                Thread.sleep(1000)
            }
        } else if (skill.equals("fly_leaf_knife")){
            println(name + "使用了飞叶快刀！")
        } else if (skill.equals("cane_whip")){
            println(name + "使用了藤鞭！")
        }
        skill.skill_pp--
    }
}
