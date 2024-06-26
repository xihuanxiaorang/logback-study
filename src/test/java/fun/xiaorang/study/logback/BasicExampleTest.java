package fun.xiaorang.study.logback;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;

/**
 * @author xiaorang
 * @description <p style = " font-weight:bold ; ">基础示例<p/>
 * @github <a href="https://github.com/xihuanxiaorang/logback-study">logback-study</a>
 * @Copyright 博客：<a href="https://docs.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2024/04/26 17:42
 */
public class BasicExampleTest {
  private static final ch.qos.logback.classic.Logger LOGGER = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(BasicExampleTest.class);

  @Test
  public void test() {
    LOGGER.info("Example log from {}", BasicExampleTest.class.getSimpleName());
  }
}
