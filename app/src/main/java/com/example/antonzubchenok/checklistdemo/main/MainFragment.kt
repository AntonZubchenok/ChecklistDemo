package com.example.antonzubchenok.checklistdemo.main

import android.os.Bundle
import android.support.v4.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.antonzubchenok.checklistdemo.R

/**
 * Created by anton.zubchenok
 * 7/24/18.
 */
class MainFragment : Fragment(), MainContract.View {

	override lateinit var presenter: MainContract.Presenter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)

		presenter.getData(21)
	}

	override fun onCreateView(inflater: LayoutInflater,
							  container: ViewGroup?,
							  savedInstanceState: Bundle?): View? {
		return inflater.inflate(R.layout.fr_main, container, false)
	}

	override fun onResume() {
		super.onResume()
		presenter.start()
	}

	override fun showResult(result: String) {
		Log.e("LOGLOG", "MainFragment - showResult")
	}

	companion object {
		fun newInstance() = MainFragment()
	}
}