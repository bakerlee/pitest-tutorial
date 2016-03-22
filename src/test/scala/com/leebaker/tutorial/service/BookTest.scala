package com.leebaker.tutorial.service

import com.leebaker.pit.service.Book
import org.hamcrest.MatcherAssert.assertThat
import org.hamcrest.Matchers._
import org.junit.Test

//noinspection UnitMethodIsParameterless
class BookTest {

  @Test
  def whenValid_shouldCreateBook {
    val Title = "War and Peace"

    val book = new Book(Title)

    assertThat(book, notNullValue)
    assertThat(book.title, equalTo(Title))
    assertThat(book.uuid, not(isEmptyOrNullString))
  }

//  @Test(expected = classOf[IllegalArgumentException])
//  def whenShortTitle_shouldFail {
//    new Book("ab")
//  }

//  @Test
//  def whenExactTitleLength_shouldCreateBook {
//    val book = new Book("abc")
//
//    assertThat(book, notNullValue)
//  }
}