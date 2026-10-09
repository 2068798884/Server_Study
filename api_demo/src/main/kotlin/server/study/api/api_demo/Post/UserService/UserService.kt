package server.study.api.api_demo.Post.Service

import server.study.api.api_demo.Post.Dto.UseInfoResponse
import server.study.api.api_demo.Post.Dto.UseInfoResquest

interface UserService {
    fun register(request: UseInfoResquest): UseInfoResponse
}