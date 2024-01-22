package skill

import element.ELEMENT

class Growl : Skill() {
    override var name: String = "叫声"
    override var id: Int = 45
    override var discription = "令目标的攻击降低1级。"
    override var pp: Int =40
    override var type: SKILL_TYPE = SKILL_TYPE.CHANGE
    override var ability: ABILITY = ABILITY.PHYSICAL_ATTACK_DOWN
    override var abilityChange: Int = 1
    override var element: ELEMENT = ELEMENT.NORMAL
    override var might: Int = 0
    override var hitRate: Int = 100
}