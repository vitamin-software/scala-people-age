name := "SimpleAgeServer"

version := "1.0"

organization := "io.vitamin"

scalaVersion := "2.11.8"
crossPaths := false

mainClass in Compile := Some("io.vitamin.SimpleAgeServer")

libraryDependencies ++= Seq(
  // Using %% will add scala version as postfix into the artifact id
  "com.sparkjava" % "spark-core" % "2.5.5" % "compile",
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.slf4j" % "slf4j-simple" % "1.7.5",
  "org.json4s" %% "json4s-jackson" % "3.5.1"
)

