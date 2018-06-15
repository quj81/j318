/**  
 * house_picturetype  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HousePicturetype;


public interface HousePicturetypeService {
	int addHousePicturetype(HousePicturetype HousePicturetype);
	int modifyHousePicturetype(HousePicturetype HousePicturetype);
	int delHousePicturetype(HousePicturetype HousePicturetype);
	List<HousePicturetype> getHousePicturetypeList();
	HousePicturetype getHousePicturetypeInfo(int id);   
}