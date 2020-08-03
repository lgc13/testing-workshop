package com.lucas.testingworkshop

import org.assertj.core.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class UtilsTest {

    val utils = Utils()

    @Nested
    inner class checkNumbersAreValid {
        @Test
        fun `when Given Positive Numbers returns True`() {
            val result = utils.checkNumbersAreValid("1", "2")
            assertThat(result).isEqualTo(true)
        }

        @Test
        fun `when Given Negative Numbers returns True`() {
            val result = utils.checkNumbersAreValid("-1", "-2")
            assertThat(result).isEqualTo(true)
        }

        @Test
        fun `when Numbers Provided Are Null Strings returns False`() {
            val result = utils.checkNumbersAreValid("null", "null")
            assertThat(result).isEqualTo(false)
        }

        @Test
        fun `when One Number Provide Is Null Strings returns False`() {
            val result = utils.checkNumbersAreValid("null", "1")
            assertThat(result).isEqualTo(false)
        }

        @Test
        fun `when Numbers Provided Are Undefined Strings returns False`() {
            val result = utils.checkNumbersAreValid("undefined", "undefined")
            assertThat(result).isEqualTo(false)
        }

        @Test
        fun `when Numbers Provided Are ! Strings returns False`() {
            val result = utils.checkNumbersAreValid("!", "!")
            assertThat(result).isEqualTo(false)
        }
    }
}