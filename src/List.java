import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class List {

    public static void main(String[] args) {
//        A. List nama makanan
        String[] foods = {"Bakso", "Gado-Gado", "Rawon", "Martabak", "Nasi Goreng", "Sate", "Rendang", "Ayam Bakar", "Pepes Ikan", "Soto Ayam"};
        ArrayList<String> foodList = new ArrayList<String>(Arrays.asList(foods));

        System.out.println("List Nama Makanan");
        System.out.println(foodList);
        System.out.println("");

//        B. List tahun piala dunia
        ArrayList<Integer> worldCup = new ArrayList<Integer>();
        for(int year = 1950; year <= 2022; year += 4){
            worldCup.add(year);
        };

        System.out.println("List Tahun World Cup");
        System.out.println(worldCup);
        System.out.println("");

//        C. Sort list nama provinsi
        ArrayList<String> provinceList = new ArrayList<String>();
        provinceList.add("Aceh");
        provinceList.add("Sumatera Selatan");
        provinceList.add("Lampung");
        provinceList.add("Banten");
        provinceList.add("Jawa Barat");
        provinceList.add("DKI Jakarta");
        provinceList.add("Kalimantan Tengah");
        provinceList.add("Sulawesi Utara");
        provinceList.add("Nusa Tenggara Barat");
        provinceList.add("Papua");

        Collections.sort(provinceList, Collections.reverseOrder());

        System.out.println("List Nama Provinsi (DESCENDING SORT)");
        for (String province : provinceList) {
            System.out.println(province);
        }
        System.out.println("");

//        D. Pengahpausan data dalam list
        String[] language = {"Java", "JavaScript", "PHP", "C", "C++", "C#", "Python", "Ruby", "Swift", "Perl", "Kotlin", "Pascal"};
        ArrayList<String> listProgrammingL = new ArrayList<>();
        Collections.addAll(listProgrammingL, language);

        System.out.println("List bahasa sebelum penghapusan");
        System.out.println(listProgrammingL);

        listProgrammingL.remove("C");
        listProgrammingL.remove(0);
        listProgrammingL.remove("Kotlin");
        listProgrammingL.remove(6);
        listProgrammingL.remove("Perl");

        System.out.println("List bahasa setelah pengahpusan");
        System.out.println(listProgrammingL);
        System.out.println("");

    }

}
