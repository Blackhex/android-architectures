package com.kiwi.architectures.mvp

class MainPresenter(
  private val view: IMainView
):
  IMainPresenter {

  // region Public Methods

  // region IMainPresenter

  override fun onCreate() {
    view.setTitle(model.title)
    view.setButtonText(model.buttonText)
  }

  override fun onButtonClick() {
    if (model.isClicked) {
      model.buttonText = "Click Me!"
    } else {
      model.buttonText = "Thank You!"
    }
    model.isClicked = !model.isClicked
    view.setButtonText(model.buttonText)
  }

  // endregion IMainPresenter

  // endregion Public Methods

  // region Private Properties

  private val model = MainModel()

  // endregion Private Properties
}
