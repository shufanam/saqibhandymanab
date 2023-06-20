package com.saqibhandymanab.app.modules.schedule.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class DatetimeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDdmmyy: String? = MyApp.getInstance().resources.getString(R.string.lbl_dd_mm_yy)

)
