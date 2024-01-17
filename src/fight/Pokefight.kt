package fight

import pokemon.Pokemon
import kotlin.math.roundToInt

fun pokefight(pokemon1 : Pokemon, pokemon2: Pokemon){
    val pokefighter1 : Pokefighter = init(pokemon1)
    println(pokefighter1.name + "登场了！")
    Thread.sleep(1000)
    val pokefighter2 : Pokefighter = init(pokemon2)
    println(pokefighter2.name + "登场了！")
    Thread.sleep(1000)
    while (pokefighter1.alive()&&pokefighter2.alive()){
        battleRound(pokefighter1, pokefighter2)
    }
    result(pokefighter1,pokefighter2)
}
fun init(pokemon : Pokemon) : Pokefighter {
    val pokefighter = Pokefighter()
    pokefighter.skill = pokemon.skill
    pokefighter.race = pokemon.race
    pokefighter.level = pokemon.level
    pokefighter.name = pokemon.name
    pokefighter.physicalAttack = (pokemon.physicalAttackAbility*2*pokemon.level)/100+5
    pokefighter.specialAttack = (pokemon.specialAttackAbility*2*pokemon.level)/100+5
    pokefighter.physicalDefense = (pokemon.physicalDefenseAbility*2*pokemon.level)/100+5
    pokefighter.specialDefense = (pokemon.specialDefenseAbility*2*pokemon.level)/100+5
    pokefighter.speed = (pokemon.speedAbility*2*pokemon.level)/100+5
    pokefighter.life = (pokemon.lifeAbility*2*pokemon.level)/100+10+pokemon.level
    pokefighter.accuracy = 1.0
    pokefighter.evasion = 1.0
    stateChange(pokefighter)
    return pokefighter
}
fun battleRound(pokefighter1 : Pokefighter, pokefighter2: Pokefighter){
    if (pokefighter1.speed >= pokefighter2.speed){
        pokefighter1.useSkill(pokefighter1.skill[(0..1).random()],pokefighter2)
        stateChange(pokefighter1)
        stateChange(pokefighter2)
        if (pokefighter1.alive() && pokefighter2.alive()){
            pokefighter2.useSkill(pokefighter2.skill[(0..1).random()],pokefighter1)
            stateChange(pokefighter1)
            stateChange(pokefighter2)
        }
    } else {
        pokefighter2.useSkill(pokefighter2.skill[(0..1).random()],pokefighter1)
        stateChange(pokefighter1)
        stateChange(pokefighter2)
        if (pokefighter1.alive() && pokefighter2.alive()){
            pokefighter1.useSkill(pokefighter1.skill[(0..1).random()],pokefighter2)
            stateChange(pokefighter1)
            stateChange(pokefighter2)
        }
    }
}
fun result(pokefighter1 : Pokefighter, pokefighter2: Pokefighter){
    if (!pokefighter1.alive()){
        println(pokefighter1.name + "倒下了！")
        Thread.sleep(1000)
        println(pokefighter2.name + "获得了胜利！")
    }
    if (!pokefighter2.alive()){
        println(pokefighter2.name + "倒下了！")
        Thread.sleep(1000)
        println(pokefighter1.name + "获得了胜利！")
    }
}
fun stateChange (pokefighter: Pokefighter){
    when (pokefighter.physicalAttackState){
        -6 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 0.25).roundToInt()
        -5 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 0.28).roundToInt()
        -4 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 0.33).roundToInt()
        -3 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 0.40).roundToInt()
        -2 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 0.50).roundToInt()
        -1 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 0.66).roundToInt()
        0 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 1.00).roundToInt()
        1 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 1.50).roundToInt()
        2 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 2.00).roundToInt()
        3 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 2.50).roundToInt()
        4 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 3.00).roundToInt()
        5 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 3.50).roundToInt()
        6 -> pokefighter.physicalAttack = (pokefighter.physicalAttack * 4.00).roundToInt()
    }
    when (pokefighter.physicalDefenseState){
        -6 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 0.25).roundToInt()
        -5 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 0.28).roundToInt()
        -4 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 0.33).roundToInt()
        -3 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 0.40).roundToInt()
        -2 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 0.50).roundToInt()
        -1 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 0.66).roundToInt()
        0 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 1.00).roundToInt()
        1 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 1.50).roundToInt()
        2 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 2.00).roundToInt()
        3 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 2.50).roundToInt()
        4 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 3.00).roundToInt()
        5 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 3.50).roundToInt()
        6 -> pokefighter.physicalDefense = (pokefighter.physicalDefense * 4.00).roundToInt()
    }
    when (pokefighter.specialAttackState){
        -6 -> pokefighter.specialAttack = (pokefighter.specialAttack * 0.25).roundToInt()
        -5 -> pokefighter.specialAttack = (pokefighter.specialAttack * 0.28).roundToInt()
        -4 -> pokefighter.specialAttack = (pokefighter.specialAttack * 0.33).roundToInt()
        -3 -> pokefighter.specialAttack = (pokefighter.specialAttack * 0.40).roundToInt()
        -2 -> pokefighter.specialAttack = (pokefighter.specialAttack * 0.50).roundToInt()
        -1 -> pokefighter.specialAttack = (pokefighter.specialAttack * 0.66).roundToInt()
        0 -> pokefighter.specialAttack = (pokefighter.specialAttack * 1.00).roundToInt()
        1 -> pokefighter.specialAttack = (pokefighter.specialAttack * 1.50).roundToInt()
        2 -> pokefighter.specialAttack = (pokefighter.specialAttack * 2.00).roundToInt()
        3 -> pokefighter.specialAttack = (pokefighter.specialAttack * 2.50).roundToInt()
        4 -> pokefighter.specialAttack = (pokefighter.specialAttack * 3.00).roundToInt()
        5 -> pokefighter.specialAttack = (pokefighter.specialAttack * 3.50).roundToInt()
        6 -> pokefighter.specialAttack = (pokefighter.specialAttack * 4.00).roundToInt()
    }
    when (pokefighter.specialDefenseState){
        -6 -> pokefighter.specialDefense = (pokefighter.specialDefense * 0.25).roundToInt()
        -5 -> pokefighter.specialDefense = (pokefighter.specialDefense * 0.28).roundToInt()
        -4 -> pokefighter.specialDefense = (pokefighter.specialDefense * 0.33).roundToInt()
        -3 -> pokefighter.specialDefense = (pokefighter.specialDefense * 0.40).roundToInt()
        -2 -> pokefighter.specialDefense = (pokefighter.specialDefense * 0.50).roundToInt()
        -1 -> pokefighter.specialDefense = (pokefighter.specialDefense * 0.66).roundToInt()
        0 -> pokefighter.specialDefense = (pokefighter.specialDefense * 1.00).roundToInt()
        1 -> pokefighter.specialDefense = (pokefighter.specialDefense * 1.50).roundToInt()
        2 -> pokefighter.specialDefense = (pokefighter.specialDefense * 2.00).roundToInt()
        3 -> pokefighter.specialDefense = (pokefighter.specialDefense * 2.50).roundToInt()
        4 -> pokefighter.specialDefense = (pokefighter.specialDefense * 3.00).roundToInt()
        5 -> pokefighter.specialDefense = (pokefighter.specialDefense * 3.50).roundToInt()
        6 -> pokefighter.specialDefense = (pokefighter.specialDefense * 4.00).roundToInt()
    }
    when (pokefighter.speedState){
        -6 -> pokefighter.speed = (pokefighter.speed * 0.25).roundToInt()
        -5 -> pokefighter.speed = (pokefighter.speed * 0.28).roundToInt()
        -4 -> pokefighter.speed = (pokefighter.speed * 0.33).roundToInt()
        -3 -> pokefighter.speed = (pokefighter.speed * 0.40).roundToInt()
        -2 -> pokefighter.speed = (pokefighter.speed * 0.50).roundToInt()
        -1 -> pokefighter.speed = (pokefighter.speed * 0.66).roundToInt()
        0 -> pokefighter.speed = (pokefighter.speed * 1.00).roundToInt()
        1 -> pokefighter.speed = (pokefighter.speed * 1.50).roundToInt()
        2 -> pokefighter.speed = (pokefighter.speed * 2.00).roundToInt()
        3 -> pokefighter.speed = (pokefighter.speed * 2.50).roundToInt()
        4 -> pokefighter.speed = (pokefighter.speed * 3.00).roundToInt()
        5 -> pokefighter.speed = (pokefighter.speed * 3.50).roundToInt()
        6 -> pokefighter.speed = (pokefighter.speed * 4.00).roundToInt()
    }
    when (pokefighter.accuracyState){
        -6 -> pokefighter.accuracy = (pokefighter.accuracy * 0.33)
        -5 -> pokefighter.accuracy = (pokefighter.accuracy * 0.36)
        -4 -> pokefighter.accuracy = (pokefighter.accuracy * 0.43)
        -3 -> pokefighter.accuracy = (pokefighter.accuracy * 0.50)
        -2 -> pokefighter.accuracy = (pokefighter.accuracy * 0.60)
        -1 -> pokefighter.accuracy = (pokefighter.accuracy * 0.75)
        0 -> pokefighter.accuracy = (pokefighter.accuracy * 1.00)
        1 -> pokefighter.accuracy = (pokefighter.accuracy * 1.33)
        2 -> pokefighter.accuracy = (pokefighter.accuracy * 1.66)
        3 -> pokefighter.accuracy = (pokefighter.accuracy * 2.00)
        4 -> pokefighter.accuracy = (pokefighter.accuracy * 2.33)
        5 -> pokefighter.accuracy = (pokefighter.accuracy * 2.66)
        6 -> pokefighter.accuracy = (pokefighter.accuracy * 3.00)
    }
    when (pokefighter.evasionState){
        -6 -> pokefighter.evasion = (pokefighter.evasion * 0.33)
        -5 -> pokefighter.evasion = (pokefighter.evasion * 0.36)
        -4 -> pokefighter.evasion = (pokefighter.evasion * 0.43)
        -3 -> pokefighter.evasion = (pokefighter.evasion * 0.50)
        -2 -> pokefighter.evasion = (pokefighter.evasion * 0.60)
        -1 -> pokefighter.evasion = (pokefighter.evasion * 0.75)
        0 -> pokefighter.evasion = (pokefighter.evasion * 1.00)
        1 -> pokefighter.evasion = (pokefighter.evasion * 1.33)
        2 -> pokefighter.evasion = (pokefighter.evasion * 1.66)
        3 -> pokefighter.evasion = (pokefighter.evasion * 2.00)
        4 -> pokefighter.evasion = (pokefighter.evasion * 2.33)
        5 -> pokefighter.evasion = (pokefighter.evasion * 2.66)
        6 -> pokefighter.evasion = (pokefighter.evasion * 3.00)
    }
}