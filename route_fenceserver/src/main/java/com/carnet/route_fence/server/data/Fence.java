package com.carnet.route_fence.server.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Fence {

    @Id
    @GeneratedValue
    private Integer fenceId;

    private Integer companyId;

    private Integer fenceType;

    private Date createDate;

    private Date updateDate;
}
