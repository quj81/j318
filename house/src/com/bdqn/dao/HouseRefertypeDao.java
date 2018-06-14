/**  
 * house_refertype  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseRefertype;
public interface HouseRefertypeDao{  
	int addHouseRefertype(HouseRefertype HouseRefertype);
	int modifyHouseRefertype(HouseRefertype HouseRefertype);
	int delHouseRefertype(HouseRefertype HouseRefertype);
	List<HouseRefertype> getHouseRefertypeList();
	HouseRefertype getHouseRefertypeInfo(int id);   
}