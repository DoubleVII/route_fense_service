package com.carnet.route_fence.server.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class Route {

    @Id
    @GeneratedValue
    private Integer routeId;

    private Integer companyId;

    private Date createDate;

    private Date updateDate;

}
