package user

class UserValidator {

    fun validateUser(shortName: String): Boolean {
        val userRepository = UserRepository()
        val users = userRepository.getUsers()

        users.forEach {
            if ( it.shortName == shortName )
                return true
        }
        return false
    }
}