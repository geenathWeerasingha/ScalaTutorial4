object main extends App{

    def  toUpper(x:String):String={
       var tex:String=""

       for(i<- x){
         if((i.toInt > 96) && (i.toInt < 123) ){
            tex+=(i.toInt-32).toChar
         }else{
            tex+=i
         }
       }
       return tex

    }

    def  toLower(x:String):String={
       var tex:String=""

       for(i<- x){
         if((i.toInt > 64) && (i.toInt < 91) ){
            tex+=(i.toInt+32).toChar
         }else{
            tex+=i
         }
       }
       return tex

    }

    def formatNamess(name:String)(pos:Int*)(func:(String)=>String)={
     
      if(pos.isEmpty){
        func(name)
      }
      else{
        var text:String= ""
        var j = 0

        for(i<-name){
          if(pos.contains(j)) text=text+func(i.toString)
          else text=text+i.toString
          j=j+1
        }

        text
      }


    }

    println(formatNamess("Benny")()(toUpper))
    println(formatNamess("Niroshan")(0,1)(toUpper))
    println(formatNamess("Saman")()(toLower))
    println(formatNamess("Kumara")(5)(toUpper))

}
