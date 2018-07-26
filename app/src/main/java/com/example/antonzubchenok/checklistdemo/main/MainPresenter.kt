package com.example.antonzubchenok.checklistdemo.main

import android.util.Log

/**
 * Created by anton.zubchenok
 * 7/24/18.
 */
class MainPresenter(private val mainView: MainContract.View) : MainContract.Presenter {

	init {
		mainView.presenter = this
	}

	override fun getData(id: Int) {
		Log.e("LOGLOG", "Presenter - getData")
		mainView.showResult("blah")

	}

	override fun start() {
		Log.e("LOGLOG", "Presenter - start")
	}
}