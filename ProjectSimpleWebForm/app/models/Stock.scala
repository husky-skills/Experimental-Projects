package models
import scala.collection.mutable.ListBuffer

/**
  * Created by Mahendra on 12-09-2016.
  */
case class Stock(var symbol:String,var company:Option[String])

object Stock {
  /* Below code is to just add persistence in Stock model */
  val lst = ListBuffer[Stock]()
  def save(stock: Stock)= {
    lst+=stock
    println(s"New stock is added to $lst")
  }
}