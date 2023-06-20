package com.saqibhandymanab.app.modules.bookings.ui

import android.os.Bundle
import androidx.fragment.app.viewModels
import com.saqibhandymanab.app.R
import com.saqibhandymanab.app.appcomponents.base.BaseFragment
import com.saqibhandymanab.app.databinding.FragmentBookingsBinding
import com.saqibhandymanab.app.modules.bookings.`data`.viewmodel.BookingsVM
import com.saqibhandymanab.app.modules.finish.ui.FinishActivity
import kotlin.String
import kotlin.Unit

class BookingsFragment : BaseFragment<FragmentBookingsBinding>(R.layout.fragment_bookings) {
  private val viewModel: BookingsVM by viewModels<BookingsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.bookingsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearCard.setOnClickListener {
      val destIntent = FinishActivity.getIntent(requireActivity(), null)
      startActivity(destIntent)
      requireActivity().onBackPressed()
    }
  }

  companion object {
    const val TAG: String = "BOOKINGS_FRAGMENT"


    fun getInstance(bundle: Bundle?): BookingsFragment {
      val fragment = BookingsFragment()
      fragment.arguments = bundle
      return fragment
    }
  }
}
