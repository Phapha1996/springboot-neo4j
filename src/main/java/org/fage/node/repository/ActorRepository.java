package org.fage.node.repository;

import org.fage.domain.Actor;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年11月7日
 * @description 演员节点实体访问对象
 *
 */
@Repository
public interface ActorRepository extends GraphRepository<Actor>{}
