class Person(val name: String, val age: Int) {
  def greet(): Unit = {
    println(s"Hello, my name is $name and I am $age years old.")
  }
}
object Main {
  def main(args: Array[String]): Unit = {
    val person = new Person("John", 30)
    person.greet()
  }
}
