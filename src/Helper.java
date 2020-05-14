import java.awt.Color;

public class Helper {

  public static Squares[] generateSquares(Player bank) {
    int w = 83;
    int h = 166;
    Squares[] ret = new Squares[40];
    ret[0] = new goSquare(0, "Go");
    ret[1] =
        new propertySquare(
            1250,
            913,
            w,
            h,
            1,
            "Crapper\n Street",
            "Brown",
            bank,
            60,
            0,
            new int[] {2, 10, 30, 90, 160, 250},
            new Color(0x955436));
    ret[2] = new Squares(1167, 913, w, h, 2, "Pot Luck");
    ret[3] =
        new propertySquare(
            1084,
            913,
            w,
            h,
            3,
            "Gangsters\n Paradise",
            "Brown",
            bank,
            60,
            0,
            new int[] {4, 20, 60, 180, 320, 450},
            new Color(0x955436));
    ret[4] = new Squares(1001, 913, w, h, 4, "Income\n Tax");
    ret[5] = new yetToImplement(918, 913, w, h, 5, "Brighton\n Station", "Station", bank, 200);
    ret[6] =
        new propertySquare(
            835,
            913,
            w,
            h,
            6,
            "Weeping\n Angel",
            "Blue",
            bank,
            100,
            0,
            new int[] {6, 30, 90, 270, 400, 550},
            new Color(0xAAE0FA));
    ret[7] = new Squares(752, 913, w, h, 7, "Opportunity\n Knocks");
    ret[8] =
        new propertySquare(
            669,
            913,
            w,
            h,
            8,
            "Potts\n Avenue",
            "Blue",
            bank,
            100,
            0,
            new int[] {6, 30, 90, 270, 400, 550},
            new Color(0xAAE0FA));
    ret[9] =
        new propertySquare(
            586,
            913,
            w,
            h,
            9,
            "Nardole\n Drive",
            "Blue",
            bank,
            120,
            0,
            new int[] {8, 40, 100, 300, 450, 600},
            new Color(0xAAE0FA));
    ret[10] = new jailSquare(10, "Jail/Just Visiting");
    ret[11] =
        new propertySquare(
            420,
            830,
            h,
            w,
            11,
            "Skywalker\n Drive",
            "Purple",
            bank,
            140,
            0,
            new int[] {10, 50, 150, 450, 625, 750},
            new Color(0xD93A96));
    ret[12] = new yetToImplement(420, 747, h, w, 12, "Tesla\n Power", "Utility", bank, 150);
    ret[13] =
        new propertySquare(
            420,
            664,
            h,
            w,
            13,
            "Wookie\n Hole",
            "Purple",
            bank,
            140,
            0,
            new int[] {10, 50, 150, 450, 625, 750},
            new Color(0xD93A96));
    ret[14] =
        new propertySquare(
            420,
            581,
            h,
            w,
            14,
            "Rey\n Lane",
            "Purple",
            bank,
            160,
            0,
            new int[] {12, 60, 180, 500, 700, 900},
            new Color(0xD93A96));
    ret[15] = new yetToImplement(420, 498, h, w, 15, "Hove\n Station", "Station", bank, 200);
    ret[16] =
        new propertySquare(
            420,
            415,
            h,
            w,
            16,
            "Cooper\n Drive",
            "Orange",
            bank,
            180,
            0,
            new int[] {14, 70, 200, 550, 750, 950},
            new Color(0xF7941D));
    ret[17] = new Squares(420, 332, h, w, 17, "Pot Luck");
    ret[18] =
        new propertySquare(
            420,
            249,
            h,
            w,
            18,
            "Wolowitz\n Street",
            "Orange",
            bank,
            180,
            0,
            new int[] {14, 70, 200, 550, 750, 950},
            new Color(0xF7941D));
    ret[19] =
        new propertySquare(
            420,
            166,
            h,
            w,
            19,
            "Penny\n Lane",
            "Orange",
            bank,
            200,
            0,
            new int[] {16, 80, 220, 600, 800, 1000},
            new Color(0xF7941D));
    ret[20] = new freeParkingSquare(20, "Free Parking");
    ret[21] =
        new propertySquare(
            586,
            0,
            w,
            h,
            21,
            "Yue Fei\n Square",
            "Red",
            bank,
            220,
            0,
            new int[] {18, 90, 250, 700, 875, 1050},
            new Color(0xED1B24));
    ret[22] = new Squares(669, 0, w, h, 22, "Opportunity Knocks");
    ret[23] =
        new propertySquare(
            752,
            0,
            w,
            h,
            23,
            "Mulan\n Rouge",
            "Red",
            bank,
            220,
            0,
            new int[] {18, 90, 250, 700, 875, 1050},
            new Color(0xED1B24));
    ret[24] =
        new propertySquare(
            835,
            0,
            w,
            h,
            24,
            "Han Xin\n Gardens",
            "Red",
            bank,
            240,
            0,
            new int[] {20, 100, 300, 750, 925, 1100},
            new Color(0xED1B24));
    ret[25] = new yetToImplement(918, 0, w, h, 25, "Falmer\n Station", "Station", bank, 200);
    ret[26] =
        new propertySquare(
            1001,
            0,
            w,
            h,
            26,
            "Kirk\n Close",
            "Yellow",
            bank,
            260,
            0,
            new int[] {22, 110, 330, 800, 975, 1150},
            new Color(0xFEF200));
    ret[27] =
        new propertySquare(
            1084,
            0,
            w,
            h,
            27,
            "Picard\n Avenue",
            "Yellow",
            bank,
            260,
            0,
            new int[] {22, 110, 330, 800, 975, 1150},
            new Color(0xFEF200));
    ret[28] = new yetToImplement(1167, 0, w, h, 28, "Edison\n Water", "Utility", bank, 150);
    ret[29] =
        new propertySquare(
            1250,
            0,
            w,
            h,
            29,
            "Crusher\n Creek",
            "Yellow",
            bank,
            280,
            0,
            new int[] {22, 120, 360, 850, 1025, 1200},
            new Color(0xFEF200));
    ret[30] = new gotoJail(30, "Goto Jail");
    ret[31] =
        new propertySquare(
            1333,
            166,
            h,
            w,
            31,
            "Sirat\n Mews",
            "Green",
            bank,
            300,
            0,
            new int[] {26, 130, 390, 900, 1100, 1275},
            new Color(0x1FB25A));
    ret[32] =
        new propertySquare(
            1333,
            249,
            h,
            w,
            32,
            "Ghengis\n Crescent",
            "Green",
            bank,
            300,
            0,
            new int[] {26, 130, 390, 900, 1100, 1275},
            new Color(0x1FB25A));
    ret[33] = new Squares(1333, 332, h, w, 33, "Pot\n Luck");
    ret[34] =
        new propertySquare(
            1333,
            415,
            h,
            w,
            34,
            "Ibis\n Close",
            "Green",
            bank,
            320,
            0,
            new int[] {28, 150, 450, 1000, 1300, 1400},
            new Color(0x1FB25A));
    ret[35] = new yetToImplement(1333, 498, h, w, 25, "Lewes\n Station", "Station", bank, 200);
    ret[36] = new Squares(1333, 581, h, w, 36, "Opportunity\n Knocks");
    ret[37] =
        new propertySquare(
            1333,
            664,
            h,
            w,
            37,
            "Hawking\n Way",
            "Deep Blue",
            bank,
            350,
            0,
            new int[] {35, 175, 500, 1100, 1300, 1500},
            new Color(0x0072BB));
    ret[38] = new Squares(1333, 747, h, w, 38, "Super Tax");
    ret[39] =
        new propertySquare(
            1333,
            830,
            h,
            w,
            39,
            "Turing\n Heights",
            "Deep Blue",
            bank,
            400,
            0,
            new int[] {50, 200, 600, 1400, 1700, 2000},
            new Color(0x0072BB));

    return ret;
  }
}
