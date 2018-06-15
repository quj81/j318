/**  
 * house_type  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseType;
public interface HouseTypeDao{  
	int addHouseType(HouseType HouseType);
	int modifyHouseType(HouseType HouseType);
	int delHouseType(HouseType HouseType);
	List<HouseType> getHouseTypeList();
	HouseType getHouseTypeInfo(int id);   
}