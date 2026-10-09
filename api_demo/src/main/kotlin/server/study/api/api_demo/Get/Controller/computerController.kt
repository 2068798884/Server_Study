package server.study.api.api_demo.Get.Controller

import server.study.api.api_demo.Get.Dto.CpuInfoResponse
import server.study.api.api_demo.Get.Service.SystemService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/system")
class SystemController(
    private val systemService: SystemService // 构造函数注入 Service
) {

    @GetMapping("/cpu")
    fun getCpuInfo(): ResponseEntity<CpuInfoResponse> {
        val cpuInfo = systemService.getCpuInfo()
        return ResponseEntity.ok(cpuInfo)
    }
}