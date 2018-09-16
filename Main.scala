import java.io.PrintWriter

object Test {

  def execute(args: String*): Int = {
    val stdClass = "com.sun.tools.doclets.standard.Standard"
    javax.tools.ToolProvider.getSystemDocumentationTool.run(System.in, System.out, System.err, args: _*)
  }

  def main(args: Array[String]): Unit = {
    val res = execute("A.java", "-d", "output_dir")
    println("res = " + res)
  }
}
