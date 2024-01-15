package com.github.aimmoth.springBoot3ScalaJs.shared

import scala.scalajs.js.annotation.{JSExport, JSExportTopLevel}

@JSExportTopLevel("Logic")
class Logic {

  @JSExport("calculate")
  def calculate(i: Int): Int = {
    i * 2;
  }
}
