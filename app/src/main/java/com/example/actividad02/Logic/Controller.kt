package com.example.actividad02.Logic

import android.util.Log
import android.widget.Button
import com.example.actividad02.Data.RepositoryClient
import com.example.actividad02.R
import com.example.actividad02.Views.Dialog
import com.example.actividad02.Views.MainActivity
import android.view.View
import com.example.actividad02.Logic.Interface.interfazCrud

class Controller(
    private val activity: MainActivity,
    private val dialog: Dialog
) : interfazCrud {
    init {
        cargarDatosDelRepositorio()
    }
    private fun cargarDatosDelRepositorio() {
        activity.textViewData.text = "Datos iniciales cargados"
    }
    fun start() {
        dialog.setListener(this)
        activity.btnInsert.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                // 4.3 Invocamos al Dialog con la acción
                dialog.show(Dialog.ACTION_INSERT)
            }
        })
        activity.btnUpdate.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                dialog.show(Dialog.ACTION_UPDATE)
            }
        })
        activity.btnDelete.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                dialog.show(Dialog.ACTION_DELETE)
            }
        })
    }
    override fun onInsert(newData: String) {
        activity.textViewData.text = "Éxito al insertar: $newData"
    }
    override fun onUpdate(updatedData: String) {
        activity.textViewData.text = "Éxito al actualizar: $updatedData"
    }
    override fun onDelete() {
        activity.textViewData.text = "Registro eliminado correctamente"
    }
}