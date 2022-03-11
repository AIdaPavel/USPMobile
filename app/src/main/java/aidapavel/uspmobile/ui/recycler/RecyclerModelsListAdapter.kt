package aidapavel.uspmobile.ui.recycler

import aidapavel.uspmobile.databinding.FragmentModelItemBinding
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerModelsListAdapter(private val data:List<Data>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {

        val bindingViewHolder = FragmentModelItemBinding
            .inflate(LayoutInflater.from(parent.context), parent, false)

        return ModelsViewHolder(bindingViewHolder.root)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ModelsViewHolder).bind(data[position])
    }

    override fun getItemCount() = data.size

    class ModelsViewHolder(view: View): RecyclerView.ViewHolder(view) {

        fun bind(data: Data) {
            FragmentModelItemBinding
                .bind(itemView).apply {
                    textView.text = data.name
                    cardView.setOnClickListener {

                    }
                }
        }
    }
}