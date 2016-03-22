package com.leebaker.pit.service

import java.util.UUID

class Book(val title: String) {
  val MinLength: Int = 3

  if (title.length < MinLength)
    throw new IllegalArgumentException("Title is too short")

  val uuid = UUID.randomUUID.toString
}
