package pokemon

import element.ELEMENT
import skill.Skill

abstract class Pokemon {
    abstract var skill: List<Skill>
    abstract var height : Double
    abstract var weight : Double
    abstract var race : String
    abstract var uid : Int
    abstract var element : ELEMENT
    abstract var character : String
    abstract var level : Int
    abstract var name : String
    abstract var physicalAttackAbility : Int
    abstract var specialAttackAbility : Int
    abstract var physicalDefenseAbility : Int
    abstract var specialDefenseAbility : Int
    abstract var speedAbility : Int
    abstract var lifeAbility : Int

}