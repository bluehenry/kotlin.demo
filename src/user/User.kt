package user

import java.util.*

data class User(var shortName: String? = null,
                var fullName: String? = null,
                var email: String? = null,
                var id: Long? = null,
                var createTime: Date? = null)
