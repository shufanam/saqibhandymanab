package com.saqibhandymanab.app.modules.detailshandyman.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityDetailsHandymanBinding
import com.saqibhandymanab.app.modules.chatshandyman.ui.ChatsHandymanActivity
import com.saqibhandymanab.app.modules.detailshandyman.`data`.viewmodel.DetailsHandymanVM
import com.saqibhandymanab.app.modules.ordersummary.ui.OrderSummaryActivity
import kotlin.String
import kotlin.Unit

class DetailsHandymanActivity :
    BaseActivity<ActivityDetailsHandymanBinding>(R.layout.activity_details_handyman) {
  private val viewModel: DetailsHandymanVM by viewModels<DetailsHandymanVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.detailsHandymanVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.linearRowvideocamera.setOnClickListener {
      val destIntent = OrderSummaryActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearBadge.setOnClickListener {
      val destIntent = ChatsHandymanActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "DETAILS_HANDYMAN_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, DetailsHandymanActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
