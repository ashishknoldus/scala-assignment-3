package main.com.knoldus.ashish.datahandler

import scala.io.Source

/**
  * Created by ashish on 1/27/17.
  */

/*
* This class is to get text from a file on directory
* */
class FileAsInputSource(sourceArg : String) extends InputGrabber{

  val source : String = sourceArg

  override def getText(): String = {

    /* The previous method of getting text out of the file
     wasn't efficient way. Because mkString reads file byte by byte */

    val text : StringBuilder = new StringBuilder("")
    for(line <- Source.fromFile(s"/home/ashish/Documents/workspace/scala-assignment-3/src/resources/input/${source}").getLines())
      text.append(s"$line\n")

    text.toString()
  }

}
