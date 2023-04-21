package icu.chiou.dao;


import icu.chiou.entity.OrderEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 19:41
 * Description: No Description
 */
public interface OrderMapper {
    List<OrderEntity> getOrderList();

    void insert(OrderEntity orderEntity);

    OrderEntity getById(@RequestParam("id") Integer id);

    void deleteById(@RequestParam("id") Integer id);

    void updateById(OrderEntity orderEntity);

    Long getCountByDoorId(@RequestParam("id") Integer id);
}
