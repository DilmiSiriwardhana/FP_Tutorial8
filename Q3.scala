object Q3 {

  def main(args: Array[String]): Unit = {

    val toUpper: (String, Int, Int) => String = (name, startIndex, endIndex) => {
      var modifiedName = name
      for (i <- startIndex to endIndex) {
        val convertWord = modifiedName.charAt(i).toUpper
        modifiedName = modifiedName.updated(i, convertWord)
      }
      modifiedName
    }

    val toLower: (String, Int, Int) => String = (name, startIndex, endIndex) => {
      var modifiedName = name
      for (i <- startIndex to endIndex) {
        val convertWord = modifiedName.charAt(i).toLower
        modifiedName = modifiedName.updated(i, convertWord)
      }
      modifiedName
    }

    val formatName: (String, Int, Int, (String, Int, Int) => String) => String = (name, startIndex, endIndex, f) => {
      f(name, startIndex, endIndex)
    }

    print("Enter the name: ")
    val name = scala.io.StdIn.readLine()

    print("Enter the start index: ")
    val startIndex = scala.io.StdIn.readInt()

    print("Enter the end index: ")
    val endIndex = scala.io.StdIn.readInt()

    val resultU = formatName(name, startIndex, endIndex, toUpper)
    //val resultL = formatName(name, startIndex, endIndex, toLower)

    print(resultU)
    //println(resultL)
  }
}