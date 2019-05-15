package com.ada.ecs.underwriting.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Suvendu Pramanick on 20-04-2019.
 */


@Entity
@Table(name = "EMPLOYEE_MASTER")
public class EmployeeDetails implements Serializable{
	
	    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		@Id
	    @Column(name = "EMP_ID")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long EMP_ID;
	    
	    @Column(name = "EMP_CODE")
	    private String EMP_CODE;
	    
	    @Column(name = "NAME")
	    private String NAME;
	    
	    @Column(name = "SEX")
	    private String SEX;
	    
	    @Column(name = "USER_ID")
	    private String USER_ID;
	    
	    @Column(name = "EMAIL")
	    private String EMAIL;

		public EmployeeDetails() {
			
		}

		public EmployeeDetails(Long eMP_ID, String eMP_CODE, String nAME, String sEX, String uSER_ID, String eMAIL) {
			super();
			EMP_ID = eMP_ID;
			EMP_CODE = eMP_CODE;
			NAME = nAME;
			SEX = sEX;
			USER_ID = uSER_ID;
			EMAIL = eMAIL;
		}

		public Long getEMP_ID() {
			return EMP_ID;
		}

		public void setEMP_ID(Long eMP_ID) {
			EMP_ID = eMP_ID;
		}

		public String getEMP_CODE() {
			return EMP_CODE;
		}

		public void setEMP_CODE(String eMP_CODE) {
			EMP_CODE = eMP_CODE;
		}

		public String getNAME() {
			return NAME;
		}

		public void setNAME(String nAME) {
			NAME = nAME;
		}

		public String getSEX() {
			return SEX;
		}

		public void setSEX(String sEX) {
			SEX = sEX;
		}

		public String getUSER_ID() {
			return USER_ID;
		}

		public void setUSER_ID(String uSER_ID) {
			USER_ID = uSER_ID;
		}

		public String getEMAIL() {
			return EMAIL;
		}

		public void setEMAIL(String eMAIL) {
			EMAIL = eMAIL;
		}

		@Override
		public String toString() {
			return "EmployeeDetails [EMP_ID=" + EMP_ID + ", EMP_CODE=" + EMP_CODE + ", NAME=" + NAME + ", SEX=" + SEX
					+ ", USER_ID=" + USER_ID + ", EMAIL=" + EMAIL + "]";
		}
	    
	    
	    
	    
	    
	    
}








