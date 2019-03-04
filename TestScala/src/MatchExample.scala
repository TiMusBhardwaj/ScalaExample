

object MatchExample {
  def main(args: Array[String]) {
      println(matchTest(3))
      var x = 2
      x match{
        case 1 => println ("one")
        case 2 => println ("two")
        case _ => println ("many")
      }
      
      
      println(matchTest2("two"))
      println(matchTest2("test"))
      println(matchTest2(1))
   }
   
   def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
   }
   
   
   def matchTest2(x: Any): Any = x match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case _ => "many"
   }
}