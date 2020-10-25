import Interfacelab1.City;

public class Database {

    public static BankAccount allAccounts[] = new BankAccount[26];
    static {
        allAccounts[0] = new CityBankAccount("Ilyas","Zhumashev",20000,"KZ0001A001","7777");
        allAccounts[1] = new CityBankAccount("Vitalii","Krasilnikov",45000,"KZ0001A002","8888");
        allAccounts[2] = new CityBankAccount("Rustam","Faizulin",35000,"KZ0001A003","9999");
        allAccounts[3] = new CityBankAccount("Maks","Kuren",56000,"KZ0001A004","1111");
        allAccounts[4] = new CityBankAccount("Zhasulan","Beshkenov",78000,"KZ0001A005","2222");
        allAccounts[5] = new CityBankAccount("Yerassyl","Altynsaka",93000,"KZ0001A006","3333");
        allAccounts[6] = new CityBankAccount("Adilhan","Sadirov",130000,"KZ0001A007","4444");
        allAccounts[7] = new CityBankAccount("Ilya","Ilyin",85000,"KZ0001A008","5555");
        allAccounts[8] = new CityBankAccount("Serik","Zhandos",75000,"KZ0001A009","6666");
        allAccounts[9] = new CityBankAccount("Adylzhan","Ykharov",103000,"KZ0001A010","7722");
        allAccounts[10] = new CityBankAccount("Mels","Seitov",113000,"KZ0001A011","7733");
        allAccounts[11] = new CityBankAccount("Angelina","Zhuma",78000,"KZ0001A012","7744");
        allAccounts[12] = new CityBankAccount("Madina","Kuren",94000,"KZ0001A012","7755");
        allAccounts[13] = new NationalBankAccount("Simbat Kuren",93000,"KZ0203A101","1234");
        allAccounts[14] = new NationalBankAccount("Khaidar Aidat",81000,"KZ0203A102","2345");
        allAccounts[15] = new NationalBankAccount("Beka Ashibulak",104000,"KZ0203A103","3456");
        allAccounts[16] = new NationalBankAccount("Alima Khaisar",140000,"KZ0203A104","4567");
        allAccounts[17] = new NationalBankAccount("Askar Daulet",30000,"KZ0203A105","5678");
        allAccounts[18] = new NationalBankAccount("Leks Luter",183000,"KZ0203A106","6789");
        allAccounts[19] = new NationalBankAccount("Aisulu Kubiyeva",148000,"KZ0203A107","7890");
        allAccounts[20] = new NationalBankAccount("Azamat Zhuma",66000,"KZ0203A108","8901");
        allAccounts[21] = new NationalBankAccount("Cristiano Ronaldo",55000,"KZ0203A109","9012");
        allAccounts[22] = new NationalBankAccount("Leo Messi",240000,"KZ0203A110","9911");
        allAccounts[23] = new NationalBankAccount("Tomas Muller",17600,"KZ0203A111","9922");
        allAccounts[24] = new NationalBankAccount("Bastian Lahm",201000,"KZ0203A112","9933");
        allAccounts[25] = new NationalBankAccount("Robert Lewa",176000,"KZ0203A113","9944");
    }

}
