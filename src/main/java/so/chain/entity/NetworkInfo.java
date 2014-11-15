package so.chain.entity;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/**
 * Holds data from the Get Network Info Chain.so API query.
 * @author chpwssn.
 */
public class NetworkInfo implements Serializable {

    private String name;
    private String acronym;
    private String network;
    @SerializedName("symbol_htmlcode")
    private String symbolHTMLCode;
    private String url;
    @SerializedName("mining_difficulty")
    private String miningDifficulty;
    @SerializedName("unconfirmed_txs")
    private int unconfirmedTXs;
    private int blocks;
    private String price;
    @SerializedName("price_base")
    private String priceBase;
    @SerializedName("price_update_time")
    private int priceUpdateTime;
    private String hashrate;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAcronym() {
		return acronym;
	}
	public void setAcronym(String acronym) {
		this.acronym = acronym;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getSymbolHTMLCode() {
		return symbolHTMLCode;
	}
	public void setSymbolHTMLCode(String symbolHTMLCode) {
		this.symbolHTMLCode = symbolHTMLCode;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getMiningDifficulty() {
		return miningDifficulty;
	}
	public void setMiningDifficulty(String miningDifficulty) {
		this.miningDifficulty = miningDifficulty;
	}
	public int getUnconfirmedTXs() {
		return unconfirmedTXs;
	}
	public void setUnconfirmedTXs(int unconfirmedTXs) {
		this.unconfirmedTXs = unconfirmedTXs;
	}
	public int getBlocks() {
		return blocks;
	}
	public void setBlocks(int blocks) {
		this.blocks = blocks;
	}
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
	public int getPriceUpdateTime() {
		return priceUpdateTime;
	}
	public void setPriceUpdateTime(int priceUpdateTime) {
		this.priceUpdateTime = priceUpdateTime;
	}
	public String getHashrate() {
		return hashrate;
	}
	public void setHashrate(String hashrate) {
		this.hashrate = hashrate;
	}
	@Override
	public String toString() {
		return "NetworkInfo [name=" + name + ", acronym=" + acronym
				+ ", network=" + network + ", symbolHTMLCode=" + symbolHTMLCode
				+ ", url=" + url + ", miningDifficulty=" + miningDifficulty
				+ ", unconfirmedTXs=" + unconfirmedTXs + ", blocks=" + blocks
				+ ", price=" + price + ", priceBase=" + priceBase
				+ ", priceUpdateTime=" + priceUpdateTime + ", hashrate="
				+ hashrate + "]";
	}
    

}
