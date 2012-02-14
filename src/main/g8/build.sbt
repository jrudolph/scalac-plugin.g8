libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _)

scalacOptions in console in Compile <+= (packageBin in Compile) map { p =>
  "-Xplugin:"+p
}

