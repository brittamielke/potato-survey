package com.libertymutual.gofocode.hello_world_again.models;

public class SurveyResults {
	private int russetCount;
	private int goldenCount;
	private int sweetCount;

	public void registerRussetVote() {
		russetCount = russetCount + 1;
	}

	public void registerSweetVote() {
		sweetCount = sweetCount + 1;
	}

	public void registerGoldenVote() {
		goldenCount = goldenCount + 1;
	}
	
	public int russetTotal() {
		return russetCount;
	}
	
	public int goldenTotal() {
		return goldenCount;
	}
	
	public int sweetTotal() {
		return sweetCount;
	}
}
