import java.lang.Math;

// The implementation Class must implement the rmi interface (calculator)
// and be set as a Remote object on a server
public class calculatorimpl extends java.rmi.server.UnicastRemoteObject implements calculator
{

    // Implementations must have an explicit constructor
    // in order to declare the RemoteException exception

    public calculatorimpl()
        throws java.rmi.RemoteException {
        super();
    }

    // Implementation of the add method
    // The two long parameters are added added and the result is retured
    @Override
    public long add(long a, long b)
        throws java.rmi.RemoteException {
            System.out.println("adding " + a +"+"+b );
            return a+b;

    }

    // Subtract the second parameter from the first and return the result
    @Override
    public long sub(long a, long b)
        throws java.rmi.RemoteException {
            System.out.println("subtracting " + a +"-"+b );
            return a-b;

    }

    // Multiply the two parameters and return the result
    @Override
    public long mul(long a, long b)
        throws java.rmi.RemoteException {
            System.out.println("multiplying " + a +"*"+b );
            return a*b;

    }

    // Divide first parameter by the second and return the result
    @Override
    public long div(long a, long b)
        throws java.rmi.RemoteException {
            System.out.println("dividing " + a +"/"+b );
            return a/b;

    }

    // Recursive power definition
    @Override
    public long pow(long a, int b)
	       throws java.rmi.RemoteException {
            System.out.println("power " + a +"**"+b );
            return (long) Math.pow(a, b);

	  }
}
