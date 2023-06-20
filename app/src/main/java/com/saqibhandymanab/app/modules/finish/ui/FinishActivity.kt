package com.saqibhandymanab.app.modules.finish.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityFinishBinding
import com.saqibhandymanab.app.modules.finish.`data`.viewmodel.FinishVM
import com.saqibhandymanab.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class FinishActivity : BaseActivity<ActivityFinishBinding>(R.layout.activity_finish) {
  private val viewModel: FinishVM by viewModels<FinishVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.finishVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnConfirm.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "FINISH_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FinishActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
