package ru.androidschool.groupiesample.items

import android.view.View
import com.squareup.picasso.Picasso
import com.xwray.groupie.viewbinding.BindableItem
import ru.androidschool.groupiesample.R
import ru.androidschool.groupiesample.databinding.ItemWithTextBinding

class MovieItem(private val content: MovieContent) : BindableItem<ItemWithTextBinding>() {

    override fun getLayout() = R.layout.item_with_text

    override fun bind(binding: ItemWithTextBinding, position: Int) {
        binding.description.text = content.title
        Picasso.get()
            .load(content.url)
            .into(binding.imagePreview)
    }

    override fun initializeViewBinding(view: View): ItemWithTextBinding {
        return ItemWithTextBinding.bind(view)
    }
}


data class MovieContent(
    val title: String,
    val url: String
)