package com.zhangkai.service;

import java.util.List;
import java.util.Map;

/**
 * 
 * @ClassName: MovieService
 * @Description: 接口
 * @author: ZK
 * @date: 2019年6月11日 上午9:10:57
 */
public interface MovieService {
	// 列表查询+分页
	List<Map> getMovieList(String mname, String eidtor, String year, String beginTime, String endTime, String minPrice,
			String maxPrice, String minTime, String maxTime, String asc_desc);

	// 批删
	int delete(String mid);

	// 修改状态
	void updateStatus(Integer mid, int status);

}
