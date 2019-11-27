package pl.kodu.akademia.repository;

import pl.kodu.akademia.model.Company;

import java.util.ArrayList;
import java.util.List;

public class CompaniesReposytory {
    private static List<Company> companiesList = new ArrayList<>();

    public static void addNewCompany(Company company){
        companiesList.add(company);
    }

    static {
        Company c1 = new Company(1, "9471228109", "100450869", "888888", "ALU-SALON");
        Company c2 = new Company(2, "9471224444", "100450861", "1242", "BlaBla");
        Company c3 = new Company(3, "9471228333", "100450862", "1253", "CCC");
        Company c4 = new Company(4, "9471228122", "100450863", "1264", "DDD");
        Company c5 = new Company(5, "9455555578", "100450864", "1275", "CCC");
        Company c6 = new Company(6, "9471228102", "100450865", "1286", "FFF");
        Company c7 = new Company(7, "9471228555", "100450866", "1297", "GGG");
        Company c8 = new Company(8, "9472222222", "100450867", "1308", "HHH");
        Company c9 = new Company(9, "9471266666", "100450868", "1319", "KKK");
        Company c10 = new Company(10, "9471111111", "100450888", "1321", "LLL");

        companiesList.add(c1);
        companiesList.add(c2);
        companiesList.add(c3);
        companiesList.add(c4);
        companiesList.add(c5);
        companiesList.add(c6);
        companiesList.add(c7);
        companiesList.add(c8);
        companiesList.add(c9);
        companiesList.add(c10);
    }

    public static List<Company> getCompaniesByNip(String nip) {
        List<Company> result = new ArrayList<>();
// pętla "for-each" dla każdego elementu z listy "companiesList" zapamiętaj go w zmiennej "mojaZmienna" typu "Company"
// i wydrukuj w konsoli
        for (Company mojaZmienna : companiesList) {
            if (mojaZmienna.getNip().equals(nip)) {
                result.add(mojaZmienna);
            }
        }
        return result;
    }

    public static List<Company> getCompaniesByRegon(String regon) {
        List<Company> result = new ArrayList<>();
        for (Company mojaZmienna : companiesList) {
            if (mojaZmienna.getRegon().equals(regon)) {
                result.add(mojaZmienna);
            }
        }
        return result;
    }

    public static List<Company> getCompaniesByKrs(String krs) {
        List<Company> result = new ArrayList<>();
        for (Company mojaZmienna : companiesList) {
            if (mojaZmienna.getKrs().equals(krs)) {
                result.add(mojaZmienna);
            }
        }
        return result;
    }

    public static List<Company> getCompaniesByName(String name) {
        List<Company> result = new ArrayList<>();
        for (Company mojaZmienna : companiesList) {
            if (mojaZmienna.getNazwa().equals(name)) {
                result.add(mojaZmienna);
            }
        }
        return result;
    }
}