package com.saqibhandymanab.app.modules.confirm.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityConfirmBinding
import com.saqibhandymanab.app.modules.confirm.`data`.viewmodel.ConfirmVM
import com.saqibhandymanab.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class ConfirmActivity : BaseActivity<ActivityConfirmBinding>(R.layout.activity_confirm) {
  private val viewModel: ConfirmVM by viewModels<ConfirmVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.confirmVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnBackHome.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "CONFIRM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ConfirmActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
