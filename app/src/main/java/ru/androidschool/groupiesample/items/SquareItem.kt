package ru.androidschool.groupiesample.items

import android.view.View
import com.squareup.picasso.Picasso
import com.xwray.groupie.viewbinding.BindableItem
import ru.androidschool.groupiesample.R
import ru.androidschool.groupiesample.databinding.ItemSquareBinding

class SquareItem(private val content: Content) : BindableItem<ItemSquareBinding>() {

    override fun getLayout() = R.layout.item_square

    override fun bind(viewHolder: ItemSquareBinding, position: Int) {
        Picasso.get()
            .load(content.url)
            .into(viewHolder.preview)
    }

    override fun initializeViewBinding(view: View): ItemSquareBinding {
        return ItemSquareBinding.bind(view)
    }
}


data class Content(
    val url: String
)