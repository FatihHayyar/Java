package day33IteratorEnum;

public class EnumRunner {
    public static void main(String[] args) {
       String inf= UsaStates.CALIFORNIA.getCapital();
        System.out.println(inf);
        System.out.println(UsaStates.getStateNameFromAbbreviation("FL"));
        System.out.println(UsaStates.getStateNameFromCapital("Honolulu"));
        System.out.println(UsaStates.getAbbreviationFromCapital("Albany"));
    }
}
