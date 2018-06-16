/**  
 * house_town  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseTownDao;
import com.bdqn.dao.Impl.HouseTownDaoImpl;
import com.bdqn.entity.HouseTown;
import com.bdqn.service.HouseTownService;


public class HouseTownServiceImpl extends BaseDao implements HouseTownService{
	
	public int addHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		HouseTownDao service=new HouseTownDaoImpl();
		return service.addHouseTown(HouseTown);
	}

	@Override
	public int modifyHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		HouseTownDao service=new HouseTownDaoImpl();
		return service.modifyHouseTown(HouseTown);
	}

	@Override
	public int delHouseTown(HouseTown HouseTown) {
		// TODO Auto-generated method stub
		HouseTownDao service=new HouseTownDaoImpl();
		return service.delHouseTown(HouseTown);
	}

	@Override
	public List<HouseTown> getHouseTownList() {
		// TODO Auto-generated method stub
		HouseTownDao service=new HouseTownDaoImpl();
		return service.getHouseTownList();
	}

	@Override
	public HouseTown getHouseTownInfo(int id) {
		// TODO Auto-generated method stub
		HouseTownDao service=new HouseTownDaoImpl();
		return service.getHouseTownInfo(id);
	}

	@Override
	public List<HouseTown> getHouseTownListId(int id) {
		// TODO Auto-generated method stub
		HouseTownDao service=new HouseTownDaoImpl();
		return service.getHouseTownListId(id);
	}
}