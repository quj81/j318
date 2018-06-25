/**  
 * house_picture  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HousePicture;


public interface HousePictureService {
	int addHousePicture(HousePicture HousePicture);
	int modifyHousePicture(HousePicture HousePicture);
	int delHousePicture(HousePicture HousePicture);
	List<HousePicture> getHousePictureList();
	HousePicture getHousePictureInfo(int id);  
	HousePicture getHousePicturead(int id);
	List<HousePicture> getHousePictureListforcon(int id,int tid);
}