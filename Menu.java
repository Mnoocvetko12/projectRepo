package dominos;

import java.util.LinkedList;

public class Menu {
	private static Menu menuEdinstveno = null;

	private Menu() {
	}

	public static Menu createMenu() {
		if (menuEdinstveno == null) {
			menuEdinstveno = new Menu();
		}
		return menuEdinstveno;
	}

	public static final String PIZZA_TESTO_TUNKO = "Tunko i hrupkavo";
	public static final String PIZZA_TESTO_SREDNO = "Italiansko";
	public static final String PIZZA_TESTO_DEBELO = "Tradicionno";
	public static final String PIZZA_SIZE_S = "Sredna";
	public static final String PIZZA_SIZE_M = "Goljama";
	public static final String PIZZA_SIZE_L = "Jumbo";

	public static final String PIZZA_PEPERONI = "PEPERONI";
	public static final String PIZZA_MEDITERANEO = "MEDITERANEO";
	public static final String PIZZA_GARDEN_KLASIK = "GARDEN KLASIK";

	public static final String DRINK_COCA_COLA_125 = "COCA-COLA 1.25L";
	public static final String PASTA_KARBONARA = "PASTA KARBONARA";
	public static final String SALAD_ROCA = "SALATA ROCA";

	// salad
	private static Ingridient tunaSP = new Ingridient("Riba Ton", 1.50);
	private static Ingridient onion_SP = new Ingridient("Luk", 1.50);
	private static Ingridient rukolaSP = new Ingridient("Rukola", 1.50);
	private static Ingridient cornSP = new Ingridient("Carevica", 1.50);
	private static Ingridient krutoniSA = new Ingridient("Krutoni", 1.50);
	private static Ingridient oliveOilSA = new Ingridient("Maslini", 1.50);
	// pasta
	// pizza
	private static LinkedList<Ingridient> peperoniIngridient = peperoni.addPizzaSustavki(onion_SP);
	private static Ingridient smetanaSausePP = new Ingridient("Smetana sos", 1.50);
	private static Ingridient tomatoSausePP = new Ingridient("Domaten sos", 1.50);
	private static Ingridient bbqSausePP = new Ingridient("BBQ sos", 1.50);
	private static Ingridient mozarelaPI = new Ingridient("Mozarela", 1.50);
	private static Ingridient chedarPP = new Ingridient("Cedar", 1.50);
	private static Ingridient topenoSurenePI = new Ingridient("Topeno Sirene", 1.50);
	private static Ingridient nadenicaPP = new Ingridient("Nadenica", 1.50);
	private static Ingridient smokedShunkaPI = new Ingridient("Pushena Shunka", 1.50);
	private static Ingridient chorisoPP = new Ingridient("Choriso", 1.50);
	private static Ingridient peperoniPP = new Ingridient("Peperoni", 1.50);
	private static Ingridient spicyBeefPI = new Ingridient("Pikantno teleshko", 1.50);
	private static Ingridient mushroomsPP = new Ingridient("Presni gubi", 1.50);
	private static Ingridient basilicumPP = new Ingridient("Bosilek", 1.50);
	private static Ingridient pineApplePI = new Ingridient("Ananas", 1.50);
	private static Ingridient hlapenjoPeppersPI = new Ingridient("Luti chushki hlapenjo", 1.50);
	private static Ingridient parmezanSnowFlakesPI = new Ingridient("Parmezan sneginki", 1.50);
	// all
	private static Ingridient pestoSauseAll = new Ingridient("Pesto sos", 1.50);
	private static Ingridient smokedBeaconAll = new Ingridient("Pushen becon", 1.50);
	private static Ingridient chickenAll = new Ingridient("Pile", 1.50);
	private static Ingridient parmeanALL = new Ingridient("Parmezan", 1.50);
	private static Ingridient ementalAll = new Ingridient("Emental", 1.50);
	private static Ingridient fetaCheesaAll = new Ingridient("Sirene feta", 1.50);
	private static Ingridient greenPeppersALL = new Ingridient("Zeleni chuski", 1.50);
	private static Ingridient freshTomatosALL = new Ingridient("Presni Domati", 1.50);
	private static Ingridient olivesAll = new Ingridient("Maslini", 1.50);
	private static Ingridient riganAll = new Ingridient("Rigan", 1.50);
	static Pizza peperoni = new Pizza("PEPERONI", "Sredna", peperoniIngridient);

