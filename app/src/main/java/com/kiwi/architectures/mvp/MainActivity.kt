package com.kiwi.architectures.mvp

import android.os.*
import android.widget.*

import androidx.appcompat.app.*

import com.kiwi.architectures.*

class MainActivity:
  AppCompatActivity(),
  IMainView {

  // region Public Methods

  // region IMainView

  override fun setTitle(title: String) {
    actionBar.title = title
  }

  override fun setButtonText(text: String) {
    button.text = text
  }

  // endregion IMainView

  // region Activity

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    actionBar = supportActionBar!!
    button = findViewById(R.id.button)
    button.setOnClickListener { presenter.onButtonClick() }

    presenter.onCreate()
  }

  // endregion Activity

  // endregion Public Methods

  // region Private Properties

  private val presenter: IMainPresenter = MainPresenter(this)

  private lateinit var actionBar: ActionBar
  private lateinit var button: Button

  // endregion Private Properties
}
