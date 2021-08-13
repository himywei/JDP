package jdp.facade;

/**
 * @author wmy
 * @date 2021/8/12 11:15
 */

/**
 * 测试工程师
 */
public class QualityAssurance extends AbstractWorker {
    public QualityAssurance(String name) {
        super(name, "测试攻城狮");
    }

    public void test() {
        System.out.println(super.getName() + " | " + super.getJob() + " 开始进行测试...");
    }

}
