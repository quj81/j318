/**  
 * house_news  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseNews;
public interface HouseNewsDao{  
	int addHouseNews(HouseNews HouseNews);
	int modifyHouseNews(HouseNews HouseNews);
	int delHouseNews(HouseNews HouseNews);
	List<HouseNews> getHouseNewsList();
	HouseNews getHouseNewsInfo(int id);   
	public List<HouseNews> getHouseNewsInIndex();
	HouseNews getHouseNewsInIndexA();
}