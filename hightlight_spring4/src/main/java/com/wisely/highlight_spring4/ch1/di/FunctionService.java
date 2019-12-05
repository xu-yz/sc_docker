package com.wisely.highlight_spring4.ch1.di;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {

	public String SayHello(String word){
		return "Hello "+word+"!";
	}
}
