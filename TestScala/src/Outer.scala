class Outer {
   class Inner {
      private def f() { println("f") }
      f()
      class InnerMost {
         f() // OK
      }
   }
   //(new Inner).f() // Error: f is not accessible
}