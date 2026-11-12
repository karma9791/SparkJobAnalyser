package com.karma.spark.analyser

import org.apache.hadoop.conf.Configuration
import org.apache.hadoop.fs.Path
import org.apache.spark.deploy.history.EventLogFileReader
import org.apache.spark.status.AppStatusStore
import org.apache.spark.util.kvstore.{InMemoryStore, KVStore}


object Temp {
  def main(args: Array[String]): Unit = {

    val kk = new InMemoryStore()
    println(kk)
    kk.setMetadata(new Abc)
    println("1")
    println(kk)
    println("2")
    val inputPath: String = ""
    val path = new Path(inputPath)
    val hadoopConf = new Configuration()
    val fileSystem = path.getFileSystem(hadoopConf)
    val kk1 = EventLogFileReader(fs =  fileSystem, path = path).get

    val k2 =  kk1.listEventLogFiles

    val appStatusStore = new AppStatusStore(kk)
  }
}
class Abc {

  def sum(i: Int): Int = i
}

