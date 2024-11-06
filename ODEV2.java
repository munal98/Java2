import java.util.Locale;
import java.util.Scanner;

public class ODEV2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		sc.useLocale(Locale.US); //Nokta kullanarak ondalık sayı almak için Locale ayarını yapıyoruz.
     
		//Kullanıcıdan kilo ve boy bilgisi al
		System.out.println("Lütfen kilonuzu kg cinsinden tam sayı giriniz :");
		int kilo = sc.nextInt();
		
		System.out.println("Lütfen boyunuzu metre cinsinden ondalık sayı giriniz :");
		double boy=sc.nextDouble();
		
		//BMI Hesaplama
		double bmi =kilo / (boy * boy);
		
		System.out.println("Vücut kitle indeksiniz :");
		
		if (bmi <20) 
			System.out.println("Zayıfsınız.");
		else if (bmi >=20 && bmi <25)
			System.out.println("Normal kilolusunuz");
		else if (bmi >=25 && bmi<40)
			System.out.println("Obezsiniz");
		else if (bmi >=40)
			System.out.println("Morbid obeziteniz var.Bir doktora gitmelisiniz.");		
	}

}
