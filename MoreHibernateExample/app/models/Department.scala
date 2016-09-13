package models

import javax.persistence._

@Embeddable
class Department {
  private var name: String = null
  private var location: String = null

  def this(name: String, location: String) {
    this()
    this.name = name
    this.location = location
  }

  def getLocation: String = {
    return location
  }

  def setLocation(location: String) {
    this.location = location
  }

  def getName: String = {
    return name
  }

  def setName(name: String) {
    this.name = name
  }
}