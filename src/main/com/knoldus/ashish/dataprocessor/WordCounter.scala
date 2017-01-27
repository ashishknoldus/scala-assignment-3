package main.com.knoldus.ashish.dataprocessor

import scala.collection.mutable.HashMap

/**
  * Created by ashish on 1/27/17.
  */

class WordCounter {

}

object WordCounter {

  def wordCount(text : String) : String = {

    val textArray : Array[String] = text.replaceAll("[.,]+","").split("\\s++")

    val wordCountMap = new HashMap[String, Long]()

    textArray.foreach(word => {

      if(wordCountMap.contains(word)) {
        wordCountMap(word) += 1
      } else {
        wordCountMap(word) = 1
      }

    })

    stringifyMap(wordCountMap)
  }

  def stringifyMap(hashMap: HashMap[String, Long]) : String = {

    val stringStore = new StringBuilder("")

    hashMap.toList.sortBy(_._1).foreach( pair => {
      stringStore.append(f"${pair._1}%20s ~> ${pair._2}\n")
    })

    stringStore.toString()
  }

}
