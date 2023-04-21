package icu.chiou.service.impl;

import icu.chiou.dao.DoorMapper;
import icu.chiou.dao.OrderMapper;
import icu.chiou.dto.DoorDTO;
import icu.chiou.entity.DoorEntity;
import icu.chiou.service.DoorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 19:14
 * Description: No Description
 */
@Service
public class DoorServiceImpl implements DoorService {
    @Autowired
    DoorMapper doorMapper;

    @Autowired
    OrderMapper orderMapper;

    @Override
    public List<DoorEntity> getDoorList() {
        return doorMapper.getDoorList();
    }

    @Override
    public void addDoor(DoorDTO doorDTO) {
        //todo 添加门店
        DoorEntity doorEntity = new DoorEntity();
        BeanUtils.copyProperties(doorDTO, doorEntity);
        doorMapper.insert(doorEntity);
    }

    @Override
    public DoorEntity findDoorById(Integer id) {
        //todo 根据id查找对应门店信息
        return doorMapper.getById(id);
    }

    @Override
    public void updateById(DoorDTO doorDTO) {
        //todo 根据id修改门店信息
        DoorEntity doorEntity = new DoorEntity();
        BeanUtils.copyProperties(doorDTO, doorEntity);
        doorMapper.updateById(doorEntity);
    }

    @Override
    public void deleteById(DoorDTO doorDTO) {
        //TODO 删除门店
        //1.删除前先检测门店是否已被使用
//        Long count = orderMapper.getCountByDoorId(doorDTO.getId());
//        if (count > 0) {
//            throw new RuntimeException("门店已被使用,删除失败");
//        }
        doorMapper.deleteById(doorDTO.getId());
    }
}
