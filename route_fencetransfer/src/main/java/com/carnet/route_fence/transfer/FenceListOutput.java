package com.carnet.route_fence.transfer;

import lombok.Data;

import java.util.List;

@Data
public class FenceListOutput {
    private List<FenceOutput> polygonFenceList;

    private List<CircleFenceOutput> circleFenceList;
}
