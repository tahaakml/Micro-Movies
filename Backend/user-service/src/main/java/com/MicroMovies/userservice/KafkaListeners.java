package com.MicroMovies.userservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.MicroMovies.userservice.model.Notification;
import com.MicroMovies.userservice.model.User;
import com.MicroMovies.userservice.repository.NotificationRepository;
import com.MicroMovies.userservice.repository.UserRepository;

@Component
public class KafkaListeners {
	
	@Autowired
	private NotificationRepository notificationRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@KafkaListener(
			topics="Notification",
			groupId= "groupId"
			)
	void listener(String data) {
		System.out.println("Listner received: " + data);
		String[] s=data.split("z33");
		System.out.println(s[0]+" "+s[1]+' '+s[2]);
		Boolean b=s[1].equals("true")?true:false;
		List<String> categories=new ArrayList<>();
		Collections.addAll(categories,s);
		categories.remove(0);
		categories.remove(1);
		Notification notification=new Notification();
		notification.setCategories(categories);
		notification.setAllusers(b);
		notification.setDescription(s[0]);
		
		notificationRepository.save(notification);
		
		
	}
	
	@KafkaListener(
			topics="payement2",
			groupId= "groupId"
			)
	void listener1(String data) {
		System.out.println("Listner received: " + data);
		if(data.equals("non"))  System.out.println("invalid operation");
		else {
			User user=new User();
			String[] s=data.split("/");
			System.out.println(data);
			user.setUsername(s[0]);
			user.setPassword(s[1]);
			
			user.setEmail(s[2]);
			List<String> list=new ArrayList<>();
			list.add(s[3]);
			
					
			user.setPreferences(list);
			List<String> lis=new ArrayList<>();
			lis.add(s[4]);
			user.setRoles(lis);
			userRepository.save(user);
			System.out.println("valid operation");
			

			
		}
		
		
		
		
	}

	
	
}