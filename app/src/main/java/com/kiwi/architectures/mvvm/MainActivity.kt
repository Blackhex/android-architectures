package com.kiwi.architectures.mvvm

import android.os.*

import androidx.appcompat.app.*
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders

import com.kiwi.architectures.*
import com.kiwi.architectures.databinding.ActivityMvvmMainBinding

class MainActivity:
  AppCompatActivity() {

  // region Public Methods

  // region Activity

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    val binding = DataBindingUtil.setContentView<ActivityMvvmMainBinding>(
      this, R.layout.activity_mvvm_main
    )

    binding.viewModel = ViewModelProviders.of(this)[MainViewModel::class.java]

    setSupportActionBar(binding.toolbar)
  }

  // endregion Activity

  // endregion Public Methods
}
