import org.scalatest._
import flatspec._
import matchers._

class NthTest extends AnyFlatSpec with should.Matchers {
  val nth = new Nth

  "A Nth" should "sum every nth element" in {
    nth.sumEveryNth(4, Seq(1, 1, 1, 1, 2, 3, 4, 5, 7, 8, 9))
    nth.sumEveryNth(2, Seq(0, 0, 0, 2, 3, 1, 4))
    nth.sumEveryNth(1, Seq(0, 2, 3, 1, 4))
  }

  it should "return empty Seq" in {
    nth.sumEveryNth(0, Seq()) should be (Seq.empty)
  }
}
