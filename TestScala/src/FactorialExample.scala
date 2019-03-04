object FactorialExample {
  def main(args: Array[String]): Unit = {
    println(fact(5))
  }
  
  def fact(i: Int):Int = {
    if(i <=1 ){
      return i
    }
    i*fact(i-1)
  }
}