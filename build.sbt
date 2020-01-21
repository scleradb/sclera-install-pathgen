name := "sclera-install-pathgen"

description := "Installation helper package -- while installing an artifact, gets the classpath containing the artifact and its dependencies"

version := "4.0"

homepage := Some(url("https://github.com/scleradb/sclera-install-pathgen"))

organization := "com.scleradb"

organizationName := "Sclera, Inc."

organizationHomepage := Some(url("https://www.scleradb.com"))

startYear := Some(2012)

scalaVersion := "2.13.1"

licenses := Seq("Apache License version 2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.txt"))

resolvers += sbtResolver.value

libraryDependencies ++= Seq(
    "org.scala-sbt" % "launcher-interface" % "1.1.3" % "provided"
)

scalacOptions ++= Seq(
    "-Werror", "-feature", "-deprecation", "-unchecked"
)

publishArtifact in (Compile, packageDoc) := false

exportJars := true
