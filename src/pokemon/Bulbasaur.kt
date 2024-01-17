package pokemon

import element.ELEMENT
import skill.Pound
import skill.Skill

class Bulbasaur(override var name: String, override var character: String, skills: List<Skill>) : Pokemon() {
    override var skill: List<Skill> = skills
    override var height = 50.00
    override var weight = 40.00
    override var race : String = "Bulbasaur"
    override var uid : Int = 1
    override var element : ELEMENT = ELEMENT.GRASS
    override var level : Int = 1
    override var physicalAttackAbility : Int = 49
    override var specialAttackAbility : Int = 65
    override var physicalDefenseAbility : Int = 49
    override var specialDefenseAbility : Int = 65
    override var speedAbility : Int = 45
    override var lifeAbility: Int = 45

}
