import play.Project._

name := """PROJECTNAME"""

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  "org.webjars" %% "webjars-play" % "2.2.2", 
  "org.webjars" % "bootstrap" % "2.3.1",
  javaJpa,
  "org.hibernate" % "hibernate-entitymanager" % "4.3.9.Final" )
 
playScalaSettings
