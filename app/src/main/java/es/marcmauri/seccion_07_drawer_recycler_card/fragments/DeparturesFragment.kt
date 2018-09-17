package es.marcmauri.seccion_07_drawer_recycler_card.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import es.marcmauri.seccion_07_drawer_recycler_card.R
import es.marcmauri.seccion_07_drawer_recycler_card.models.Flight


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class DeparturesFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_departures, container, false)
    }

    private fun getFlights(): ArrayList<Flight> {
        return object: ArrayList<Flight>() {
            init {
                add(Flight(1, "Seattle", R.drawable.seattle))
                add(Flight(2, "New York", R.drawable.new_york))
                add(Flight(3, "London", R.drawable.london))
                add(Flight(4, "Seville", R.drawable.seville))
                add(Flight(5, "Venice", R.drawable.venice))
                add(Flight(6, "Athens", R.drawable.athens))
                add(Flight(7, "Toronto", R.drawable.toronto))
                add(Flight(8, "Dublin", R.drawable.dublin))
                add(Flight(9, "Caribbean", R.drawable.caribbean_sea))
            }
        }
    }
}
