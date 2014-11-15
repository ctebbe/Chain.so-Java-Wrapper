package so.chain.entity;

/**
 * @author ct.
 */
public enum Network {

//    @SerializedName("BTC")
    BTC("Bitcoin"),

//    @SerializedName("LTC")
    LTC("Litecoin"),

//    @SerializedName("DOGE")
    DOGE("Dogecoin");

    private final String name;

    private Network(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // causes serialization to fail
//    @Override
//    public String toString() {
//        return getName();
//    }

}
