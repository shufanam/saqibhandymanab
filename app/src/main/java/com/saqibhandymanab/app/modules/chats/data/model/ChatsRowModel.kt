package com.saqibhandymanab.app.modules.chats.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class ChatsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMinnieRamsey: String? = MyApp.getInstance().resources.getString(R.string.lbl_minnie_ramsey)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtGroupFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_ha_ha_lol)

)
