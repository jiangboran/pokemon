package pokemon

class Charmander(override var name: String, override var character: String) : Pokemon() {
    override var skill: List<String> = mutableListOf("impact", "spark", "scream", "hot_wind")
    override var height = 60.00
    override var weight = 30.00
    override var race : String = "Charmander"
    override var uid : Int = 4
    override var level = 1
    override var physical_attack_ability : Int = 50
    override var special_attack_ability : Int = 30
    override var physical_defense_ability : Int = 30
    override var special_defense_ability : Int = 30
    override var speed_ability : Int = 50
    override var life_ability: Int = 40

    override fun move(skill: String,component: Pokemon) {
        if (skill.equals("impact")){
            println(name + "使用了撞击！")
        } else if (skill.equals("spark")){
            println(name + "使用了火花！")
        } else if (skill.equals("scream")){
            println(name + "使用了鸣叫！")
        } else if (skill.equals("hot_wind")){
            println(name + "使用了热风！")
        }
    }
}