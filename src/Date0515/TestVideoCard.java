package Date0515;

public class TestVideoCard {
    public void showViderCard(IPCI ipci) {
        ipci.show();
    }

    public static void main(String[] args) {
        TestVideoCard test = new TestVideoCard();
        IPCI ipci = new Asus();
        test.showViderCard(ipci);

        ipci = new MSI();
        test.showViderCard(ipci);
    }
}
