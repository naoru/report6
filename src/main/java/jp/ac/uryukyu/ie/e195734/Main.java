package jp.ac.uryukyu.ie.e195734;

/**
 * mainクラス
 */
public class Main {
    public static void main(String[] args){
        Master master = new Master();

        master.roadFile();
        while(true){
            master.master();
        }
    }
}
