object String_interpolations extends App {
  val name = "Nimesh"
  val age  = 27

  println(name + " is " + age + " year old")
  println(s"$name is $age year old")      //S string interpolations
  println(f"$name%s is $age%d year old")  //F string interpolation
  println(raw"Hello \n world")            //Raw string interpolation
}
