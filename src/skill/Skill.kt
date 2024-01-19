package skill

import element.ELEMENT

abstract class Skill(){
    abstract var name : String
    abstract var id : Int
    abstract var discription : String
    abstract var pp : Int
    abstract var type : SKILL_TYPE
    abstract var ability : ABILITY
    abstract var abilityChange : Int
    abstract var element : ELEMENT
    abstract var might : Int
    abstract var hitRate : Int
}