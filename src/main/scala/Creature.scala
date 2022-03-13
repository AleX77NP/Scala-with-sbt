class Creature(var name: String, var attack: Int, var defense: Int) {
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

  def attackOpponent(creature: Creature) = {
    creature.takeDamage(attack)
  }

  def takeDamage(damage: Int) = {
    setDefense(this.defense - damage)
  }
}
