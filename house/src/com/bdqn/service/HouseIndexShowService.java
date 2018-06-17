/**  
 * house_index_show  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;


import com.bdqn.entity.HouseIndexShow;


public interface HouseIndexShowService {
	int addHouseIndexShow(HouseIndexShow HouseIndexShow);
	int modifyHouseIndexShow(HouseIndexShow HouseIndexShow);
	int delHouseIndexShow(HouseIndexShow HouseIndexShow);
	List<HouseIndexShow> getHouseIndexShowList();
	HouseIndexShow getHouseIndexShowInfo(int id);   
}