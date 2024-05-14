package rafoshi.com.github.recycleview.model

data class ItemModel(
    val name: String,
    val onRemove: (ItemModel) -> Unit
)