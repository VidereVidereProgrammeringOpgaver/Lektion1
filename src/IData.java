
public interface IData {

	//Gets the weight of the person with a given cpr nr.
	double getVaegt(String cpr);
	//Gets the height of the person with a given cpr nr.
	double getHoejde(String cpr);
	//Gets the name of the person with a given cpr nr.
	String getNavn(String cpr);
}
