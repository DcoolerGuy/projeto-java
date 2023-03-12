/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proj.individual;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author jvass
 */
public class CalculadoraReds {

    void getStartUp() {

        var artLiver = "\n    dMP     dMP dMP dMP dMMMMMP dMMMMb  dMMMMb  .aMMMb  .aMMMb  dMP         dMMMMMP .aMMMb \n"
                + "   dMP     amr dMP dMP dMP     dMP.dMP dMP.dMP dMP\"dMP dMP\"dMP dMP         dMP     dMP\"VMP \n"
                + "  dMP     dMP dMP dMP dMMMP   dMMMMK\" dMMMMP\" dMP dMP dMP dMP dMP         dMMMP   dMP      \n"
                + " dMP     dMP  YMvAP\" dMP     dMP\"AMF dMP     dMP.aMP dMP.aMP dMP         dMP     dMP.aMP   \n"
                + "dMMMMMP dMP    VP\"  dMMMMMP dMP dMP dMP      VMMMP\"  VMMMP\" dMMMMMP     dMP      VMMMP\"\n";

        for (var i = 0; i < artLiver.length(); i++) {
            System.out.print(artLiver.charAt(i));
            Thread.sleep(1);
        }

        System.out.println("\nOlá, Klopp\n O que gostaria de fazer?");
        System.out.println("1 - Calculo de salário");
        System.out.println("2 - Calculo de transferência");
        System.out.println("3 - Escalação");
        System.out.println("4 - Champions League");
        System.out.println("5 - Encerrar");
    }

    void getFinancia(Double salarioDig) {
        Double salarioMensal = salarioDig * 4;
        Double salarioAnual = salarioMensal * 12;

        System.out.println(String.format("O salário semanal é \u20AC%.2f", salarioDig));
        System.out.println(String.format("E o mensal é de \u20AC%.2f", salarioMensal));
        System.out.println(String.format("E o anual é de \u20AC%.2f", salarioAnual));
    }

    void getLogo() {
        var artLiver = "                                                                           \n"
                + "                                                                           \n"
                + "                                                     =:                    \n"
                + "                                              .-    .#+                    \n"
                + "                                              .%::  +%--                   \n"
                + "                                              +#:%.=%=#:                   \n"
                + "                            :: =+=-:         +#:*+=#=+:                    \n"
                + "                           -=#=#**%%%++=:  -#=:#+**--=:                    \n"
                + "                          ..===-=#%%%*  .-#+-+++*:.=*:                     \n"
                + "                        .=*=*+:  *%%%=.=#+=+==+-:+#=.                      \n"
                + "                         ==    -#%%#-+#====++-=**=+=                       \n"
                + "                            .=#%%%-:#=:++++:**+=**-                        \n"
                + "                          :*%%+%%:.%=:#%#*=.+##+++:                        \n"
                + "                         +%%#:#%+ +*:%%#*+-.**#*=.                         \n"
                + "                        +%%%:-%%+-#:#%%#*+:-++==:                          \n"
                + "                       .%%%# =%%%#+%%%%*+--#*=-                            \n"
                + "                       .%%%%-.#%%%%=*+%#+=--=+.                            \n"
                + "                        *%%%%+:+%%%*-#==**+=:                              \n"
                + "                        .+%%%%%+=+%%#-+#++**=.                             \n"
                + "                          .=*%%%%%%%%%*-=#=-#%*:                           \n"
                + "                             .:++**#%%%%-.*- +%%:                          \n"
                + "                              :%%#= :%%%= .+  *%*                          \n"
                + "                              +*%%* .%%%%- :  .%*                          \n"
                + "                               +%+ ...*%+:.    #-                          \n"
                + "                              =%+.    -%+      -                           \n"
                + "                             =#-       *%.                                 \n"
                + "                        ::..**.      ...*+                                 \n"
                + "                      --#*+++=++-  -=#*+=+====                             \n"
                + "                                    .                                      \n"
                + "                      .*+.       -*+++*-    :=+++*+:                       \n"
                + "                       %#        :%+  .   .*#-.   :.                       \n"
                + "                       #*        .%+:::.  #%.                              \n"
                + "                       #*        .%*-==   %%.                              \n"
                + "                       %*     .  .%+   .  =%*.    .:  .                    \n"
                + "                      :##=+*+.*- -#*  .*:  .=******- -*                    \n"
                + "                                                                           \n"
                + "                                                                           \n"
                + "                                                                           ";

        for (var i = 0; i < artLiver.length(); i++) {
            System.out.print(artLiver.charAt(i));
            Thread.sleep(1);

        }
    }

