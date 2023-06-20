package com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model.ListabcRowModel
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model.ListwallrepairOneRowModel
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model.ScheduleCalendarTwoModel
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model.SpinnerZipcodeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ScheduleCalendarTwoVM : ViewModel(), KoinComponent {
  val scheduleCalendarTwoModel: MutableLiveData<ScheduleCalendarTwoModel> =
      MutableLiveData(ScheduleCalendarTwoModel())

  var navArguments: Bundle? = null

  val spinnerZipcodeList: MutableLiveData<MutableList<SpinnerZipcodeModel>> = MutableLiveData()

  val listwallrepairOneList: MutableLiveData<MutableList<ListwallrepairOneRowModel>> =
      MutableLiveData(mutableListOf())

  val listabcList: MutableLiveData<MutableList<ListabcRowModel>> = MutableLiveData(mutableListOf())
}
