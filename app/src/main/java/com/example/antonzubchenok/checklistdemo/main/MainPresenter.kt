package com.example.antonzubchenok.checklistdemo.main

import android.util.Log
import com.example.antonzubchenok.checklistdemo.data.local.ItemDao

/**
 * Created by anton.zubchenok
 * 7/24/18.
 */
class MainPresenter(private val mainView: MainContract.View,
					private val itemDao: ItemDao) : MainContract.Presenter {

	init {
		mainView.presenter = this
	}

	override fun getData(id: Int) {
		Log.e("LOGLOG", "Presenter - getData")
		mainView.showResult("blah")
		itemDao.getItemById(id)

	}

	override fun start() {
		Log.e("LOGLOG", "Presenter - start")
	}
}