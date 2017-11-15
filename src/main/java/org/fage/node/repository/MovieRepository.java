package org.fage.node.repository;

import org.fage.domain.Movie;
import org.springframework.data.neo4j.repository.GraphRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
/**
 * 
 * @author Caizhfy
 * @email caizhfy@163.com
 * @createTime 2017年11月7日
 * @description 节点实体访问对象
 *
 */
@Repository
public interface MovieRepository extends GraphRepository<Movie>{
	Movie findByTitle(@Param("title") String title);
}
