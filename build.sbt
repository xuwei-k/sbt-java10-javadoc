// add lib/tools.jar if exists
unmanagedJars in Compile ++= {
  val f = file(System.getProperty("java.home").dropRight(3)+"lib/tools.jar")
  if (f.isFile)
    Seq(Attributed.blank(f))
  else
    Nil
}

scalaVersion := "2.12.6"
