package pers.zhangzhijun.amp.repository;

import org.springframework.data.repository.CrudRepository;
import pers.zhangzhijun.amp.domain.Log;

import java.util.List;

/**
 * ClassName: pers.zhangzhijun.amp.repository
 * Function :
 * Author   : ZhangZhijun
 * Date     : 23:11
 * Since    : v1.0.0
 */
public interface LogRepository extends CrudRepository<Log, Long> {
    Log findById(String id);

    Log findByOperator(String operator);

    List<Log> findByDate(String begindDate, String endDate);

    List<Log> findAll();
}
