package com.org.nyp;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        String kullaniciAdi, sifre;
        Scanner scanner =new Scanner(System.in);
        System.out.println("kullanıcı adınızı giriniz : ");
        kullaniciAdi = scanner.nextLine();
        System.out.println("şifrenizi giriniz : ");
        sifre = scanner.nextLine();
        if(kullaniciAdi.equals("seval")&&sifre.equals("1234")){
            System.out.println("sisteme başarıyla giriş yapıldı ! ");
        }else{
            System.out.println("şifre veya kullanıcı adı yanlış !");
        }

    }
}
