package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import androidx.fragment.app.Fragment

class AuthFragment : Fragment() {




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.activity_auth,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val etPhone = view.findViewById<EditText>(R.id.etPhone)
        val btnStart = view.findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
            parentFragmentManager
                .beginTransaction()
                .add(R.id.clRoot,OrderFragment())
                .commit()
        }
    }


}