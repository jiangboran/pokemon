import fight.pokefight
import pokemon.Bulbasaur
import pokemon.Charmander
import pokemon.Pokemon
import pokemon.Squirtle
import skill.Pound

fun main() {
    var pound : Pound = Pound()
    var grasser = Bulbasaur("mwzz","muture", listOf(pound))
    var firer = Charmander("xhl","optimistic", listOf(pound))
    var waterer = Squirtle("jng","naughty", listOf(pound))
    pokefight(grasser,firer);
}