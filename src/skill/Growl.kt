package skill

import element.ELEMENT

class Growl : Skill() {
    override var skill_name: String = "叫声"
    override var skill_id: Int = 45
    override var skill_discription = "令目标的攻击降低1级。"
    override var skill_pp: Int =40
    override var skill_type: SKILL_TYPE =SKILL_TYPE.CHANGE
    override var skill_element: ELEMENT = ELEMENT.NORMAL
    override var skill_might: Int = 0
    override var skill_hit_rate: Int = 100
}