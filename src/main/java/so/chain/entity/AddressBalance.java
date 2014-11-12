package so.chain.entity;

import com.google.gson.annotations.SerializedName;

/**
 * @author ct.
 */
public class AddressBalance {

    private Network network;
    private String address;
    @SerializedName("confirmed_balance")
    private String confirmedBalance;
    @SerializedName("unconfirmed_balance")
    private String unconfirmedBalance;

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

    public String getConfirmedBalance() {
        return confirmedBalance;
    }

    public void setConfirmedBalance(String confirmedBalance) {
        this.confirmedBalance = confirmedBalance;
    }

    public String getUnconfirmedBalance() {
        return unconfirmedBalance;
    }

    public void setUnconfirmedBalance(String unconfirmedBalance) {
        this.unconfirmedBalance = unconfirmedBalance;
    }
}
