package datastructures.MarkovChain;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        MarkovChain mkc = new MarkovChain();
        mkc.train("This is going really well. This is fun.");
        mkc.generateText(10);


    }

}


