val akkaVersion = "2.5.8"

lazy val commonSettings = Seq(
  name := "akkatypedagreggates",
  organization := "com.julianheres",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.12.6",
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-typed" % akkaVersion,
    "com.typesafe.akka" %% "akka-typed-testkit" % akkaVersion % "test",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test",
    "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
  )
)

lazy val audit = project

lazy val payment = project

lazy val ecommerce = project.dependsOn(audit, payment)
