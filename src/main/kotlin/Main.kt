fun main() {
    var data = Human("Mary",40,60)
    data.eat(10)
    data.speak("My name is Samara")
    data.birthday()
    println(data.age)

    var theUser = user("Annet","Jepkorir","annet@gmail.com",87547544,"6458438")
    println(theUser.firstName)
    println(theUser.email)


}

    //Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
//- eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food”
//and increments the human’s weight by the weight of the food eaten
//- speak(speech: String) :Prints the string passed to it
//birthday( ) :Increments the human’s age by 1
    class Human(var name: String, var age: Int, var weightKg: Int) {
        fun eat(foodWeight: Int) {
            var newWeight = weightKg + foodWeight
            println("I am eating $newWeight Kgs of food")
        }

        fun speak(speech: String) {
            println(speech)
        }

        fun birthday() {
            ++age
        }

    }


//    Create a data class User with these fields: firstName, lastName, email,
//    phoneNumber, password. Create an instance of User and print out any 2
//    attributes

    data class user (var firstName: String, var lastName: String, var email: String, var phoneNumber:Int, var password: String){
    }

