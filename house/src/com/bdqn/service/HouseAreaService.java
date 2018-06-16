/**  
 * house_area  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseArea;


public interface HouseAreaService {
	int addHouseArea(HouseArea HouseArea);
	int modifyHouseArea(HouseArea HouseArea);
	int delHouseArea(HouseArea HouseArea);
	List<HouseArea> getHouseAreaList();
	List<HouseArea> getHouseAreaList(int id);
	HouseArea getHouseAreaInfo(int id);   
}