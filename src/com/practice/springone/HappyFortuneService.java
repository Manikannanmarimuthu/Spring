package com.practice.springone;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Happy  Fortune Service !!! Lucky Day";
	}

}
