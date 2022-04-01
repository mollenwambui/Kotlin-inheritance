fun main(){
var car=Car("Audi","audi-a2","pink",54)
    car.carry(76)
    car.identity()
    var fee= car.calculateparkingfee(4)

    println(car.calculateparkingfee(4))
    var nissan=Bus("Ferari","New","Black",23)
    val maxTripFare = nissan.maxTripFare(50.00)
    println(maxTripFare)

    var busfee=  nissan.calculateparkingfee(5)
    nissan.identity()
    println(nissan.calculateparkingfee(7))



}
//Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
  open class Car (var make:String,var model:String,var color:String,var capacity:Int){
   open fun carry(people:Int){
      var  x=people-capacity
        if (people<=capacity){
            println("carrying $people passengers!")
        }
        else
            println("Over Capacity by $x passengers")
    }
    open  fun  identity(){
        println("I am a $color $make $model")
    }
    open fun calculateparkingfee(hours:Int):Int{
        var fee=hours*20
        return fee
    }

}
 class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color,capacity) {
     fun maxTripFare(fare: Double): Double {
         var money = fare *capacity
         return money
     }
      override fun calculateparkingfee(hours:Int):Int{
         var  busfee=hours*capacity
         return  busfee
     }

     }

