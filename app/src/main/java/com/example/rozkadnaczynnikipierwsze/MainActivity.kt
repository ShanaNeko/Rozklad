package com.example.rozkadnaczynnikipierwsze

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.b1).setOnClickListener() {
            val liczba = findViewById<EditText>(R.id.liczba)
            var n = liczba.text.toString().toInt()
            var array = arrayOf<Int>()
                var i = 2
                while (n != 1) {
                if (n % i == 0) {
                    array += i
                    n /= i;
                } else {
                    i++;
                }
                    val a = AlertDialog.Builder(this)
                    a.setTitle("Rozkład na czynniki pierwsze")
                    a.setMessage("Rozkład liczby $n wynosi: " + array)
                    a.show();
            }
            }

        }
    }

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