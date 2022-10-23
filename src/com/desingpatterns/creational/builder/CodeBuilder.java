package com.desingpatterns.creational.builder;

public class CodeBuilder {
    StringBuilder sb;

    public CodeBuilder(String className)
    {
        sb = new StringBuilder();
        sb.append("public class ");
        sb.append(className);
        sb.append("\n");
        sb.append("{");
    }

    public CodeBuilder addField(String name, String type)
    {
        sb.append("\n");
        sb.append("  public " );
        sb.append(type);
        sb.append(" ");
        sb.append(name);
        sb.append(";");
        return this;
    }

    @Override
    public String toString()
    {
        sb.append("\n");
        sb.append("}");
        return sb.toString();
    }
}
