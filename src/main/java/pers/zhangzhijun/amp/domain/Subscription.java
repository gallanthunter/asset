package pers.zhangzhijun.amp.domain;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

/**
 * ClassName: pers.zhangzhijun.amp.domain
 * Function :
 * Author   : ZhangZhijun
 * Date     : 23:14
 * Since    : v1.0.0
 */
@Entity
@Table(name = "T_SUBSCRIPTION")
public class Subscription implements Serializable {
    private static final long serialVersionUID = -1583570849469017666L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "asset_id", nullable = false)
    @Size(max = 32)
    private String aid;

    @Column(name = "user_id", nullable = false)
    @Size(max = 32)
    private String sid;

    @Column(name = "subscription_time", nullable = false, insertable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date subscriptionTIme;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public Date getSubscriptionTIme() {
        return subscriptionTIme;
    }

    public void setSubscriptionTIme(Date subscriptionTIme) {
        this.subscriptionTIme = subscriptionTIme;
    }

    @Override
    public String toString() {
        return "Subscription{" +
                "id=" + id +
                ", aid='" + aid + '\'' +
                ", sid='" + sid + '\'' +
                ", subscriptionTIme='" + subscriptionTIme + '\'' +
                '}';
    }
}
