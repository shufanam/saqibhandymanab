package com.saqibhandymanab.app.modules.cancelfinishworking.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityCancelFinishWorkingBinding
import com.saqibhandymanab.app.modules.cancelfinishworking.`data`.viewmodel.CancelFinishWorkingVM
import com.saqibhandymanab.app.modules.finishone.ui.FinishOneActivity
import kotlin.String
import kotlin.Unit

class CancelFinishWorkingActivity :
    BaseActivity<ActivityCancelFinishWorkingBinding>(R.layout.activity_cancel_finish_working) {
  private val viewModel: CancelFinishWorkingVM by viewModels<CancelFinishWorkingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.cancelFinishWorkingVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnFinish.setOnClickListener {
      val destIntent = FinishOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CANCEL_FINISH_WORKING_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CancelFinishWorkingActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
