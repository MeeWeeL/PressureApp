package com.meeweel.pressureapp.data.repository

import com.meeweel.pressureapp.domain.Item
import io.reactivex.rxjava3.core.Single

interface Repository {

    fun getItems(): Single<List<Item>>
    fun addItem(item: Item): Single<List<Item>>
}