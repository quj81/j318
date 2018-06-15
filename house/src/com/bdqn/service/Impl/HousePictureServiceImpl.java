/**  
 * house_picture  
 * @author Mr.yang
 *  
 */
package com.bdqn.service.Impl;

import java.util.List;

import com.bdqn.dao.BaseDao;
import com.bdqn.dao.HousePictureDao;
import com.bdqn.dao.Impl.HousePictureDaoImpl;
import com.bdqn.entity.HousePicture;


public class HousePictureServiceImpl extends BaseDao implements HousePictureDao{
	
	public int addHousePicture(HousePicture HousePicture) {
		// TODO Auto-generated method stub
		HousePictureDao service=new HousePictureDaoImpl();
		return service.addHousePicture(HousePicture);
	}

	@Override
	public int modifyHousePicture(HousePicture HousePicture) {
		// TODO Auto-generated method stub
		HousePictureDao service=new HousePictureDaoImpl();
		return service.modifyHousePicture(HousePicture);
	}

	@Override
	public int delHousePicture(HousePicture HousePicture) {
		// TODO Auto-generated method stub
		HousePictureDao service=new HousePictureDaoImpl();
		return service.delHousePicture(HousePicture);
	}

	@Override
	public List<HousePicture> getHousePictureList() {
		// TODO Auto-generated method stub
		HousePictureDao service=new HousePictureDaoImpl();
		return service.getHousePictureList();
	}

	@Override
	public HousePicture getHousePictureInfo(int id) {
		// TODO Auto-generated method stub
		HousePictureDao service=new HousePictureDaoImpl();
		return service.getHousePictureInfo(id);
	}
}