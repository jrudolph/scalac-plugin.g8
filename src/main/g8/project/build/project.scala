import sbt._

class $name$Project(info: ProjectInfo) extends DefaultProject(info) {
  override lazy val console = super.consoleAction dependsOn `package`
  override def consoleOptions = super.consoleOptions ++ compileOptions("-Xplugin:"+jarPath.toString)
}
