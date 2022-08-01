object main extends App{

 print("Enter an integer:")
 val x=scala.io.StdIn.readInt()

 def evenodd(x:Int)=x match {
   case x if(x<0) => println(x+" is negative")
   case x if(x==0) => println(x+" is zero")
   case x if(x%2==0)=> println(x+" is an even number")
   case x if(x%2==1)=> println(x+" is an odd number")
 }

 evenodd(x)
}
