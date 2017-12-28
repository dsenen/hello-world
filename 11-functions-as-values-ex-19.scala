case class Activity(date: String, activities: String) {
  def getDates(v:Vector[String]) = {
	  v.foreach(print)
  }
}

val activities = Vector(
              Activity("01-01", "Run"),
              Activity("01-03", "Ski"),
              Activity("01-04", "Run"),
              Activity("01-10", "Ski"),
              Activity("01-03", "Run"))