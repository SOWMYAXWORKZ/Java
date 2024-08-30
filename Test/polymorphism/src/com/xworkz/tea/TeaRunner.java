package com.xworkz.tea;

import com.xworkz.tea.teaapp.Samurdhtea;
import com.xworkz.tea.teaapp.Tea;

public class TeaRunner {

    public static void main(String[] args) {

        Tea tea = new Tea();
        Samurdhtea samurdhtea = new Samurdhtea();
       samurdhtea.teaName = "lemon tea";
        tea.getTeaName(samurdhtea);


    }



}