	public static Menu getMenuEdinstveno() {
		return menuEdinstveno;
	}

	public static void setMenuEdinstveno(Menu menuEdinstveno) {
		Menu.menuEdinstveno = menuEdinstveno;
	}

	public static Ingridient getTunaSP() {
		return tunaSP;
	}

	public static void setTunaSP(Ingridient tunaSP) {
		Menu.tunaSP = tunaSP;
	}

	public static Ingridient getOnion_SP() {
		return onion_SP;
	}

	public static void setOnion_SP(Ingridient onion_SP) {
		Menu.onion_SP = onion_SP;
	}

	public static Ingridient getRukolaSP() {
		return rukolaSP;
	}

	public static void setRukolaSP(Ingridient rukolaSP) {
		Menu.rukolaSP = rukolaSP;
	}

	public static Ingridient getCornSP() {
		return cornSP;
	}

	public static void setCornSP(Ingridient cornSP) {
		Menu.cornSP = cornSP;
	}

	public static Ingridient getKrutoniSA() {
		return krutoniSA;
	}

	public static void setKrutoniSA(Ingridient krutoniSA) {
		Menu.krutoniSA = krutoniSA;
	}

	public static Ingridient getOliveOilSA() {
		return oliveOilSA;
	}

	public static void setOliveOilSA(Ingridient oliveOilSA) {
		Menu.oliveOilSA = oliveOilSA;
	}

	public static Ingridient getSmetanaSausePP() {
		return smetanaSausePP;
	}

	public static void setSmetanaSausePP(Ingridient smetanaSausePP) {
		Menu.smetanaSausePP = smetanaSausePP;
	}

	public static Ingridient getTomatoSausePP() {
		return tomatoSausePP;
	}

	public static void setTomatoSausePP(Ingridient tomatoSausePP) {
		Menu.tomatoSausePP = tomatoSausePP;
	}

	public static Ingridient getBbqSausePP() {
		return bbqSausePP;
	}

	public static void setBbqSausePP(Ingridient bbqSausePP) {
		Menu.bbqSausePP = bbqSausePP;
	}

	public static Ingridient getMozarelaPI() {
		return mozarelaPI;
	}

	public static void setMozarelaPI(Ingridient mozarelaPI) {
		Menu.mozarelaPI = mozarelaPI;
	}

	public static Ingridient getChedarPP() {
		return chedarPP;
	}

	public static void setChedarPP(Ingridient chedarPP) {
		Menu.chedarPP = chedarPP;
	}

	public static Ingridient getTopenoSurenePI() {
		return topenoSurenePI;
	}

	public static void setTopenoSurenePI(Ingridient topenoSurenePI) {
		Menu.topenoSurenePI = topenoSurenePI;
	}

	public static Ingridient getNadenicaPP() {
		return nadenicaPP;
	}

	public static void setNadenicaPP(Ingridient nadenicaPP) {
		Menu.nadenicaPP = nadenicaPP;
	}

	public static Ingridient getSmokedShunkaPI() {
		return smokedShunkaPI;
	}

	public static void setSmokedShunkaPI(Ingridient smokedShunkaPI) {
		Menu.smokedShunkaPI = smokedShunkaPI;
	}

	public static Ingridient getChorisoPP() {
		return chorisoPP;
	}

	public static void setChorisoPP(Ingridient chorisoPP) {
		Menu.chorisoPP = chorisoPP;
	}

