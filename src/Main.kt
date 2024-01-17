import fight.pokefight
import pokemon.Bulbasaur
import pokemon.Charmander
import pokemon.Squirtle
import skill.Growl
import skill.Pound

fun main() {
    var pound = Pound()
    var growl = Growl()
    var grasser = Bulbasaur("mwzz","muture", listOf(pound,growl))
    var firer = Charmander("xhl","optimistic", listOf(pound,growl))
    var waterer = Squirtle("jng","naughty", listOf(pound))
    pokefight(grasser,firer);
}