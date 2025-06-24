object MySingleton {
  def greet(): Unit = {
    println("Hello from singleton!")
  }
}

object Logger1 {
    def log(message: String): Unit = {
      println(s"[LOG]:1 $message")
    }
  }

object Logger2 {
  def log(message: String): Unit = {
    println(s"[LOG]:2 $message")
  }
}

object Logger3 {
  def log(message: String): Unit = {
    println(s"[LOG]:3 $message")
  }
}