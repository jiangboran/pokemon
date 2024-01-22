package role

import pokemon.Pokemon

class Poketrainer : Pokerole() {
    override var name: String = "Player"
    override var roleid: Int = 0
    override var pokemonsTaking: MutableList<Pokemon> = mutableListOf()
    override var pokemonsTakingCount: Int = 0
    override var pokemonStore: MutableList<Pokemon> = mutableListOf()

    fun addPokemon(pokemon: Pokemon){
        if (pokemonsTakingCount<6){
            pokemonsTaking.add(pokemon)
        } else {
            pokemonStore.add(pokemon)
        }
    }
    private fun depositPokemon(pokemon: Pokemon){
        pokemonStore.add(pokemon)
        pokemonsTaking.remove(pokemon)
    }
    private fun takeOutPokemon(pokemon: Pokemon){
        pokemonsTaking.add(pokemon)
        pokemonStore.remove(pokemon)
    }
    fun changePokemon(pokemonToDeposit: Pokemon, pokemonToTakeOut: Pokemon){
        depositPokemon(pokemonToDeposit)
        takeOutPokemon(pokemonToTakeOut)
    }
}