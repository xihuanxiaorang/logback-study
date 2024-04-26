package fun.xiaorang.study.logback;

import org.slf4j.LoggerFactory;

/**
 * @author xiaorang
 * @description <p style = " font-weight:bold ; "><p/>
 * @github <a href="https://github.com/xihuanxiaorang/logback-study">logback-study</a>
 * @Copyright 博客：<a href="https://docs.xiaorang.fun">小让的糖果屋</a>  - show me the code
 * @date 2024/04/26 16:45
 */
public class Example {
  private static final ch.qos.logback.classic.Logger LOGGER = (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(Example.class);

  public static void main(String[] args) {
    LOGGER.info("Example log from {}", Example.class.getSimpleName());
  }
}
