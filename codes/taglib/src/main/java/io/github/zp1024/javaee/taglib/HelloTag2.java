/**
 * The Apache License 2.0 Copyright (c) 2017 Zhang Peng
 */
package io.github.zp1024.javaee.taglib;

import java.io.IOException;
import java.io.StringWriter;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * @author Zhang Peng
 * @date 2017/4/3.
 */
public class HelloTag2 extends SimpleTagSupport {
    StringWriter sw = new StringWriter();

    public void doTag() throws JspException, IOException {
        getJspBody().invoke(sw);
        getJspContext().getOut().println(sw.toString());
    }
}