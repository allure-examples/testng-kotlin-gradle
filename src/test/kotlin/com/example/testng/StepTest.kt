package com.example.testng

import io.qameta.allure.Allure.step
import io.qameta.allure.Step
import org.testng.annotations.Test

class StepTest {

    @Test
    fun `test with lambda steps`() {
        step("step 1") { _ ->
            step("step 1.1")
            step("step 1.2") { _ ->

            }
        }
        step("step 2") { _ ->
        }
    }

    @Test
    fun `test with annotation steps`() {
        step1()
        step2()
    }

    @Step("step 1")
    fun step1() {
        step11()
        step12()
    }

    @Step("step 1.1")
    fun step11() {
    }

    @Step("step 1.2")
    fun step12() {
    }

    @Step("step 2")
    fun step2() {
    }
}
