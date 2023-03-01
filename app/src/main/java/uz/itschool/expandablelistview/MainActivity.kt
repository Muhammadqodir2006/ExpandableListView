package uz.itschool.expandablelistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ExpandableListView
import uz.itschool.expandablelistview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var expandableListView: ExpandableListView
    private lateinit var binding : ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        expandableListView = binding.listViewExpandable
        val a : ArrayList<String> = getMap().keys.toList() as ArrayList<String>
        val adapter = Adapter(a, getMap())
        expandableListView.adapter = adapter


    }
    fun getMap(): MutableMap<String, ArrayList<String>> {
        val map = mutableMapOf<String, ArrayList<String>>()
        map["Cars"] = arrayListOf("Audi", "BMW", "Mercedes Benz", "Rolls Royce")
        map["Phones"] = arrayListOf("Samsung", "Apple", "Redmi", "LG")
        map["TV"] = arrayListOf("LG", "Samsung", "Shivaki", "Artel")
        return map
    }

}