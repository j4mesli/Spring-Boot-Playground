package com.example.demo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		String[] fortunes = { "Today is your lucky day!", "Oof, sorry! Better luck next time!", "Sometimes maybe good, sometimes maybe sheet." };
		String fortune = fortunes[(int) Math.floor(Math.random()*3)];
		return fortune;
	}

}
