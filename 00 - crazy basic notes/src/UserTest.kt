data class UserTest(var name: String, var lastName: String){
    companion object {
        private val users = mutableListOf<UserTest>()
        fun createUsers(count: Int): List<UserTest>{
            for (i in 0 .. count){
                val unknown = UserTest("$i", "desconhecido")
                users.add(unknown)
            }
            return users
        }
    }
}