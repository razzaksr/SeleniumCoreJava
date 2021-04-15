package selenium.core.KishoreVinoth.exceptions;

public class VinothException extends Exception 
{
	private String info;
	public VinothException()
	{
		super();
		info="ResultShouldn'tBeInfinity";
	}
	public String toString()
	{
		return info;
	}
}
