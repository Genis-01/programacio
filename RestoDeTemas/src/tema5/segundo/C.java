package tema5.segundo;

import tema5.primero.A;
class C {

    A a = new A();
    B b = new B(a.numero, "pedro");

    void prinraB(){
        b.info();
    }

    void llamoAA() {
        //a.prueba();
    }
}
