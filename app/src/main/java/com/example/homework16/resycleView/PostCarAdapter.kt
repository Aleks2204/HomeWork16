package com.example.homework16.resycleView


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.homework16.R
import com.example.homework16.resycleView.models.PostCar
import kotlinx.android.synthetic.main.post_car_adapter_item.view.*

class PostCarAdapter : RecyclerView.Adapter<PostCarViewHolder>() {
    var postCarList = listOf<PostCar>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostCarViewHolder {
        return PostCarViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.post_car_adapter_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: PostCarViewHolder, position: Int) {
        holder.bind(data = postCarList[position])
    }

    override fun getItemCount(): Int {
        return postCarList.size
    }
}

class PostCarViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(data: PostCar) {
        itemView.tvPostCarTitle.text = data.postCarTitle
        itemView.tvPostCarDescription.text = data.postCarDescription
        itemView.ivPostCarPicture.setImageResource(data.postCarImageResource)
    }
}
