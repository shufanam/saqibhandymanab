package com.saqibhandymanab.app.modules.landing.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityLandingBinding
import com.saqibhandymanab.app.modules.customerlogin.ui.CustomerLogInActivity
import com.saqibhandymanab.app.modules.handymanlogin.ui.HandymanLogInActivity
import com.saqibhandymanab.app.modules.landing.`data`.viewmodel.LandingVM
import kotlin.String
import kotlin.Unit

class LandingActivity : BaseActivity<ActivityLandingBinding>(R.layout.activity_landing) {
  private val viewModel: LandingVM by viewModels<LandingVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.landingVM = viewModel
    Handler(Looper.getMainLooper()).postDelayed( {
      val destIntent = CustomerLogInActivity.getIntent(this, null)
      startActivity(destIntent)
      finish()
      }, 3000)
    }

    override fun setUpClicks(): Unit {
      binding.btnImAHandyman.setOnClickListener {
        val destIntent = HandymanLogInActivity.getIntent(this, null)
        startActivity(destIntent)
      }
      binding.btnImACustomer.setOnClickListener {
        val destIntent = CustomerLogInActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    companion object {
      const val TAG: String = "LANDING_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, LandingActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
