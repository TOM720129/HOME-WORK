package health.professional;

/**
 * 专业医护人员，作为父类提供基本属性。id,name,info
 */
public class HealthProfessional {

    public Integer id;

    public String name;

    public String info;

    // 默认构造函数
    public HealthProfessional() {
    }

    // 第二构造函数
    public HealthProfessional(Integer id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    // 打印函数
    public void print() {
        String format = "HealthProfessional:【 %-3d || %-8s || %-20s 】\n";
        System.out.printf(format,id,name,info);
    }
}