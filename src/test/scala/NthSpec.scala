import org.scalatest._
import flatspec._
import matchers._

class NthSpec extends AnyFlatSpec with should.Matchers {

  "sumEveryNth" should "verify whether funtion sums every nth element" in {
    import Nth._
    sumEveryNth(4, Seq(1, 2, 3, 6, 5, 6, 7)) shouldBe true
    sumEveryNth(3, Seq(0, 0, 0, 1, 2, 3)) shouldBe true
    sumEveryNth(3, Seq(0, 0, 0, 1, 2)) shouldBe true
  }

  it should "be false for empty Seq" in {
    import Nth._
    sumEveryNth(0, Seq.empty[Int]) shouldBe false
  }
}