	public static Ingridient getPeperoniPP() {
		return peperoniPP;
	}

	public static void setPeperoniPP(Ingridient peperoniPP) {
		Menu.peperoniPP = peperoniPP;
	}

	public static Ingridient getSpicyBeefPI() {
		return spicyBeefPI;
	}

	public static void setSpicyBeefPI(Ingridient spicyBeefPI) {
		Menu.spicyBeefPI = spicyBeefPI;
	}

	public static Ingridient getMushroomsPP() {
		return mushroomsPP;
	}

	public static void setMushroomsPP(Ingridient mushroomsPP) {
		Menu.mushroomsPP = mushroomsPP;
	}

	public static Ingridient getBasilicumPP() {
		return basilicumPP;
	}

	public static void setBasilicumPP(Ingridient basilicumPP) {
		Menu.basilicumPP = basilicumPP;
	}

	public static Ingridient getPineApplePI() {
		return pineApplePI;
	}

	public static void setPineApplePI(Ingridient pineApplePI) {
		Menu.pineApplePI = pineApplePI;
	}

	public static Ingridient getHlapenjoPeppersPI() {
		return hlapenjoPeppersPI;
	}

	public static void setHlapenjoPeppersPI(Ingridient hlapenjoPeppersPI) {
		Menu.hlapenjoPeppersPI = hlapenjoPeppersPI;
	}

	public static Ingridient getParmezanSnowFlakesPI() {
		return parmezanSnowFlakesPI;
	}

	public static void setParmezanSnowFlakesPI(Ingridient parmezanSnowFlakesPI) {
		Menu.parmezanSnowFlakesPI = parmezanSnowFlakesPI;
	}

	public static Ingridient getPestoSauseAll() {
		return pestoSauseAll;
	}

	public static void setPestoSauseAll(Ingridient pestoSauseAll) {
		Menu.pestoSauseAll = pestoSauseAll;
	}

	public static Ingridient getSmokedBeaconAll() {
		return smokedBeaconAll;
	}

	public static void setSmokedBeaconAll(Ingridient smokedBeaconAll) {
		Menu.smokedBeaconAll = smokedBeaconAll;
	}

	public static Ingridient getChickenAll() {
		return chickenAll;
	}

	public static void setChickenAll(Ingridient chickenAll) {
		Menu.chickenAll = chickenAll;
	}

	public static Ingridient getParmeanALL() {
		return parmeanALL;
	}

	public static void setParmeanALL(Ingridient parmeanALL) {
		Menu.parmeanALL = parmeanALL;
	}

	public static Ingridient getEmentalAll() {
		return ementalAll;
	}

	public static void setEmentalAll(Ingridient ementalAll) {
		Menu.ementalAll = ementalAll;
	}

	public static Ingridient getFetaCheesaAll() {
		return fetaCheesaAll;
	}

	public static void setFetaCheesaAll(Ingridient fetaCheesaAll) {
		Menu.fetaCheesaAll = fetaCheesaAll;
	}

	public static Ingridient getGreenPeppersALL() {
		return greenPeppersALL;
	}

	public static void setGreenPeppersALL(Ingridient greenPeppersALL) {
		Menu.greenPeppersALL = greenPeppersALL;
	}

	public static Ingridient getFreshTomatosALL() {
		return freshTomatosALL;
	}

	public static void setFreshTomatosALL(Ingridient freshTomatosALL) {
		Menu.freshTomatosALL = freshTomatosALL;
	}

	public static Ingridient getOlivesAll() {
		return olivesAll;
	}

	public static void setOlivesAll(Ingridient olivesAll) {
		Menu.olivesAll = olivesAll;
	}

	public static Ingridient getRiganAll() {
		return riganAll;
	}

	public static void setRiganAll(Ingridient riganAll) {
		Menu.riganAll = riganAll;
	}

}
