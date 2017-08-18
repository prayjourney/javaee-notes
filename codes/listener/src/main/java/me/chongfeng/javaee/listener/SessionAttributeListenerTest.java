package me.chongfeng.javaee.listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SessionAttributeListenerTest implements HttpSessionAttributeListener {

    Logger logger = LoggerFactory.getLogger(getClass());

    // 添加属性
    public void attributeAdded(HttpSessionBindingEvent se) {
        HttpSession session = se.getSession();
        String name = se.getName();
        logger.info("新建session属性：" + name + ", 值为：" + se.getValue());
    }

    // 删除属性
    public void attributeRemoved(HttpSessionBindingEvent se) {
        HttpSession session = se.getSession();
        String name = se.getName();
        logger.info("删除session属性：" + name + ", 值为：" + se.getValue());
    }

    // 修改属性
    public void attributeReplaced(HttpSessionBindingEvent se) {
        HttpSession session = se.getSession();
        String name = se.getName();
        Object oldValue = se.getValue();
        logger.info("修改session属性：" + name + ", 原值：" + oldValue + ", 新值：" + session.getAttribute(name));
    }
}
