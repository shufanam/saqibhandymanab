package com.saqibhandymanab.app.modules.schedulecalendartwo.ui

import android.view.View
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.appcomponents.views.DatePickerFragment
import com.saqibhandymanab.app.appcomponents.views.TimePickerFragment
import com.saqibhandymanab.app.databinding.ActivityScheduleCalendarTwoBinding
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model.ListabcRowModel
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model.ListwallrepairOneRowModel
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.model.SpinnerZipcodeModel
import com.saqibhandymanab.app.modules.schedulecalendartwo.`data`.viewmodel.ScheduleCalendarTwoVM
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScheduleCalendarTwoActivity :
    BaseActivity<ActivityScheduleCalendarTwoBinding>(R.layout.activity_schedule_calendar_two) {
  private val viewModel: ScheduleCalendarTwoVM by viewModels<ScheduleCalendarTwoVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerZipcodeList.value = mutableListOf(
    SpinnerZipcodeModel("Item1"),
    SpinnerZipcodeModel("Item2"),
    SpinnerZipcodeModel("Item3"),
    SpinnerZipcodeModel("Item4"),
    SpinnerZipcodeModel("Item5")
    )
    val spinnerZipcodeAdapter =
    SpinnerZipcodeAdapter(this,R.layout.spinner_item,viewModel.spinnerZipcodeList.value?:
    mutableListOf())
    binding.spinnerZipcode.adapter = spinnerZipcodeAdapter
    val listwallrepairOneAdapter =
    ListwallrepairOneAdapter(viewModel.listwallrepairOneList.value?:mutableListOf())
    binding.recyclerListwallrepairOne.adapter = listwallrepairOneAdapter
    listwallrepairOneAdapter.setOnItemClickListener(
    object : ListwallrepairOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListwallrepairOneRowModel) {
        onClickRecyclerListwallrepairOne(view, position, item)
      }
    }
    )
    viewModel.listwallrepairOneList.observe(this) {
      listwallrepairOneAdapter.updateData(it)
    }
    val listabcAdapter = ListabcAdapter(viewModel.listabcList.value?:mutableListOf())
    binding.recyclerListabc.adapter = listabcAdapter
    listabcAdapter.setOnItemClickListener(
    object : ListabcAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListabcRowModel) {
        onClickRecyclerListabc(view, position, item)
      }
    }
    )
    viewModel.listabcList.observe(this) {
      listabcAdapter.updateData(it)
    }
    binding.scheduleCalendarTwoVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowtimeOne.setOnClickListener {
      val destinationInstance = TimePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, TimePickerFragment.TAG) {
          selectedTime ->
        onTimeSelectedLinearRowtimeOne(selectedTime)
      }
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowdateOne.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateOne(selectedDate)
      }
    }
  }

  fun onClickRecyclerListwallrepairOne(
    view: View,
    position: Int,
    item: ListwallrepairOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListabc(
    view: View,
    position: Int,
    item: ListabcRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date) {
  }

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date) {
  }

  companion object {
    const val TAG: String = "SCHEDULE_CALENDAR_TWO_ACTIVITY"

  }
}
