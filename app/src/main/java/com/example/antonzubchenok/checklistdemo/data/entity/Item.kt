package com.example.antonzubchenok.checklistdemo.data.entity

import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by anton.zubchenok
 * 7/26/18.
 */

@Entity(tableName = "items")
data class Item(
		@PrimaryKey(autoGenerate = true) var id: Int,
		var text: String,
		var isChecked: Boolean
)