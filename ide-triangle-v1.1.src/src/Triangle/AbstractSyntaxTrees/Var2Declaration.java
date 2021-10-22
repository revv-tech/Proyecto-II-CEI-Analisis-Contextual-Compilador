/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Triangle.AbstractSyntaxTrees;

import Triangle.SyntacticAnalyzer.SourcePosition;

/**
 * Clase nueva
 * @author Steven
 */
public class Var2Declaration extends Declaration{
    
  public Var2Declaration (Identifier iAST, Expression eAST,
                         SourcePosition thePosition) {
    super (thePosition);
    I = iAST;
    E = eAST;
  }

  public Object visit(Visitor v, Object o) {
    return v.visitVar2Declaration(this, o);
  }

  public Identifier I;
  public Expression E;    
  
  @Override
    public Object visitXML(Visitor v, Object o) {
         return v.visitVar2Declaration(this, o);
    }
}
