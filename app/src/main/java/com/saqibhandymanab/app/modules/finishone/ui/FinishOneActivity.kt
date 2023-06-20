package com.saqibhandymanab.app.modules.finishone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityFinishOneBinding
import com.saqibhandymanab.app.modules.finishone.`data`.viewmodel.FinishOneVM
import com.saqibhandymanab.app.modules.homeone.ui.HomeOneActivity
import kotlin.String
import kotlin.Unit

class FinishOneActivity : BaseActivity<ActivityFinishOneBinding>(R.layout.activity_finish_one) {
  private val viewModel: FinishOneVM by viewModels<FinishOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finishOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnConfirm.setOnClickListener {
      val destIntent = HomeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FINISH_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FinishOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
