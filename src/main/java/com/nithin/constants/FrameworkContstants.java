package com.nithin.constants;

public final class FrameworkContstants {

	private FrameworkContstants() {
	}

	private static final String CHROMEDRIVERPATH = System.getProperty("user.dir") + "src/test/resources/";
//	private static final String URL = "https://www.google.com/";

	public static String getChromePath() {
		return CHROMEDRIVERPATH;
	}

//	public static String getUrl() {
//		return URL;
//	}

}
