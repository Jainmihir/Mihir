package com.erp.erp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase

class SignUp :  AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        var database = FirebaseDatabase.getInstance()
        var ref = database.getReference("users")



        findViewById<Button>(R.id.s_alreadyreg).setOnClickListener {
            var intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()

        }
    }

}