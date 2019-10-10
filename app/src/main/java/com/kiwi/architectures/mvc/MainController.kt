package com.kiwi.architectures.mvc

class MainController(
  private val view: IMainView,
  private val model: MainModel
):
  IMainController {

  // region Public Methods

  // region IMainController

  override fun onCreate() {
    view.updateTitle()
    view.updateButtonText()
  }

  override fun onButtonClick() {
    if (isClicked) {
      model.buttonText = "Click Me!"
    } else {
      model.buttonText = "Thank You!"
    }
    isClicked = !isClicked
    view.updateButtonText()
  }

  // endregion IMainController

  // endregion Public Methods

  // region Private Properties

  private var isClicked = false

  // endregion Private Properties
}
