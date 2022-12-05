package org.example;

public class RenameVisitor extends JavaScriptParserBaseVisitor{
    int i = 0;

    @Override
    public Object visitIdentifier(JavaScriptParser.IdentifierContext ctx){
        i++;
        String name =ctx.Identifier().getText();
        System.out.println(name);

        return null;
    }
}
