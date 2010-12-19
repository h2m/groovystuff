package h2m

class MyScalaClass(index: Int) {
  var idx: Int = index
  def inc(by: Int) {
    idx = idx + by
  }
  override def toString(): String = "MyScalaClass having index:" + idx + "!";
}
