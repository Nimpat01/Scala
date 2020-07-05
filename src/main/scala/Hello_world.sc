/*object higher_order_function{
  def sum (f:Int =>Int, a:Int, b:Int):Int={
    def loop(a:Int,acc:Int):Int=
      if(a>b) acc
      else loop(a+1,f(a)+acc)
    loop(a,0)
  }
  sum(x=>x*x,3,5)
}*/
/*
def sum (f:Int => Int):(Int,Int)=>Int={
  def sumF(a:Int,b:Int):Int=
    if(a>b) 0
    else f(a)+sumF(a+1,b)
  sumF
}
sum(x=>x)(0,10)*/
/*def sum(f:Int=>Int)(a:Int,b:Int):Int={
  if (a>b) 0
  else f(a)+sum(f)(a+1,b)
}
sum(x=>x*x*x)(0,10)*/
/*object exe {
  def product(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
    product(x => x)(1, 10)
  def fact(n:Int):Int = product(x=>x)(1,n)
    fact(5)

}*/
