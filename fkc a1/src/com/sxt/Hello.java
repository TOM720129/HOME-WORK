public class HealthProfessional {
    protected int ID;
    protected String name;
    protected String description;

    // 默认构造函数
    public HealthProfessional() {
    }

    // 带参数的构造函数
    public HealthProfessional(int ID, String name, String description) {
        this.ID = ID;
        this.name = name;
        this.description = description;
    }

    // 打印健康专业人员的详细信息
    public void printDetails() {
        System.out.println("ID: " + ID);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }
}
