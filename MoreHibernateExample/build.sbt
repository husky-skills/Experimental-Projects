
name := """MoreHibernateExample"""

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  //javaJdbc,
  javaJpa,
  "javax.inject" % "javax.inject" % "1",
  "org.hibernate" % "hibernate-entitymanager" % "4.3.5.Final",
  "org.postgresql" % "postgresql" % "9.3-1102-jdbc41"

  )
  
//routesGenerator := InjectedRoutesGenerator
