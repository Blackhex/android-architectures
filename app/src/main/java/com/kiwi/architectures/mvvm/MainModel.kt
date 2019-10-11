package com.kiwi.architectures.mvvm

import androidx.databinding.ObservableField

data class MainModel(
  var title: ObservableField<String> = ObservableField("MVP Example"),
  var buttonText: ObservableField<String> = ObservableField("Click Me!"),
  var isClicked: Boolean = false
)
