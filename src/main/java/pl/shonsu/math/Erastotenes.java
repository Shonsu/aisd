package pl.shonsu.math;


import java.util.stream.IntStream;

import static java.lang.Math.sqrt;

class Erastotenes {

    private boolean[] tab;

    public Erastotenes(boolean[] tab) {
        this.tab = tab;
    }

    public void crossOutNonPrime() {
        for (int i = 2; i < sqrt(tab.length); i++) {
            for (int j = i * i; j < tab.length; j+=i) {
                tab[j]=true;
            }
        }
    }

    public int[] returnPrimes(){
        return IntStream.range(1, tab.length).filter(i->!tab[i]).toArray();
    }


}
