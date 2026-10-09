package server.study.api.api_demo.Post.Dto

data class UseInfoResquest(
    val username: String,
    val password: String,
    val email: String
)

data class UseInfoResponse(
    val id: Long,
    val username: String,
    val message: String
)