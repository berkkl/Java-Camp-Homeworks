public class Discount{

    private int discountId;
    private String campaignName;
    private double discountRate;

    public Discount(){

    }

    public Discount(int discountId, String campaignName, double discountRate){
        this.discountId=discountId;
        this.campaignName=campaignName;
        this.discountRate=discountRate;
    }


    public int getDiscountId() {
        return discountId;
    }

    public void setDiscountId(int discountId) {
        this.discountId = discountId;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
}
