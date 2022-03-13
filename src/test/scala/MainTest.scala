class MainTest extends org.scalatest.funsuite.AnyFunSuite {
  test("CubeCalculator.cube") {
    assert(Main.cube(3) === 27)
  }
}
