package Projrct.IMS;

public class imsMain {
    public static void main(String[] args) {
        Product appleMacBookAir = new Product();
        Customer c1=new Customer();


        c1.id=2;
        c1.addressCity="nashik";
        c1.addressState="Maharashtra";
        c1.addressStreet="a 1";
        c1.transactionCount=23;
        c1.contactEmail="nsk@gmail.com";
        c1.contactName="neha";
        c1.contactPhone="0912345678";

        appleMacBookAir.id=1;
        appleMacBookAir.name="Apple Mac Book Air";
        appleMacBookAir.category="Laptop";
        appleMacBookAir.salesPrice=100000f;
        appleMacBookAir.cost=50000f;
        appleMacBookAir.active=true;

        System.out.println(appleMacBookAir.id);
        System.out.println(appleMacBookAir.name);
        System.out.println(appleMacBookAir.category);
        System.out.println(appleMacBookAir.salesPrice);
        System.out.println(appleMacBookAir.cost);
        System.out.println(appleMacBookAir.getProfitOrLoss());
        System.out.println(appleMacBookAir.belowTheThreshold());

        System.out.println(c1.calculateDiscount());
        System.out.println(c1.getAddressDetails());
        System.out.println(c1.getContactDetails());
        System.out.println(c1.getTransactionCount());
    }
}
