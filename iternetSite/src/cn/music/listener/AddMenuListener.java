package cn.music.listener;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;
import org.springframework.beans.factory.annotation.Autowired;
import cn.music.po.User;
import cn.music.service.SongService;
import cn.music.service.UserService;

public class AddMenuListener implements MessageListener{
	@Autowired
	private SongService songService;
	@Override
	public void onMessage(Message message){
			try {
				Thread.sleep(1000);//等待事务提交，保证注册服务的数据保存到数据库
				TextMessage tm=(TextMessage)message;
				String text = tm.getText();
				Thread.sleep(1000);//等待事务提交，保证注册服务的数据保存到数据库
				String[] split = text.split(":");
				System.out.println(split[0]+":"+split[1]);
				songService.addusersong(Integer.parseInt(split[0]),Integer.parseInt(split[1]));
			} catch (Exception e) {
				e.printStackTrace();
			}
		
	}

}
