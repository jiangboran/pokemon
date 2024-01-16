package pokemon

class Squirtle(override var name: String, override var character: String) : Pokemon() {
    override var skill: List<String> = mutableListOf("impact", "water_gun", "retraction", "high_speed_rotation")
    override var height = 55.00
    override var weight = 35.00
    override var race = "Squirtle"
    override var uid = 7
    override var level = 1
    override var physical_attack_ability = 30
    override var special_attack_ability = 50
    override var physical_defense_ability = 40
    override var special_defense_ability = 30
    override var speed_ability = 40
    override var life_ability = 40

    override fun move(skill: String,component: Pokemon) {
        if (skill.equals("impact")){
            println(name + "使用了撞击！")
        } else if (skill.equals("water_gun")){
            println(name + "使用了水枪！")
        } else if (skill.equals("retraction")){
            println(name + "使用了缩壳！")
        } else if (skill.equals("high_speed_rotation")){
            println(name + "使用了高速旋转！")
        }
    }

}