package blockchain;

import java.util.ArrayList;

public class Main {

    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        /**
         * Hash is a digital signature of data.
         *
         * Each block of the blockchain will have a list of transactions and a previous hash.
         *
         * Below two arrays will have an identical hash. Because they are identical.
         * String[] arrayOne = {"a", "b", "c"};
         * String[] arrayTwo = {"a", "b", "c"};
         *
         * If I make a change: arrayTwo = {"ab", "b", "c"};...
         * The hash of this array will change. This is the foundation of a blockchain - every block of the chain
         * holds the digital signature of the previous block and the following block's digital signature depends
         * on the current one's hash. To meddle with one's hash means ruining the hashes of all the following ones.
         *
         * Below I am creating the Genesis block!
         * It's the first one. It needs to be hardcoded.
         */
        String[] genesisTransactions = {"Dazikiri sent Halasibel 10 dogecoins.", "Seinn sent Justinia 3 dogecoins."};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] blockTwoTransactions = {"Hasarani sent Alibal 5 dogecoins", "Nergalszarsur sent Hoofie 7 dogecoins"};
        Block blockTwo = new Block(genesisBlock.getBlockHash(), blockTwoTransactions);

        /**
         * If any change is made in the previous block, the following block's hash will change. Every participant
         * has their own version of the blockchain and they will see that a change has been made if such an event
         * occurs due to hashes being completely different.
         */
        System.out.println(genesisBlock.getBlockHash());
        System.out.println(blockTwo.getBlockHash());
    }
}
