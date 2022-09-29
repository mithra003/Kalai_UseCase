package com.tweetapp.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "users")
public class UserModel {
	
	@Id
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private String contactNum;
	private String password;
}
