package Lesson24;

import java.util.Map;

public class Test1 {
}

abstract class Figura {
    int kolichestvoStoron = 0;

    abstract void ploshad();

    abstract void perimetr();

    void showInfo() {
        System.out.println("Eto figura");
    }

}

class Kvadrat extends Figura {
    int storona1 = 10;
    int kolichestvoStoron = 4;


    @Override
    void perimetr() {
        System.out.println("Perimetr kvadrata = "+4*storona1);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad kvadrata = "+storona1*storona1);
    }
}


class Pryamougolnik extends Figura {
    int storona1 = 8;
    int storona2 = 5;
    int kolichestvoStoron = 4;


    @Override
    void perimetr() {
        System.out.println("Perimetr pryamougolnika = "+2*storona1+2*storona2);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad pryamougolnika = "+storona1*storona2);
    }
}

class Okrujnost extends Figura {
    int radius = 3;

    int kolichestvoStoron = 0;


    @Override
    void perimetr() {
        System.out.println("Perimetr okrujnosti = "+2*Math.PI*radius);
    }

    @Override
    void ploshad() {
        System.out.println("Ploshad okrujnosti = "+ Math.PI*radius*radius);
    }
}

abstract class Chetirehugolnik {
    void def (){
        System.out.println("Eto Chetirehugolnik ");
    }
}