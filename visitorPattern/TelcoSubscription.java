package SoftEng2.visitorPattern;

public interface TelcoSubscription {
    public String accept(UsagePromo usagePromo, double promoPrice);
    public String accept(UnliCallsTextOffer unliPackage, boolean unliCallText);
    public String getTelcoName();
    public double getPromoPrice();
    public int getDataAllowance();
    public boolean getUnliCallText();
}
