package com.practice.springone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	private FortuneService fortuneService;

	// As of Spring Framework 4.3, an @Autowired annotation on such a constructor is
	// no
	// longer necessary if the target bean only defines one constructor to begin
	// with. However,
	// if several constructors are available, at least one must be annotated to
	// teach the container which one to use.

	/*
	 * @Autowired public TennisCoach(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */

	public TennisCoach() {
		System.out.println("Tennis Coach Constructor");
	}
	
	
/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService fortuneService) {
		System.out.println("Settie Injection");
		this.fortuneService = fortuneService;
	} */

	
	@Override
	public String getDailyWorkout() {
		return "Practice Your Tennis Daily";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
