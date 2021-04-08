package com.github.sparsick.springbootexample.hero;


import com.github.sparsick.springbootexample.hero.universum.HeroController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HeroApplicationTest {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private HeroController controller;

	@Test
	public void controllerTest() throws Exception {
		assertThat(controller).isNotNull();
	}
}
