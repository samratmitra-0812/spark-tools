package com.sparktools

import org.apache.spark.sql.SparkSession

object Converter {

    def convert(iType:String, iPath:String, oType:String, oPath:String) : Unit = {

        val spark = SparkSession.builder().appName("Data Converter").getOrCreate()
        val iData = spark.read.format(iType).load(iPath)
        iData.write.format(oType).save(oPath)
        spark.close();

    }
}
