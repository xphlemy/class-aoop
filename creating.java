class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable running...");
    }
}
new Thread(new MyRunnable()).start();
