package com.carnet.route_fence.client;

import com.carnet.route_fence.transfer.FenceListOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient("route_fence")
@Component
public interface RouteFenceClient {


    /**
     * 一个服务间对外的接口的例子，在controller中还没有实现这个方法
     * @param companyId
     * @param fenceId
     * @return
     */
    @GetMapping("/service/fence")
    List<FenceListOutput> findFence(@RequestParam("companyId") Integer companyId, @RequestParam("fenceId") Integer fenceId);
}
