package com.example.rozkadnaczynnikipierwsze

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.b1).setOnClickListener() {
            val liczba = findViewById<EditText>(R.id.liczba)
            val n = liczba.text.toString().toInt()
            var array = arrayOf<Int>()
                var i = 2
                var e = n
                while (e != 1) {
                    while (e % i == 0) {
                        array += i
                        e /= i
                    }
                    ++i; }
                    val a = AlertDialog.Builder(this)
                    val liczby= array.map { it }.toString()
                    a.setTitle("Rozkład na czynniki pierwsze")
                    a.setMessage("Rozkład liczby $n wynosi: " + liczby)
                    a.show()
        }
            }

        }

// poniżej są notatki i pomoce z internetu

// miałam problemy z stringem i tutaj znalazłam pomoc: https://stackoverflow.com/questions/45823162/how-to-convert-string-array-to-int-array-in-kotlin
//  dokładniej to ta linijka kodu;
// val ints = ints.map { it.toInt() }.toTypedArray()
// użyta w linii 28

// a tu jest kod z c++, którym się posłużyłam jako podstawa;

//cout<<"Podaj liczbę: ";
//cin>>n;
//cout<<"Czynniki pierwsze liczby "<<n<<": ";
//int k=2; //ustawiamy k na pierwszą liczbę pierwszą
//rozkład liczby na czynniki pierwsze
//while(n>1)
//{
//    while(n%k==0) //dopóki liczba jest podzielna przez k
//    {
//        cout<<k<<" ";
//        n/=k;
//    }
//    ++k;
//}
