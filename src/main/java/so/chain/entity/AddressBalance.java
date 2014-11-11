package so.chain.entity;

/**
 * @author ct.
 */
public class AddressBalance {

    private Network network;
    private String
            address,
            confirmed_balance,
            unconfirmed_balance;

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

    public String getConfirmed_balance() {
        return confirmed_balance;
    }

    public void setConfirmed_balance(String confirmed_balance) {
        this.confirmed_balance = confirmed_balance;
    }

    public String getUnconfirmed_balance() {
        return unconfirmed_balance;
    }

    public void setUnconfirmed_balance(String unconfirmed_balance) {
        this.unconfirmed_balance = unconfirmed_balance;
    }
}
