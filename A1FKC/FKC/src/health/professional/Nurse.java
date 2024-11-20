package health.professional;

/**
 * Nurses, inherited from health care professionals, also contain the attribute "rank".
 */
public class Nurse extends HealthProfessional {

    // rank
    public String level;

    // default constructor
    public Nurse() {}

    // Second constructor
    public Nurse(Integer id, String name, String info, String level) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.level = level;
    }

    // printf
    public void print() {
        String format = "Nurse:【 %-3d || %-8s || %-2s || %-20s 】\n";
        System.out.printf(format,id,name,level,info);
    }
}
