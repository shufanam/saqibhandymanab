package com.saqibhandymanab.app.modules.landing.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class LandingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcome: String? = MyApp.getInstance().resources.getString(R.string.lbl_welcome)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSelectyouracc: String? =
      MyApp.getInstance().resources.getString(R.string.msg_select_your_acc)

)
