package com.saqibhandymanab.app.modules.cancelfinishworking.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class CancelFinishWorkingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtOnGoing: String? = MyApp.getInstance().resources.getString(R.string.lbl_on_going)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt0322: String? = MyApp.getInstance().resources.getString(R.string.lbl_03_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_3)

)
