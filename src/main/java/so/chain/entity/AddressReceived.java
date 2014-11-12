package so.chain.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author chpwssn
 */
public class AddressReceived {

    private Network network;
    private String address;
    @SerializedName("confirmed_received_value")
    private String confirmedReceivedValue;
    @SerializedName("unconfirmed_received_value")
    private String unconfirmedReceivedValue;

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

	public String getConfirmedReceivedValue() {
		return confirmedReceivedValue;
	}

	public void setConfirmedReceivedValue(String confirmedReceivedValue) {
		this.confirmedReceivedValue = confirmedReceivedValue;
	}

	public String getUnconfirmedReceivedValue() {
		return unconfirmedReceivedValue;
	}

	public void setUnconfirmedReceivedValue(String unconfirmedReceivedValue) {
		this.unconfirmedReceivedValue = unconfirmedReceivedValue;
	}
}
