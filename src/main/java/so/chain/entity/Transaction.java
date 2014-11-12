package so.chain.entity;

import java.util.ArrayList;

import com.google.gson.annotations.SerializedName;

/**
 * Holds transaction data.
 * @author chpwssn
 */
public class Transaction {

    private String txid;
    @SerializedName("block_no")
    private int blockNo;
    private int confirmations;
    private int time;
    private IncomingTX incoming;
    private OutgoingTX outgoing;
    
    
	public String getTxid() {
		return txid;
	}
	public void setTxid(String txid) {
		this.txid = txid;
	}
	public int getConfirmations() {
		return confirmations;
	}
	public void setConfirmations(int confirmations) {
		this.confirmations = confirmations;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getBlockNo() {
		return blockNo;
	}
	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}
	public IncomingTX getIncoming() {
		return incoming;
	}
	public void setIncoming(IncomingTX incoming) {
		this.incoming = incoming;
	}
	public OutgoingTX getOutgoing() {
		return outgoing;
	}
	public void setOutgoing(OutgoingTX outgoing) {
		this.outgoing = outgoing;
	}
	@Override
	public String toString() {
		return "Transaction [txid=" + txid + ", blockNo=" + blockNo
				+ ", confirmations=" + confirmations + ", time=" + time
				+ ", incoming=" + incoming + ", outgoing=" + outgoing + "]";
	}
    

}
