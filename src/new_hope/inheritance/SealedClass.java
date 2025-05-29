package new_hope.inheritance;

public class SealedClass {

    sealed class A permits B,C{
    }

    final class B extends A{ //final will not allow further inheritance
    }

    non-sealed class C extends A{  // C is non-sealed, it will allow further inheritance
    }
}
