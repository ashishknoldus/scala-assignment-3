package main.com.knoldus.ashish.datahandler

import java.io.{File, FileNotFoundException, IOException, PrintWriter}

/**
  * Created by ashish on 1/27/17.
  */
class FileAsOutputSource(sourceArg : String) extends OutputExporter{

  val source : String = sourceArg

  override def exportTextToSource(text: String): Boolean = {

    val writer = new PrintWriter(new File(s"/home/ashish/Documents/workspace/scala-assignment-3/src/resources/output/${source}"))
    writer.println(text)

    if(writer.checkError()) {
        println("Couldn't write data to file. Error!")
        writer.close()
        return false
    }

    writer.close()
    true

  }
}