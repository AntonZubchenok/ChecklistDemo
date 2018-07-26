package com.example.antonzubchenok.checklistdemo.main

import com.example.antonzubchenok.checklistdemo.base.BasePresenter
import com.example.antonzubchenok.checklistdemo.base.BaseView

/**
 * Created by anton.zubchenok
 * 7/24/18.
 */
interface MainContract {

	interface View : BaseView<Presenter> {
		fun showResult(result: String)
	}

	interface Presenter : BasePresenter {
		fun getData(id: Int)
	}

}