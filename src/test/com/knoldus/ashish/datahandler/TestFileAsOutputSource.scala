package test.com.knoldus.ashish.datahandler

import java.io.File

import main.com.knoldus.ashish.datahandler.{FileAsInputSource, FileAsOutputSource, OutputExporter}
import org.junit.Test
import org.junit.Assert._

/**
  * Created by ashish on 1/29/17.
  */
class TestFileAsOutputSource {

  val inputSource = "datafile.txt"
  val outputSource = "testFileOutput.txt"
  val outputSourceObj : OutputExporter= new FileAsOutputSource(outputSource)
  val outputFileRef = new File(s"${outputSourceObj.outputLocation}$outputSource")

  val text = new FileAsInputSource(inputSource).getText()

  @Test
  def trueWhenEmptyText() : Unit = {
    assertTrue(outputSourceObj.exportText(""))
  }

  @Test
  def fileSizeZeroWhenEmptyText() : Unit = {
    outputSourceObj.exportText("")
    assertEquals(outputFileRef.length, 0)
  }

  @Test
  def fileCreatedOnExport(): Unit = {
    outputSourceObj.exportText(text)
    assertTrue(outputFileRef.exists && outputFileRef.isFile)
  }

  @Test
  def allTextIsExported(): Unit = {
    outputSourceObj.exportText(text)
    assertEquals(outputFileRef.length, text.length+1)
    //The output's length is one more than input text because of \n character
  }

  @Test
  def trueWhenCorrectText(): Unit = {
    assertTrue(outputSourceObj.exportText(text))
  }

}