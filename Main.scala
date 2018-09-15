import java.io.PrintWriter

object Test {

  lazy val javadocMethod = {
    val javadocClass = "com.sun.tools.javadoc.Main"
    val javadocClz = Class.forName(javadocClass)
    val (str, pw) = (classOf[String], classOf[PrintWriter])
    val arrStr = classOf[Array[String]]
    javadocClz.getDeclaredMethod("execute", str, pw, pw, pw, str, arrStr)
  }

  def execute(args: String*): Int = {
    val stdClass = "com.sun.tools.doclets.standard.Standard"
    val out = new java.io.PrintWriter(System.out)
    val run = javadocMethod.invoke(null, "javadoc", out, out, out, stdClass, args.toArray)
    run.asInstanceOf[java.lang.Integer].intValue
  }

  def main(args: Array[String]): Unit = {
    val res = execute("A.java", "-d", "output_dir")
    println("res = " + res)
  }
}
