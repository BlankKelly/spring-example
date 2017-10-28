package com.etime.spring.web;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.*;
import javax.servlet.ServletRegistration.Dynamic;
import java.util.EnumSet;

/**
 * Created by huitailang on 2017/10/22.
 * @author huitailang
 *
 * 相当于配置web.xml
 */
public class WebInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        //配置基于注解的ioc
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(MyMvcConfig.class);
        ctx.setServletContext(servletContext);

        FilterRegistration.Dynamic filter = servletContext.addFilter("characterEncodingFilter", new CharacterEncodingFilter("UTF-8"));
        filter.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST), true, "/");

        Dynamic servlet = servletContext.addServlet("dispatcher",new DispatcherServlet(ctx));
        servlet.addMapping("/");
        servlet.setLoadOnStartup(1);
    }
}
