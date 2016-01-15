package pers.zhangzhijun.amp.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Timestamp;

/**
 * ClassName: pers.zhangzhijun.amp.domain
 * Function :
 * Author   : ZhangZhijun
 * Date     : 23:14
 * Since    : v1.0.0
 */
@Entity
@Table(name = "T_SUBSCRIPTION")
public class Subscription {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "asset_id")
    @Size(max = 32)
    @NotNull
    private String aid;

    @Column(name = "user_id")
    @Size(max = 32)
    @NotNull
    private String sid;

    @Column(name = "subscriptionTime")
    @Size(max = 32)
    @NotNull
    private Timestamp subscriptionTIme;

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

    public Timestamp getSubscriptionTIme() {
        return subscriptionTIme;
    }

    public void setSubscriptionTIme(Timestamp subscriptionTIme) {
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
