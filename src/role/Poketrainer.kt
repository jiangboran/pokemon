package role

import pokemon.Pokemon

class Poketrainer : Pokerole() {
    override var name: String = "Player"
    override var roleid: Int = 0
    override var pokemonsTaking: List<Pokemon> = mutableListOf()
    override var pokemonsTakingCount: Int = 0
    override var pokemonStore: List<Pokemon> = mutableListOf()

}