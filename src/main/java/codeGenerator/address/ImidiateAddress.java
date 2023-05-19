package codeGenerator.address;

import codeGenerator.TypeAddress;
import codeGenerator.varType;

public class ImidiateAddress extends Address {
    public ImidiateAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Imidiate);
    }

    @Override
    public String toString() {
        return "#" + num;
    }
}
