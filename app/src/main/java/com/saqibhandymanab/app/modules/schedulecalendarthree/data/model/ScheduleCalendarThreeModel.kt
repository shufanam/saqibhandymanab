package com.saqibhandymanab.app.modules.schedulecalendarthree.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class ScheduleCalendarThreeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWallrepair: String? = MyApp.getInstance().resources.getString(R.string.lbl_wall_repair)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDescribeyourp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_describe_your_p)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_ex_i_have_wat)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDate: String? = MyApp.getInstance().resources.getString(R.string.lbl_date2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDateOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_08_11_2022)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_09_30_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAttachphotos: String? = MyApp.getInstance().resources.getString(R.string.lbl_attach_photos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSeeavailablew: String? =
      MyApp.getInstance().resources.getString(R.string.msg_see_available_w)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2023)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2024)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcodeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_2025)

)
