package so.chain;

import so.chain.entity.*;

import java.io.IOException;

public interface SoChain {

	public AddressBalance getAddressBalance(Network network, String address) throws IOException;

	public AddressReceived getAddressReceived(Network network, String address) throws IOException;

	public AddressSpent getAddressSpent(Network network, String address) throws IOException;

	public AddressValid getAddressValid(Network network, String address) throws IOException;

	public Address getAddress(Network network, String address) throws IOException;

	public PriceQuery getPrice(Network network, Currency currency) throws IOException;

	public NetworkInfo getNetworkInfo(Network network) throws IOException;

}
