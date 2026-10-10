package com.example.actividad02.Views

import android.util.Log
import com.example.actividad02.Logic.Client
import android.content.Context
import com.example.actividad02.Logic.Interface.interfazCrud

class Dialog(private val context: Context) {

    companion object {
        const val ACTION_INSERT = 1
        const val ACTION_UPDATE = 2
        const val ACTION_DELETE = 3
    }

    private var listener: interfazCrud? = null

    // 1. Recibimos en su método setListener la referencia del Controller
    fun setListener(listener: interfazCrud) {
        this.listener = listener
    }

    // 2. Dependiendo de la acción, simulamos la captura e invocamos al listener
    fun show(typeAction: Int) {
        // Si el listener es nulo, no hacemos nada
        val currentListener = listener ?: return

        when (typeAction) {
            ACTION_INSERT -> {
                val datosCapturadosParaInsertar = "Nuevo Registro ABC"
                currentListener.onInsert(datosCapturadosParaInsertar)
            }
            ACTION_UPDATE -> {
                val datosCapturadosParaEditar = "Registro Editado XYZ"
                currentListener.onUpdate(datosCapturadosParaEditar)
            }
            ACTION_DELETE -> {
                currentListener.onDelete()
            }
        }
    }
}