package icu.chiou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * (TbDoor)实体类对应数据库表tb_door
 *
 * @author makejava
 * @since 2023-04-18 18:28:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DoorEntity implements Serializable {
    private static final long serialVersionUID = 785552618678979122L;

    private Integer id;

    private String name;

    private String tel;

    private String addr;
}

