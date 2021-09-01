package blockchain;

import java.util.Arrays;

public class Block {

    private int previousHash;
    private String[] transactions;
    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        /**
         * Calculating the hash of the current block based on the hash of all of the transactions and the previous hash.
         * Contents is the hash of the transactions that are included in the current block and the hash of the previous
         * block.
         */
        Object[] contents = {Arrays.hashCode(transactions), previousHash};
        /**
         * The current block's hash is based on contents (explained above). So if anything is changed in the
         * transactions or in the transactions in the previous block or anything in the transactions of the block
         * before the previous block... this.blockHash will be completely different.
         */
        this.blockHash = Arrays.hashCode(contents);
    }

    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
