name := "lab2"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.7" ,
  "org.apache.spark" %% "spark-sql" % "2.4.7",
  "com.databricks" %% "spark-xml" % "0.10.0"
)
