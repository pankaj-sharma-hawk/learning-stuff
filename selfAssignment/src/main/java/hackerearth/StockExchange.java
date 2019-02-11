package hackerearth;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by pankaj on 01,2019
 */
public class StockExchange {
    private final static String SELL="Sell";
    private final static String BUY="Buy";
    public static void main(String[] args) {
        List<OrderSystem> list = new ArrayList();
        list.add(new OrderSystem(1,"09:45","FK",SELL,100,240.10));
        list.add(new OrderSystem(2,"09:45","FK",SELL,90,237.45));
        list.add(new OrderSystem(3,"09:47","FK",BUY,80,238.10));
        list.add(new OrderSystem(5,"09:48","FK",SELL,220,2));
        list.add(new OrderSystem(6,"09:49","FK",BUY,50,240.10));
        list.add(new OrderSystem(7,"09:52","AZ",BUY,10,240.10));
        list.add(new OrderSystem(8,"10:01","FK",SELL,20,240.10));
        list.add(new OrderSystem(9,"10:02","FK",BUY,150,240.10));

        System.out.println(list);

    }
}
class OrderSystem{
    private final static String SELL="Sell";
    public class stockDetail{
        private int orderId;
        private String date;
        private String stock;
        private int quantity;
        private double pricePerUnit;

        public stockDetail(int orderId, String date, String stock, int quantity, double pricePerUnit) {
            this.orderId = orderId;
            this.date = date;
            this.stock = stock;
            this.quantity = quantity;
            this.pricePerUnit = pricePerUnit;
        }

        public int getOrderId() {
            return orderId;
        }

        public void setOrderId(int orderId) {
            this.orderId = orderId;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getStock() {
            return stock;
        }

        public void setStock(String stock) {
            this.stock = stock;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }

        public double getPricePerUnit() {
            return pricePerUnit;
        }

        public void setPricePerUnit(double pricePerUnit) {
            this.pricePerUnit = pricePerUnit;
        }

        @Override
        public String toString() {
            return "stockDetail{" +
                    "orderId=" + orderId +
                    ", date='" + date + '\'' +
                    ", stock='" + stock + '\'' +
                    ", quantity=" + quantity +
                    ", pricePerUnit=" + pricePerUnit +
                    '}';
        }
    }
    private List<stockDetail> buyStock=new ArrayList();
    private List<stockDetail> sellStock=new ArrayList();

    public OrderSystem(int orderId, String date, String stock,String buySell, int quantity, double pricePerUnit) {
        if(buySell.equals(SELL)){
            sellStock.add(new stockDetail(orderId,date,stock,quantity,pricePerUnit));
        }else{
            buyStock.add(new stockDetail(orderId,date,stock,quantity,pricePerUnit));
        }
    }

    @Override
    public String toString() {
        return "OrderSystem{" +
                "buyStock=" + buyStock +
                ", sellStock=" + sellStock +
                '}';
    }
}
