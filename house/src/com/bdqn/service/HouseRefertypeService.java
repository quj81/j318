/**  
 * house_refertype  
 * @author Mr.yang
 *  
 */
package com.bdqn.service;

import java.util.List;

import com.bdqn.entity.HouseRefertype;


public interface HouseRefertypeService {
	int addHouseRefertype(HouseRefertype HouseRefertype);
	int modifyHouseRefertype(HouseRefertype HouseRefertype);
	int delHouseRefertype(HouseRefertype HouseRefertype);
	List<HouseRefertype> getHouseRefertypeList();
	HouseRefertype getHouseRefertypeInfo(int id);   
}