package com.saqibhandymanab.app.modules.schedulecalendarone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.appcomponents.views.DatePickerFragment
import com.saqibhandymanab.app.appcomponents.views.TimePickerFragment
import com.saqibhandymanab.app.databinding.ActivityScheduleCalendarOneBinding
import com.saqibhandymanab.app.modules.schedulecalendarone.`data`.model.ListmRowModel
import com.saqibhandymanab.app.modules.schedulecalendarone.`data`.model.SpinnerDecemberCounterModel
import com.saqibhandymanab.app.modules.schedulecalendarone.`data`.viewmodel.ScheduleCalendarOneVM
import java.util.Date
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ScheduleCalendarOneActivity :
    BaseActivity<ActivityScheduleCalendarOneBinding>(R.layout.activity_schedule_calendar_one) {
  private val viewModel: ScheduleCalendarOneVM by viewModels<ScheduleCalendarOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    viewModel.spinnerDecemberCounterList.value = mutableListOf(
    SpinnerDecemberCounterModel("Item1"),
    SpinnerDecemberCounterModel("Item2"),
    SpinnerDecemberCounterModel("Item3"),
    SpinnerDecemberCounterModel("Item4"),
    SpinnerDecemberCounterModel("Item5")
    )
    val spinnerDecemberCounterAdapter =
    SpinnerDecemberCounterAdapter(this,R.layout.spinner_item,viewModel.spinnerDecemberCounterList.value?:
    mutableListOf())
    binding.spinnerDecemberCounter.adapter = spinnerDecemberCounterAdapter
    val listmAdapter = ListmAdapter(viewModel.listmList.value?:mutableListOf())
    binding.recyclerListm.adapter = listmAdapter
    listmAdapter.setOnItemClickListener(
    object : ListmAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListmRowModel) {
        onClickRecyclerListm(view, position, item)
      }
    }
    )
    viewModel.listmList.observe(this) {
      listmAdapter.updateData(it)
    }
    binding.scheduleCalendarOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearRowdateOne.setOnClickListener {
      val destinationInstance = DatePickerFragment.getInstance()
      destinationInstance.show(this.supportFragmentManager, DatePickerFragment.TAG) {
          selectedDate ->
        onDateSelectedLinearRowdateOne(selectedDate)
      }
    }
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
  }

  fun onClickRecyclerListm(
    view: View,
    position: Int,
    item: ListmRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun onDateSelectedLinearRowdateOne(selectedDate: Date) {
  }

  private fun onTimeSelectedLinearRowtimeOne(selectedTime: Date) {
  }

  companion object {
    const val TAG: String = "SCHEDULE_CALENDAR_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ScheduleCalendarOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
