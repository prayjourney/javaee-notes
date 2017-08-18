/**
 * The Apache License 2.0 Copyright (c) 2017 Victor Zhang
 */
package me.chongfeng.javaee.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSession;

/**
 * @author victor zhang
 * @date 2017/4/4.
 */
public class MyServletRequestAttributeListener implements ServletRequestAttributeListener {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void attributeAdded(ServletRequestAttributeEvent srae) {
        logger.debug("ServletRequest域对象中添加了属性:{}，属性值是:{}", srae.getName(), srae.getValue());
    }

    @Override
    public void attributeRemoved(ServletRequestAttributeEvent srae) {
        logger.debug("ServletRequest域对象中删除了属性:{}，属性值是:{}", srae.getName(), srae.getValue());
    }

    @Override
    public void attributeReplaced(ServletRequestAttributeEvent srae) {
        logger.debug("ServletRequest域对象中替换了属性:{}，原值是:{}， 现值是:{}",
                srae.getName(), srae.getSource(), srae.getValue());
    }
}
