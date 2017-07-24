package org.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by gaowenfeng on 2017/7/24.
 */
@Data
public class Seckill {
    private long seckillId;

    private String name;

    private int number;

    private Date startTime;

    private Date endTime;

    private Date createTime;


    @Override
    public String toString() {
        return "Seckill{" +
                "seckillId=" + seckillId +
                ", name='" + name + '\'' +
                ", number=" + number +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", createTime=" + createTime +
                '}';
    }
}
