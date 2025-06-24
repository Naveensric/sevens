
object program2 {

  def main(args: Array[String]): Unit = {

    val p = new Person()
    p.setName("Naveen")
    p.setAge(25)
    p.setLocation("chennai")

    println(p.getName)  // Output: Naveen
    println(p.getAge)
    println(p.getLocation)

    MySingleton.greet()
    Logger1.log("Log:1 started")
    Logger2.log("Log:2 started")
    Logger3.log("Log:3 started")

    val basics = new Basics()
    basics.boss()
  }

}
