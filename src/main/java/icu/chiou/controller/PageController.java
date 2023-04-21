package icu.chiou.controller;

import icu.chiou.entity.DoorEntity;
import icu.chiou.entity.OrderEntity;
import icu.chiou.service.DoorService;
import icu.chiou.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 18:45
 * Description: 页面调整接口
 */
@Controller
@Slf4j
public class PageController {
    @Autowired
    DoorService doorService;

    @Autowired
    OrderService orderService;

    @RequestMapping("error")
    public String errot500(HttpServletRequest request) {
        return "/500";
    }

    /**
     * _top.jsp界面
     */
    @RequestMapping("_top")
    public String topPage() {
        return "_top";
    }

    /**
     * _left.jsp界面
     */
    @RequestMapping("_left")
    public String leftPage() {
        return "_left";
    }

    /**
     * _right.jsp界面
     */
    @RequestMapping("_right")
    public String rightPage() {
        return "_right";
    }


    /**
     * door_list.jsp界面
     */
    @RequestMapping("doorList")
    public String doorListPage(HttpServletRequest request) {
        List<DoorEntity> list = doorService.getDoorList();
        request.setAttribute("list", list);
        return "door_list";
    }


    /**
     * order_list.jsp界面
     */
    @RequestMapping("orderList")
    public String orderListPage(HttpServletRequest request) {
        List<OrderEntity> orderList = orderService.getOrderList();
        List<DoorEntity> doorList = doorService.getDoorList();
        request.setAttribute("orderList", orderList);
        request.setAttribute("doorList", doorList);
        return "order_list";
    }

    /**
     * door_add.jsp界面
     */
    @RequestMapping("door_add")
    public String doorAddPage() {
        return "door_add";
    }

    /**
     * door_update.jsp界面
     */
    @RequestMapping("doorInfo")
    public String doorUpdatePage(@RequestParam("id") Integer id, HttpServletRequest request) {
        log.info("id is {}", id);
        //查询当前id的门店信息回显
        DoorEntity doorEntity = doorService.findDoorById(id);
        request.setAttribute("door", doorEntity);
        return "door_update";
    }

    /**
     * order_add.jsp界面
     */
    @RequestMapping("order_add")
    public String orderAddPage(HttpServletRequest request) {
        List<DoorEntity> doorList = doorService.getDoorList();
        request.setAttribute("doorList", doorList);
        return "order_add";
    }

    /**
     * order_update.jsp界面
     */
    @RequestMapping("orderInfo")
    public String orderUpdatePage(@RequestParam("id") Integer id, HttpServletRequest request) {
        log.info("id is {}", id);
        //查询当前id的订单信息回显
        OrderEntity orderEntity = orderService.findOrderById(id);
        List<DoorEntity> doorList = doorService.getDoorList();
        request.setAttribute("doorList", doorList);
        request.setAttribute("order", orderEntity);
        return "order_update";
    }


}
