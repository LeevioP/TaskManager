package com.d121201074.taskmanager.repository

import androidx.lifecycle.LiveData
import com.d121201074.taskmanager.database.TaskDao
import com.d121201074.taskmanager.database.TaskEntry

class TaskRepository(val taskDao: TaskDao) {

    fun insert(taskEntry: TaskEntry) = taskDao.insert(taskEntry)

    fun updateData(taskEntry: TaskEntry) = taskDao.update(taskEntry)

    fun deleteItem(taskEntry: TaskEntry) = taskDao.delete(taskEntry)

    fun deleteAll() {
        taskDao.deleteAll()
    }

    fun getAllTasks(): LiveData<List<TaskEntry>> = taskDao.getAllTask()
}