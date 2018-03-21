package cn.music.controller;
import java.io.IOException;
import java.sql.Timestamp;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.music.po.User;
import cn.music.service.UserService;
import cn.music.utils.Md5Utils;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired 
	private UserService userServiceImpl;
	@RequestMapping("/regist")
	public void regist(User u,HttpServletRequest request,HttpServletResponse response) throws IOException, InterruptedException{
		u.setHeadimg("default.jpg");
		u.setCreatetime(new Timestamp(System.currentTimeMillis()));
		String pwd = u.getPassword();
		u.setPassword(Md5Utils.getMD5(pwd));
		boolean isr = userServiceImpl.regist(u);
		if (isr) {
			response.getWriter().write("success");
		}else{
			response.getWriter().write("fail");
		}
	}
	
	@RequestMapping("/login")
	public void login(User u,HttpServletRequest request,HttpServletResponse response) throws IOException{
		u.setPassword(Md5Utils.getMD5(u.getPassword()));
		User user = userServiceImpl.login(u);
		if(user!=null){
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().write("true");
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("usernick", user.getNickname());
			System.out.println(user.getNickname());
			/*测试全局异常
			int a=1/0;*/
		}else{
		}
	}
	
	@RequestMapping("/login1")
	public String login1(User u,HttpServletRequest request,HttpServletResponse response) throws IOException{
		u.setPassword(Md5Utils.getMD5(u.getPassword()));
		User user = userServiceImpl.login(u);
		if(user!=null){
			response.setContentType("text/html; charset=utf-8");
			response.getWriter().write("true");
			request.getSession().setAttribute("user", user);
			request.getSession().setAttribute("usernick", user.getNickname());
			System.out.println(user.getNickname());
			/*测试全局异常
			int a=1/0;*/
			return "page/myMusic";
		}else{
			return "error/exception";
		}
	}
	@RequestMapping("/logout")
	public String logout(HttpServletRequest request) throws IOException{
		System.out.println(request.getSession(false).getAttribute("usernick"));
		request.getSession(false).removeAttribute("usernick");
		return "forward:/";
	}
}
