package icu.chiou.dao;

import icu.chiou.entity.DoorEntity;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 19:14
 * Description: No Description
 */
public interface DoorMapper {
    List<DoorEntity> getDoorList();

    void insert(DoorEntity doorEntity);

    DoorEntity getById(@RequestParam("id") Integer id);

    void updateById(DoorEntity doorEntity);

    void deleteById(@RequestParam("id") Integer id);
}
