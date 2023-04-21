package icu.chiou.service.impl;

import icu.chiou.dao.OrderMapper;
import icu.chiou.dto.DoorDTO;
import icu.chiou.dto.OrderDTO;
import icu.chiou.entity.OrderEntity;
import icu.chiou.service.OrderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 19:40
 * Description: No Description
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<OrderEntity> getOrderList() {
        return orderMapper.getOrderList();
    }

    @Override
    public void addOrder(OrderDTO orderDTO) {
        //todo 添加订单
        OrderEntity orderEntity = new OrderEntity();
        BeanUtils.copyProperties(orderDTO, orderEntity);
        orderEntity.setOrderTime(new Date());
        //付款时间暂时设置为下单时间
        orderEntity.setPayTime(new Date());
        orderMapper.insert(orderEntity);
    }

    @Override
    public OrderEntity findOrderById(Integer id) {
        //todo 通过id查询订单信息
        return orderMapper.getById(id);
    }

    @Override
    public void updateOrderById(OrderDTO orderDTO) {
        //todo 根据id更新订单信息
        OrderEntity orderEntity = new OrderEntity();
        BeanUtils.copyProperties(orderDTO, orderEntity);
        orderEntity.setPayTime(new Date());
        orderEntity.setOrderTime(new Date());
        orderMapper.updateById(orderEntity);
    }

    @Override
    public void deleteOrderById(DoorDTO doorDTO) {
        //todo 根据id删除订单信息
        orderMapper.deleteById(doorDTO.getId());
    }
}
