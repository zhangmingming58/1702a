package com.zhangkai.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhangkai.mapper.MovieMapper;

/**
 * 
 * @ClassName: MovieServiceImpl
 * @Description: TODO
 * @author: ZK
 * @date: 2019年6月11日 上午9:11:04
 */
@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MovieMapper mapper;

	// 列表查询+分页
	@Override
	public List<Map> getMovieList(String mname, String eidtor, String year, String beginTime, String endTime,
			String minPrice, String maxPrice, String minTime, String maxTime, String asc_desc) {
		// TODO Auto-generated method stub
		return mapper.getMovieList(mname, eidtor, year, beginTime, endTime, minPrice, maxPrice, minTime, maxTime,
				asc_desc);
	}

	// 批删
	@Override
	public int delete(String mid) {
		// TODO Auto-generated method stub
		return mapper.delete(mid);
	}

	// 修改状态
	@Override
	public void updateStatus(Integer mid, int status) {
		// TODO Auto-generated method stub
		mapper.updateStatus(mid, status);
	}
}
