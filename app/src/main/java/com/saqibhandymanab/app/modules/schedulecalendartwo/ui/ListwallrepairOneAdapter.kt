package com.saqibhandymanab.app.modules.schedulecalendartwo.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.databinding.RowListwallrepairOneBinding
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model.ListwallrepairOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListwallrepairOneAdapter(
  var list: List<ListwallrepairOneRowModel>
) : RecyclerView.Adapter<ListwallrepairOneAdapter.RowListwallrepairOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListwallrepairOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listwallrepair_one,parent,false)
    return RowListwallrepairOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListwallrepairOneVH, position: Int) {
    val listwallrepairOneRowModel = ListwallrepairOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listwallrepairOneRowModel = list[position]
    holder.binding.listwallrepairOneRowModel = listwallrepairOneRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListwallrepairOneRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: ListwallrepairOneRowModel
    ) {
    }
  }

  inner class RowListwallrepairOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListwallrepairOneBinding = RowListwallrepairOneBinding.bind(itemView)
  }
}
