package com.ada.ecs.underwriting.controller;

import com.ada.ecs.underwriting.data.UserNotification;
import com.ada.ecs.underwriting.repo.INotificationRepository;
//import com.ada.ecs.underwriting.service.IUserNotificationService;

import io.swagger.annotations.ApiOperation;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Suvendu Pramanick on 20-04-2019.
 */


@RestController
@RequestMapping("/notification")
public class NotificationController {
 

	private INotificationRepository notificationRepository;
    public NotificationController() {
        super();
    }
    
    @Autowired
    public NotificationController(final INotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }
    
    @ApiOperation(httpMethod = "GET", value = "GET Notification", consumes = "application/json")
    @RequestMapping(value="/{USER_ID}",method = RequestMethod.GET)
	public List<UserNotification> getAllNotifications(@PathVariable(value = "USER_ID")String USER_ID) {
		return (List<UserNotification>) notificationRepository.getNotificationByUserID(USER_ID);
	}
  

  /*  @Autowired
    public NotificationController(final IUserNotificationService studentRecordService) {
        this.studentRecordService = studentRecordService;
    }*/

    
   
   /* @ApiOperation(httpMethod = "POST", value = "Save Student Record into the Database", consumes = "application/json")
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Void> createStudentRecord(@RequestBody @Valid final NotificationDetails studentDetail) {
      //  this.studentRecordService.createStudentRecord(studentDetail);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @ApiOperation(httpMethod = "GET", value = "Fetch Student Record from the Database", consumes = "application/json")
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<String> getNotificationDetails(@RequestParam String studentUsn) {
       /// UserNotification ddpaStudentDetail = this.studentRecordService.getStudentDetails(studentUsn);
        return new ResponseEntity<>(ddpaStudentDetail, HttpStatus.OK);
    }*/
}
