package pokemon

class Bulbasaur(override var name: String, override var character: String) : Pokemon() {
    override var skill: List<String> = mutableListOf("impact", "absorb", "fly_leaf_knife", "cane_whip")
    override var height = 50.00
    override var weight = 40.00
    override var race : String = "Bulbasaur"
    override var uid : Int = 1
    override var level = 1
    override var physical_attack_ability : Int = 30
    override var special_attack_ability : Int = 40
    override var physical_defense_ability : Int = 40
    override var special_defense_ability : Int = 40
    override var speed_ability : Int = 30
    override var life_ability: Int = 50

    override fun move(skill: String,component: Pokemon) {
        if (skill.equals("impact")){
            println(name + "使用了撞击！")
        } else if (skill.equals("absorb")){
            println(name + "使用了吸取！")
        } else if (skill.equals("fly_leaf_knife")){
            println(name + "使用了飞叶快刀！")
        } else if (skill.equals("cane_whip")){
            println(name + "使用了藤鞭！")
        }
    }
}
