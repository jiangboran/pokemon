package fight

import pokemon.Pokemon

fun pokefight(pokemon_1 : Pokemon, pokemon_2: Pokemon){
    var pokefighter_1 : Pokefighter = init(pokemon_1)
    println(pokefighter_1.name + "登场了！")
    Thread.sleep(1000)
    var pokefighter_2 : Pokefighter = init(pokemon_2)
    println(pokefighter_2.name + "登场了！")
    Thread.sleep(1000)
    while (pokefighter_1.alive()&&pokefighter_2.alive()){
        battleRound(pokefighter_1, pokefighter_2)
    }
    result(pokefighter_1,pokefighter_2)
}
fun init(pokemon : Pokemon) : Pokefighter {
    var pokefighter = Pokefighter()
//    pokefighter.setSkill(pokemon.skill)
//    pokefighter.setRace(pokemon.race)
//    pokefighter.setLevel(pokemon.level)
//    pokefighter.setName(pokemon.name)
//    pokefighter.setPhysicalAttack((pokemon.physicalAttackAbility*2*pokemon.level)/100+5)
//    pokefighter.setSpecialAttack((pokemon.specialAttackAbility*2*pokemon.level)/100+5)
//    pokefighter.setPhysicalDefense((pokemon.physicalDefenseAbility*2*pokemon.level)/100+5)
//    pokefighter.setSpecialDefense((pokemon.specialDefenseAbility*2*pokemon.level)/100+5)
//    pokefighter.setSpeed((pokemon.speedAbility*2*pokemon.level)/100+5)
//    pokefighter.setLife((pokemon.lifeAbility*2*pokemon.level)/100+10+pokemon.level)
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
    return pokefighter
}
fun battleRound(pokefighter_1 : Pokefighter, pokefighter_2: Pokefighter){
//    if (pokefighter_1.getSpeed() > pokefighter_2.getSpeed()){
    if (pokefighter_1.speed > pokefighter_2.speed){
        pokefighter_1.useSkill(pokefighter_1.skill.get(0),pokefighter_2)
    }
    if (pokefighter_1.alive() && pokefighter_2.alive()){
        pokefighter_2.useSkill(pokefighter_2.skill.get(0),pokefighter_1)
    }
}
fun result(pokefighter_1 : Pokefighter, pokefighter_2: Pokefighter){
    if (!pokefighter_1.alive()){
//        println(pokefighter_1.getName() + "倒下了！")
//        println(pokefighter_2.getName() + "获得了胜利！")
        println(pokefighter_1.name + "倒下了！")
        Thread.sleep(1000)
        println(pokefighter_2.name + "获得了胜利！")
    }
    if (!pokefighter_2.alive()){
//        println(pokefighter_2.getName() + "倒下了！")
//        println(pokefighter_1.getName() + "获得了胜利！")
        println(pokefighter_2.name + "倒下了！")
        Thread.sleep(1000)
        println(pokefighter_1.name + "获得了胜利！")
    }
}