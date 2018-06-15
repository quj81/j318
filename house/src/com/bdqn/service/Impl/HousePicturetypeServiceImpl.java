/**  
 * house_picturetype  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HousePicturetypeDao;
import com.bdqn.dao.Impl.HousePicturetypeDaoImpl;
import com.bdqn.entity.HousePicturetype;


public class HousePicturetypeServiceImpl extends BaseDao implements HousePicturetypeDao{
	
	public int addHousePicturetype(HousePicturetype HousePicturetype) {
		// TODO Auto-generated method stub
		HousePicturetypeDao service=new HousePicturetypeDaoImpl();
		return service.addHousePicturetype(HousePicturetype);
	}

	@Override
	public int modifyHousePicturetype(HousePicturetype HousePicturetype) {
		// TODO Auto-generated method stub
		HousePicturetypeDao service=new HousePicturetypeDaoImpl();
		return service.modifyHousePicturetype(HousePicturetype);
	}

	@Override
	public int delHousePicturetype(HousePicturetype HousePicturetype) {
		// TODO Auto-generated method stub
		HousePicturetypeDao service=new HousePicturetypeDaoImpl();
		return service.delHousePicturetype(HousePicturetype);
	}

	@Override
	public List<HousePicturetype> getHousePicturetypeList() {
		// TODO Auto-generated method stub
		HousePicturetypeDao service=new HousePicturetypeDaoImpl();
		return service.getHousePicturetypeList();
	}

	@Override
	public HousePicturetype getHousePicturetypeInfo(int id) {
		// TODO Auto-generated method stub
		HousePicturetypeDao service=new HousePicturetypeDaoImpl();
		return service.getHousePicturetypeInfo(id);
	}
}