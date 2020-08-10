import sbt._

object Dependencies {

  val scalatest        = "org.scalatest"       %% "scalatest"      % "3.2.1"
  val `cats-helper`    = "com.evolutiongaming" %% "cats-helper"    % "2.0.7"
  val smetrics         = "com.evolutiongaming" %% "smetrics"       % "0.1.1"
  val `kind-projector` = "org.typelevel"        % "kind-projector" % "0.11.0"

  object Cats {
    val core   = "org.typelevel" %% "cats-core"   % "2.1.1"
    val effect = "org.typelevel" %% "cats-effect" % "2.1.4"
  }
}
