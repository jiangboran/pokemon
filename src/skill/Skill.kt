package skill

import element.ELEMENT

abstract class Skill(){
    abstract var skill_name : String
    abstract var skill_id : Int
    abstract var skill_discription : String
    abstract var skill_pp : Int
    abstract var skill_type : SKILL_TYPE
    abstract var skill_element : ELEMENT
    abstract var skill_might : Int
    abstract var skill_hit_rate : Int
}