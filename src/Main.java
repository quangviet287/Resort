public class Main {
    public static void main(String[] arg){
        Customer cus = new Customer();
        cus.setName("ABC");
        Villar vila = new Villar();
        vila.setDate(5);
        vila.setName("vilar1");
        vila.setPrice(5000);
        vila.setSize(120);
        System.out.println("Khach hang "+cus.getName()+" da dat "+vila.getName()+" trong "+vila.getDate()+" ngay. So tien phai tra la: "+ vila.getPrice());
        House h1 = new House();
        float noBed =vila.getBed()+h1.getBed();
        System.out.println("So giuong co trong Resort la: "+ noBed);
        SwimmingPool sw = new SwimmingPool();
        sw.setName("Be boi 1");
        sw.setOpenTime("8:00 AM");
        sw.setEndTime("20:00 PM");
        System.out.println("Thoi gian mo cua cua "+sw.getName()+" la: " + sw.getHour());

        Tour t1 = new Tour();
        t1.setInfoTour("Da Nang","1000$","1/1/2018","1/15/2018");
        System.out.println(t1.getInfoTour());
    }
}
