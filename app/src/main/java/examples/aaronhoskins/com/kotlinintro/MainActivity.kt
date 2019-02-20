package examples.aaronhoskins.com.kotlinintro

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.tvDisplay

data class User (var userEmail: String?, var password: String?){
    var email : String?
    get() {
        println("CUSTOM")
        return userEmail
    }
    set(value) {
        println("SETTER")
        userEmail = value
    }

}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        //runtime constant
        val message = returnValue()

        val isNull = 123

        //elvis operator
        val value = isNull ?: "NULL"

        //Android default stuff
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Set by values
        val user = User("","")

        //set param by var names
        val user2 = User(password = "password", userEmail = "email")
        user.userEmail = "aaronhosk@gmail.com"

        //Inline Functions
        fun processString(passedString : String) : String {
            //String.format("%s FUNCTION RETURN", passedString)//Java equiv of line below
            return "$passedString FUNCTION RETURN"
        }
        tvDisplay.text = processString("PRE STRING ")
        //type checking
        if(value is String) {
            tvDisplay.text = value
        }
        mathStuff(12)

        val me = PersonProcessor("toby", "hoskins")
        me.mixTheLettersUp()

        val notMe = PersonProcessor("Bob", "Saget")
        notMe.mixTheLettersUp()
    }

    fun returnValue() : String {
        return "returnValue"
    }

    fun mathStuff(value : Int) {
        val divide = value.div(1).minus(1).plus(100.0007)
        val subtraction = value.minus(2)
        Log.d("TAG","$divide DIVIDE")
        Log.d("TAG","$subtraction MUNUS")
    }
}
