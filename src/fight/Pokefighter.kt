package fight

import element.ELEMENT
import element.RELATIONSHIP_TYPE
import element.elementMultiple
import element.relationship
import skill.ABILITY
import skill.SKILL_TYPE
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
    fun useSkill(skill: Skill, target: Pokefighter) {
        
        println(name + "对" + target.name + "使用了" + skill.name + "！")
        Thread.sleep(1000)
        when (skill.type) {
            SKILL_TYPE.PHYSICAL -> {
                physicalSkill(skill, target)
            }
            SKILL_TYPE.SPECIAL -> {
                specialSkill(skill, target)
            }
            SKILL_TYPE.CHANGE -> {
                changeSkill(skill, target)
            }
        }
        skill.pp--
    }
    private fun checkHit(skill: Skill, target: Pokefighter) : Boolean{
        return if ((0..100).random()<skill.hitRate*accuracy/target.evasion){
            true
        } else {
            false
        }
    }
    private fun checkEffect(skill: Skill, target: Pokefighter){
        if (relationship(skill.element,target.element) == RELATIONSHIP_TYPE.STRONG) {
            println("效果拔群！")
            Thread.sleep(1000)
        } else if (relationship(skill.element,target.element) == RELATIONSHIP_TYPE.WEAK){
            println("效果不是很好...")
            Thread.sleep(1000)
        }
    }
    private fun physicalSkill(skill: Skill, target: Pokefighter){
        val basicHurt : Int = (((level*2/5+2))*skill.might*physicalAttack/target.physicalDefense/50+2)*(85..100).random()/100
        val finalHurt : Int = (basicHurt * elementMultiple(relationship(element,target.element))).roundToInt()
        if (checkHit(skill,target)){
            target.life -= finalHurt
            println("对" + target.name + "造成了" + finalHurt + "点伤害！")
            Thread.sleep(1000)
            checkEffect(skill, target)
        } else {
            println("没有命中...")
            Thread.sleep(1000)
        }
    }
    private fun specialSkill(skill: Skill, target: Pokefighter){
        val basicHurt : Int = (((level*2/5+2))*skill.might*specialAttack/target.specialDefense/50+2)*(85..100).random()/100
        val finalHurt : Int = (basicHurt * elementMultiple(relationship(element,target.element))).roundToInt()
        if (checkHit(skill,target)){
            target.life -= finalHurt
            println("对" + target.name + "造成了" + finalHurt + "点伤害！")
            Thread.sleep(1000)
            checkEffect(skill, target)
        } else {
            println("没有命中...")
            Thread.sleep(1000)
        }
    }
    private fun changeSkill(skill: Skill, target: Pokefighter){
        if (checkHit(skill,target)){
            if (skill.ability == ABILITY.PHYSICAL_ATTACK_UP){
                changePhysicalAttackUp(skill, target)
            } else if (skill.ability == ABILITY.PHYSICAL_ATTACK_DOWN){
                changePhysicalAttackDown(skill, target)
            } else if (skill.ability == ABILITY.PHYSICAL_DEFENSE_UP){
                changePhysicalDefenseUp(skill, target)
            } else if (skill.ability == ABILITY.PHYSICAL_DEFENSE_DOWN){
                changePhysicalDefenseDown(skill, target)
            }
        } else {
            println("没有命中...")
            Thread.sleep(1000)
        }
    }
    private fun changePhysicalAttackUp(skill: Skill, target: Pokefighter){
        target.physicalAttackState += skill.abilityChange
        println(target.name + "的攻击提升了" + skill.abilityChange + "点！")
        Thread.sleep(1000)
    }
    private fun changePhysicalAttackDown(skill: Skill, target: Pokefighter){
        target.physicalAttackState -= skill.abilityChange
        println(target.name + "的攻击下降了" + skill.abilityChange + "点！")
        Thread.sleep(1000)
    }
    private fun changePhysicalDefenseUp(skill: Skill, target: Pokefighter) {
        target.physicalDefenseState += skill.abilityChange
        println(target.name + "的防御提升了" + skill.abilityChange + "点！")
        Thread.sleep(1000)
    }
    private fun changePhysicalDefenseDown(skill: Skill, target: Pokefighter){
        target.physicalDefenseState -= skill.abilityChange
        println(target.name + "的防御下降了" + skill.abilityChange + "点！")
        Thread.sleep(1000)
    }
}
