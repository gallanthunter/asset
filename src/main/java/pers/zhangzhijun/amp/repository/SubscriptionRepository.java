package pers.zhangzhijun.amp.repository;

import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Subscription;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 23:17
 * Since    : v1.0.0
 */
public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {
    Subscription findById(String id);

    Subscription findByAid(String aid);

    List<Subscription> findBySid(String sid);

    List<Subscription> findAll();
}
