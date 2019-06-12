package com.zhangkai.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhangkai.service.MovieService;
import com.zhangkai.util.PageUtils;

/**
 * 
 * @ClassName: MovieController
 * @Description: TODO
 * @author: ZK
 * @date: 2019年6月11日 上午9:05:21
 */
@Controller
public class MovieController {

	@Autowired
	private MovieService service;

	// 列表查询+分页
	@RequestMapping("list")
	public String getMovieList(@RequestParam(defaultValue = "1") Integer pageNum,
			@RequestParam(defaultValue = "") String mname, @RequestParam(defaultValue = "") String editor,
			@RequestParam(defaultValue = "0") String year, @RequestParam(defaultValue = "1900-01-01") String beginTime,
			@RequestParam(defaultValue = "2100-12-30") String endTime,
			@RequestParam(defaultValue = "0") String minPrice, @RequestParam(defaultValue = "120") String maxPrice,
			@RequestParam(defaultValue = "0") String minTime, @RequestParam(defaultValue = "200") String maxTime,
			@RequestParam(defaultValue = "0") String asc_desc, Model model) {

		PageHelper.startPage(pageNum, 3);
		List<Map> list = service.getMovieList(mname, editor, year, beginTime, endTime, minPrice, maxPrice, minTime,
				maxTime, asc_desc);
		String url = "&mname=" + mname + "&editor=" + editor + "&year=" + year + "&beginTime=" + beginTime + "&endTime="
				+ endTime + "&minPrice=" + minPrice + "&maxPrice=" + maxPrice + "&minTime=" + minTime + "&maxTime="
				+ maxTime + "&asc_desc=" + asc_desc;
		PageInfo info = new PageInfo<>(list);
		PageUtils.page(model, info, url);
		model.addAttribute("list", list);
		model.addAttribute("asc_desc", asc_desc);
		model.addAttribute("mname", mname);
		model.addAttribute("editor", editor);
		model.addAttribute("year", year);
		model.addAttribute("beginTime", beginTime);
		model.addAttribute("endTime", endTime);
		model.addAttribute("minPrice", minPrice);
		model.addAttribute("maxPrice", maxPrice);
		model.addAttribute("minTime", minTime);
		model.addAttribute("maxTime", maxTime);

		return "list";
	}

	// 批删
	@RequestMapping("delete.do")
	@ResponseBody
	public boolean delete(String mid) {
		return service.delete(mid) > 0;
	}

	// 修改状态
	@RequestMapping("updateStatus.do")
	public String updateStatus(Integer mid, int status) {
		service.updateStatus(mid, status);
		return "redirect:list";
	}

	// 修改状态
	@RequestMapping("see.do")
	public String see() {

		return "see";
	}
}
