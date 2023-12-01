package device;

public class Main {
    public static void main(String[] args) {
        DeviceA deviceA = new DeviceA();
        DeviceB deviceB = new DeviceB();
        Result result = new Result();

        double resA = deviceA.getResult(15, 20);
        double resB = deviceB.getResult(21, 65);
        result.printResult(resA, resB);
    }
}