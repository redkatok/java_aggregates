package core.association.composition;

public class Bottle {

    private BottleContent bottleContent;

    public Bottle fillBottle(String bottleContent) {
        this.bottleContent = new BottleContent(bottleContent);
        return this;
    }

    public
    class BottleContent {
        private String contentName;

        public BottleContent(String contentName) {
            this.contentName = contentName;
        }
    }
}
