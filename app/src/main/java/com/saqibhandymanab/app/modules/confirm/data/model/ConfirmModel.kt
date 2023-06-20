package com.saqibhandymanab.app.modules.confirm.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class ConfirmModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOrdersummary: String? = MyApp.getInstance().resources.getString(R.string.lbl_order_summary)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmed: String? = MyApp.getInstance().resources.getString(R.string.lbl_confirmed)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescription: String? =
      MyApp.getInstance().resources.getString(R.string.msg_your_booking_ha)

)
