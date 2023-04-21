package icu.chiou.service;

import icu.chiou.dto.DoorDTO;
import icu.chiou.entity.DoorEntity;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 19:14
 * Description: No Description
 */
public interface DoorService {
    List<DoorEntity> getDoorList();

    void addDoor(DoorDTO doorDTO);

    DoorEntity findDoorById(Integer id);

    void updateById(DoorDTO doorDTO);

    void deleteById(DoorDTO doorDTO);
}
