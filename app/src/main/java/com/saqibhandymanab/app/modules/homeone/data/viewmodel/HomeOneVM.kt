package com.saqibhandymanab.app.modules.homeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibhandymanab.app.modules.homeone.`data`.model.HomeOne1RowModel
import com.saqibhandymanab.app.modules.homeone.`data`.model.HomeOneModel
import com.saqibhandymanab.app.modules.homeone.`data`.model.HomeOneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeOneVM : ViewModel(), KoinComponent {
  val homeOneModel: MutableLiveData<HomeOneModel> = MutableLiveData(HomeOneModel())

  var navArguments: Bundle? = null

  val homeOneList: MutableLiveData<MutableList<HomeOneRowModel>> = MutableLiveData(mutableListOf())

  val homeOne1List: MutableLiveData<MutableList<HomeOne1RowModel>> =
      MutableLiveData(mutableListOf())
}
