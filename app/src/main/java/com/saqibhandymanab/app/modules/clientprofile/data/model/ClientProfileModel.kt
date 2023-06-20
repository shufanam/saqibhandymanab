package com.saqibhandymanab.app.modules.clientprofile.`data`.model

import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.di.MyApp
import kotlin.String

data class ClientProfileModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtProfileOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMinnieRamsey: String? = MyApp.getInstance().resources.getString(R.string.lbl_minnie_ramsey)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmail: String? = MyApp.getInstance().resources.getString(R.string.msg_minnie_email_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStatistics: String? = MyApp.getInstance().resources.getString(R.string.lbl_statistics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSettingsandPr: String? =
      MyApp.getInstance().resources.getString(R.string.msg_settings_and_pr)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_payment_option)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddress: String? = MyApp.getInstance().resources.getString(R.string.lbl_address)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogout: String? = MyApp.getInstance().resources.getString(R.string.lbl_logout)

)
