

object NamedArgsExample {
  def main(args: Array[String]): Unit = {
    printInt(b=5, a=3)
  }
  
  def printInt(a :Int , b:Int):Unit = {
   println("Value of a : " + a );
      println("Value of b : " + b );
  }
}