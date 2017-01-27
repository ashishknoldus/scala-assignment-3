package main.com.knoldus.ashish.datahandler

import scala.io.Source

/**
  * Created by ashish on 1/27/17.
  */
class FileAsInputSource(sourceArg : String) extends InputGrabber{

  val source : String = sourceArg

  override def getText(): String = {

    Source.fromFile(s"/home/ashish/Documents/workspace/scala-assignment-3/src/resources/input/${source}").mkString

  }

}
