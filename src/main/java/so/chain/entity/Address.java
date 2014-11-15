package so.chain.entity;

import java.io.Serializable;
import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/**
 * Holds the data from the Chain.so Get Display Data query.
 * @author chpwssn
 */
public class Address implements Serializable {

    private Network network;
    private String address;
    @SerializedName("received_value")
    private String receivedValue;
    @SerializedName("pending_value")
    private String pendingValue;
    @SerializedName("total_txs")
    private int totalTransactions;
    private ArrayList<Transaction> txs;

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

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Address address1 = (Address) o;

		if (!address.equals(address1.address)) return false;
		if (network != address1.network) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = network.hashCode();
		result = 31 * result + address.hashCode();
		return result;
	}
}
