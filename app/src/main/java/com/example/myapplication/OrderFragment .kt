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
import com.example.myapplication.databinding.OrderActivityBinding

class OrderFragment : Fragment() {


    companion object {
         const val PHONE_KEY = "phone"
        fun newInstance(etPhone: String): OrderFragment {
            return OrderFragment().apply {
                arguments = bundleOf(
                    PHONE_KEY to etPhone.toString()
                )
            }
        }
    }

    private lateinit var binding: OrderActivityBinding

    var phone: String?=null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = OrderActivityBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        phone = arguments?.getString(PHONE_KEY)
        binding.etFirsText.setText("$phone")
    }

}