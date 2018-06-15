/**  
 * house_user  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseUserDao;
import com.bdqn.dao.Impl.HouseUserDaoImpl;
import com.bdqn.entity.HouseUser;


public class HouseUserServiceImpl extends BaseDao implements HouseUserDao{
	
	public int addHouseUser(HouseUser HouseUser) {
		// TODO Auto-generated method stub
		HouseUserDao service=new HouseUserDaoImpl();
		return service.addHouseUser(HouseUser);
	}

	@Override
	public int modifyHouseUser(HouseUser HouseUser) {
		// TODO Auto-generated method stub
		HouseUserDao service=new HouseUserDaoImpl();
		return service.modifyHouseUser(HouseUser);
	}

	@Override
	public int delHouseUser(HouseUser HouseUser) {
		// TODO Auto-generated method stub
		HouseUserDao service=new HouseUserDaoImpl();
		return service.delHouseUser(HouseUser);
	}

	@Override
	public List<HouseUser> getHouseUserList() {
		// TODO Auto-generated method stub
		HouseUserDao service=new HouseUserDaoImpl();
		return service.getHouseUserList();
	}

	@Override
	public HouseUser getHouseUserInfo(int id) {
		// TODO Auto-generated method stub
		HouseUserDao service=new HouseUserDaoImpl();
		return service.getHouseUserInfo(id);
	}
}