package com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class ListwallrepairOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWallrepairOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_wall_repair2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlumping: String? = MyApp.getInstance().resources.getString(R.string.lbl_plumping)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWallpainting: String? = MyApp.getInstance().resources.getString(R.string.lbl_wall_painting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWalldecoration: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_wall_decoration)

)
