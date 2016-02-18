package pers.zhangzhijun.amp.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;

/**
 * ClassName: pers.zhangzhijun.amp.domain
 * Function :
 * Author   : ZhangZhijun
 * Date     : 2015/12/21 23:29
 * Since    : v1.0.0
 */
@Entity
@Table(name = "T_TOKEN")
public class Token implements Serializable {
    private static final long serialVersionUID = 2792839088439040631L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Size(max = 32)
    @Column(name = "id")
    private String id;


}
