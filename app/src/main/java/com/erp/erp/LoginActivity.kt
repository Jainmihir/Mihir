package com.erp.erp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class LoginActivity: AppCompatActivity()  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)
        var database = FirebaseDatabase.getInstance()
        var ref = database.getReference("users")

        findViewById<Button>(R.id.l_signupb).setOnClickListener {
            var intent = Intent(this,SignUp::class.java)
            startActivity(intent)
            finish()
        }


    }
}