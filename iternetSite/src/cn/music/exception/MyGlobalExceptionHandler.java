package cn.music.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
//ȫ���쳣������
//��service�㽫�쳣�׸����ֲ㣬���ֲ㲻������������׻��׸�springmvc��ܣ�springmvc��ܻ���ȫ���쳣���������д���
public class MyGlobalExceptionHandler implements HandlerExceptionResolver{
	Logger logger=LoggerFactory.getLogger(MyGlobalExceptionHandler.class);
	@Override
	public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex) {
		//��ӡջ��Ϣ
		ex.printStackTrace();
		//д��־
		logger.debug("���Գ����쳣������");
		logger.info("ϵͳ�����쳣��");
		logger.trace("ϵͳ�����쳣", ex);
		//�����ʼ��Ͷ���
		//ʹ��jmail�����ʼ���ʹ�õ���������webservice���Ͷ���
		//��ʾ�Ѻ�ҳ��
		ModelAndView modelAndView=new ModelAndView();
		modelAndView.setViewName("error/exception");
		return modelAndView;
	}

}
