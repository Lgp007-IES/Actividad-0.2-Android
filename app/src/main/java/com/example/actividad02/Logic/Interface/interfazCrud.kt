package com.example.actividad02.Logic.Interface

interface interfazCrud {
    fun onInsert(newData: String)
    fun onUpdate(updatedData: String)
    fun onDelete()
}