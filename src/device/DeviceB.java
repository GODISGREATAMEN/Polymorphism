package device;

class DeviceB implements Device {
    final double coefficient = 1.8;

    @Override
    public double getResult(double num1, double num2) {
        return num1 + num2 * coefficient;
    }
}
