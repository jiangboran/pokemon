package skill

import element.ELEMENT

class Pound() : Skill() {
    override var skill_name: String = "拍击"
    override var skill_id: Int = 1
    override var skill_discription = "使用长长的尾巴或手等拍打对手进行攻击。"
    override var skill_pp: Int =35
    override var skill_type: SKILL_TYPE =SKILL_TYPE.PHYSICAL
    override var skill_element: ELEMENT = ELEMENT.NORMAL
    override var skill_might: Int = 40
    override var skill_hit_rate: Int = 100
}