/* @UNIVESRE.COM_20170115_HYE
 * Demo: initialization order, p94. */

import static net.mindview.util.Print.*;

class Window {
    Window(int maker) { print("Window(" + maker + ")"); }
}

class House {

    Window w1 = new Window(1);  // Before constructor;
    House() {
        // Show that we're in constructor;
        print("House()");
        w3 = new Window(33);    // Reinitialize w3;
    }

    Window w2 = new Window(2);  // After constructor;
    void f() { print("f()"); }
    Window w3 = new Window(3);  // At end;

}


public class OrderOfInitialization {

    public static void main(String[] args) {
        House h = new House();
        h.f();  // Shows that construction is done;
    }

}

