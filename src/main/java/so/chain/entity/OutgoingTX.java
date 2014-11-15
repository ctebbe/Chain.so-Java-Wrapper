package so.chain.entity;

/**
 * Holds incoming transaction data.
 * @author chpwssn
 */
public class OutgoingTX {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

	@Override
	public String toString() {
		return "OutgoingTX [value=" + value + "]";
	}

    
   /*
    * Example:
    *  "output_no": 0,
    "value": "3.10000000",
    "spent": null,
    "inputs": [
      {
        "input_no": 0,
        "address": "9uV5CT5H3owGYcrfHRG15vQgaL1Vofj3ii",
        "received_from": {
          "txid": "3fd4c34c769b72a39c964c8aa4809443faae363a2822834a0b7e3d42cae8f827",
          "output_no": 0
        }
      },
      {
        "input_no": 1,
        "address": "AERLDRhH8TMsQzc8MdRPD4EoQ8QYrGRFZ1",
        "received_from": {
          "txid": "3fd4c34c769b72a39c964c8aa4809443faae363a2822834a0b7e3d42cae8f827",
          "output_no": 1
        }
      }
    ],
    "req_sigs": 1,
    "script_asm": "OP_DUP OP_HASH160 af37191ed6bb8ecd87afb747eaca108db3e6f079 OP_EQUALVERIFY OP_CHECKSIG",
    "script_hex": "76a914af37191ed6bb8ecd87afb747eaca108db3e6f07988ac"
    */
    

}
