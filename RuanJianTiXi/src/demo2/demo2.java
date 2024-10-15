package demo2;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class demo2 {
    public static void main(String[] args) {

        Input input = new Input();
        input.input("input.txt");
        Shift shift = new Shift(input.getLineTxt());
        shift.shift();
        Alphabetizer alphabetizer = new Alphabetizer(shift.getKwicList());
        alphabetizer.sort();
        Output output = new Output(alphabetizer.getKwicList());
        output.output("output2.txt");

    }
}

