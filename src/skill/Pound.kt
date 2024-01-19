package skill

import element.ELEMENT

class Pound() : Skill() {
    override var name: String = "拍击"
    override var id: Int = 1
    override var discription = "使用长长的尾巴或手等拍打对手进行攻击。"
    override var pp: Int =35
    override var type: SKILL_TYPE =SKILL_TYPE.PHYSICAL
    override var ability: ABILITY = ABILITY.NO_CHANGE
    override var abilityChange: Int = 0
    override var element: ELEMENT = ELEMENT.NORMAL
    override var might: Int = 40
    override var hitRate: Int = 100
}