/**  
 * house_property  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HouseProperty;
public interface HousePropertyDao{  
	int addHouseProperty(HouseProperty HouseProperty);
	int modifyHouseProperty(HouseProperty HouseProperty);
	int delHouseProperty(HouseProperty HouseProperty);
	List<HouseProperty> getHousePropertyList();
	HouseProperty getHousePropertyInfo(int id);   
}