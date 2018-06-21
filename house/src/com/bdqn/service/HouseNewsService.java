/**  
 * house_news  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseNews;


public interface HouseNewsService {
	int addHouseNews(HouseNews HouseNews);
	int modifyHouseNews(HouseNews HouseNews);
	int delHouseNews(HouseNews HouseNews);
	List<HouseNews> getHouseNewsList();
	HouseNews getHouseNewsInfo(int id);   
	public List<HouseNews> getHouseNewsInIndex();
	HouseNews getHouseNewsInIndexA();
}