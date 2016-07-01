package models

import javax.persistence._
import javax.persistence.Column

@Embeddable
class Address (var house_no: String ,var street_name: String ,private var city: String ) {
 def this() = this ( null, null, null)
}

