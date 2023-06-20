package com.saqibhandymanab.app.modules.handymanlogin.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class HandymanLogInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWearelooking: String? =
      MyApp.getInstance().resources.getString(R.string.msg_we_are_looking)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltext: String? = MyApp.getInstance().resources.getString(R.string.lbl_email)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotpassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabeltextTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_remember_me)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtConfirmation: String? =
      MyApp.getInstance().resources.getString(R.string.msg_don_t_have_an_a2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSignUp: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_up)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldcontentValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFieldcontentOneValue: String? = null
)
