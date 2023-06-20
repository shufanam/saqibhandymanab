package com.saqibhandymanab.app.modules.confirm.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibhandymanab.app.modules.confirm.`data`.model.ConfirmModel
import org.koin.core.KoinComponent

class ConfirmVM : ViewModel(), KoinComponent {
  val confirmModel: MutableLiveData<ConfirmModel> = MutableLiveData(ConfirmModel())

  var navArguments: Bundle? = null
}