    void getLogOff() {

        System.out.println("Até Logo!");

        var artLiver = "                                                                                                                                                                                         \n"
                + "                            gp   ,,    ,,                                                                                    ,,                           ,,                             \n"
                + "`YMM'   `MM'                \\/ `7MM  `7MM                                                                                  `7MM  `7MM                   `7MM                             \n"
                + "  VMA   ,V                  `'   MM    MM                                                                                    MM    MM                     MM                             \n"
                + "   VMA ,V ,pW\"Wq.`7MM  `7MM      MM    MM      `7MMpMMMb.  .gP\"Ya `7M'   `MF'.gP\"Ya `7Mb,od8     `7M'    ,A    `MF',6\"Yb.    MM    MM  ,MP'     ,6\"Yb.    MM  ,pW\"Wq.`7MMpMMMb.  .gP\"Ya  \n"
                + "    VMMP 6W'   `Wb MM    MM      MM    MM        MM    MM ,M'   Yb  VA   ,V ,M'   Yb  MM' \"'       VA   ,VAA   ,V 8)   MM    MM    MM ;Y       8)   MM    MM 6W'   `Wb MM    MM ,M'   Yb \n"
                + "     MM  8M     M8 MM    MM      MM    MM        MM    MM 8M\"\"\"\"\"\"   VA ,V  8M\"\"\"\"\"\"  MM            VA ,V  VA ,V   ,pm9MM    MM    MM;Mm        ,pm9MM    MM 8M     M8 MM    MM 8M\"\"\"\"\"\" \n"
                + "     MM  YA.   ,A9 MM    MM      MM    MM        MM    MM YM.    ,    VVV   YM.    ,  MM             VVV    VVV   8M   MM    MM    MM `Mb.     8M   MM    MM YA.   ,A9 MM    MM YM.    , \n"
                + "   .JMML. `Ybmd9'  `Mbod\"YML.  .JMML..JMML.    .JMML  JMML.`Mbmmd'     W     `Mbmmd'.JMML.            W      W    `Moo9^Yo..JMML..JMML. YA.    `Moo9^Yo..JMML.`Ybmd9'.JMML  JMML.`Mbmmd' ";

        for (var i = 0; i < artLiver.length(); i++) {
            System.out.print(artLiver.charAt(i));
            Thread.sleep(1);
        }
    }

    Double getMercado(Double valorExp, Integer fase) {
        if (fase.equals(1)) {
            return valorExp * 0.7;
        } else if (fase.equals(2)) {
            return valorExp * 0.9;
        } else if (fase.equals(3)) {
            return valorExp * 1.1;
        } else {
            return valorExp * 1.7;
        }
    }

