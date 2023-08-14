object Q1 {
  def main(args: Array[String]): Unit = {

    val interest: Double => Double = {
      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
    }
    print("Enter the deposit amount : ")
    var amount = scala.io.StdIn.readLine().toDouble

    print("The interest earned in a year is: " + interest(amount))

  }
}