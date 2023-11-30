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
