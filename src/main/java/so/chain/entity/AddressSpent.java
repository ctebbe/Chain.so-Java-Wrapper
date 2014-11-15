package so.chain.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Holds the address Spent/Sent data. Chain.so refers to this data as Get Spent Value but the response states
 * Sent value, therefore the getters and setters are sent, class is Spent.
 * @author chpwssn
 */
public class AddressSpent implements Serializable {

    private Network network;
    private String address;
    @SerializedName("confirmed_sent_value")
    private String confirmedSentValue;
    @SerializedName("unconfirmed_sent_value")
    private String unconfirmedSentValue;

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

	public String getConfirmedSentValue() {
		return confirmedSentValue;
	}

	public void setConfirmedSentValue(String confirmedSentValue) {
		this.confirmedSentValue = confirmedSentValue;
	}

	public String getUnconfirmedSentValue() {
		return unconfirmedSentValue;
	}

	public void setUnconfirmedSentValue(String unconfirmedSentValue) {
		this.unconfirmedSentValue = unconfirmedSentValue;
	}
}
