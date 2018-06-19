/**  
 * house_message  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HouseMessageDao;
import com.bdqn.dao.Impl.HouseMessageDaoImpl;
import com.bdqn.entity.HouseMessage;
import com.bdqn.service.HouseMessageService;


public class HouseMessageServiceImpl extends BaseDao implements HouseMessageService{
	
	public int addHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		HouseMessageDao service=new HouseMessageDaoImpl();
		return service.addHouseMessage(HouseMessage);
	}

	@Override
	public int modifyHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		HouseMessageDao service=new HouseMessageDaoImpl();
		return service.modifyHouseMessage(HouseMessage);
	}

	@Override
	public int delHouseMessage(HouseMessage HouseMessage) {
		// TODO Auto-generated method stub
		HouseMessageDao service=new HouseMessageDaoImpl();
		return service.delHouseMessage(HouseMessage);
	}

	@Override
	public List<HouseMessage> getHouseMessageList() {
		// TODO Auto-generated method stub
		HouseMessageDao service=new HouseMessageDaoImpl();
		return service.getHouseMessageList();
	}

	@Override
	public HouseMessage getHouseMessageInfo(int id) {
		// TODO Auto-generated method stub
		HouseMessageDao service=new HouseMessageDaoImpl();
		return service.getHouseMessageInfo(id);
	}

	@Override
	public int checkName(String name) {
		// TODO Auto-generated method stub
		HouseMessageDao service =new HouseMessageDaoImpl();
		return service.checkName(name);
	}

	@Override
	public List<HouseMessage> getHouseMessageList(String sql) {
		// TODO Auto-generated method stub
		HouseMessageDao service =new HouseMessageDaoImpl();
		return service.getHouseMessageList(sql);
	}

	@Override
	public List<HouseMessage> getLikeHouseMessageList(String name) {
		// TODO Auto-generated method stub
		HouseMessageDao service =new HouseMessageDaoImpl();
		return service.getLikeHouseMessageList(name);
	}
}