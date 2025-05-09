package bailooon.com.github.listadecompras.data

import androidx.room.Database
import androidx.room.RoomDatabase
import bailooon.com.github.listadecompras.model.ItemModel

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
}