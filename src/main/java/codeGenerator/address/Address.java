package codeGenerator.address;

import codeGenerator.TypeAddress;
import codeGenerator.varType;

/**
 * Created by mohammad hosein on 6/28/2015.
 */

public abstract class Address {
    public int num;
    public TypeAddress Type;
    public codeGenerator.varType varType;

    public Address(int num, varType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
    }

    public String toString() {
        switch (Type) {
            case Direct:
                return num + "";
            case Indirect:
                return "@" + num;
            case Imidiate:
                return "#" + num;
        }
        return num + "";
    }


}

