package fight

import element.ELEMENT
import element.RELATIONSHIP_TYPE
import element.elementMultiple
import element.relationship
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

//    fun getRace() : String{return race}
//    fun setRace(race : String){this.race = race}
//    fun getElement() : ELEMENT{return element}
//    fun setElement(element: ELEMENT){this.element = element}
//    fun getLevel() : Int{return level}
//    fun setLevel(level : Int){this.level = level}
//    fun getName() : String{return name}
//    fun setName(name : String){this.name = name}
//    fun getPhysicalAttack() : Int{return physicalAttack}
//    fun setPhysicalAttack(physicalAttack : Int){this.physicalAttack = physicalAttack}
//    fun getSpecialAttack() : Int{return specialAttack}
//    fun setSpecialAttack(specialAttack : Int){this.specialAttack = specialAttack}
//    fun getPhysicalDefense() : Int{return physicalDefense}
//    fun setPhysicalDefense(physicalDefense : Int){this.physicalDefense = physicalDefense}
//    fun getSpecialDefense() : Int{return specialDefense}
//    fun setSpecialDefense(specialDefense : Int){this.specialDefense = specialDefense}
//    fun getSpeed() : Int{return speed}
//    fun setSpeed(speed : Int){this.speed = speed}
//    fun getLife() : Int{return life}
//    fun setLife(life : Int){this.life = life}
    fun alive() : Boolean{return this.life > 0}
    fun useSkill(skill: Skill, component: Pokefighter) {
        var basicHurt : Int = 0
        var finalHurt : Int = 0
        if (skill is Pound){
            println(name + "使用了撞击！")
            Thread.sleep(1000)
            basicHurt = (((level*2/5+2))*skill.skill_might*physicalAttack/component.physicalDefense/50+2)*(85..100).random()/100
//            finalHurt = (basicHurt * elementMultiple(relationship(element,component.getElement()))).roundToInt()
            finalHurt = (basicHurt * elementMultiple(relationship(element,component.element))).roundToInt()
//            component.setLife(component.getLife()-finalHurt)
            component.life = component.life - finalHurt
            println("对" + component.name + "造成了" + finalHurt + "点伤害！")
            Thread.sleep(1000)
//            if (relationship(element,component.getElement()) == RELATIONSHIP_TYPE.STRONG){
            if (relationship(element,component.element) == RELATIONSHIP_TYPE.STRONG) {
                println("效果拔群！")
                Thread.sleep(1000)
//            } else if (relationship(element,component.getElement()) == RELATIONSHIP_TYPE.WEAK){
            } else if (relationship(element,component.element) == RELATIONSHIP_TYPE.WEAK){
                println("效果不是很好...")
                Thread.sleep(1000)
            }
        } else if (skill.equals("absorb")){
            println(name + "使用了吸取！")
        } else if (skill.equals("fly_leaf_knife")){
            println(name + "使用了飞叶快刀！")
        } else if (skill.equals("cane_whip")){
            println(name + "使用了藤鞭！")
        }
    }
}
