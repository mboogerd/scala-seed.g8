import sbt.{ModuleID, _}
import sbt.Keys._

object DependenciesConf {

  /* === Aggregated dependency configurations === */
  lazy val scala: Seq[Setting[_]] = Seq(
    scalaVersion := "2.12.4",
    resolvers ++= Seq(
      Resolver.jcenterRepo,
      Resolver.sonatypeRepo("releases")
    )
  )

  lazy val common: Seq[Setting[_]] = scala ++ Seq(
    libraryDependencies ++= Seq(logback, log4s, pureconfig, scalatest, scalacheck),
    libraryDependencies ++= cats
  )

  lazy val akka: Seq[Setting[_]] = scala ++ Seq(
    libraryDependencies ++= akkaActor ++ akkaStreams ++ akkaHttp ++ akkaCluster
  )

  /* === Logging === */
  lazy val logback = "ch.qos.logback" % "logback-classic" % "$logback_version$"

  /* === Various Scala utility libraries === */
  lazy val betterfiles = "com.github.pathikrit" %% "better-files" % "$better_files_version$"
  lazy val enumeratum = "com.beachape" %% "enumeratum" % "$enumeratum_version$"
  lazy val log4s = "org.log4s" %% "log4s" % "$log4s_version$"
  lazy val nscalaTime = "com.github.nscala-time" %% "nscala-time" % "$nscala_time_version$"
  lazy val scalaz = "org.scalaz" %% "scalaz-core" % "7.2.18"


  /* === Typesafe / Lightbend dependencies === */
  val akkaVersion = "$akka_version$"

  lazy val akkaActor: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaVersion,
    "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
    "com.typesafe.akka" %% "akka-testkit" % akkaVersion
  )

  lazy val akkaStreams: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-stream" % akkaVersion,
    "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion
  )

  lazy val akkaHttp: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-http" % akkaVersion,
    "com.typesafe.akka" %% "akka-http-testkit" % akkaVersion
  )

  lazy val akkaCluster: Seq[ModuleID] = Seq(
    "com.typesafe.akka" %% "akka-cluster" % akkaVersion,
    "com.typesafe.akka" %% "akka-cluster-sharding" % akkaVersion,
    "com.typesafe.akka" %% "akka-cluster-tools" % akkaVersion,
    "com.typesafe.akka" %% "akka-distributed-data" % akkaVersion,
    "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion
  )

  /* === Typelevel dependencies === */
  lazy val algebra: Seq[ModuleID] = {
    val algebraVersion = "$algebra_version$"
    Seq(
      "org.typelevel" %% "algebra" % algebraVersion,
      "org.typelevel" %% "algebra-laws" % algebraVersion % Test
    )
  }

  lazy val cats: Seq[ModuleID] = {
    // Resolution via Maven central is stuck at 0.9.0 as Typelevel only publishes to Sonatype
    lazy val catsVersion = "1.0.1"
    Seq(
      "org.typelevel" %% "cats-core" % catsVersion,
      "org.typelevel" %% "alleycats-core" % catsVersion,
      "org.typelevel" %% "cats-testkit" % catsVersion % Test,
      "org.typelevel" %% "cats-laws" % catsVersion % Test
    )
  }

  lazy val catseffect: Seq[ModuleID] = {
    val catsEffectVersion = "$cats_effect_version$"
    Seq(
      "org.typelevel" %% "cats-effect" % catsEffectVersion,
      "org.typelevel" %% "cats-effect-laws" % catsEffectVersion % Test
    )
  }

  lazy val discipline = "org.typelevel" %% "discipline" % "$discipline_version$"

  lazy val monix = "io.monix" %% "monix" % "$monix_version$"

  lazy val monocle: Seq[ModuleID] = {
    lazy val monocleVersion = "$monocle_version$"
    Seq(
      "com.github.julien-truffaut" %% "monocle-core" % monocleVersion,
      "com.github.julien-truffaut" %% "monocle-macro" % monocleVersion,
      "com.github.julien-truffaut" %% "monocle-law" % monocleVersion % Test
    )
  }

  lazy val pureconfig = "com.github.pureconfig" %% "pureconfig" % "$pureconfig_version$"

  lazy val refined = "eu.timepit" %% "refined" % "$refined_version$"

  lazy val shapeless = "com.chuusai" %% "shapeless" % "$shapeless_version$"

  lazy val simulacrum = "com.github.mpilquist" %% "simulacrum" % "0.11.0"

  lazy val spire: Seq[ModuleID] = {
    val spireVersion = "$spire_version$"
    Seq(
      "org.typelevel" %% "spire" % spireVersion,
      "org.typelevel" %% "spire-extras" % spireVersion,
      "org.typelevel" %% "spire-laws" % spireVersion % Test
    )
  }

  /* === Scala Testing Frameworks === */
  lazy val scalatest = "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test
  lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "$scalacheck_version$" % Test
  lazy val scalamock = "org.scalamock" %% "scalamock-scalatest-support" % "$scalamock_version$" % Test
  lazy val scalameter = "com.storm-enroute" %% "scalameter" % "$scalameter_version$" % Test

  /* === Interop === */
  lazy val pureconfigEnumeratum = "com.github.pureconfig" %% "pureconfig-enumeratum" % "$pureconfig_version$"
  lazy val refinedPureconfig = "eu.timepit" %% "refined-pureconfig" % "$refined_version$"
  lazy val refinedScalacheck = "eu.timepit" %% "refined-scalacheck" % "$refined_version$" % Test
}