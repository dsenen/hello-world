case class Activity(date: String, activity: String) {
  def getDates(v: Vector[Activity]) = {
	  v match {
	    case Vector(Activity(d, a)) if a == "Run" => println(d)
	    case _ => println("No sports")
	  }
  }
}

val dave = Activity("01-01", "Run")

dave match {
  case Activity(d, a) if a == "Run" => println(d)
  case _ => println("No sports")
}

val activities = Vector(
              Activity("01-01", "Run"),
              Activity("01-03", "Ski"),
              Activity("01-04", "Run"),
              Activity("01-10", "Ski"),
              Activity("01-03", "Run"))

dave.getDates(activities)