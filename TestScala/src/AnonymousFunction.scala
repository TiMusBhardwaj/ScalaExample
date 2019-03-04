

object AnonymousFunction {
  
  def main(args: Array[String]): Unit = {
    var mul = (x: Int, y: Int) => {x*y}
    println(mul(3, 4))
    
    var userDir = () => { System.getProperty("os") }
    println( userDir )
  }
}