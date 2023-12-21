package Day24_inheritance_constructorCall;

public class E_Toyota extends D_Car {

    String marka = "Toyota";
    String uretimYeri = "Japonya ve Türkiye"; // bu ikisini paretn class dan aldı

    String sanziman = "Otomatik veya manuel";
    String lastik = "Pirelli";
    String guvenlik = "Toyota araçlar ekstra güvenlik donanımına sahiptir";
    String aku = "Akü atanmadı"; //bu dört özelliği yeni özellik olarak ekledi.

    E_Toyota(){

        super();
    }



}
