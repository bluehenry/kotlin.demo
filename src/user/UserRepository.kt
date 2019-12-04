package user

class UserRepository {
    fun getUsers(): List<User> {
        return listOf(
            User("DRS", "Drill Support"),
            User("DAS", "Daily Service"),
            User("MT", "Maintenance"),
            User("SVR", "Supervisor"),
            User("SA", "Sampler"),
            User("BC", "Blast Crew"),
            User("GG", "Geologist"),
            User("EP", "Epiroc"),
            User("FL", "Field Leadership"),
            User("SI", "Superintendent"),
            User("SV", "Survey"),
            User("EG", "Engineer"),
            User("OT", "Other")
        )
    }
}