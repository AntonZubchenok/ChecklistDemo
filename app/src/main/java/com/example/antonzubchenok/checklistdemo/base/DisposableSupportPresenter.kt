package com.example.antonzubchenok.checklistdemo.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable


/**
 * Created by anton.zubchenok
 * 7/26/18.
 */
abstract class DisposableSupportPresenter {

	private var mDisposables: CompositeDisposable? = null

	protected fun addDisposable(disposable: Disposable): Disposable {
		if (mDisposables == null) {
			mDisposables = CompositeDisposable()
		}
		mDisposables!!.add(disposable)
		return disposable
	}

	protected fun dropDisposables() {
		if (mDisposables != null) {
			mDisposables!!.clear()
			mDisposables = null
		}
	}

}