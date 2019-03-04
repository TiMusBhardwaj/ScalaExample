

object RegexExample {
   def main(args: Array[String]) {
      val pattern = "Scala".r
      val str = "Scala is Scalable and cool"
      var x = pattern findAllIn str
      for(i <- x){
        println(i)
      }
      
      val pattern2 = "(S|s)cala".r
      val str2 = "Scala is scalable and cool"
      
      println(pattern2 replaceFirstIn(str2, "Java"))
   }
}