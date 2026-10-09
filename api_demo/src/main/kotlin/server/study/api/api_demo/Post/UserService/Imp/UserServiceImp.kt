package server.study.api.api_demo.Post.Service.Imp

import server.study.api.api_demo.Post.Dto.UseInfoResponse
import server.study.api.api_demo.Post.Dto.UseInfoResquest
import server.study.api.api_demo.Post.Service.UserService
import org.springframework.stereotype.Service

@Service
class UserServiceImp : UserService {
    override fun register(request: UseInfoResquest) : UseInfoResponse {
        // 💡 目前不查数据库，纯粹模拟业务处理
        println("收到注册请求：用户名=${request.username}, 邮箱=${request.email}")
        // 模拟数据库保存后生成的 ID
        val mockUserId = 1001L
        return UseInfoResponse(
            id = mockUserId,
            username = request.username,
            message = "注册成功（暂未连接数据库）"
        )
    }
}