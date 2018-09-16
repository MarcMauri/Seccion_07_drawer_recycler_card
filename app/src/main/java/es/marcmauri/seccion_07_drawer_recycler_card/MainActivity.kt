package es.marcmauri.seccion_07_drawer_recycler_card

import android.os.Bundle
import android.support.v7.widget.Toolbar
import es.marcmauri.mylibrary.ToolbarActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : ToolbarActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toolbarToLoad(toolbar as Toolbar)
    }
}
