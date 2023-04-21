package icu.chiou.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: chiou
 * Date: 2023/4/18
 * Time: 20:44
 * Description: No Description
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class OrderDTO implements Serializable {
    private Integer id;

    private Integer doorId;


    private String orderNo;

    private String orderType;

    private Integer pnum;

    private String cashier;

    private String orderTime;

    private String payTime;

    private String payType;

    private Object price;
}
