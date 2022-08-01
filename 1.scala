object main extends App{

 def interest(amount:Double)={
   if(amount<=20000){
     amount * 0.02
   }
   else if(amount <= 200000){
     amount * 0.04
   }

   else if(amount <= 2000000){
     amount * 0.035
   }

   else if(amount > 2000000){
     amount * 0.065
   }

}

println(interest(20000))
println(interest(200000))
println(interest(2000000))

}
