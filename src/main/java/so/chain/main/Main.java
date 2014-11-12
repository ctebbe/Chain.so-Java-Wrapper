package so.chain.main;

import so.chain.SoChainImpl;
import so.chain.entity.Network;

import java.io.IOException;

/**
 * @author ct.
 */
public class Main {
    // DFundmtrigzA6E25Swr2pRe4Eb79bGP8G1
    public static void main(String[] args) throws IOException {
        SoChainImpl sc = SoChainImpl.getInstance();
        System.out.println(sc.getAddressBalance(Network.BTC, "12jLTBHojddsxHYebRjNHVcXUYy1jpq2iE").getConfirmedBalance());
        System.out.println(sc.getAddressBalance(Network.LTC, "LahRWRyaJokYxf4u4ndpyMwopVWdEzyeuP").getConfirmedBalance());
        System.out.println(sc.getAddressBalance(Network.DOGE, "DFundmtrigzA6E25Swr2pRe4Eb79bGP8G1").getConfirmedBalance());
        //System.out.println(sc.getAddressBalance(Network.DOGE, "DQkoCN264PMgemwmHH2UR8kMDRqMexJ2sk").getConfirmedBalance());
    }
}
