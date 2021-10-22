/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Clase agregada
 * @author Steven
 * AST para SingleOrCommand
 */
public class SingleOrCommand extends OrCommand{
    
    public SingleOrCommand(Expression eAST, Command cAST, SourcePosition thePosition){
    
        super(thePosition);
        E = eAST;
        C = cAST;    
    }
    
    public Object visit(Visitor v, Object o) {
        return v.visitSingleOrCommand(this, o);
    }
    
    public Expression E;
    public Command C;
    
    @Override
    public Object visitXML(Visitor v, Object o) {
         return v.visitSingleOrCommand(this, o);
    }
}
