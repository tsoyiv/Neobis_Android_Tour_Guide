package com.example.map_app

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CinemaFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_cinema, container, false)
        recyclerView = view.findViewById(R.id.recyclerviewCinema)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items: MutableList<Item> = mutableListOf()
        items.add(Item("Broadwey", "Проспект Чуй 136", R.drawable.aaa, "1.5 km", "Открыт до 24:00"))
        items.add(Item("Манас", "ул. Иса Ахунбаева 17А", R.drawable.bbb, "1.5 km", "Открыт до 24:00"))
        items.add(Item("Ала-Тоо", "Проспект  Чуй 136", R.drawable.ccc, "1.5 km", "Открыт до 24:00"))
        items.add(Item("ЦУМ Сinema", "Проспект Чуй 136", R.drawable.ddd, "1.5 km", "Открыт до 24:00"))

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = ItemsAdapter(requireContext(), items)
    }
}