package org.seckill.entity;

import lombok.Data;

import java.util.Date;

/**
 * Created by gaowenfeng on 2017/7/24.
 */
@Data
public class SuccessKilled {
    private long seckillId;

    private long userPhone;

    private short state;

    private Date createTime;

    //多对一
    private Seckill seckill;


    @Override
    public String toString() {
        return "SuccessKilled{" +
                "seckillId=" + seckillId +
                ", userPhone=" + userPhone +
                ", state=" + state +
                ", createTime=" + createTime +
                '}';
    }
}
