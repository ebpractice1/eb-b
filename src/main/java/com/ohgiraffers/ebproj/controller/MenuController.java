package com.ohgiraffers.ebproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ohgiraffers.ebproj.dto.MenuDTO;
import com.ohgiraffers.ebproj.service.MenuService;

@RestController
public class MenuController {

	private final MenuService menuService;

	@Autowired
	public MenuController(MenuService menuService) {
		this.menuService = menuService;
	}

	@GetMapping("/health")
	public String healthCheck() {
		return "I'm alive123!";
	}

	@GetMapping("/menus/{menuCode}")
	public MenuDTO findByMenuCode(@PathVariable("menuCode") int menuCode) {
		return menuService.findMenuByMenuCode(menuCode);
	}


}
