package org.example.abstract_factory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("você criou checkbox de Windows");
    }
}
