package user

import org.junit.Assert
import org.junit.Test

class UserValidatorTest() {
    @Test fun Check_MT() {
        val userValidator = UserValidator()
        Assert.assertEquals(userValidator.validateUser("MT"), true)
    }

    @Test fun Check_AA() {
        val userValidator = UserValidator()
        Assert.assertEquals(userValidator.validateUser("AA"), false)
    }

    @Test fun Check_MailAddress() {
        val userValidator = UserValidator()
        Assert.assertEquals(userValidator.validateUser("sample@gmail.com"), false)
    }
}