
object Assignment14T1 {

  class RationalCalculator {
    def calculateGCD(a: Int, b: Int): Int = {
      if (b == 0) a else calculateGCD(b, a % b)
    }

    def addition(n1: Int, d1: Int, n2: Int, d2: Int) = {
      var gcd = calculateGCD(d1, d2)
      var lcm = d1 * d2 / gcd
      var numerator1 = n1 * (lcm / d1)
      var numerator2 = n2 * (lcm / d2)
      var sum = numerator1 + numerator2
      println("Addition: " + sum + "/" + lcm)
    }

    def substraction(n1: Int, d1: Int, n2: Int, d2: Int) = {
      var gcd = calculateGCD(d1, d2)
      var lcm = d1 * d2 / gcd
      var numerator1 = n1 * (lcm / d1)
      var numerator2 = n2 * (lcm / d2)
      var sum = numerator1 - numerator2
      println("Substraction: " + sum + "/" + lcm)
    }

    def multiplication(n1: Int, d1: Int, n2: Int, d2: Int) = {
      var numerator = n1 * n2
      var denominator = d1 * d2
      println("Multiplication: " + numerator + "/" + denominator)
    }

    def division(n1: Int, d1: Int, n2: Int, d2: Int) = {
      var numerator = n1 * d2
      var denominator = n2 * d1
      println("Division: " + numerator + "/" + denominator)
    }

    def addition(n1: Int, n2: Int) = {
      var sum = n1 + n2
      println("Addition: " + sum)
    }

    def substraction(n1: Int, n2: Int) = {
      var sub = n1 - n2
      println("Substraction: " + sub)
    }

    def multiplication(n1: Int, n2: Int) = {
      var mul = n1 * n2
      println("Multiplication: " + mul)
    }

    def division(n1: Int, n2: Int) = {
      var div = n1 / n2
      println("Division: " + div)
    }
  }
  def main(args: Array[String]): Unit = {
    var calc = new RationalCalculator
    try {
      println("Enter numbers:")
      var n1: Int = scala.io.StdIn.readLine().toInt
      var n2: Int = scala.io.StdIn.readLine().toInt
      var d1: Int = scala.io.StdIn.readLine().toInt
      var d2: Int = scala.io.StdIn.readLine().toInt
      var again: Char = 'y'
      while (again == 'y') {
        println("Enter a operator(+,-,*,/):")
        var operation = scala.io.StdIn.readLine().toString()
        operation match {
          case "+" => {
            println("********* Rational Calculations Results: (n1/d1)+(n2/d2) *********")
            calc.addition(n1, d1, n2, d2)  //(n1/d1)+(n2/d2)
            println("********* Whole number Calculations Results: (n1+n2) *********")
            calc.addition(n1, n2)  //n1+n2
          }
          case "-" => {
            println("********* Rational Calculations Results: (n1/d1)-(n2/d2) *********")
            calc.substraction(n1, d1, n2, d2)  //(n1/d1)-(n2/d2)
            println("********* Whole number Calculations Results: (n1-n2) *********")
            calc.substraction(n1, n2)  // n1-n2
          }
          case "*" => {
            println("********* Rational Calculations Results: (n1/d1)*(n2/d2) *********")
            calc.multiplication(n1, d1, n2, d2)  //(n1/d1)*(n2/d2)
            println("********* Whole number Calculations Results: (n1*n2) *********")
            calc.multiplication(n1, n2)
          }
          case "/" => {
            println("********* Rational Calculations Results: (n1/d1)/(n2/d2) *********")
            calc.division(n1, d1, n2, d2)
            println("********* Whole number Calculations Results: (n1/n2) *********")
            calc.division(n1, n2)
          }
        }
        println("------------------------------------------")
        println("Perform calculations again ? Press (y/n)")
        again = scala.io.StdIn.readChar()
        println("------------------------------------------")
      }
    } catch {
      case ex: Exception => {
        println("Invalid input. Please enter valid number")
      }
    }
  }
}