package so.chain.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Holds the data from the Chain.so Is Address Valid? query.
 * @author chpwssn
 */
public class AddressValid implements Serializable {

    private Network network;
    private String address;
    @SerializedName("is_valid")
    private boolean isValid;

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

	public boolean isValid() {
		return isValid;
	}

	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}


}
