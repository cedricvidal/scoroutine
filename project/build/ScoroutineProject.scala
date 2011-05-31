import sbt._

class ScoroutineProject(info: ProjectInfo) extends DefaultProject(info) with AutoCompilerPlugins with IdeaProject {
  val continuationsPlugin = compilerPlugin("org.scala-lang.plugins" % "continuations" % "2.9.0")
  override def compileOptions = super.compileOptions ++ compileOptions("-P:continuations:enable")
  override def testScalaSourcePath = "src" / "example" / "scala"
}
