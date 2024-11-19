package com.example.alertbox

import android.app.Dialog
import android.content.DialogInterface
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.alertbox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
     private  lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.alertBoxBtn.setOnClickListener {
              val builder =  AlertDialog.Builder(this)
             builder.setTitle("Are you sure?")
            builder.setIcon(R.drawable.warning_icon)
            builder.setMessage("Are You sure Do You want to Quit this Apps")
             builder.setPositiveButton("yes" ,  DialogInterface.OnClickListener { dialog, which ->
                 finish()
             })

             builder.setNegativeButton("No" , DialogInterface.OnClickListener { dialog, which ->
                   builder.show()
             })
            builder.show()
        }


    }
}