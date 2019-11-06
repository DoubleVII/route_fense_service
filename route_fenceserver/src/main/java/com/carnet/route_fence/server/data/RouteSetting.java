package com.carnet.route_fence.server.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity
public class RouteSetting {

    @Id
    @GeneratedValue
    private Integer routeSettingId;

    private Integer routeId;

    private Integer carId;

    private Date createDate;

    private Date updateDate;
}
