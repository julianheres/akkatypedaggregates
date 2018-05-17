import mill._, mill.scalalib._

object audit extends ScalaModule {
  def scalaVersion = "2.12.4"

  override def ivyDeps = Agg(
    ivy"com.typesafe.akka::akka-actor-typed:2.5.12"
  )
}
object payment extends ScalaModule {
  def scalaVersion = "2.12.4"
}