import java.awt.*;

public class Helper {

  public static Squares[] generateSquares(Player bank) {
    Squares[] ret = new Squares[40];
    ret[0] = new goSquare(0, "Go");
    ret[1] =
        new propertySquare(
            1,
            "Crapper Street",
            "Brown",
            bank,
            60,
            0,
            new int[] {2, 10, 30, 90, 160, 250},
            new Color(0x955436));
    ret[2] = new Squares(2, "Pot Luck");
    ret[3] =
            new propertySquare(
            3,
            "Gangsters Paradise",
            "Brown",
            bank,
            60,
            0,
            new int[] {4, 20, 60, 180, 320, 450},
            new Color(0x955436));
    ret[4] = new Squares(4, "Income Tax");
    ret[5] =
        new propertySquare(
            5,
            "Brighton Station",
            "Station",
            bank,
            200,
            0,
            new int[] {},
            new Color(0x000000FF, true));
    ret[6] =
        new propertySquare(
            6,
            "Weeping Angel",
            "Blue",
            bank,
            100,
            0,
            new int[] {6, 30, 90, 270, 400, 550},
            new Color(0xAAE0FA));
    ret[7] = new Squares(7, "Opportunity Knocks");
    ret[8] =
        new propertySquare(
            8,
            "Potts Avenue",
            "Blue",
            bank,
            100,
            0,
            new int[] {6, 30, 90, 270, 400, 550},
            new Color(0xAAE0FA));
    ret[9] =
        new propertySquare(
            9,
            "Nardole Drive",
            "Blue",
            bank,
            120,
            0,
            new int[] {8, 40, 100, 300, 450, 600},
            new Color(0xAAE0FA));
    ret[10] = new jailSquare(10, "Jail/Just Visiting");
    ret[11] =
        new propertySquare(
            11,
            "Skywalker Drive",
            "Purple",
            bank,
            140,
            0,
            new int[] {10, 50, 150, 450, 625, 750},
            new Color(0xD93A96));
    ret[12] =
        new propertySquare(
            12,
            "Tesla Power Co",
            "Utility",
            bank,
            150,
            0,
            new int[] {},
            new Color(0x000000FF, true));
    ret[13] =
        new propertySquare(
            13,
            "Wookie Hole",
            "Purple",
            bank,
            140,
            0,
            new int[] {10, 50, 150, 450, 625, 750},
            new Color(0xD93A96));
    ret[14] =
        new propertySquare(
            14,
            "Rey Lane",
            "Purple",
            bank,
            160,
            0,
            new int[] {12, 60, 180, 500, 700, 900},
            new Color(0xD93A96));
    ret[15] =
        new propertySquare(
            15, "Hove Station", "Station", bank, 200, 0, new int[] {}, new Color(0x000000FF, true));
    ret[16] =
        new propertySquare(
            16,
            "Cooper Drive",
            "Orange",
            bank,
            180,
            0,
            new int[] {14, 70, 200, 550, 750, 950},
            new Color(0xF7941D));
    ret[17] = new Squares(17, "Pot Luck");
    ret[18] =
        new propertySquare(
            18,
            "Wolowitz Street",
            "Orange",
            bank,
            180,
            0,
            new int[] {14, 70, 200, 550, 750, 950},
            new Color(0xF7941D));
    ret[19] =
        new propertySquare(
            19,
            "Penny Lane",
            "Orange",
            bank,
            200,
            0,
            new int[] {16, 80, 220, 600, 800, 1000},
            new Color(0xF7941D));
    ret[20] = new freeParkingSquare(20, "Free Parking");
    ret[21] =
        new propertySquare(
            21,
            "Yue Fei Square",
            "Red",
            bank,
            220,
            0,
            new int[] {18, 90, 250, 700, 875, 1050},
            new Color(0xED1B24));
    ret[22] = new Squares(22, "Opportunity Knocks");
    ret[23] =
        new propertySquare(
            23,
            "Mulan Rouge",
            "Red",
            bank,
            220,
            0,
            new int[] {18, 90, 250, 700, 875, 1050},
            new Color(0xED1B24));
    ret[24] =
        new propertySquare(
            24,
            "Han Xin Gardens",
            "Red",
            bank,
            240,
            0,
            new int[] {20, 100, 300, 750, 925, 1100},
            new Color(0xED1B24));
    ret[25] =
        new propertySquare(
            25,
            "Falmer Station",
            "Station",
            bank,
            200,
            0,
            new int[] {},
            new Color(0x000000FF, true));
    ret[26] =
        new propertySquare(
            26,
            "Kirk Close",
            "Yellow",
            bank,
            260,
            0,
            new int[] {22,110,330,800,975,1150},
            new Color(0xFEF200));
    ret[27] =
        new propertySquare(
            27,
            "Picard Avenue",
            "Yellow",
            bank,
            260,
            0,
            new int[] {22,110,330,800,975,1150},
            new Color(0xFEF200));
    ret[28] =
        new propertySquare(
            28,
            "Edison Water",
            "Utility",
            bank,
            150,
            0,
            new int[] {},
            new Color(0x000000FF, true));
    ret[29] =
        new propertySquare(
            29,
            "Crusher Creek",
            "Yellow",
            bank,
            280,
            0,
            new int[] {22,120,360,850,1025,1200},
            new Color(0xFEF200));
    ret[30] = new gotoJail( 30, "Goto Jail" );
    ret[31] =
        new propertySquare(
            31,
            "Sirat Mews",
            "Green",
            bank,
            300,
            0,
            new int[] {26,130,390,900,1100,1275},
            new Color(0x1FB25A));
    ret[32] =
        new propertySquare(
            32,
            "Ghengis Crescent",
            "Green",
            bank,
            300,
            0,
            new int[] {26, 130, 390, 900, 1100, 1275},
            new Color(0x1FB25A));
    ret[33] = new Squares(33, "Pot Luck");
    ret[34] =
        new propertySquare(
            34,
            "Ibis Close",
            "Green",
            bank,
            320,
            0,
            new int[] {28, 150, 450, 1000, 1300, 1400},
            new Color(0x1FB25A));
    ret[35] =
        new propertySquare(
            25,
            "Lewes Station",
            "Station",
            bank,
            200,
            0,
            new int[] {},
            new Color(0x000000FF, true));
      ret[36] = new Squares(36, "Opportunity Knocks");
    ret[37] =
        new propertySquare(
            37,
            "Hawking Way",
            "Deep Blue",
            bank,
            350,
            0,
            new int[] {35,175,500,1100,1300,1500},
            new Color(0x0072BB));
      ret[38] = new Squares(38, "Super Tax");
    ret[39] =
        new propertySquare(
            39,
            "Turing Heights\n",
            "Deep Blue",
            bank,
            400,
            0,
            new int[] {50,200,600,1400,1700,2000},
            new Color(0x0072BB));

      return ret;
  }
}
