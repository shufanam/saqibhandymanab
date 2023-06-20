package com.saqibhandymanab.app.modules.home.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinnie: String? = MyApp.getInstance().resources.getString(R.string.lbl_minnie)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt38ChestnutStr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_38_chestnut_str)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFieldtext: String? = MyApp.getInstance().resources.getString(R.string.msg_what_services_a)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategories: String? = MyApp.getInstance().resources.getString(R.string.lbl_categories)

)
