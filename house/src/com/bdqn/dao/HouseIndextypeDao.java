/**  
 * house_indextype  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseIndextype;
public interface HouseIndextypeDao{  
	int addHouseIndextype(HouseIndextype HouseIndextype);
	int modifyHouseIndextype(HouseIndextype HouseIndextype);
	int delHouseIndextype(HouseIndextype HouseIndextype);
	List<HouseIndextype> getHouseIndextypeList();
	HouseIndextype getHouseIndextypeInfo(int id);   
}