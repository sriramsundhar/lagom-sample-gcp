import Dependencies._
import play.grpc.gen.javadsl.{ PlayJavaClientCodeGenerator, PlayJavaServerCodeGenerator }
organization in ThisBuild := "com.example"
version in ThisBuild := "1.0.0-SNAPSHOT"
// the Scala version that will be used for cross-compiled libraries
scalaVersion in ThisBuild := "2.13.0"


lazy val `lagom-sample-gcp` = (project in file("."))
  .aggregate(`users-api`, `users-api-impl`)

lazy val `users-api` = (project in file("users-api"))
  .settings(common)
  .settings(
    libraryDependencies ++= Seq(
      lagomJavadslApi,
      lombok
    )
  )

lazy val `users-api-impl` = (project in file("users-api-impl"))
  .enablePlugins(LagomJava,AkkaGrpcPlugin, PlayAkkaHttp2Support, JibPlugin)
  .settings(
    common, lagomForkedTestSettings,
    libraryDependencies ++= Seq(
      mySqlConnector,
      playGrpcRuntime,
      lombok,
      lagomJavadslPersistenceJdbc,
      lagomLogback,
      lagomJavadslTestKit,
      lagomGrpcTestkit,
      lombok
    )++ akkaOverrides ++ akkaHttpOverrides ++ playOverrides,

    akkaGrpcGeneratedLanguages := Seq(AkkaGrpc.Java),
    akkaGrpcGeneratedSources :=
      Seq(
        AkkaGrpc.Server,
      ),
    akkaGrpcExtraGenerators in Compile += PlayJavaServerCodeGenerator,
    lagomServiceHttpPort := 11000,
  )
  .dependsOn(`users-api`)

def common = Seq(
  javacOptions in Compile += "-parameters"
)
lagomCassandraEnabled in ThisBuild := false
lagomKafkaEnabled in ThisBuild := false
