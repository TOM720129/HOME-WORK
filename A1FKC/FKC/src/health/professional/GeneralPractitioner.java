package health.professional;

/**
 * The general practitioner, inheriting the healthcare professional, also contains the attribute "responsible for the community".
 */
public class GeneralPractitioner extends HealthProfessional {

    // responsible Community
    public String responsibleCommunity;

    // default constructor
    public GeneralPractitioner() {}

    // Second constructor
    public GeneralPractitioner(Integer id, String name, String info, String responsibleCommunity) {
        this.id = id;
        this.name = name;
        this.info = info;
        this.responsibleCommunity = responsibleCommunity;
    }

    // printf
    public void print() {
        String format = "GeneralPractitioner:【 %-3d || %-8s || %-10s || %-20s 】\n";
        System.out.printf(format,id,name,responsibleCommunity,info);
    }
}