object Main {
  def main(args: Array[String]) = {
    val arybas = new Creature("Arybas", 2000, 800)
    val nathan = new Hero("Nathan", 1700, 760)
    nathan.equip(new Weapon(45, "attack", 10.5f))

    var i = 0
    while(i < 10) {
      if (i % 2 == 0)
        nathan.attackOpponent(arybas)
      else
        arybas.attackOpponent(nathan)

      println("Nathan's defense:")
      println(nathan.getDefense())

      println("Arybas' defense:")
      println(arybas.getDefense())

      i+=1
    }

    if(nathan.getDefense() > 0 && arybas.getDefense() > 0)
      println("Both survived this battle!")
  }
}