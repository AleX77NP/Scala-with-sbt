class Hero(name: String, attack: Int, defense: Int) extends Creature(name, attack, defense) with Armor {
  var treasure = Treasure(50.5f)

  override def equip(weapon: Weapon): Unit = {
    if (weapon.kind == "attack")
      this.setAttack(attack + weapon.power)
    else
      this.setDefense(defense - weapon.power)
  }

  override def remove(weapon: Weapon): Unit = {
    if (weapon.kind == "attack")
      this.setAttack(attack - weapon.power)
    else
      this.setDefense(defense - weapon.power)
  }

  def buyWeapon(weapon: Weapon) = {
    if(treasure.value >= weapon.price) {
      this.equip(weapon)
      this.treasure = Treasure(treasure.value - weapon.price)
    } else
      println("Not enough money to buy weapon")
  }


}

