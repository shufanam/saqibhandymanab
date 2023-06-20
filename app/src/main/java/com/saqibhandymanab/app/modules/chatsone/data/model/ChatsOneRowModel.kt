package com.saqibhandymanab.app.modules.chatsone.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtVernonPowell: String? = MyApp.getInstance().resources.getString(R.string.lbl_thomas_lukas2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAreyouthere: String? = MyApp.getInstance().resources.getString(R.string.lbl_are_you_there)

)
