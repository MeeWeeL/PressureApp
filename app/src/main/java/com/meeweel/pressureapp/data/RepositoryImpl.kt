package com.meeweel.pressureapp.data

import com.meeweel.pressureapp.domain.Item
import io.reactivex.rxjava3.core.Single

class RepositoryImpl : Repository {

    override fun getItems(): Single<List<Item>> {
        TODO("Not yet implemented")
    }

    override fun addItem(item: Item) {
        TODO("Not yet implemented")
    }
}