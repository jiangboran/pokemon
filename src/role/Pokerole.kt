package role

import pokemon.Pokemon

abstract class Pokerole {
    abstract var name : String
    abstract var roleid : Int
    abstract var pokemonsTaking : List<Pokemon>
    abstract var pokemonsTakingCount : Int
    abstract var pokemonStore : List<Pokemon>
}