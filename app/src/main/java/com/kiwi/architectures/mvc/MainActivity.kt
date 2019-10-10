package com.kiwi.architectures.mvc

import android.os.*
import android.widget.*

import androidx.appcompat.app.*

import com.kiwi.architectures.*

class MainActivity:
  AppCompatActivity(),
  IMainView {

  // region Public Methods

  // region IMainView

  override fun updateTitle() {
    actionBar.title = model.title
  }

  override fun updateButtonText() {
    button.text = model.buttonText
  }

  // endregion IMainView

  // region Activity

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    actionBar = supportActionBar!!
    button = findViewById(R.id.button)
    button.setOnClickListener { controller.onButtonClick() }

    controller.onCreate()
  }

  // endregion Activity

  // endregion Public Methods

  // region Private Properties

  private val model = MainModel()
  private val controller = MainController(this, model)

  private lateinit var actionBar: ActionBar
  private lateinit var button: Button

  // endregion Private Properties
}
