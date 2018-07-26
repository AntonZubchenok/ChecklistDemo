package com.example.antonzubchenok.checklistdemo.main

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.example.antonzubchenok.checklistdemo.R
import com.example.antonzubchenok.checklistdemo.data.local.MyDatabase
import com.example.antonzubchenok.checklistdemo.util.replaceFragmentInActivity

class MainActivity : AppCompatActivity() {

	private lateinit var mainPresenter: MainPresenter

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.ac_main)

		val mainFragment =
				supportFragmentManager.findFragmentById(R.id.contentFrame) as MainFragment?
						?: MainFragment.newInstance().also {
							replaceFragmentInActivity(it, R.id.contentFrame)
						}

		mainPresenter = MainPresenter(mainFragment, MyDatabase.getInstance(this).itemDao())
	}
}
