package so.chain;

import org.junit.Test;
import so.chain.entity.*;
import so.chain.impl.SoChainImpl;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KevinsAddressesTest {

    public static final String SOME_BTC = "0.0997454";

    private String[] someOfKevinsPublicAddresses = new String[] {
            "1FLfdpBuEoauHCjQzYsYQZEYNBdqoZDkJi",
            "15ZHnNHitVy6Kao1wwLFFcu3ivDKCpgv9k",
            "1F4sUdZRLNrDPwgcX3VJG4W6Yfsxyjqwer",
            "143pJVGACJyT5P8iNioRvmmnK3bCo82oDb",
            "1Cio3Xe7WTwhQde8qSAzZocQrfpRHQ5Cah",
            "1Dhky71e1L1iTRxc1r1gnMuKH22X7e5Qcu",
            "14TNUSW4dyHfew2Jk5gpifQ5jnWNhjLNqH",
            "1J7kRSz3Wb1uACD8nthSLfKVnzcUicfH5e",
            "1Dq6Vp4v2nhmPGuUJU6RYp5XaReTaPb8jX"
    };

    private static final SoChainImpl sc = SoChainImpl.getInstance();

    @Test
    public void testAggregateSomeAddresses() throws Exception {
        Double totalBits = 0.0;
        Double totalBitsFromAddressBalance = 0.0;
        for (String address : someOfKevinsPublicAddresses) {
            totalBits += calculateConfirmedBalance(address);
            totalBitsFromAddressBalance += getConfirmedBalance(address);
        }
        System.out.println("total bits: " + totalBits + " and " + totalBitsFromAddressBalance);

        // string compare because floating point
        assertEquals(SOME_BTC, String.valueOf(totalBits));
        assertEquals(SOME_BTC, String.valueOf(totalBitsFromAddressBalance));

    }

    private double getConfirmedBalance(String addressString) throws IOException {
        AddressBalance addressBalance = sc.getAddressBalance(Network.BTC, addressString);
        return Double.valueOf(addressBalance.getConfirmedBalance());
    }

    private double calculateConfirmedBalance(String addressString) throws IOException {
        Address address = sc.getAddress(Network.BTC, addressString);
        printTransactionsForAddress(address);

        String receivedValue = address.getReceivedValue();
        AddressSpent addressSpent = sc.getAddressSpent(Network.BTC, addressString);
        return Double.valueOf(receivedValue) - Double.valueOf(addressSpent.getConfirmedSentValue());
    }

    private void printTransactionsForAddress(Address address) {
        System.out.println("\nAddress" + address.getAddress() + " on Network " + address.getNetwork() + ". Transactions:");
        ArrayList<Transaction> transactions = address.getTxs();
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

}
