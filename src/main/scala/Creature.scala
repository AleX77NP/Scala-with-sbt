class Creature(private var name: String, private var attack: Int, private var defense: Int) {
  this.name = name
  this.attack = attack
  this.defense = defense

  def this(name: String) = {
    this(name, 0, 0)
  }

  def setAttack(attack: Int) = {
    this.attack = attack
  }

  def setDefense(defense: Int) = {
    this.defense = defense
  }

  def getAttack(): Int = {
    attack
  }

  def getDefense(): Int = {
    defense
  }

  def getName(): String = {
    name
  }

  def attackOpponent(creature: Creature) = {
    if(defense > 0) {
      printf("%s attacks opponent!\n", name)
      if(creature.getDefense() > 0)
        creature.takeDamage(attack / 10)
      else
        printf("%s is defeated\n", creature.getName())
    }
  }

  def takeDamage(damage: Int) = {
    if (damage >= defense)
      defense = 0
    else
      setDefense(this.defense - damage)
    }
}

object Aliveness {
  def healthCheck(creature: Creature): Boolean = {
    creature.getDefense() > 0
  }

  def status(creature: Creature): String = {
    if (healthCheck(creature)) "Healthy" else "Gone"
  }
}
