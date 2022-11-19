package com.ezatpanah.nested_recyclerview_youtube.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import com.ezatpanah.nested_recyclerview_youtube.R
import com.ezatpanah.nested_recyclerview_youtube.databinding.MovieItemBinding
import com.ezatpanah.nested_recyclerview_youtube.model.MovieModel

class MovieAdapter (private val movieModel: List<MovieModel>) : RecyclerView.Adapter<MovieAdapter.MovieViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.movie_item,parent,false)
        return MovieViewHolder(view)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.binding.apply {
            imgMoviePoster.load(movieModel[position].imageUrl)
        }
    }

    override fun getItemCount() =movieModel.size


    inner class MovieViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = MovieItemBinding.bind(itemView)

    }

}