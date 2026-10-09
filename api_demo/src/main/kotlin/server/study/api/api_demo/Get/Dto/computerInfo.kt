package server.study.api.api_demo.Get.Dto

data class CpuInfoResponse(
    val arch: String,
    val osName: String,
    val availableProcessors: Int
)