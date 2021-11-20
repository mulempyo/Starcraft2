package org.techtown.starcraft2

import android.content.Context
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.swiperefreshlayout.widget.CircularProgressDrawable
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

fun getProgressDrawable(con: Context): CircularProgressDrawable {
    return CircularProgressDrawable(con).apply {
        strokeWidth = 5f
        centerRadius = 40f
        start()
    }
}

        fun ImageView.loadImage(uri:String?, progressDawable:CircularProgressDrawable){
                val option = RequestOptions().placeholder(progressDawable)
                    .error(R.mipmap.ic_launcher)

                Glide.with(context)
                    .setDefaultRequestOptions(option)
                    .load(uri)
                    .into(this)

            }
@BindingAdapter("android:imageUrl")
fun loadImage(view:ImageView,url:String){
    view.loadImage(url,getProgressDrawable(view.context))
}


