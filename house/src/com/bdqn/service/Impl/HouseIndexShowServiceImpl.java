/**  
 * house_index_show  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseIndexShowDao;
import com.bdqn.dao.Impl.HouseIndexShowDaoImpl;
import com.bdqn.entity.HouseIndexShow;


public class HouseIndexShowServiceImpl extends BaseDao implements HouseIndexShowDao{
	
	public int addHouseIndexShow(HouseIndexShow HouseIndexShow) {
		// TODO Auto-generated method stub
		HouseIndexShowDao service=new HouseIndexShowDaoImpl();
		return service.addHouseIndexShow(HouseIndexShow);
	}

	@Override
	public int modifyHouseIndexShow(HouseIndexShow HouseIndexShow) {
		// TODO Auto-generated method stub
		HouseIndexShowDao service=new HouseIndexShowDaoImpl();
		return service.modifyHouseIndexShow(HouseIndexShow);
	}

	@Override
	public int delHouseIndexShow(HouseIndexShow HouseIndexShow) {
		// TODO Auto-generated method stub
		HouseIndexShowDao service=new HouseIndexShowDaoImpl();
		return service.delHouseIndexShow(HouseIndexShow);
	}

	@Override
	public List<HouseIndexShow> getHouseIndexShowList() {
		// TODO Auto-generated method stub
		HouseIndexShowDao service=new HouseIndexShowDaoImpl();
		return service.getHouseIndexShowList();
	}

	@Override
	public HouseIndexShow getHouseIndexShowInfo(int id) {
		// TODO Auto-generated method stub
		HouseIndexShowDao service=new HouseIndexShowDaoImpl();
		return service.getHouseIndexShowInfo(id);
	}
}