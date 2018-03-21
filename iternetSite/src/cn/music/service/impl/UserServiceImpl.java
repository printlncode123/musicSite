package cn.music.service.impl;

import java.util.List;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;
import cn.music.mapper.UserMapper;
import cn.music.po.User;
import cn.music.po.UserExample;
import cn.music.po.UserExample.Criteria;
import cn.music.service.UserService;
import cn.music.utils.Md5Utils;
@Service
public class UserServiceImpl implements UserService {
	/*@Autowired
	private JmsTemplate jmsTemplate;//spring�ṩ���ڷ��ͣ�������Ϣ
*/	/*@Resource
	private Destination topicDestination;//Ŀ�Ķ���
*/	@Autowired
	private UserMapper userMapper;
	
	//ע��
	@Override
	public boolean regist(User user) {
		int i = userMapper.insert(user);
		if (i>0) {
			return true;
		}else{
			return false;
		}
		/*final String account = user.getAccount();
		final String password = Md5Utils.getMD5(user.getPassword());
		final Integer id = user.getId();
		jmsTemplate.send(topicDestination, new MessageCreator() {
			@Override
			public Message createMessage(Session session) throws JMSException {
				TextMessage tm = session.createTextMessage(id+"");
				return tm;
			}
		});*/
	}
	
	//��¼
	@Override
	public User login(User user) {
		UserExample uExample=new UserExample();
		Criteria criteria = uExample.createCriteria();
		criteria.andAccountEqualTo(user.getAccount());
		criteria.andPasswordEqualTo(user.getPassword());
		criteria.andPhonePrefixEqualTo(user.getPhonePrefix());
		List<User> selectByExample = userMapper.selectByExample(uExample);
		return selectByExample.get(0);
	}
	
	//�����û�id��ѯĳ�û�
	public User findUserById(int id){
		return userMapper.selectByPrimaryKey(id);
	}
}
