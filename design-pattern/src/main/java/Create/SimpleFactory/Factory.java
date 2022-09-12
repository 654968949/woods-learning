package Create.SimpleFactory;

/**
 * 生成产品的工厂
 * @author : Woods
 * @ClassName : Factory
 * @date : 2022/9/6  9:29 下午
 * @Version ：1.0
 */
public class Factory {

    /**
     * 生产产品的方法
     * @param clazz 对应的产品的字节码类
     * @return 创建好的产品对象
     */
    IProduct makeProduct(Class< ? extends IProduct> clazz) {
        try {
            if (null!=clazz) {
                return clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
