package pers.zhangzhijun.amp.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: pers.zhangzhijun.amp.dto
 * Function :
 * Author   : ZhangZhijun
 * Date     : 23:10
 * Since    : v1.0.0
 */
public class LogDTO implements Serializable {
    private static final long serialVersionUID = 1427229055261554211L;

    private Long id;

    private Date date;

    private String operator;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "LogDTO{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", operator='" + operator + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
