package Behavior.TemplateMethod;

/**
 * 模版抽象类
 * 定义方法子类重写
 *
 * @author : woods
 * @ClassName : template
 * @date : 2023/1/17  2:57 PM
 * @Version ：1.0
 */
public abstract class Template {


  /**
   * 钩子方法
   * 通常此方法是用来干预主流程的, 这个要根据实际场景使用
   * @return 返回的参数通常是Boolean类型, 便于用条件语句控制
   */
  protected boolean needDoHomeWork(int type) {
    if (type == 3) {
      return false;
    }
    return true;
  }


  /**
   * 子类重写该方法,实现自己的逻辑
   */
  protected abstract void doTask();
}
