package com.edu18graph;

public class SetElements {
    private final int MAX_ELEMENTS = 26; // Latin Alphabet
    private Element[] elements;

    public SetElements() {
        elements = new Element[MAX_ELEMENTS];
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public Element[] getElements() {
        return elements;
    }

    public Element getFirstElement() {
        Element element = null;
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            if (elements[i] != null) {
                element = elements[i];
                break;
            }
        }
        return element;
    }

    public SetElements addElement(Element element) {
        if (element != null) {
            elements[element.getId()] = element;
        }
        return this;
    }

    public SetElements addElements(SetElements setElements) {
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            addElement(setElements.getElements()[i]);
        }
        return this;
    }

    // Overload
    public SetElements addElements(Element[] elements) {
        for (int i = 0; i < elements.length; i++) {
            addElement(elements[i]);
        }
        return this;
    }

    // Overload
    public SetElements delElement(Element element) {
        if (element != null) {
            elements[element.getId()] = null;
        }
        return this;
    }

    // Overload
    public SetElements delElements(SetElements setElements) {
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            delElement(setElements.getElements()[i]);
        }
        return this;
    }

    // Overload
    public SetElements delElements(Element[] elements) {
        for (int i = 0; i < MAX_ELEMENTS; i++) {
            delElement(elements[i]);
        }
        return this;
    }

    public boolean isEmpty() {
        boolean result = true;
        for (int i = 0; i < MAX_ELEMENTS; i++) {
           if (elements[i] != null) {
               result = false;
               break;
           }
        }
        return result;
    }

    @Override
    public String toString() {
        String result = "This is SetElements.";
        if (isEmpty()) {
            result = result + " Empty.";
        } else {
            for (int i = 0; i < MAX_ELEMENTS; i++) {
                if (elements[i] != null) {
                    result = result + "\n" + elements[i].toString();
                }
            }
        }
        return result;
    }
}
