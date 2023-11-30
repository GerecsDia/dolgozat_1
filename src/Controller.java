/*
* File: dolgozat_1
* Author: Gerecs Diána
* Copyright: 2023, Gerecs Diána
* Group: Szoft II/1/E
* Date: 2023-11-30
* Github: https://github.com/GerecsDia/
* Licenc: GNU GPL
*/

public class Controller implements Controllable {
    @Override
    public void start() {
        System.out.println("A vezérlő elindult.");
    }

    @Override
    public void stop() {
        System.out.println("A vezérlő leállt.");
    }

    @Override
    public void restart() {
        System.out.println("A vezérlő újraindult.");
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.start();
        controller.stop();
        controller.restart();
    }

}
