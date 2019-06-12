package com.zhangkai.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
/**
 * 
 * @ClassName: MovieMapper 
 * @Description: TODO
 * @author: ZK
 * @date: 2019年6月11日 上午11:00:25
 */
public interface MovieMapper {
	// 列表查询+分页+模糊
	List<Map> getMovieList(@Param("mname") String mname, @Param("editor") String eidtor, @Param("year") String year,
			@Param("beginTime") String beginTime, @Param("endTime") String endTime, @Param("minPrice") String minPrice,
			@Param("maxPrice") String maxPrice, @Param("minTime") String minTime, @Param("maxTime") String maxTime,
			@Param("asc_desc") String asc_desc);
	//批删
	int delete(@Param("mid")String mid);
	//修改状态
	void updateStatus(@Param("mid")Integer mid, @Param("status")int status);

}
