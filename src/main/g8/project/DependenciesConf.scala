import sbt.Keys._
import sbt._


object DependenciesConf {

  lazy val scala: Seq[Setting[_]] = Seq(
    scalaVersion := "2.12.2",
    resolvers ++= Seq(
      Resolver.jcenterRepo,
      Resolver.bintrayRepo("iheartradio", "maven"),
      Resolver.sonatypeRepo("releases")
    )
  )

  lazy val common: Seq[Setting[_]] = scala ++ Seq(
    libraryDependencies ++= commonDeps
  )

  def commonDeps = Seq(
    "commons-io" % "commons-io" % "$commons_io_version$",
    "ch.qos.logback" % "logback-classic" % "$logback_version$",
    "com.iheart" %% "ficus" % "$ficus_version$",
    "com.github.pathikrit" %% "better-files" % "$better_files_version$",
    "com.beachape" %% "enumeratum" % "$enumeratum_version$",
    "com.github.nscala-time" %% "nscala-time" % "$nscala_time_version$",
    "org.scalaz" %% "scalaz-core" % "$scalaz_version$",

    "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test,
    "org.scalacheck" %% "scalacheck" % "$scalacheck_version$" % Test,
    "org.typelevel" %% "scalaz-scalatest" % "$scalaz_test_version$" % Test
  )
}