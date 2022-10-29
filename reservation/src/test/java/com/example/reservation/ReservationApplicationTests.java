package com.example.reservation;

import com.example.reservation.pages.HomePage;
import com.example.reservation.pages.LoginPage;
import com.example.reservation.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ReservationApplicationTests {

	@Autowired
	private MainPage mainPage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Value("testing")
	private String environment;

	@Test
	void contextLoads() {
		System.out.println(appUrl);
		mainPage.PerformLogin();
	}

}
