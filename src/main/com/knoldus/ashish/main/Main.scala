package main.com.knoldus.ashish.main

import main.com.knoldus.ashish.datahandler.{FileAsInputSource, FileAsOutputSource, InputGrabber, OutputExporter}
import main.com.knoldus.ashish.dataprocessor.Capitalizer
import main.com.knoldus.ashish.dataprocessor.WordCounter

/**
  * Created by ashish on 1/27/17.
  */
class Main {

}

object Main {

  def main(args: Array[String]): Unit = {

    val inputFile : InputGrabber = new FileAsInputSource("datafile.txt")
    val capitalOutputFile : OutputExporter = new FileAsOutputSource("capitalizedOutput.txt")
    val wordCountOutputFile : OutputExporter = new FileAsOutputSource("wordCount.txt")

    capitalOutputFile.exportTextToSource(Capitalizer.capitalizeText(inputFile.getText()))
    wordCountOutputFile.exportTextToSource(WordCounter.wordCount(inputFile.getText()))

  }

}