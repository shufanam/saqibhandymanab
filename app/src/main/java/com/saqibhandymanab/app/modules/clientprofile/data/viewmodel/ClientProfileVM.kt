package com.saqibhandymanab.app.modules.clientprofile.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibhandymanab.app.modules.clientprofile.`data`.model.CardsstatisticRowModel
import com.saqibhandymanab.app.modules.clientprofile.`data`.model.ClientProfileModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ClientProfileVM : ViewModel(), KoinComponent {
  val clientProfileModel: MutableLiveData<ClientProfileModel> =
      MutableLiveData(ClientProfileModel())

  var navArguments: Bundle? = null

  val cardsstatisticList: MutableLiveData<MutableList<CardsstatisticRowModel>> =
      MutableLiveData(mutableListOf())
}
