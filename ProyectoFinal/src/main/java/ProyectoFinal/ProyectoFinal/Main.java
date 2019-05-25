
package ProyectoFinal.ProyectoFinal;
import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;

public class Main {

	private static final String EXTENSION = "pf";

	public static void main(String[] args) throws IOException {
		String program = args.length > 1 ? args[1] : "test/test." + EXTENSION;

		System.out.println("Interpreting file " + program);

		ProyectoFinalLexer lexer = new ProyectoFinalLexer(new ANTLRFileStream(program));
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		ProyectoFinalParser parser = new ProyectoFinalParser(tokens);

		ProyectoFinalParser.StartContext tree = parser.start();

		ProyectoFinalCustomVisitor visitor = new ProyectoFinalCustomVisitor();
		visitor.visit(tree);

		System.out.println("Interpretation finished");

	}

}
