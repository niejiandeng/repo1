package cn.dsx.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Classname: Payment
 * @Author: Dsx
 * @Date: 2020/04/12/9:40
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment  implements Serializable {
    private Long id;
    private String serial;
}
