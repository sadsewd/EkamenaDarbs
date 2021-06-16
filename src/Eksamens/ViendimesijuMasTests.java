package Eksamens;

import java.util.Scanner;

public class ViendimesijuMasTests {
	
		static void rezIzvade(char[] lietotajaAtb, String[] jautajumi, int punkti, Boolean[] pareizasAtb) {
			
			System.out.println("\nJūs atbildējāt pareizi uz "+punkti+" jautājumiem!");
			if(punkti<10) {
			System.out.println("\nJautājumi uz kuriem jūs atbildējāt nepareizi");
			for(int i = 0; i<jautajumi.length;i++) {
				
				if(pareizasAtb[i] == false){
					System.out.println("Jautājums "+(i+1)+"."+jautajumi[i]);
				}
				
			}
			}
			
		}
	
		static void tests() {
		String[] jautajumi = {"Kurš no piemēriem pareizi deklerē jaunu masīvu","Kas ir masīvs?","Kādēļ masīvi ir parocīgi?","Kā tiek uzskaitīta masīva vērtības pozīcija?","Vai ir iespējams meklēt vērtības masīvā bez tā sakārtošansas.","Vai ir iespējams izvadīt visu masīvu vienlaicīgi?","Kādas iespējas ir masīvu sakārtošanai?","Vai dotais piemērs ir ievadīts pareizi, kur ir kļūda? \"atrsIndeks = Arrays.binarySearch(01, masīvs[1]);\"","Kurš no šiem variantiem izveido masīvu un nosaka tā lielumu","Kas ir jaizdara pirms tiek lietots binarySearch()"};
		String[] atbilzuVar = {"a) int[] skaitluMas = {1,2,3,4};\nb) int[] skaitluMas[];\nc) int[] skaitluMas;\nd) int skaitluMas[];","a) Mainīgais kas var saturēt vairākas vērtības\nb) String rindiņa.\nc) Vērtību kopums\nd) Mainīgo tips.","a) Tie nodrošina ievaddatu plūsmu\nb) Tie ļauj uzglabāt vairākas vērtības vienā mainīgajā.\nc) Samazina koda lielumu.\nd) Tie ļauj izveidot failus","a) Tas tiek darīts ar kārtas skaitli\nb) Tiek lietoti burti lai noteiktu vērtības kārtu\nc) Nejauši ģenerēta vērtība kas ir dota katrai vērtībai masīvā\nd) Tiek lietots indeks","a) Jā, ir iespējams izveidot algoritmu kas atradīs vērtību masīvā bez tā sakārtošanas\nb) Nē, lai lietotu binarySearch ir vajadzīgs sakārtot masīvu.\nc) Jā, nav vajadzības kārtot masīvus.\nd) Nē, ir jasakārto masīvs jebkurā gadijumā ","a) Jā, to var izdarīt lietojot ciklu for.\nb) Jā, to var izdarī lietojot Arrays.sort()\nc) Jā, to var izdarīt lietotjot Arrays.toString.\nd) Nē tas nav iespējams, ir iespējams izvadīt tikai pa vienai vērtībai.","a) Var lietot Arrays sort lai sakārtotu masīvu.\nb) Nav iemeslu kārtot masīvus.\nc) Var izveidot pats savu kārtošanas algoritmu.\nd) Izvadot masīvu lietojot for tas automātiski sakārtosies.","a) Nav pareizi ievadīts, jo binarySearch nav parezi uzrakstīts.\nb) Jā, ir ievadīts pareizi\nc) Nav pareizi ievadīts, jo nav janorāda masīva vērtības indeks\nd) Nav pareizi ievadīts, jo nav ievērota pareiza vērtību secība iekšpus binarySearch","a) int[] skaitluMas = {1,2,3,4};\nb) int[] masivs = new int[5];\nc) int masivs[]; masivs = new int[5];\nd) int masivs = new int[5];","a) Ir vajadzīgs importēt java.util.Arrays;\nb) Ir jasakārto masīvs kuram tiks meklēta vērtība\nc) Jaizvada vispirms masīvs pirms vērtības tiek meklētas\nd) Nav nekas jaizdara lai nodrošinātu binarySearch darbību. "}; 
		char[] lietotajaAtb = new char[10]; 
		String[] pareizAtb = {"a cd","a c "," bc ","a  d","ab  ","a c ","a c ","  cd"," bc ","ab  "};// Uzglabātas pareizās atbildes lai varētu vēlāk salīdzināt ar lietotāja atbildēm
		Boolean[] pareizasAtb = new Boolean[10];
		int punkti = 0;
		String pagAtb, atbUzString;
		char atbilde;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nIevadiet atbilžu varianta burtu un nospiediet ENTER taustiņu!");
		
		for(int i = 0; i<jautajumi.length;i++)
		{
			System.out.println("\n"+jautajumi[i]);//Tiek izvadīts jautājums
			System.out.println("\n"+atbilzuVar[i]);//Tiek izvadīti atbilžu varianti
			System.out.print("Jūsu atbilde: ");
			
			pagAtb = scan.next();//Lietotāja atbilde jautājumam
			pagAtb = pagAtb.toLowerCase();//Ievadatu pārmaiņa uz mazajiem burtiem lai nebūtu iespēja rasties kļūdai ievadot pareizo burtu, bet ar nepareizo noformējumu.
			atbilde = pagAtb.charAt(0);//Tiek lietots string tipa mainīgais, un paņemts pirmais burts, jo nav iespēja ar scanner palīdzību ievadīt char vērtību.
			
			if(atbilde == 'a' || atbilde == 'b' || atbilde == 'c' || atbilde == 'd') { // tiek pārbaudīts vai ievadītis burts ir iespējama atbilde
				
				lietotajaAtb[i] = atbilde;
				atbUzString = pareizAtb[i]; //Lai varētu varētu salīdzināt lietotāja atbildi ar pareizajam atbildēm, tiks pārbaudīts vai i jautājumam i pareizAtb sakrīt viens no atbilžu variantiem, tiek i vērtības atbildes pārveidotas uz string lai varētu vieglāt atrast noteiktu vērtību 
				
				if(atbilde == 'a' && atbUzString.charAt(0) == 'a'){ //tiek salīdzināta lietotāja atbilde ar pareizajām atbildēm
					punkti++; //tiks uzņemts kopējo pareizo atbilžu skaits
					pareizasAtb[i] = true; //Tiek uzņemts kuras atbildes ir pareizas un kuras nav
				}else if(atbilde == 'b' && atbUzString.charAt(1) == 'b') {
					punkti++;
					pareizasAtb[i] = true;
				}else if(atbilde == 'c' && atbUzString.charAt(2) == 'c') {
					punkti++;
					pareizasAtb[i] = true;
				}else if(atbilde == 'd' && atbUzString.charAt(3) == 'd') {
					punkti++;
					pareizasAtb[i] = true;
				}else {
					pareizasAtb[i] = false;
				}
				
			}else { //ja lietotājs ievada nepastāvošu atbildes variantu, lietotājams tiek dota iespēja mēģināt vēlreiz
				System.out.println("\nJūs ievadijāt nepastāvošu variantu! \nMēģiniet vēlreiz!\n");
				i--; //Tiek samazināta i vērtība lai cikls atkārtotu i gājienu.
			}
		}
		
		rezIzvade(lietotajaAtb, jautajumi, punkti,pareizasAtb); //vajadzīgās vērtības tiek padotas metodei kur tās tiek izvadītas
		
	}
	
	public static void main(String[] args) {
		Scanner dati = new Scanner(System.in);
		String pagString;
		char atbilde;
		
		System.out.println("Labdien! Šī programma testēs jūsu zināšanas par viendimensiju masīviem!");
		System.out.print("\nVai esat gatavs uzsākt testu (j - jā; n - nē): ");
		
		pagString = dati.nextLine();
		pagString = pagString.toLowerCase();
		atbilde = pagString.charAt(0);
		
		
		if(atbilde == 'n'){
			System.out.println("Veiksmi gatavoties testam!");
		}else {
		
		switch(atbilde) {	
		case 'j' : tests(); break;
		case 'n' : break;
		default : System.out.println("Tika nepareizi ievadīta atbilde!");
				}
			}
		}
	}
