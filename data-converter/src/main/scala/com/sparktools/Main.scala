package com.sparktools

/**
 * Hello world!
 *
 */
object Main {

  def main(args: Array[String]): Unit = {

      val input_data_type = args(0);
      val input_path = args(1);
      val output_data_type = args(2);
      val output_path = args(3);

      Converter.convert(input_data_type, input_path, output_data_type, output_path)
  }
}
