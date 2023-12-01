package device;

class DeviceA implements Device {
    @Override
    public double getResult(double num1, double num2) {
        return num1 * num2;
    }
}
