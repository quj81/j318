/**  
 * house_news  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseNewsDao;
import com.bdqn.dao.Impl.HouseNewsDaoImpl;
import com.bdqn.entity.HouseNews;
import com.bdqn.service.HouseNewsService;


public class HouseNewsServiceImpl extends BaseDao implements HouseNewsService{
	
	public int addHouseNews(HouseNews HouseNews) {
		// TODO Auto-generated method stub
		HouseNewsDao service=new HouseNewsDaoImpl();
		return service.addHouseNews(HouseNews);
	}

	@Override
	public int modifyHouseNews(HouseNews HouseNews) {
		// TODO Auto-generated method stub
		HouseNewsDao service=new HouseNewsDaoImpl();
		return service.modifyHouseNews(HouseNews);
	}

	@Override
	public int delHouseNews(HouseNews HouseNews) {
		// TODO Auto-generated method stub
		HouseNewsDao service=new HouseNewsDaoImpl();
		return service.delHouseNews(HouseNews);
	}

	@Override
	public List<HouseNews> getHouseNewsList() {
		// TODO Auto-generated method stub
		HouseNewsDao service=new HouseNewsDaoImpl();
		return service.getHouseNewsList();
	}

	@Override
	public HouseNews getHouseNewsInfo(int id) {
		// TODO Auto-generated method stub
		HouseNewsDao service=new HouseNewsDaoImpl();
		return service.getHouseNewsInfo(id);
	}
}