package java01.polymorphism;

public class Tv extends Product {

    boolean power; // 전원 on/off
    int channel;   // 채널

    /**
     * 전원 on/off
     */
    void power() {
        power = !power;
        System.out.println("power : " + power);
    }

    /**
     * 채널 업
     */
    void channelUp() {
        ++channel;
        System.out.println("channel : " + channel);
    }

    /**
     * 채널 다운
     */
    void channelDown() {
        --channel;
        System.out.println("channel : " + channel);
    }
    //#region - 저장

    //#endregion - 저장
}
