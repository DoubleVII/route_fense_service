package com.carnet.route_fence.transfer;

import lombok.Data;

import java.util.List;

@Data
public class FenceOutput {
    private Integer fenceId;

    private Integer companyId;

    private List<PointOutput> fencePointList;
}
