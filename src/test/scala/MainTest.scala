class MainTest extends org.scalatest.funsuite.AnyFunSuite {
  test("TestAliveness") {
    val creature1 = new Creature("testCreature1")
    val creature2 = new Creature("testCreature2", 1000,1000)
    assert(Aliveness.healthCheck(creature1) == false)
    assert(Aliveness.healthCheck(creature2) == true)
  }

  test("TestStatus") {
    val creature1 = new Creature("testCreature1")
    val creature2 = new Creature("testCreature2", 500,500)
    assert(Aliveness.status(creature1) == "Gone")
    assert(Aliveness.status(creature2) == "Healthy")
  }
}
