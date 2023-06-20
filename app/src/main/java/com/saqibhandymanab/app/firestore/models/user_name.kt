package com.saqibhandymanab.app.firestore.models

import com.google.firebase.firestore.PropertyName
import kotlin.String
import kotlin.jvm.JvmField

public class user_name {
  @JvmField
  @PropertyName("User_Name")
  public var userName: String? = null

  @JvmField
  @PropertyName("Password")
  public var password: String? = null
}
