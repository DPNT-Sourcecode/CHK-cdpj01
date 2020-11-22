package befaster.solutions.CHK;

public class CheckoutSolution {
    public Integer checkout(String skus) {

        Basket basket = new Basket(skus);

        return basket.calculateCost();

    }
}



