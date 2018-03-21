package cn.music.listener;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import cn.music.po.User;
import cn.music.service.UserService;

public class LoginListener implements MessageListener{
	@Autowired
	private UserService userServiceImpl;
	@Override
	public void onMessage(Message message){
			try {
				TextMessage tm=(TextMessage)message;
				String text = tm.getText();
				Thread.sleep(1000);//等待事务提交，保证注册服务的数据保存到数据库
				/*String[] us = text.split("&");
				User user=new User();
				user.setAccount(us[0]);*/
				/*System.out.println(text);//null
				int uid = Integer.parseInt(text);
				User u = userServiceImpl.findUserById(uid);
				u=userServiceImpl.login(u);
				if (u!=null) {
				   System.out.println(u.getAccount()+u.getPassword());
				}*/
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
