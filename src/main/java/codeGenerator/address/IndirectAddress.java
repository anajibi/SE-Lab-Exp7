package codeGenerator.address;

import codeGenerator.TypeAddress;
import codeGenerator.varType;

public class IndirectAddress extends Address {
    public IndirectAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Indirect);
    }

    @Override
    public String toString() {
        return "@" + num;
    }
}
