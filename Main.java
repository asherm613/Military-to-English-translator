import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        boolean state = true;
        Scanner scan = new Scanner(System.in);
        String userinput;
        String[] definitions = {
    "will comply",
    "weapon released",
    "out of ammunition",
    "semi active radar missile launch",
    "infrared missile launch",
    "active radar missile launch",
    "anti radiation missile launch",
    "air to ground missile launch",
    "return to base",
    "on the move",
    "minimum fuel to return safely",
    "friendly troops near target",
    "casualty evacuation",
    "enemy combatant",
    "troops in contact",
    "high value target",
    "high value individual",
    "infiltration",
    "exfiltration",
    "landing zone",
    "helicopter landing zone",
    "drop zone",
    "rendezvous point",
    "area of operations",
    "time on target",
    "close air support",
    "artillery",
    "night observation devices",
    "night vision goggles",
    "electronic intelligence",
    "signals intelligence",
    "command and control",
    "observation post",
    "combat outpost",
    "command post",
    "main supply route",
    "main line of resistance",
    "well done",
    "situation normal all fouled up",
    "fouled up beyond all recognition",
    "friendly unit in danger of being overrun",
    "final protective fire"
};

String[] codes = {
    "WILCO",
    "PICKLE",
    "WINCHESTER",
    "FOX 1",
    "FOX 2",
    "FOX 3",
    "MAGNUM",
    "RIFLE",
    "RTB",
    "OSCAR MIKE",
    "BINGO FUEL",
    "DANGER CLOSE",
    "CASEVAC",
    "TANGO",
    "TIC",
    "HVT",
    "HVI",
    "INFIL",
    "EXFIL",
    "LZ",
    "HLZ",
    "DZ",
    "RV",
    "AO",
    "TOT",
    "CAS",
    "ARTY",
    "NODS",
    "NVGS",
    "ELINT",
    "SIGINT",
    "C2",
    "OP",
    "COP",
    "CP",
    "MSR",
    "MLR",
    "BRAVO ZULU",
    "SNAFU",
    "FUBAR",
    "BROKEN ARROW",
    "FPF"
};
    while (state) {
        userinput = scan.nextLine();
        for (int x = 0; x <= 41; x++) {
            if (userinput.toUpperCase().equals(codes[x]))
                System.out.println(definitions[x]);
            else if (userinput.toUpperCase().equals(definitions[x]))
                System.out.println(codes[x]);
            }
        }
    }
}
