package demo3;

import java.util.Observer;
public class Main {

    public static void main(String[] args) {

        //创建主题
        KWICSubject kwicSubject = new KWICSubject();
        //创建观察者
        Input input3 = new Input("input.txt");
        Shift shift = new Shift(input3.getLineTxt());
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        Output output3 = new Output(alphabetizer.getKwicList(), "output3.txt");

        // 将观察者加入主题

        kwicSubject.addPropertyChangeListener(input3);
        kwicSubject.addPropertyChangeListener(shift);
        kwicSubject.addPropertyChangeListener(alphabetizer);
        kwicSubject.addPropertyChangeListener(output3);
        // 逐步调用各个观察者
        kwicSubject.startKWIC();
    }
}