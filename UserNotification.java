package com.ada.ecs.underwriting.data;



import javax.persistence.*;

import java.io.Serializable;

/**
 * Created by Suvendu Pramanick on 20-04-2019.
 */


@Entity
@Table(name = "USER_NOTIFICATION")
public class UserNotification implements Serializable {
  
	   @Id
	    @Column(name = "USER_NOTIFICATION_ID")
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long USER_NOTIFICATION_ID;
	 
	    @Column(name = "USER_ID")
	    private int USER_ID;
	 
	    @Column(name = "USER_NOTIFICATION")
	    private String USER_NOTIFICATION;
	    
	    @Column(name = "IS_READ")
	    private boolean IS_READ;

	    @Column(name = "CREATED_BY")
	    private String CREATED_BY;
	    
	    @Column(name = "UPDATED_BY")
	    private String UPDATED_BY;
	    
	    @Column(name = "CREATE_DATE")
	    private String CREATE_DATE;
	    
	    @Column(name = "LAST_UPDATE_DATE")
	    private String LAST_UPDATE_DATE;
	    
	    @Column(name = "COUNTER")
	    private int COUNTER;

	    public UserNotification(){}
	    
		public UserNotification(Long uSER_NOTIFICATION_ID, int uSER_ID, String uSER_NOTIFICATION, boolean iS_READ,
				String cREATED_BY, String uPDATED_BY, String cREATE_DATE, String lAST_UPDATE_DATE, int cOUNTER) {
			super();
			USER_NOTIFICATION_ID = uSER_NOTIFICATION_ID;
			USER_ID = uSER_ID;
			USER_NOTIFICATION = uSER_NOTIFICATION;
			IS_READ = iS_READ;
			CREATED_BY = cREATED_BY;
			UPDATED_BY = uPDATED_BY;
			CREATE_DATE = cREATE_DATE;
			LAST_UPDATE_DATE = lAST_UPDATE_DATE;
			COUNTER = cOUNTER;
		}

		public Long getUSER_NOTIFICATION_ID() {
			return USER_NOTIFICATION_ID;
		}

		public void setUSER_NOTIFICATION_ID(Long uSER_NOTIFICATION_ID) {
			USER_NOTIFICATION_ID = uSER_NOTIFICATION_ID;
		}

		public int getUSER_ID() {
			return USER_ID;
		}

		public void setUSER_ID(int uSER_ID) {
			USER_ID = uSER_ID;
		}

		public String getUSER_NOTIFICATION() {
			return USER_NOTIFICATION;
		}

		public void setUSER_NOTIFICATION(String uSER_NOTIFICATION) {
			USER_NOTIFICATION = uSER_NOTIFICATION;
		}

		public boolean isIS_READ() {
			return IS_READ;
		}

		public void setIS_READ(boolean iS_READ) {
			IS_READ = iS_READ;
		}

		public String getCREATED_BY() {
			return CREATED_BY;
		}

		public void setCREATED_BY(String cREATED_BY) {
			CREATED_BY = cREATED_BY;
		}

		public String getUPDATED_BY() {
			return UPDATED_BY;
		}

		public void setUPDATED_BY(String uPDATED_BY) {
			UPDATED_BY = uPDATED_BY;
		}

		public String getCREATE_DATE() {
			return CREATE_DATE;
		}

		public void setCREATE_DATE(String cREATE_DATE) {
			CREATE_DATE = cREATE_DATE;
		}

		public String getLAST_UPDATE_DATE() {
			return LAST_UPDATE_DATE;
		}

		public void setLAST_UPDATE_DATE(String lAST_UPDATE_DATE) {
			LAST_UPDATE_DATE = lAST_UPDATE_DATE;
		}

		public int getCOUNTER() {
			return COUNTER;
		}

		public void setCOUNTER(int cOUNTER) {
			COUNTER = cOUNTER;
		}
	    
}
