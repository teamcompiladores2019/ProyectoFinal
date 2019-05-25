// Generated from ProyectoFinal/ProyectoFinal/ProyectoFinal.g4 by ANTLR 4.5.1
package ProyectoFinal.ProyectoFinal;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ProyectoFinalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ProyectoFinalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(ProyectoFinalParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#proyecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProyecto(ProyectoFinalParser.ProyectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#librerias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLibrerias(ProyectoFinalParser.LibreriasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#nombrelib}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombrelib(ProyectoFinalParser.NombrelibContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(ProyectoFinalParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#nombreprg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreprg(ProyectoFinalParser.NombreprgContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#contenido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContenido(ProyectoFinalParser.ContenidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#variables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariables(ProyectoFinalParser.VariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#tipov}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipov(ProyectoFinalParser.TipovContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#nombrev}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombrev(ProyectoFinalParser.NombrevContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(ProyectoFinalParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#imprimirvalor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImprimirvalor(ProyectoFinalParser.ImprimirvalorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#agregarvalor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgregarvalor(ProyectoFinalParser.AgregarvalorContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#ciclos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclos(ProyectoFinalParser.CiclosContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(ProyectoFinalParser.CondicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ProyectoFinalParser#fin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFin(ProyectoFinalParser.FinContext ctx);
}