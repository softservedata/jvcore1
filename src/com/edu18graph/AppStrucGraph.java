package com.edu18graph;

public class AppStrucGraph {
    public static void main(String[] args) {
        Element a = new Element("a");
        Element b = new Element("b");
        Element c = new Element("c");
        Element d = new Element("d");
        Element e = new Element("e");
        Element f = new Element("f");
        Element g = new Element("g");
        Element z = new Element("z");
        //
        // Fluent interface
        a.addElement(b).addElement(e);
        b.addElement(a).addElement(c);
        c.addElement(b).addElement(d);
        d.addElement(c).addElement(e).addElement(g);
        e.addElement(a).addElement(d).addElement(f);
        f.addElement(e);
        g.addElement(d);
        g.addElement(z);
        //
        Graph graph = new Graph()
                .addElement(a).addElement(b).addElement(c).addElement(d)
                .addElement(e).addElement(f).addElement(g).addElement(z);
        //
        System.out.println("Original:\n" + graph); // graph.toString();
        //
        SetElements todo = new SetElements();
        SetElements exist = new SetElements();
        todo.addElement(a); // get from graph
        Element currentElement = null;
        //
        System.out.println("\tstart todo: " + todo);
        System.out.println("\tstart exist: " + exist);
        //
        while (!todo.isEmpty()) {
            currentElement = todo.getFirstElement();
            System.out.println("Review Element: " + currentElement);
            exist.addElement(currentElement);
            todo.addElements(currentElement.getElements());
            todo.delElements(exist);
        }
        //
        System.out.println("\tdone todo: " + todo);
        System.out.println("\tdone exist: " + exist);
        //
        System.out.println("done");
    }
}
