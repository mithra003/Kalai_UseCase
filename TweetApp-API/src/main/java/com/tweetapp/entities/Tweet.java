package com.tweetapp.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.tweetapp.dto.Comment;
import com.tweetapp.dto.Like;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "tweets")
public class Tweet {
	
	@Id 
	private String tweetId;
	private String username;
	private String tweetText;
	private String firstName;
	private String lastName;
	private String tweetDate;
	private List<String> likes = new ArrayList<>();
	private List<Comment> comments = new ArrayList<>();
	
}
