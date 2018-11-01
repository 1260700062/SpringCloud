package com.demo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;

public class NameFilter extends ZuulFilter {

    private static Logger log = LoggerFactory.getLogger(NameFilter.class);

    /**
     * 过滤器类型，决定在请求的哪个生命周期进行
     */
    @Override
    public String filterType() {
        return "pre";
    }

    /**
     * 过滤器顺序，根据返回值依次进行
     */
    @Override
    public int filterOrder() {
        return 0;
    }

    /**
     * 指定过滤器有效范围
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 过滤器具体逻辑
     */
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        log.info("send {} request to {}", request.getMethod(), request.getRequestURI());

        Object nameToken = request.getParameter("name");
        if(nameToken == null) {
            log.warn("name token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            return null;
        }
        log.info("name token ok");
        return null;
    }
}
