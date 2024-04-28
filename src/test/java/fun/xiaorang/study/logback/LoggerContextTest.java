package fun.xiaorang.study.logback;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

/**
 * @author xiaorang
 * @description <p style = " font-weight:bold ; ">记录器上下文<p/>
 * @github <a href="https://github.com/xihuanxiaorang/logback-study">logback-study</a>
 * @Copyright 博客：<a href="https://docs.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2024/04/26 16:53
 */
public class LoggerContextTest {
  @Test
  public void test() {
    ch.qos.logback.classic.Logger parentLogger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("fun.xiaorang.study.logback");
    parentLogger.setLevel(ch.qos.logback.classic.Level.INFO);
    ch.qos.logback.classic.Logger childlogger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("fun.xiaorang.study.logback.tests");
    parentLogger.warn("This message is logged because WARN > INFO.");
    parentLogger.debug("This message is not logged because DEBUG < INFO.");
    childlogger.info("INFO == INFO");
    childlogger.debug("DEBUG < INFO");
  }

  @Test
  public void test1() {
    ch.qos.logback.classic.Logger logger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("fun.xiaorang.study.logback");
    logger.debug("Hi there!");
    logger.debug("This message is logged because DEBUG == DEBUG.");
    ch.qos.logback.classic.Logger rootLogger =
            (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);
    rootLogger.setLevel(ch.qos.logback.classic.Level.ERROR);
    logger.warn("This message is not logged because WARN < ERROR.");
    logger.error("This is logged.");
  }
}
