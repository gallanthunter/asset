package pers.zhangzhijun.amp.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;
import pers.zhangzhijun.amp.domain.Subscription;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 23:17
 * Since    : v1.0.0
 */
@Transactional
public interface SubscriptionRepository extends CrudRepository<Subscription, Long> {

    @Query("SELECT a from Asset a, User u, Subscription s where a.assetId = s.aid and u.id = s.sid and s.aid = ?1")
    Subscription findByAid(String aid);

    @Query("select a from Asset a, User u, Subscription s where a.assetId = s.aid and u.id = s.sid and s.sid = ?1")
    List<Subscription> findBySid(String sid);

    List<Subscription> findAll();
}
