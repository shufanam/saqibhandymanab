package com.saqibhandymanab.app.modules.customerlogin.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityCustomerLogInBinding
import com.saqibhandymanab.app.modules.customerlogin.`data`.viewmodel.CustomerLogInVM
import com.saqibhandymanab.app.modules.home.ui.HomeActivity
import kotlin.String
import kotlin.Unit

class CustomerLogInActivity :
    BaseActivity<ActivityCustomerLogInBinding>(R.layout.activity_customer_log_in) {
  private val viewModel: CustomerLogInVM by viewModels<CustomerLogInVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.customerLogInVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnLogin.setOnClickListener {
      val destIntent = HomeActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "CUSTOMER_LOG_IN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, CustomerLogInActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
