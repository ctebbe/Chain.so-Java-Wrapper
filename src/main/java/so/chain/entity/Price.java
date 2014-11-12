package so.chain.entity;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/**
 * Holds price from individual exchanges.
 * @author chpwssn.
 */
public class Price {

    private String price;
    @SerializedName("price_base")
    private String priceBase;
    private String exchange;
    private int time;
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getPriceBase() {
		return priceBase;
	}
	public void setPriceBase(String priceBase) {
		this.priceBase = priceBase;
	}
	public String getExchange() {
		return exchange;
	}
	public void setExchange(String exchange) {
		this.exchange = exchange;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "Price [price=" + price + ", priceBase=" + priceBase
				+ ", exchange=" + exchange + ", time=" + time + "]";
	}
    

}
