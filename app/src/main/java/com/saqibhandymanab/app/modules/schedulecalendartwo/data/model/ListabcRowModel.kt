package com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class ListabcRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAbc: String? = MyApp.getInstance().resources.getString(R.string.lbl_jan)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbcOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_feb)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbcTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_mar)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAbcThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_apr)

)