    void getEscalacao(Integer escalacaoDig) {

        String[] form433 = {"Alisson", "Robertson", "Van Dijk", "Konaté", "Alxander-Arnold", "Fabinho",
            "Alcatara", "Elliot", "Nuñez", "Gakpo", "Salah"};
        String[] form4231 = {"Alisson", "Robertson", "Van Dijk", "Konaté", "Alxander-Arnold", "Fabinho",
            "Keita", "Gakpo", "Elliot", "Salah", "Nuñez"};
        String[] form433falso9 = {"Alisson", "Robertson", "Van Dijk", "Matip", "Alxander-Arnold", "Fabinho",
            "Alcantara", "Elliot", "Gakpo", "Nuñez", "Salah"};

        if (escalacaoDig.equals(1)) {
            System.out.println("             9                 9: " + form433[8]);
            System.out.println("     10             11         10: " + form433[9] + ", 11: " + form433[10]);
            System.out.println("          7     8              7: " + form433[6] + ",  8: " + form433[7]);
            System.out.println("   2         6          5      2: " + form433[1] + ",  6: " + form433[5] + ", 5: " + form433[4]);
            System.out.println("        3         4            3: " + form433[2] + ", 4: " + form433[3]);
            System.out.println("             1                 1: " + form433[0]);

        } else if (escalacaoDig.equals(2)) {
            System.out.println("            11                 11: " + form4231[10]);
            System.out.println("      8      9     10           8: " + form4231[7] + ", 9: " + form4231[8] + ", 10: " + form4231[9]);
            System.out.println("          6     7              6: " + form4231[5] + ",  7: " + form4231[6]);
            System.out.println("   2                  5        2: " + form4231[1] + ", 5: " + form4231[4]);
            System.out.println("        3        4             3: " + form4231[2] + ", 4: " + form4231[3]);
            System.out.println("             1                 1: " + form4231[0]);
        } else {
            System.out.println("     10             11         10: " + form433falso9[8] + ", 11: " + form433falso9[10]);
            System.out.println("             9                 9: " + form433falso9[9]);
            System.out.println("          7     8              7: " + form433falso9[6] + ",  8: " + form433falso9[7]);
            System.out.println("   2         6          5      2: " + form433falso9[1] + ",  6: " + form433falso9[5] + ", 5: " + form433falso9[4]);
            System.out.println("        3         4            3:" + form433falso9[2] + ", 4: " + form433falso9[3]);
            System.out.println("             1                 1:" + form433falso9[0]);
        }
    }

    void getchampionsLogo() {
        System.out.println("ooooo     ooo oooooooooooo oooooooooooo       .o.                                                                                                                                                                   \n"
                + "`888'     `8' `888'     `8 `888'     `8      .888.                                                                                                                                                                  \n"
                + " 888       8   888          888             .8\"888.                                                                                                                                                                 \n"
                + " 888       8   888oooo8     888oooo8       .8' `888.                                                                                                                                                                \n"
                + " 888       8   888    \"     888    \"      .88ooo8888.                                                                                                                                                               \n"
                + " `88.    .8'   888       o  888          .8'     `888.                                                                                                                                                              \n"
                + "   `YbodP'    o888ooooood8 o888o        o88o     o8888o                                                                                                                                                             \n"
                + "                                                                                                                                                                                                                    \n"
                + "                                                                                                                                                                                                                    \n"
                + "                                                                                                                                                                                                                    \n"
                + "  .oooooo.   ooooo   ooooo       .o.       ooo        ooooo ooooooooo.   ooooo   .oooooo.   ooooo      ooo  .oooooo..o      ooooo        oooooooooooo       .o.         .oooooo.    ooooo     ooo oooooooooooo      \n"
                + " d8P'  `Y8b  `888'   `888'      .888.      `88.       .888' `888   `Y88. `888'  d8P'  `Y8b  `888b.     `8' d8P'    `Y8      `888'        `888'     `8      .888.       d8P'  `Y8b   `888'     `8' `888'     `8      \n"
                + "888           888     888      .8\"888.      888b     d'888   888   .d88'  888  888      888  8 `88b.    8  Y88bo.            888          888             .8\"888.     888            888       8   888              \n"
                + "888           888ooooo888     .8' `888.     8 Y88. .P  888   888ooo88P'   888  888      888  8   `88b.  8   `\"Y8888o.        888          888oooo8       .8' `888.    888            888       8   888oooo8         \n"
                + "888           888     888    .88ooo8888.    8  `888'   888   888          888  888      888  8     `88b.8       `\"Y88b       888          888    \"      .88ooo8888.   888     ooooo  888       8   888    \"         \n"
                + "`88b    ooo   888     888   .8'     `888.   8    Y     888   888          888  `88b    d88'  8       `888  oo     .d8P       888       o  888       o  .8'     `888.  `88.    .88'   `88.    .8'   888       o      \n"
                + " `Y8bood8P'  o888o   o888o o88o     o8888o o8o        o888o o888o        o888o  `Y8bood8P'  o8o        `8  8\"\"88888P'       o888ooooood8 o888ooooood8 o88o     o8888o  `Y8bood8P'      `YbodP'    o888ooooood8      \n"
                + "                                                                                                                                                                                                                    \n"
                + "                                                                                                                                                                                                                    \n"
                + "                                                                                                                                                                                                                    ");
        
    }

