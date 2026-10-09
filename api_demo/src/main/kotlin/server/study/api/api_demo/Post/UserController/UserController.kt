package server.study.api.api_demo.Post.Controller

import server.study.api.api_demo.Post.Dto.UseInfoResquest
import server.study.api.api_demo.Post.Dto.UseInfoResponse
import server.study.api.api_demo.Post.Service.UserService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import java.net.URI

@RestController
@RequestMapping("/api/user")
class UserController(
    private val userService : UserService // 构造函数注入 Service
) {

    @PostMapping("/register")
    fun register(@RequestBody request: UseInfoResquest): ResponseEntity<UseInfoResponse> {
        // 1. 调用 Service 层处理业务
        val response = userService.register(request)
        
        // 2. 返回 201 Created 状态码，并在 Header 中带上新创建资源的路径
        return ResponseEntity
            .created(URI.create("/api/user/${response.id}"))
            .body(response)
    }
}