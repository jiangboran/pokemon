package pokemon

abstract class Pokemon {
    abstract var skill: List<String>
    abstract var height : Double
    abstract var weight : Double
    abstract var race : String
    abstract var uid : Int
    abstract var character : String
    abstract var level : Int
    abstract var name : String;
    abstract var physical_attack_ability : Int
    abstract var special_attack_ability : Int
    abstract var physical_defense_ability : Int
    abstract var special_defense_ability : Int
    abstract var speed_ability : Int
    abstract var life_ability : Int

    abstract fun move(skill : String,component: Pokemon)
}
