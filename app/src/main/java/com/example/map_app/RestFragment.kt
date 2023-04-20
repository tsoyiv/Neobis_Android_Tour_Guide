package com.example.map_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RestFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_rest, container, false)
        recyclerView = view.findViewById(R.id.recyclerviewRest)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val items: MutableList<Item> = mutableListOf()
        items.add(Item("Cyclone", "Проспект Чуй 136", R.drawable.a, "1.5 km", "Открыт до 24:00"))
        items.add(Item("Anar", "ул. Иса Ахунбаева 17А", R.drawable.b, "1.5 km", "Открыт до 24:00"))
        items.add(Item("Бай Казан", "Проспект  Чуй 136", R.drawable.c, "1.5 km", "Открыт до 24:00"))
        items.add(Item("BARHAT", "Проспект Чуй 136", R.drawable.d, "1.5 km", "Открыт до 24:00"))
        items.add(Item("Тринити", "Проспект Чуй 136", R.drawable.e, "1.5 km", "Открыт до 24:00"))
        items.add(Item("Кайф", "Проспект Чуй 136", R.drawable.f, "1.5 km", "Открыт до 24:00"))

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = MyAdapter(requireContext(), items)
    }
}
