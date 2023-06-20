package com.saqibhandymanab.app.modules.handymanlogin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityHandymanLogInBinding
import com.saqibhandymanab.app.modules.handymanlogin.`data`.viewmodel.HandymanLogInVM
import com.saqibhandymanab.app.modules.homeone.ui.HomeOneActivity
import kotlin.String
import kotlin.Unit

class HandymanLogInActivity :
    BaseActivity<ActivityHandymanLogInBinding>(R.layout.activity_handyman_log_in) {
  private val viewModel: HandymanLogInVM by viewModels<HandymanLogInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.handymanLogInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.btnLogin.setOnClickListener {
      val destIntent = HomeOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "HANDYMAN_LOG_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HandymanLogInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
