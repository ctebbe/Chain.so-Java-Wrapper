package so.chain.entity;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/**
 * Holds information from the Price Query from Chain.so
 * @author chpwssn.
 */
public class PriceQuery {

    private Network network;
    private ArrayList<Price> prices;
	public Network getNetwork() {
		return network;
	}
	public void setNetwork(Network network) {
		this.network = network;
	}
	public ArrayList<Price> getPrices() {
		return prices;
	}
	public void setPrices(ArrayList<Price> prices) {
		this.prices = prices;
	}
	@Override
	public String toString() {
		return "PriceQuery [network=" + network + ", prices=" + prices + "]";
	}

}
