package com.hascode.tutorial.entity

class Book(val title: String, val id: String) {
  def getTitle: String = {
    return title
  }

  def getId: String = {
    return id
  }

  override def toString: String = {
    val builder: StringBuilder = new StringBuilder
    builder.append("Book [title=").append(title).append(", id=").append(id).append("]")
    return builder.toString
  }
}