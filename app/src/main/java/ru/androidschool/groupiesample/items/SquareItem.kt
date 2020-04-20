package ru.androidschool.groupiesample.items


import com.squareup.picasso.Picasso
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.item_square.*
import ru.androidschool.groupiesample.R

class SquareItem(private val content: Content) : Item() {

    override fun getLayout() = R.layout.item_square

    override fun bind(viewHolder: GroupieViewHolder, position: Int) {
        Picasso.get()
            .load(content.url)
            .into(viewHolder.preview)
    }
}


data class Content(
    val url: String
)