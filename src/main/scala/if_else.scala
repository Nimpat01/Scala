object if_else extends App{
  val x:Int = 20
  var res:String = ""
  if (x==20){
    println(f"X is equal to $x%d")
    res = "x == 20"
  }else {
    println(f"X is not equal to $x%d")
    res = "x != 20"
  }
println(res)

  //Now above code we can convert into single line
  val res2 = if(x == 20) "x == 20" else "x != 20"
  println(res2)
  //Advantage of using above method is we can use immutable "val" instead of mutable "var"
  println(if(x == 20) "x == 20" else "x != 20")
}
