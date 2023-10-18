package com.itheima.day14.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
    private static final Logger logger = LoggerFactory.getLogger(Test.class);

    public static void main(String[] args) {
//        框架:   框:一种约束，限制
//                架:功能
//        第一个约束
//        引入jar包 jar:是一种压缩包，压缩的是class文件(java archive)
//        第二个约束
//        引入配置文件
        System.out.println("输出日志");
        logger.info("输出日志");

//        日志六大级别:TRACE< DEBUG< INFO< WARN< ERROR< FATAL
        logger.trace("这是跟踪级别");
        logger.debug("这是调试级别");
//        和sout一样用在方法里
        logger.info("这是信息级别");
        logger.warn("这是警告级别");
//        用着catch里面
        logger.error("这是错误级别");

    }
}
