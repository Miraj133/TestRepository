package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class OrderFragment : Fragment() {


    companion object {
        private const val PHONE_KEY = "phone"
        fun newInstance(etPhone: Editable): OrderFragment {
            return OrderFragment().apply {
                arguments = bundleOf(
                    PHONE_KEY to etPhone.toString()
                )
            }
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.order_activity,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val etPhone = view.findViewById<EditText>(R.id.etPhone)
        val etFirsText = view.findViewById<EditText>(R.id.etFirsText)
        //etFirsText.setText(arguments.text.getString("PHONE_KEY"))
        etPhone.text = "fd $etPhone"
    }

}