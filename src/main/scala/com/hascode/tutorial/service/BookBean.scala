package com.hascode.tutorial.service

import java.util.UUID

import com.hascode.tutorial.entity.Book

object BookBean {private val MIN_LENGTH: Int = 3}

class BookBean {
  def create(title: String) = {
    if (title == null) {
      throw new IllegalArgumentException("title must be set")
    }
    if (title.length <= BookBean.MIN_LENGTH) {
      throw new IllegalArgumentException("title must have a minimal length of " + BookBean.MIN_LENGTH)
    }
    new Book(title, UUID.randomUUID.toString.toUpperCase)
  }
}