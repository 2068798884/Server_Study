package server.study.api.api_demo.Get.Service

import server.study.api.api_demo.Get.Dto.CpuInfoResponse

interface SystemService {
    fun getCpuInfo(): CpuInfoResponse
}