    void getBvb() {
        System.out.println("                                                                                                 \n"
                + "`7MMF'      `7MMF'`7MMF'   `7MF'        `YMM'   `MP'         `7MM\"\"\"Yp, `7MMF'   `7MF'`7MM\"\"\"Yp, \n"
                + "  MM          MM    `MA     ,V            VMb.  ,P             MM    Yb   `MA     ,V    MM    Yb \n"
                + "  MM          MM     VM:   ,V              `MM.M'              MM    dP    VM:   ,V     MM    dP \n"
                + "  MM          MM      MM.  M'                MMb               MM\"\"\"bg.     MM.  M'     MM\"\"\"bg. \n"
                + "  MM      ,   MM      `MM A'               ,M'`Mb.             MM    `Y     `MM A'      MM    `Y \n"
                + "  MM     ,M   MM       :MM;               ,P   `MM.            MM    ,9      :MM;       MM    ,9 \n"
                + ".JMMmmmmMMM .JMML.      VF              .MM:.  .:MMa.        .JMMmmmd9        VF      .JMMmmmd9  \n"
                + "                                                                                                 ");

    }

    void getCity() {
        System.out.println("`7MMF'      `7MMF'`7MMF'   `7MF'        `YMM'   `MP'         `7MMM.     ,MMF'      db      `7MN.   `7MF'      .g8\"\"\"bgd `7MMF'MMP\"\"MM\"\"YMM `YMM'   `MM'\n"
                + "  MM          MM    `MA     ,V            VMb.  ,P             MMMb    dPMM       ;MM:       MMN.    M      .dP'     `M   MM  P'   MM   `7   VMA   ,V  \n"
                + "  MM          MM     VM:   ,V              `MM.M'              M YM   ,M MM      ,V^MM.      M YMb   M      dM'       `   MM       MM         VMA ,V   \n"
                + "  MM          MM      MM.  M'                MMb               M  Mb  M' MM     ,M  `MM      M  `MN. M      MM            MM       MM          VMMP    \n"
                + "  MM      ,   MM      `MM A'               ,M'`Mb.             M  YM.P'  MM     AbmmmqMA     M   `MM.M      MM.           MM       MM           MM     \n"
                + "  MM     ,M   MM       :MM;               ,P   `MM.            M  `YM'   MM    A'     VML    M     YMM      `Mb.     ,'   MM       MM           MM     \n"
                + ".JMMmmmmMMM .JMML.      VF              .MM:.  .:MMa.        .JML. `'  .JMML..AMA.   .AMMA..JML.    YM        `\"bmmmd'  .JMML.   .JMML.       .JMML.");
    }

