/**  
 * house_finishstate  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseFinishstate;


public interface HouseFinishstateService {
	int addHouseFinishstate(HouseFinishstate HouseFinishstate);
	int modifyHouseFinishstate(HouseFinishstate HouseFinishstate);
	int delHouseFinishstate(HouseFinishstate HouseFinishstate);
	List<HouseFinishstate> getHouseFinishstateList();
	HouseFinishstate getHouseFinishstateInfo(int id);   
}