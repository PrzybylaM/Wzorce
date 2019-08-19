package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {


    public void listaZamowien(){
        List<Pozycje> listaMenu = new ArrayList();
        listaMenu.add(new Pozycje("Pizza z serem", 20));
        listaMenu.add(new Pozycje("Pizza z szynka", 16));
        listaMenu.add(new Pozycje("Pizza z pieczarkami", 17));
        listaMenu.add(new Pozycje("Pizza z kebabem", 19));
        listaMenu.add(new Pozycje("Pizza z kurczakiem", 22));
        for (Pozycje lista : listaMenu)
            System.out.println(lista);
    }


    public void wyswietl(){
        System.out.println("----------------------");
        System.out.println("-------MC PIZZA-------");
        System.out.println("----------------------");
        System.out.println("0. Pizza z serem");
        System.out.println("1. Pizza z szynką");
        System.out.println("2. Pizza z pieczarkami");
        System.out.println("3. Pizza z kebabem");
        System.out.println("4. Pizza z kurczakiem");
    }

    public OpcjaMenu pobierzWybor(){
        System.out.println("Twój wybór: ");
        Scanner skaner =new Scanner(System.in);
        int opcja = skaner.nextInt();
        switch (opcja){
            case 0:
                return OpcjaMenu.WYSWIETL_MENU;
            case 1:
                return OpcjaMenu.ZLOZ_ZAMOWIENIE;
            case 2:
                return OpcjaMenu.STAN_ZAMOWIENIA;
            case 3:
                return OpcjaMenu.LISTA_ZAMOWIEN;
            case 4:
                return OpcjaMenu.ZAKONCZ;
            default:
                return OpcjaMenu.NIE_POPRAWNIE;
        }
    }

    public void powrot(){
        Scanner skaner = new Scanner(System.in);
        System.out.println("__________________");
        System.out.println("Aby powrócić wciśnij enter");
        skaner.nextLine();
    }





}
