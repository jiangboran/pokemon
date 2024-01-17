package pokemon

import element.ELEMENT
import skill.Skill

class Squirtle(override var name: String, override var character: String, skills: List<Skill>) : Pokemon() {
    override var skill: List<Skill> = skills
    override var height = 55.00
    override var weight = 35.00
    override var race = "Squirtle"
    override var uid = 7
    override var element: ELEMENT = ELEMENT.WATER
    override var level = 1
    override var physicalAttackAbility = 48
    override var specialAttackAbility = 65
    override var physicalDefenseAbility = 50
    override var specialDefenseAbility = 64
    override var speedAbility = 43
    override var lifeAbility = 44

}