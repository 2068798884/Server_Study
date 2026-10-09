package server.study.api.api_demo.Get.Service.impl

import server.study.api.api_demo.Get.Dto.CpuInfoResponse
import server.study.api.api_demo.Get.Service.SystemService
import org.springframework.stereotype.Service

@Service
class SystemServiceImpl : SystemService {

    override fun getCpuInfo(): CpuInfoResponse {
        // 使用 Java 原生的 System 类获取系统属性
        val arch = System.getProperty("os.arch") ?: "Unknown"
        val osName = System.getProperty("os.name") ?: "Unknown"
        val processors = Runtime.getRuntime().availableProcessors()

        return CpuInfoResponse(
            arch = arch,
            osName = osName,
            availableProcessors = processors
        )
    }
}