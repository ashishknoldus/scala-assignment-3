package main.com.knoldus.ashish.datahandler

/**
  * Created by ashish on 1/27/17.
  */


/*
* Use this class as handler of data
* from the database and pass the data to
* caller
* */

class DatabaseAsInputSource(source : Any) extends InputGrabber{


  override def getText(): String = {
    "This method needs implementation"//
  }

}
