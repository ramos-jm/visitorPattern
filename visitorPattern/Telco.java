package SoftEng2.visitorPattern;

public class Telco implements TelcoSubscription {
    private String telcoName;
    private double promoPrice;
    private int dataAllowance;
    private boolean unliCallText;

    public Telco(int dataAllowance, double promoPrice, String telcoName, boolean unliCallText) {
        this.dataAllowance = dataAllowance;
        this.promoPrice = promoPrice;
        this.telcoName = telcoName;
        this.unliCallText = unliCallText;
    }

    public String accept(UsagePromo promo, double price) {
        return promo.showAllowance(telcoName, price);
    }

    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText) {
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }

    public String getTelcoName() {
        return telcoName;
    }

    public double getPromoPrice() {
        return promoPrice;
    }

    public int getDataAllowance() {
        return dataAllowance;
    }

    public boolean getUnliCallText() {
        return unliCallText;
    }

    public static String getAllowance(String telcoName, double price) {
        UsagePromo promo = new TelcoAllowance();
        return promo.showAllowance(telcoName, price);
    }

    public static String getUnlimitedCallsTextOffer(String telcoName, boolean unliCallText) {
        UnliCallsTextOffer unliPackage = new UnliCallTextPackage();
        return unliPackage.showUnliCallsTextOffer(telcoName, unliCallText);
    }
}