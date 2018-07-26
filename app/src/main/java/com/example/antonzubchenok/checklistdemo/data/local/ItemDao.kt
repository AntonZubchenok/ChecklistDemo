package com.example.antonzubchenok.checklistdemo.data.local

import android.arch.persistence.room.*
import com.example.antonzubchenok.checklistdemo.data.entity.Item

/**
 * Created by anton.zubchenok
 * 7/26/18.
 */

@Dao
interface ItemDao {

	@Query("SELECT * FROM Items")
	fun getItems(): List<Item>

	@Query("SELECT * FROM Items WHERE id = :itemId")
	fun getItemById(itemId: String): Item?

	@Insert(onConflict = OnConflictStrategy.REPLACE)
	fun insertItem(item: Item)

	@Update
	fun updateItem(item: Item): Int

	@Query("DELETE FROM Items WHERE id = :itemId")
	fun deleteItemById(itemId: String): Int

	@Query("DELETE FROM Items")
	fun deleteItems()

}