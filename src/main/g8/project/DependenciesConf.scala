import sbt.Keys._
import sbt._


object DependenciesConf {

  lazy val scala: Seq[Setting[_]] = Seq(
    scalaVersion := "2.12.2",
    resolvers ++= Seq(
      Resolver.jcenterRepo,
      Resolver.sonatypeRepo("releases")
    )
  )

  lazy val common: Seq[Setting[_]] = scala ++ Seq(
    libraryDependencies ++= commonDeps
  )

  def commonDeps = Seq(
    // logging
    "ch.qos.logback" % "logback-classic" % "$logback_version$",

    // scala
    "org.log4s" %% "log4s" % "$log4s_version$",
    "com.github.pathikrit" %% "better-files" % "$better_files_version$",
    "com.beachape" %% "enumeratum" % "$enumeratum_version$",
    "com.github.nscala-time" %% "nscala-time" % "$nscala_time_version$",

    // typelevel
    "com.chuusai" %% "shapeless" % "$shapeless_version$",
    "com.github.pureconfig" %% "pureconfig" % "$pureconfig_version$",
    "com.github.pureconfig" %% "pureconfig-enumeratum" % "$pureconfig_version$",
    "eu.timepit" %% "refined" % "$refined_version$",
    "eu.timepit" %% "refined-pureconfig" % "$refined_version$",
    "org.typelevel" %% "cats" % "$cats_version$",
    "org.typelevel" %% "cats-effect" % "$cats_effect_version$",

    // test
    "org.scalatest" %% "scalatest" % "$scalatest_version$" % Test,
    "org.scalacheck" %% "scalacheck" % "$scalacheck_version$" % Test,
    "eu.timepit" %% "refined-scalacheck" % "$refined_version$" % Test,
    "org.scalamock" %% "scalamock-scalatest-support" % "$scalamock_version$" % Test
  )
}