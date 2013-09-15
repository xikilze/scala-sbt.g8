import sbt._
import sbt.Keys._

object $name;format="Camel"$Build extends Build {

  lazy val $name;format="camel"$ = Project(
    id = "$name;format="norm"$",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "$name$",
      organization := "$organization$",
      version := "$version$",
      scalaVersion := "$scala_version$",
      libraryDependencies ++= Seq(
        "org.clapper" %% "grizzled-slf4j" % "1.0.1",
        "ch.qos.logback" % "logback-classic" % "1.0.13",
        "org.codehaus.groovy" % "groovy-all" % "2.1.6"
      )
    )
  )
}
