package com.kiwi.architectures.mvp

data class MainModel(
  var title: String = "MVP Example",
  var buttonText: String = "Click Me!",
  var isClicked: Boolean = false
)
