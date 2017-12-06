object Demo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  println("Welcome to the Scala worksheet");$skip(17); 
  var num1:Int=8;System.out.println("""num1  : Int = """ + $show(num1 ));$skip(18); 
  val num2:Int=10;System.out.println("""num2  : Int = """ + $show(num2 ));$skip(21); 
  println(num1+num2);$skip(18); 
  var res = 8 + 7;System.out.println("""res  : Int = """ + $show(res ))}
}
