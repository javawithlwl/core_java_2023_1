package com.careerit.jfs.basics.day19;
interface Instrument{
      void sound();  // public abstract void sound();
}

class Piano implements  Instrument{

      @Override
      public void sound() {
            System.out.println("PEEPEEPEEEEEEEEEEEEEEEEEEEEEEEE");
      }
}
class Guitar implements  Instrument{
      @Override
      public void sound() {
            System.out.println("TIN TINTIN TITNIN TIN TIN");
      }
}

public class MusicInstrumentExample {

      public static void main(String[] args) {
            Instrument obj =  new Guitar();
            obj.sound();
      }
}
