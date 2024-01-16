import pokemon.Bulbasaur
import pokemon.Charmander
import pokemon.Pokemon
import pokemon.Squirtle
import java.util.concurrent.ThreadLocalRandom
fun main() {
    var grasser = Bulbasaur("mwzz","muture")
    var firer = Charmander("xhl","optimistic")
    var waterer = Squirtle("jng","naughty")
    fight(grasser,firer);
}
fun fight(pokemon_1: Pokemon, pokemon_2: Pokemon){
    init(pokemon_1)
    init(pokemon_2)
    while (true) {
        pokemon_1.move(pokemon_1.skill.get((0..3).random()),pokemon_2)
        Thread.sleep(1000)
        pokemon_2.move(pokemon_2.skill.get((0..3).random()),pokemon_1)
        Thread.sleep(1000)
    }
}
fun init(pokemon: Pokemon){

}