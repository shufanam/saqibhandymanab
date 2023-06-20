package com.saqibhandymanab.app.modules.homeone.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class HomeOneRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtRightnow: String? = MyApp.getInstance().resources.getString(R.string.lbl_right_now)
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
  var txtThomasLukas: String? = MyApp.getInstance().resources.getString(R.string.lbl_thomas_lukas2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAppliancerepai: String? =
      MyApp.getInstance().resources.getString(R.string.msg_appliance_repai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.lbl_25_hr)

)
