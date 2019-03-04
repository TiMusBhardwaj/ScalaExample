import java.io.PrintWriter
import java.io.File
import scala.io.Source


object FileExample {
  def main(args: Array[String]) {
      val writer = new PrintWriter(new File("test.txt" ))

      writer.write("Hello Scala")
      
       print("Please enter your input : " )
        val line = Console.readLine()
        writer.write(line)
      writer.close()
      
      Source.fromFile("test.txt" ).foreach { 
         print 
      }
   }
}