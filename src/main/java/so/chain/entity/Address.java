package so.chain.entity;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/**
 * Holds the data from the Chain.so Get Display Data query.
 * @author chpwssn
 */
public class Address {

    private Network network;
    private String address;
    @SerializedName("received_value")
    private String receivedValue;
    @SerializedName("pending_value")
    private String pendingValue;
    @SerializedName("total_txs")
    private int totalTransactions;
    ArrayList<Transaction> txs;
    
	public Network getNetwork() {
		return network;
	}
	public void setNetwork(Network network) {
		this.network = network;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReceivedValue() {
		return receivedValue;
	}
	public void setReceivedValue(String receivedValue) {
		this.receivedValue = receivedValue;
	}
	public String getPendingValue() {
		return pendingValue;
	}
	public void setPendingValue(String pendingValue) {
		this.pendingValue = pendingValue;
	}
	public int getTotalTransactions() {
		return totalTransactions;
	}
	public void setTotalTransactions(int totalTransactions) {
		this.totalTransactions = totalTransactions;
	}
	public ArrayList<Transaction> getTxs() {
		return txs;
	}
	public void setTxs(ArrayList<Transaction> txs) {
		this.txs = txs;
	}



}
