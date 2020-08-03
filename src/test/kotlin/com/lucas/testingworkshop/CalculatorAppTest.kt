package com.lucas.testingworkshop

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.whenever
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.mockito.InjectMocks
import org.mockito.Mock
import org.mockito.junit.jupiter.MockitoExtension
import org.springframework.boot.test.mock.mockito.MockBean

@ExtendWith(MockitoExtension::class)
class CalculatorAppTest {

    @Mock
    lateinit var mockUtils: Utils

    @InjectMocks
    lateinit var calculatorApp: CalculatorApp

//    val mockUtils: Utils = mock<Utils>()
//
//    private val calculatorApp = CalculatorApp(utils)

    @Nested
    // THING TO TEST GIVEN X WHEN Y THEN Z
    inner class add {

        @Nested
        inner class givenNumbers {

            @Nested
            inner class whenCheckNumbersAreValidIsTrue {

                @Test
                fun `returns 3`() {
                    whenever(mockUtils.checkNumbersAreValid("1", "2")).thenReturn(true)
                    assertThat(calculatorApp.add("1", "2")).isEqualTo("3")
                }
            }

            @Nested
            inner class whenCheckNumbersAreValidIsFalse {

                @Test
                fun `returns Error`() {
                    whenever(mockUtils.checkNumbersAreValid("1", "2")).thenReturn(false)
                    assertThat(calculatorApp.add("1", "2")).isEqualTo("Error")
                }
            }
        }
    }

    fun subtract_doesSomething() {

    }
}