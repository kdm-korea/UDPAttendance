package com.services.webservice.controller.Member;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.services.webservice.service.MemberService.EquipService.MemberEquipService;
import com.services.webservice.service.dto.Equip.Request.ReqEquipRentalDto;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
@RequestMapping("/memeber")
public class MemberController {

	private MemberEquipService memberEquipService;

	@GetMapping("/equip")
	public String resMemberMypage(HttpSession session, Model model) {
		if(session != null) {
			model.addAttribute("equiplist", memberEquipService.selectEuqipList());
		}
		return "Member/memberEquipRent";
	}
	
	@PostMapping("/equip/rent")
	public String memberEquipRent(ReqEquipRentalDto dto, Model model) {
		
		return "";
	}
	
	@GetMapping("/equiprent")
	public String memberEquip(Model model) {
		
		return "";
	}
	
	@GetMapping("/computerRent")
	public String memberComputer(Model model) {
		
		return "";
	}
	
	@GetMapping("/QABoard")
	public String memberQABoard(Model model) {
		return "";
	}
}

