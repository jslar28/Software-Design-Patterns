package StructuralPatterns.Facade;

import StructuralPatterns.Facade.ComplexSubsystem.ClassA;
import StructuralPatterns.Facade.ComplexSubsystem.ClassB;
import StructuralPatterns.Facade.ComplexSubsystem.ClassC;
import StructuralPatterns.Facade.ComplexSubsystem.ClassD;

class ComplexSubsystemFacade {
    String getComplexResult() {
        return "RESULT: " + (new ClassA().getComplexSubResult())
                + (new ClassB().getComplexSubResult())
                + (new ClassC().getComplexSubResult())
                + (new ClassD().getComplexSubResult());
    }
}
