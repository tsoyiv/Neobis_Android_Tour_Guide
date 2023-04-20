package com.example.map_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FitnessFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_fitness, container, false)
        recyclerView = view.findViewById(R.id.recyclerviewFitness)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items: MutableList<Item> = mutableListOf()
        items.add(Item("JFC Gym", "Проспект Чуй 136", R.drawable.aa, "1.5 km", "Открыт до 24:00"))
        items.add(Item("Beauty Dance Studio", "ул. Иса Ахунбаева 17А", R.drawable.bb, "1.5 km", "Открыт до 24:00"))
        items.add(Item("UMAY DAnce Fit", "Проспект  Чуй 136", R.drawable.cc, "1.5 km", "Открыт до 24:00"))
        items.add(Item("Dasmia", "Проспект Чуй 136", R.drawable.dd, "1.5 km", "Открыт до 24:00"))

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ItemsAdapter(requireContext(), items)
    }

}