package com.example.mymenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import com.example.mymenu.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object {
        private val ID_MENU_SETTINGS = Menu.FIRST
        private val ID_GROUP_BR = Menu.FIRST
        private val ID_ELEMENTO_CHECKBOX = Menu.FIRST
        private val ID_BOTONRADIO_1 = Menu.FIRST + 1
        private val ID_BOTONRADIO_2 = Menu.FIRST + 2
        private val ID_BOTONRADIO_3 = Menu.FIRST + 3
        private val ELEMENTOSUBMENU = Menu.FIRST + 4
        private var cont = 0
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    //onCreatedOptionsMenu solo se ejecuta una vez, cuando se crea el menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        //poner interrogaciones cerradas detras de menu para que no de error
//        menu?.add(Menu.NONE, ID_ELEMENTO_CHECKBOX, Menu.NONE, "CheckBox")?.setCheckable(true)
//        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_1, Menu.NONE, "Opcion 1")
//        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_2, Menu.NONE, "Opcion 2")
//        menu?.add(ID_GROUP_BR, ID_BOTONRADIO_3, Menu.NONE, "Opcion 3")
//            ?.setChecked(true)
//        menu?.setGroupCheckable(ID_GROUP_BR, true, true)
//        val sub = menu?.addSubMenu(0,0, Menu.NONE, "Titulo submenú")
//        val elementoSubMenu = sub?.add(0, ELEMENTOSUBMENU, Menu.NONE, "Elemento submenú")
        //El segundo cero se refiere al identificador del item y el primero se refiere al identificador del grupo
//        menu?.setGroupCheckable(ID_GROUP_BR, true,true)
        menuInflater.inflate(R.menu.custom_menu, menu)

        return true
    }
    //onPrepareOptionsMenu se ejecuta siempre que se llame al menu
    //Esto nos permite modificar el menu dinamicamente
    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        super.onPrepareOptionsMenu(menu)
//        var menuItem = menu?.findItem(ID_BOTONRADIO_2)
//        menuItem?.setTitle("Papafrita")
//        menuItem = menu?.findItem(ID_BOTONRADIO_3)
//        menuItem?.setIcon(R.drawable.icons8_spider_32)
//        menuItem?.setTitle(R.string.app_name)
        cont++
        binding.tvContador.text = cont.toString()


        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item) //esto tiene que ser igual que en los valores (item)
        when (item.itemId){
            ID_MENU_SETTINGS -> {Snackbar.make(binding.root, "Item seleccionado", Snackbar.LENGTH_LONG).show()

            return true}
            ID_BOTONRADIO_1 -> {Snackbar.make(binding.root, "Opción 1 seleccionada", Snackbar.LENGTH_LONG).show()

                return true}
            ID_BOTONRADIO_2 -> {Snackbar.make(binding.root, "Opción 2 seleccionada", Snackbar.LENGTH_LONG).show()

                return true}
            ID_BOTONRADIO_3 -> {Snackbar.make(binding.root, "Opción 3 seleccionada", Snackbar.LENGTH_LONG).show()

                return true}
            ELEMENTOSUBMENU -> {Snackbar.make(binding.root, "Elemento seleccionado", Snackbar.LENGTH_LONG).show()

                return true}
            R.id.itSubOption1 -> {Snackbar.make(binding.root, "Elemento seleccionado", Snackbar.LENGTH_LONG).show()

                return true}//Hay que usar llaves cuando se quieran introducir varias sentencias
        // y usarlas como bloque para lo que se le pida al programa
        }
        return false
    }


}