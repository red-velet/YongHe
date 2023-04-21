package icu.chiou.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbOrder)实体类对应数据库表tb_order
 *
 * @author makejava
 * @since 2023-04-18 18:29:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderEntity implements Serializable {
    private static final long serialVersionUID = -37400545914947882L;

    private Integer id;

    private Integer doorId;


    private String orderNo;

    private String orderType;

    private Integer pnum;

    private String cashier;

    private Date orderTime;

    private Date payTime;

    private String payType;

    private Object price;

}

