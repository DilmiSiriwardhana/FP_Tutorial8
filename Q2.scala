object Q2 {
  def main(args: Array[String]): Unit = {

    val findCategory : Int => String = {
      case n if n < 0 => "Negative"
      case 0 => "Zero"
      case n if n % 2 == 0 => "Even number"
      case n => "Odd number"
    }

    print("Enter the number : ")
    var n = scala.io.StdIn.readLine().toInt

    print(findCategory(n))

  }
}