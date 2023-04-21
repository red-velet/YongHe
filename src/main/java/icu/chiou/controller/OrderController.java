package icu.chiou.controller;

import icu.chiou.dto.DoorDTO;
import icu.chiou.dto.OrderDTO;
import icu.chiou.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 20:42
 * Description: 订单接口
 */
@Controller
@Slf4j
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("orderAdd")
    public String addOrder(OrderDTO orderDTO) {
        //TODO 添加订单信息
        try {
            orderService.addOrder(orderDTO);
            return "redirect: /orderList";
        } catch (Exception e) {
            //操作失败,打印日志
            e.printStackTrace();
            log.info("添加失败" + e.getMessage());
            return "redirect: /orderList";
        }
    }

    @PostMapping("orderUpdate")
    public String updateOrder(OrderDTO orderDTO) {
        //TODO 修改订单信息
        try {
            orderService.updateOrderById(orderDTO);
            return "redirect: /orderList";
        } catch (Exception e) {
            //操作失败,打印日志
            e.printStackTrace();
            log.info("添加失败" + e.getMessage());
            return "redirect: /orderList";
        }
    }

    @GetMapping("orderDelete")
    public String deleteOrder(DoorDTO doorDTO) {
        //TODO 删除订单信息
        try {
            orderService.deleteOrderById(doorDTO);
            return "redirect: /orderList";
        } catch (Exception e) {
            //操作失败,打印日志
            e.printStackTrace();
            log.info("删除失败" + e.getMessage());
            return "redirect: /orderList";
        }
    }
}
