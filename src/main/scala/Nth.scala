class Nth {
  def sumEveryNth[A](n: Int, ns: Seq[Int]): Seq[Int] = {
    if (ns.isEmpty && n == 0) {
      Seq.empty
    } else {
      ns.grouped(n).map(_.sum).toSeq
    }
  }
}
