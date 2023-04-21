package icu.chiou.controller;

import icu.chiou.dto.DoorDTO;
import icu.chiou.service.DoorService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 18:36
 * Description: 门店接口
 */
@Controller
@Slf4j
public class DoorController {
    @Autowired
    DoorService doorService;

    @PostMapping("doorAdd")
    public String addDoor(DoorDTO doorDTO) {
        //TODO 添加门店
        try {
            doorService.addDoor(doorDTO);
            return "redirect: /doorList";
        } catch (Exception e) {
            //操作失败,打印日志
            e.printStackTrace();
            log.info("添加失败" + e.getMessage());
            return "redirect: /doorList";
        }
    }

    @PostMapping("doorUpdate")
    public String updateDoor(DoorDTO doorDTO) {
        //TODO 修改门店信息
        try {
            doorService.updateById(doorDTO);
            return "redirect: /doorList";
        } catch (Exception e) {
            //操作失败,打印日志
            e.printStackTrace();
            log.info("修改失败" + e.getMessage());
            return "redirect: /doorList";
        }
    }

    //@DeleteMapping("doorDelete/{id}")
    @GetMapping("doorDelete")
    public String deleteDoor(DoorDTO doorDTO) {
        //TODO 删除门店信息
        //不主动处理异常，让它显示在500.jsp界面
        doorService.deleteById(doorDTO);
        return "redirect: /doorList";
//        try {
//            doorService.deleteById(doorDTO);
//            return "redirect: /doorList";
//        } catch (Exception e) {
//            //操作失败,打印日志
//            e.printStackTrace();
//            log.info("删除失败" + e.getMessage());
//            return "redirect: /doorList";
//        }
    }
}
