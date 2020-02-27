package test.kotlin.demo

import kotlin.test.assertEquals
import org.junit.Test
import main.kotlin.demo.getGreeting

class TestSource {
    @Test fun getGreetingTest() {
        assertEquals("Hello, world!", getGreeting())
    }
}