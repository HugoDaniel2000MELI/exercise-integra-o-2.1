import java.util.ArrayList;

public class cadastro_competidor {

    private ArrayList competidores = new ArrayList();
    private int id;
    private String name;
    private String lastName;
    private String rg;
    private String phone;
    private String phoneEmergency;
    private String bloodType;
    private int age;

    private String category;

    private int priceRegister;

    public cadastro_competidor(
            int id,
            String name,
            String lastName,
            int age,
            String rg,
            String phone,
            String phoneEmergency,
            String bloodType,
            String category
            ) {
        this.name = name;
        this.lastName = lastName;
        this.rg = rg;
        this.age = age;
        this.phone = phone;
        this.phoneEmergency = phoneEmergency;
        this.bloodType = bloodType;
        this.category = category;
    }

    public void calculate_value_register() {
        if (this.category == "Circuito pequeno" ) {
            if(this.age >= 18){
                this.priceRegister = 1500;
            }else {
                this.priceRegister = 1300;
            }
        }

        if (this.category == "Circuito médio" ) {
            if(this.age >= 18){
                this.priceRegister = 2300;
            }else {
                this.priceRegister = 2000;
            }
        }

        if(this.category == "Circuito Avançado" && this.age >= 18){
            this.priceRegister = 2800;
        }
    }


    public void cadastro(){

    }
}


