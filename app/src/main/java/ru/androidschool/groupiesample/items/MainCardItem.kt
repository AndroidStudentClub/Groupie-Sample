package ru.androidschool.groupiesample.items

import android.view.View
import com.xwray.groupie.GroupieAdapter
import com.xwray.groupie.viewbinding.BindableItem
import ru.androidschool.groupiesample.R
import ru.androidschool.groupiesample.databinding.ItemCardBinding

class MainCardContainer(
    private val title: String? = "",
    private val description: String? = "",
    private val onClick: (url: String) -> Unit,
    private val items: List<BindableItem<*>>
) : BindableItem<ItemCardBinding>() {

    override fun getLayout() = R.layout.item_card

    override fun bind(binding: ItemCardBinding, position: Int) {
        binding.titleTextView.text = title
        binding.descriptionTextView.text = description
        binding.itemsContainer.adapter = GroupieAdapter().apply { addAll(items) }
    }

    override fun initializeViewBinding(view: View): ItemCardBinding {
        return ItemCardBinding.bind(view)
    }
}
