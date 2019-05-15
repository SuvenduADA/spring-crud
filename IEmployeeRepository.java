package com.ada.ecs.underwriting.repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.ada.ecs.underwriting.data.EmployeeDetails;

/**
 * Created by Suvendu Pramanick on 20-04-2019.
 */



@Repository
public interface IEmployeeRepository extends CrudRepository<EmployeeDetails, Long> {
	
	@Query(nativeQuery = true,value ="select EMP_ID from EMPLOYEE_MASTER e where e.USER_ID=:USER_ID")
	public int getEmpIDByUserName(@Param(value = "USER_ID")String USER_ID);
	

}
