package icu.chiou.service;

import icu.chiou.dto.DoorDTO;
import icu.chiou.dto.OrderDTO;
import icu.chiou.entity.OrderEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 19:39
 * Description: No Description
 */
public interface OrderService {
    List<OrderEntity> getOrderList();

    void addOrder(OrderDTO orderDTO);

    OrderEntity findOrderById(Integer id);

    void updateOrderById(OrderDTO orderDTO);

    void deleteOrderById(DoorDTO doorDTO);
}
