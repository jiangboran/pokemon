package pokemon

import element.ELEMENT
import skill.Skill

class Charmander(override var name: String, override var character: String, skills: List<Skill>) : Pokemon() {
    override var skill: List<Skill> = skills
    override var height = 60.00
    override var weight = 30.00
    override var race : String = "Charmander"
    override var uid : Int = 4
    override var element: ELEMENT = ELEMENT.FIRE
    override var level = 1
    override var physicalAttackAbility : Int = 52
    override var specialAttackAbility : Int = 43
    override var physicalDefenseAbility : Int = 60
    override var specialDefenseAbility : Int = 50
    override var speedAbility : Int = 65
    override var lifeAbility: Int = 39

}