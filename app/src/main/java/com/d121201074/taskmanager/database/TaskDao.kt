package com.d121201074.taskmanager.database

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface TaskDao {

    @Insert
    fun insert(taskEntry: TaskEntry)

    @Delete
    fun delete(taskEntry: TaskEntry)

    @Update
    fun update(taskEntry: TaskEntry)

    @Query("DELETE FROM task_Table")
    fun deleteAll()

    @Query("SELECT * FROM task_Table ORDER BY timestamp")
    fun getAllTask(): LiveData<List<TaskEntry>>
}

