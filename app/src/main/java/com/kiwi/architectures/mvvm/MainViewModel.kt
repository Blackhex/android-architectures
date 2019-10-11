package com.kiwi.architectures.mvvm

import androidx.lifecycle.ViewModel

class MainViewModel:
  ViewModel() {

  // region Public Properties

  val title
    get() = model.title

  val buttonText
    get() = model.buttonText

  // endregion Public Properties

  // region Public Methods

  fun onButtonClick() {
    model.buttonText.set(
      if (model.isClicked) {
        "Click Me!"
      } else {
        "Thank You!"
      }
    )

    model.isClicked = !model.isClicked
  }

  // endregion Public Methods

  // region Private Properties

  private val model = MainModel()

  // endregion Private Properties
}
