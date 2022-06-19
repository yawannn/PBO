
package tugas5;


public class Tugas5 {

    public static void main(String[] args) {
        CarRider ming = new CarRider("Lin Ming", 19, "080000000000");
        CarRider yohan = new CarRider("Bei Yohan", 20, "081111111111");
        CarRider ling = new CarRider("Ling'er", 31, "082222222222");
        CarRider yao = new CarRider("Yao Shi", 21, "083333333333");
        
        CarData wkwk = new CarData();
        wkwk.addCar("SUV", "N 1111 AB", "Honda");
        wkwk.addCar("SPORT", "N 2222 AB", "SSC Tuatara");
        wkwk.addCar("TRUCK", "N 3333 AB", "Suzuki");
        wkwk.addCar("SEDAN", "N 4444 AB", "Mitsubishi");
        
        wkwk.listOfCar();
        
        RentArchive data = new RentArchive();
        data.Rent(ming, wkwk.carList.get(1), 9);
        data.Rent(yohan, wkwk.carList.get(0), 3);
        data.Rent(ling, wkwk.carList.get(2), 1);
        data.Rent(yao, wkwk.carList.get(1), 3);
        
        System.out.println("");
        data.info();
        
        System.out.println("Nama    : Fahru Setiawan Iskandar");
        System.out.println("NIM     : 215150600111026");
    }
}
