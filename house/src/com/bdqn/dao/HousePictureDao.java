/**  
 * house_picture  
 * @author Doc.zhen
 *  
 */
package com.bdqn.dao;
import java.util.List;
import com.bdqn.entity.HousePicture;
public interface HousePictureDao{  
	int addHousePicture(HousePicture HousePicture);
	int modifyHousePicture(HousePicture HousePicture);
	int delHousePicture(HousePicture HousePicture);
	List<HousePicture> getHousePictureList();
	HousePicture getHousePictureInfo(int id);   
}