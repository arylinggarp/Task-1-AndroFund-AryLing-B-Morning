package com.example.latihanfundamental

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class DataFragment : Fragment() {

    companion object {
        private const val ARG_DATA = "data"

        fun newInstance(data: String): DataFragment {
            val fragment = DataFragment()
            val args = Bundle()
            args.putString(ARG_DATA, data)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_data, container, false)

        val dataTextView = view.findViewById<TextView>(R.id.dataTextView)
        val data = arguments?.getString(ARG_DATA)
        dataTextView.text = data

        return view
    }
}
