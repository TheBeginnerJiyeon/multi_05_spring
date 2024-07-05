package com.multi.spring.movie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.multi.spring.movie.model.dto.MovieDTO;

@SessionAttributes("loginUser") // Model에 Attribute 추가할때 자동으로 설정된 키값을 세션에 등록 시키는 기능
@Controller
@RequestMapping("/movie")
public class MovieController {

	@RequestMapping("/main")
	public String main() {
		return "redirect:/index.jsp";
	}

	@GetMapping("/genre")
	public void movieMain() {

	}

	@RequestMapping("/movie2")
	public void movie2() {

	}

	@RequestMapping("/action")
	public void action() {

	}

	@RequestMapping("/comic")
	public void comic() {

	}

	@RequestMapping("/drama")
	public void drama() {

	}

	@RequestMapping("pay")
	public void pay(@RequestParam("title") String title, @RequestParam("price") int price, Model model) {
		System.out.println("pay-------");
//		model.addAttribute("title", title);
//		model.addAttribute("price", price);
		// pay.jsp로 포워딩
	}

	@RequestMapping("pay2")
	public void pay2(@RequestParam("total") int total, Model model) {
		System.out.println("pay2-------");
		int result = (int) (total * 0.9);
		model.addAttribute("result", result);

	}

	@RequestMapping("genre2")
	public String genre2(@RequestParam("movie") String movie) {
		System.out.println("genre2-------");

		if (movie.equals("action") | movie.equals("액션")) {
			movie = "action";
		} else if (movie.equals("comic") | movie.equals("코믹")) {
			movie = "comic";
		} else {
			movie = "drama";
		}

		String page = "redirect:" + movie;

		System.out.println(page);
		return page;

	}

	@PostMapping("/genre")
	public void movieGenre(MovieDTO movieDTO, Model model) {

		System.out.println("컨트롤러에서 받은 값" + movieDTO);

		// db처리
		/* model.addAttribute("moviedto",movieDTO); */

	}

	@PostMapping("/movie.do")
	public String movie(String title, int price, Model model, RedirectAttributes redirectAttributes) {
		// 관람료가 10000원이상이면 pay.jsp로 감!
		// 관람료가 10000원 이상이 아니면 webapp/movie2.jsp로 감.

		String page = "redirect:movie2";

		if (price >= 10000) {

//			page = "/movie/pay";
//			// 포워드일 때 모델을 쓴다.
//			model.addAttribute("title", title);
//			model.addAttribute("price", price);

			page = "redirect:pay";
		}

		redirectAttributes.addAttribute("title", title);
		redirectAttributes.addAttribute("price", price);

		return page;

	}

}