    void getNapoli() {
        System.out.println("`7MMF'      `7MMF'`7MMF'   `7MF'        `YMM'   `MP'         `7MN.   `7MF'     db      `7MM\"\"\"Mq.   .g8\"\"8q. `7MMF'      `7MMF'\n"
                + "  MM          MM    `MA     ,V            VMb.  ,P             MMN.    M      ;MM:       MM   `MM..dP'    `YM. MM          MM  \n"
                + "  MM          MM     VM:   ,V              `MM.M'              M YMb   M     ,V^MM.      MM   ,M9 dM'      `MM MM          MM  \n"
                + "  MM          MM      MM.  M'                MMb               M  `MN. M    ,M  `MM      MMmmdM9  MM        MM MM          MM  \n"
                + "  MM      ,   MM      `MM A'               ,M'`Mb.             M   `MM.M    AbmmmqMA     MM       MM.      ,MP MM      ,   MM  \n"
                + "  MM     ,M   MM       :MM;               ,P   `MM.            M     YMM   A'     VML    MM       `Mb.    ,dP' MM     ,M   MM  \n"
                + ".JMMmmmmMMM .JMML.      VF              .MM:.  .:MMa.        .JML.    YM .AMA.   .AMMA..JMML.       `\"bmmd\"' .JMMmmmmMMM .JMML.");
    }

    void getReal() {
        System.out.println("                                                                                                         _,o9                                                      \n"
                + "                                                                                                       ,'                                                          \n"
                + "`7MMF'      `7MMF'`7MMF'   `7MF'        `YMM'   `MP'           .g8\"\"\"bgd       db      `7MMF'            db   MMP\"\"MM\"\"YMM `7MMF' .g8\"\"\"bgd   .g8\"\"8q.    .M\"\"\"bgd \n"
                + "  MM          MM    `MA     ,V            VMb.  ,P           .dP'     `M      ;MM:       MM             ;MM:  P'   MM   `7   MM .dP'     `M .dP'    `YM. ,MI    \"Y \n"
                + "  MM          MM     VM:   ,V              `MM.M'            dM'       `     ,V^MM.      MM            ,V^MM.      MM        MM dM'       ` dM'      `MM `MMb.     \n"
                + "  MM          MM      MM.  M'                MMb             MM             ,M  `MM      MM           ,M  `MM      MM        MM MM          MM        MM   `YMMNq. \n"
                + "  MM      ,   MM      `MM A'               ,M'`Mb.           MM.    `7MMF'  AbmmmqMA     MM      ,    AbmmmqMA     MM        MM MM.         MM.      ,MP .     `MM \n"
                + "  MM     ,M   MM       :MM;               ,P   `MM.          `Mb.     MM   A'     VML    MM     ,M   A'     VML    MM        MM `Mb.     ,' `Mb.    ,dP' Mb     dM \n"
                + ".JMMmmmmMMM .JMML.      VF              .MM:.  .:MMa.          `\"bmmmdPY .AMA.   .AMMA..JMMmmmmMMM .AMA.   .AMMA..JMML.    .JMML. `\"bmmmd'    `\"bmmd\"'   P\"Ybmmd\"  \n"
                + "                                                                                                                                                                  ");
    }

    void getChampion(){
        System.out.println("                             .---'::'        `---.\n" +
"                            (::::::'              )\n" +
"                            |`-----._______.-----'|\n" +
"                            |              :::::::|\n" +
"                           .|               ::::::!-.\n" +
"                           \\|               :::::/|/\n" +
"                            |               ::::::|\n" +
"                            |    LIVERPOOL    ::::|\n" +
"                            |                 ::::|\n" +
"                            |               ::::::|\n" +
"                            |              .::::::|\n" +
"                            J              :::::::F\n" +
"                             \\            :::::::/\n" +
"                              `.        .:::::::'\n" +
"                                `-._  .::::::-'\n" +
"____________________________________|  \"\"\"|\"_________________________________________\n" +
"                                    |  :::|\n" +
"                                    F   ::J\n" +
"                                   /     ::\\                                        \n" +
"                              __.-'      :::`-.__\n" +
"                             (_           ::::::_)\n" +
"                               `\"\"\"---------\"\"\"'");
    }
}
