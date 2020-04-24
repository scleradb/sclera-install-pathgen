name := "sclera-install-pathgen"

description := "Installation helper package -- while installing an artifact, gets the classpath containing the artifact and its dependencies"

homepage := Some(url(s"https://github.com/scleradb/${name.value}"))

scmInfo := Some(
    ScmInfo(
        url(s"https://github.com/scleradb/${name.value}"),
        s"scm:git@github.com:scleradb/${name.value}.git"
    )
)

version := "4.0-SNAPSHOT"

startYear := Some(2012)

scalaVersion := "2.13.2"

licenses := Seq("Apache License version 2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))

resolvers += sbtResolver.value

libraryDependencies ++= Seq(
    "org.scala-sbt" % "launcher-interface" % "1.1.3" % "provided"
)

scalacOptions ++= Seq(
    "-Werror", "-feature", "-deprecation", "-unchecked"
)

exportJars := true
