package fun.xiaorang.study.logback;

import ch.qos.logback.classic.Level;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiaorang
 * @description <p style = " font-weight:bold ; ">基础选择规则<p/>
 * @github <a href="https://github.com/xihuanxiaorang/logback-study">logback-study</a>
 * @Copyright 博客：<a href="https://docs.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2024/04/27 15:44
 */
public class BasicSelectionRuleTest {
  @Test
  public void test() {
    // 创建一个名为 "com.foo" 的记录器（logger），进一步强转记录器的类型为 ch.qos.logback.classic.Logger，以便我们可以设置其有效级别
    final ch.qos.logback.classic.Logger logger = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger("com.foo");
    // 设置 logger 的有效级别为 INFO。
    logger.setLevel(Level.INFO);
    // 这条日志会打印，因为 logger 的有效级别（INFO）>= 日志的打印级别（INFO）。
    logger.warn("Low fuel level.");
    // 这条日志不会打印，因为日志的打印级别（DEBUG）低于 logger 的有效级别（INFO）。
    logger.debug("Starting search for nearest gas station.");

    // barLogger（"com.foo.bar"） 会继承 logger（"com.foo"） 的有效级别（INFO）。
    final Logger barLogger = LoggerFactory.getLogger("com.foo.bar");
    // 这条日志会打印，因为 barLogger 的有效级别（INFO）>= 日志的打印级别（INFO）。
    barLogger.info("Located nearest gas station.");
    // 这条日志不会打印，因为日志的打印级别（DEBUG）低于 barLogger 的有效级别（INFO）。
    barLogger.debug("Exiting gas station search.");
  }
}
