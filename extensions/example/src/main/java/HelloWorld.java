import org.nlogo.api.*;
import org.nlogo.core.Syntax;
import org.nlogo.core.SyntaxJ;

public class HelloWorld implements Reporter {

  public Syntax getSyntax(){
    return SyntaxJ.reporterSyntax(Syntax.StringType());
  }


  public Object report(Argument args[], Context context)
    throws ExtensionException {

    String n;
    try {
      n = args[0].toString();
    }
    catch(LogoException e) {
      throw new ExtensionException( e.getMessage() ) ;
    }

    String s = "HelloWorld" + n;
    return s;

  }
}
