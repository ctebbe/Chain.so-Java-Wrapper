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
        
        System.out.println("Chip's things");
        System.out.println(sc.getAddressBalance(Network.BTC, "18WBAGheW4qQm8E81CF7Na6XeGqDmNcn4T").getConfirmedBalance());
        System.out.println(sc.getAddressReceived(Network.BTC, "18WBAGheW4qQm8E81CF7Na6XeGqDmNcn4T").getConfirmedReceivedValue());
        System.out.println(sc.getAddressReceived(Network.BTC, "18WBAGheW4qQm8E81CF7Na6XeGqDmNcn4T").getUnconfirmedReceivedValue());
        System.out.println(sc.getAddressSpent(Network.BTC, "1EaMTTuazCANnyhTpwnraQnh57qa8GRbYi").getConfirmedSentValue());
        System.out.println(sc.getAddressBalance(Network.DOGE, "DMSDtPsuirxGBknp7yamjHfFcmASfRBA9h").getConfirmedBalance());
        System.out.println(sc.getAddressBalance(Network.DOGE, "DTQ3wJzdJguepdXHcitzxCcutNCeBZ3fg8").getConfirmedBalance());
        System.out.println(sc.getAddressBalance(Network.DOGE, "DEsmd5DyCVsaRU38hHEpaZbtydeC5PEHRf").getConfirmedBalance());
        System.out.println(sc.getAddressBalance(Network.DOGE, "DF2xBr9W9ZW2Jpt9zuDWbN5P4WAb2Vu4f3").getConfirmedBalance());
        //System.out.println(sc.getAddressBalance(Network.DOGE, "DQkoCN264PMgemwmHH2UR8kMDRqMexJ2sk").getConfirmedBalance());
    }
}
