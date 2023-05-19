package codeGenerator.address;

import codeGenerator.TypeAddress;
import codeGenerator.varType;

public class DirectAddress extends Address {
    public DirectAddress(int num, codeGenerator.varType varType) {
        super(num, varType, TypeAddress.Direct);
    }

    @Override
    public String toString() {
        return num + "";
    }
}
