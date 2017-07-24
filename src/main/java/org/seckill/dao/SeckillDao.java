package org.seckill.dao;

import javafx.scene.chart.PieChart;
import org.seckill.entity.Seckill;
import sun.rmi.runtime.Log;

import java.util.List;

/**
 * Created by gaowenfeng on 2017/7/24.
 */
public interface SeckillDao {
    /**
     * 减库存
     * @param seckillId
     * @param killTime
     * @return
     */
    int reduceNumber(long seckillId, PieChart.Data killTime);

    /**
     * 根据id查询秒杀对象
     * @param seckillId
     * @return
     */
    Seckill queryById(long seckillId);

    /**
     * 根据偏移量查询秒杀商品列表
     * @param offet
     * @param limit
     * @return
     */
    List<Seckill> queryAll(int offet,int limit);
}
