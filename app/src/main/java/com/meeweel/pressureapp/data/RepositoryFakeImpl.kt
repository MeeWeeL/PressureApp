package com.meeweel.pressureapp.data

import com.meeweel.pressureapp.domain.FakeRepo
import com.meeweel.pressureapp.domain.Item
import io.reactivex.rxjava3.core.Single

class RepositoryFakeImpl(private val repo: FakeRepo = FakeRepo()) : Repository {

    override fun getItems() : Single<List<Item>> {
        return repo.getList()
    }

    override fun addItem(item: Item) {
        repo.addItem(item)
    }
}