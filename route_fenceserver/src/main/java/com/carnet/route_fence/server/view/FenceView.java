package com.carnet.route_fence.server.view;

import com.carnet.route_fence.server.data.FencePoint;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class FenceView {

    private Integer fenceId;

    private Integer companyId;

    private Integer fenceType;

    private Date createDate;

    private Date updateDate;

    private List<FencePoint> fencePointList;
}
