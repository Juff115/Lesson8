import hsa.*;

public class Pokesearch {
    static String pokemon[]=new String[151];
    static String evolvefrom[]=new String[151];
 
  
    public static void main(String[] args) {
	Console c = new Console();
        loadData();
        String psearch, answer;
        int loc;
        while(true){
            c.print("Enter pokemon or \"q\" to quit: ");
            psearch=c.readLine();
            if (psearch.equals("q")) break;
            loc = findPokemon(psearch);
            if (loc==-1){
                c.println(psearch+" not found");    
            }
            else{
                c.println(psearch +" evolves from "+ evolvefrom[loc]);
            }
            c.println("Press the enter key to continue");
            c.readChar();
            c.clear();
        }
        c.close();
    }
    
    public static int findPokemon(String p){
        int result=-1;
        for (int x=0; x<pokemon.length; x++){
            if(p.equals(pokemon[x])){
                result=x;
            }
        }
        return result;
    }
    
    public static void loadData()
    {
        pokemon[0]="Bulbasaur";
        pokemon[1]="Ivysaur";
        pokemon[2]="Venusaur";
        pokemon[3]="Charmander";
        pokemon[4]="Charmeleon";
        pokemon[5]="Charizard";
        pokemon[6]="Squirtle";
        pokemon[7]="Wartortle";
        pokemon[8]="Blastoise";
        pokemon[9]="Caterpie";
        pokemon[10]="Metapod";
        pokemon[11]="Butterfree";
        pokemon[12]="Weedle";
        pokemon[13]="Kakuna";
        pokemon[14]="Beedrill";
        pokemon[15]="Pidgey";
        pokemon[16]="Pidgeotto";
        pokemon[17]="Pidgeot";
        pokemon[18]="Rattata";
        pokemon[19]="Raticate";
        pokemon[20]="Spearow";
        pokemon[21]="Fearow";
        pokemon[22]="Ekans";
        pokemon[23]="Arbok";
        pokemon[24]="Pikachu";
        pokemon[25]="Raichu";
        pokemon[26]="Sandshrew";
        pokemon[27]="Sandslash";
        pokemon[28]="Nidoran";
        pokemon[29]="Nidorina";
        pokemon[30]="Nidoqueen";
        pokemon[31]="Nidoran";
        pokemon[32]="Nidorino";
        pokemon[33]="Nidoking";
        pokemon[34]="Clefairy";
        pokemon[35]="Clefable";
        pokemon[36]="Vulpix";
        pokemon[37]="Ninetales";
        pokemon[38]="Jigglypuff";
        pokemon[39]="Wigglytuff";
        pokemon[40]="Zubat";
        pokemon[41]="Golbat";
        pokemon[42]="Oddish";
        pokemon[43]="Gloom";
        pokemon[44]="Vileplume";
        pokemon[45]="Paras";
        pokemon[46]="Parasect";
        pokemon[47]="Venonat";
        pokemon[48]="Venomoth";
        pokemon[49]="Diglett";
        pokemon[50]="Dugtrio";
        pokemon[51]="Meowth";
        pokemon[52]="Persian";
        pokemon[53]="Psyduck";
        pokemon[54]="Golduck";
        pokemon[55]="Mankey";
        pokemon[56]="Primeape";
        pokemon[57]="Growlithe";
        pokemon[58]="Arcanine";
        pokemon[59]="Poliwag";
        pokemon[60]="Poliwhirl";
        pokemon[61]="Poliwrath";
        pokemon[62]="Abra";
        pokemon[63]="Kadabra";
        pokemon[64]="Alakazam";
        pokemon[65]="Machop";
        pokemon[66]="Machoke";
        pokemon[67]="Machamp";
        pokemon[68]="Bellsprout";
        pokemon[69]="Weepinbell";
        pokemon[70]="Victreebel";
        pokemon[71]="Tentacool";
        pokemon[72]="Tentacruel";
        pokemon[73]="Geodude";
        pokemon[74]="Graveler";
        pokemon[75]="Golem";
        pokemon[76]="Ponyta";
        pokemon[77]="Rapidash";
        pokemon[78]="Slowpoke";
        pokemon[79]="Slowbro";
        pokemon[80]="Magnemite";
        pokemon[81]="Magneton";
        pokemon[82]="Farfetch'd";
        pokemon[83]="Doduo";
        pokemon[84]="Dodrio";
        pokemon[85]="Seel";
        pokemon[86]="Dewgong";
        pokemon[87]="Grimer";
        pokemon[88]="Muk";
        pokemon[89]="Shellder";
        pokemon[90]="Cloyster";
        pokemon[91]="Gastly";
        pokemon[92]="Haunter";
        pokemon[93]="Gengar";
        pokemon[94]="Onix";
        pokemon[95]="Drowzee";
        pokemon[96]="Hypno";
        pokemon[97]="Krabby";
        pokemon[98]="Kingler";
        pokemon[99]="Voltorb";
        pokemon[100]="Electrode";
        pokemon[101]="Exeggcute";
        pokemon[102]="Exeggutor";
        pokemon[103]="Cubone";
        pokemon[104]="Marowak";
        pokemon[105]="Hitmonlee";
        pokemon[106]="Hitmonchan";
        pokemon[107]="Lickitung";
        pokemon[108]="Koffing";
        pokemon[109]="Weezing";
        pokemon[110]="Rhyhorn";
        pokemon[111]="Rhydon";
        pokemon[112]="Chansey";
        pokemon[113]="Tangela";
        pokemon[114]="Kangaskhan";
        pokemon[115]="Horsea";
        pokemon[116]="Seadra";
        pokemon[117]="Goldeen";
        pokemon[118]="Seaking";
        pokemon[119]="Staryu";
        pokemon[120]="Starmie";
        pokemon[121]="Mr. Mime";
        pokemon[122]="Scyther";
        pokemon[123]="Jynx";
        pokemon[124]="Electabuzz";
        pokemon[125]="Magmar";
        pokemon[126]="Pinsir";
        pokemon[127]="Tauros";
        pokemon[128]="Magikarp";
        pokemon[129]="Gyarados";
        pokemon[130]="Lapras";
        pokemon[131]="Ditto";
        pokemon[132]="Eevee";
        pokemon[133]="Vaporeon";
        pokemon[134]="Jolteon";
        pokemon[135]="Flareon";
        pokemon[136]="Porygon";
        pokemon[137]="Omanyte";
        pokemon[138]="Omastar";
        pokemon[139]="Kabuto";
        pokemon[140]="Kabutops";
        pokemon[141]="Aerodactyl";
        pokemon[142]="Snorlax";
        pokemon[143]="Articuno";
        pokemon[144]="Zapdos";
        pokemon[145]="Moltres";
        pokemon[146]="Dratini";
        pokemon[147]="Dragonair";
        pokemon[148]="Dragonite";
        pokemon[149]="Mewtwo";
        pokemon[150]="Mew";
        
	////////////////////////////        

        evolvefrom[0]="Egg";
        evolvefrom[1]="Bulbasaur";
        evolvefrom[2]="Ivysaur";
        evolvefrom[3]="Egg";
        evolvefrom[4]="Charmander";
        evolvefrom[5]="Charmeleon";
        evolvefrom[6]="Egg";
        evolvefrom[7]="Squirtle";
        evolvefrom[8]="Wartortle";
        evolvefrom[9]="Egg";
        evolvefrom[10]="Caterpie";
        evolvefrom[11]="Metapod";
        evolvefrom[12]="Egg";
        evolvefrom[13]="Weedle";
        evolvefrom[14]="Kakuna";
        evolvefrom[15]="Egg";
        evolvefrom[16]="Pidgey";
        evolvefrom[17]="Pidgeotto";
        evolvefrom[18]="Egg";
        evolvefrom[19]="Rattata";
        evolvefrom[20]="Egg";
        evolvefrom[21]="Spearow";
        evolvefrom[22]="Egg";
        evolvefrom[23]="Ekans";
        evolvefrom[24]="Pichu";
        evolvefrom[25]="Pikachu";
        evolvefrom[26]="Egg";
        evolvefrom[27]="Sandshrew";
        evolvefrom[28]="Egg";
        evolvefrom[29]="Nidoran";
        evolvefrom[30]="Nidorina";
        evolvefrom[31]="Egg";
        evolvefrom[32]="Nidoran";
        evolvefrom[33]="Nidorino";
        evolvefrom[34]="Cleffa";
        evolvefrom[35]="Clefairy";
        evolvefrom[36]="Egg";
        evolvefrom[37]="Vulpix";
        evolvefrom[38]="Igglybuff";
        evolvefrom[39]="Jigglypuff";
        evolvefrom[40]="Egg";
        evolvefrom[41]="Zubat";
        evolvefrom[42]="Egg";
        evolvefrom[43]="Oddish";
        evolvefrom[44]="Gloom";
        evolvefrom[45]="Egg";
        evolvefrom[46]="Paras";
        evolvefrom[47]="Egg";
        evolvefrom[48]="Venonat";
        evolvefrom[49]="Egg";
        evolvefrom[50]="Diglett";
        evolvefrom[51]="Egg";
        evolvefrom[52]="Meowth";
        evolvefrom[53]="Egg";
        evolvefrom[54]="Psyduck";
        evolvefrom[55]="Egg";
        evolvefrom[56]="Mankey";
        evolvefrom[57]="Egg";
        evolvefrom[58]="Growlithe";
        evolvefrom[59]="Egg";
        evolvefrom[60]="Poliwag";
        evolvefrom[61]="Poliwhirl";
        evolvefrom[62]="Egg";
        evolvefrom[63]="Abra";
        evolvefrom[64]="Kadabra";
        evolvefrom[65]="Egg";
        evolvefrom[66]="Machop";
        evolvefrom[67]="Machoke";
        evolvefrom[68]="Egg";
        evolvefrom[69]="Bellsprout";
        evolvefrom[70]="Weepinbell";
        evolvefrom[71]="Egg";
        evolvefrom[72]="Tentacool";
        evolvefrom[73]="Egg";
        evolvefrom[74]="Geodude";
        evolvefrom[75]="Graveler";
        evolvefrom[76]="Egg";
        evolvefrom[77]="Ponyta";
        evolvefrom[78]="Egg";
        evolvefrom[79]="Slowpoke";
        evolvefrom[80]="Egg";
        evolvefrom[81]="Magnemite";
        evolvefrom[82]="Egg";
        evolvefrom[83]="Egg";
        evolvefrom[84]="Doduo";
        evolvefrom[85]="Egg";
        evolvefrom[86]="Seel";
        evolvefrom[87]="Egg";
        evolvefrom[88]="Grimer";
        evolvefrom[89]="Egg";
        evolvefrom[90]="Shellder";
        evolvefrom[91]="Egg";
        evolvefrom[92]="Gastly";
        evolvefrom[93]="Haunter";
        evolvefrom[94]="Egg";
        evolvefrom[95]="Egg";
        evolvefrom[96]="Drowzee";
        evolvefrom[97]="Egg";
        evolvefrom[98]="Krabby";
        evolvefrom[99]="Egg";
        evolvefrom[100]="Voltorb";
        evolvefrom[101]="Egg";
        evolvefrom[102]="Exeggcute";
        evolvefrom[103]="Egg";
        evolvefrom[104]="Cubone";
        evolvefrom[105]="Tyrogue";
        evolvefrom[106]="Tyrogue";
        evolvefrom[107]="Egg";
        evolvefrom[108]="Egg";
        evolvefrom[109]="Koffing";
        evolvefrom[110]="Egg";
        evolvefrom[111]="Rhyhorn";
        evolvefrom[112]="Egg/Happiny";
        evolvefrom[113]="Egg";
        evolvefrom[114]="Egg";
        evolvefrom[115]="Egg";
        evolvefrom[116]="Horsea";
        evolvefrom[117]="Egg";
        evolvefrom[118]="Goldeen";
        evolvefrom[119]="Egg";
        evolvefrom[120]="Staryu";
        evolvefrom[121]="Egg/Mime�Jr.";
        evolvefrom[122]="Egg";
        evolvefrom[123]="Smoochum";
        evolvefrom[124]="Elekid";
        evolvefrom[125]="Magby";
        evolvefrom[126]="Egg";
        evolvefrom[127]="Egg";
        evolvefrom[128]="Egg";
        evolvefrom[129]="Magikarp";
        evolvefrom[130]="Egg";
        evolvefrom[131]="�";
        evolvefrom[132]="Egg";
        evolvefrom[133]="Eevee";
        evolvefrom[134]="Eevee";
        evolvefrom[135]="Eevee";
        evolvefrom[136]="Egg";
        evolvefrom[137]="Egg/Helix�Fossil";
        evolvefrom[138]="Omanyte";
        evolvefrom[139]="Egg/Dome�Fossil";
        evolvefrom[140]="Kabuto";
        evolvefrom[141]="Egg/Old Amber";
        evolvefrom[142]="Egg/Munchlax";
        evolvefrom[143]="Unknown";
        evolvefrom[144]="Unknown";
        evolvefrom[145]="Unknown";
        evolvefrom[146]="Egg";
        evolvefrom[147]="Dratini";
        evolvefrom[148]="Dragonair";
        evolvefrom[149]="Mew";
        evolvefrom[150]="Unknown";
    }
}
