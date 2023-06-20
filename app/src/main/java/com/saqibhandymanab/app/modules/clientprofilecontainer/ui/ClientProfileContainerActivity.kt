package com.saqibhandymanab.app.modules.clientprofilecontainer.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseActivity
import com.saqibhandymanab.app.databinding.ActivityClientProfileContainerBinding
import com.saqibhandymanab.app.extensions.loadFragment
import com.saqibhandymanab.app.modules.bookings.ui.BookingsFragment
import com.saqibhandymanab.app.modules.chatsone.ui.ChatsOneFragment
import com.saqibhandymanab.app.modules.clientprofile.ui.ClientProfileFragment
import com.saqibhandymanab.app.modules.clientprofilecontainer.`data`.viewmodel.ClientProfileContainerVM
import kotlin.String
import kotlin.Unit

class ClientProfileContainerActivity :
    BaseActivity<ActivityClientProfileContainerBinding>(R.layout.activity_client_profile_container)
    {
  private val viewModel: ClientProfileContainerVM by viewModels<ClientProfileContainerVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.clientProfileContainerVM = viewModel
    val destFragment = ClientProfileFragment.getInstance(null)
    this.loadFragment(
    R.id.fragmentContainer,
    destFragment,
    bundle = destFragment.arguments,
    tag = ClientProfileFragment.TAG,
    addToBackStack = false,
    add = false,
    enter = null,
    exit = null,
    )
  }

  override fun setUpClicks(): Unit {
    binding.imageMenu.setOnClickListener {
      val destFragment = BookingsFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = BookingsFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageIcon.setOnClickListener {
      val destFragment = ClientProfileFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ClientProfileFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
    binding.imageFile.setOnClickListener {
      val destFragment = ChatsOneFragment.getInstance(null)
      this.loadFragment(
      R.id.fragmentContainer,
      destFragment,
      bundle = destFragment.arguments,
      tag = ChatsOneFragment.TAG,
      addToBackStack = true,
      add = false,
      enter = null,
      exit = null,
      )
    }
  }

  companion object {
    const val TAG: String = "CLIENT_PROFILE_CONTAINER_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ClientProfileContainerActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
