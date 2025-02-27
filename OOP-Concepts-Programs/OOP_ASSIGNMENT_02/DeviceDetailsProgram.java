import java.util.Scanner;

class DeviceDetails {
    int deviceNo;
    String deviceName;
    String deviceType;
    double devicePrice;


    DeviceDetails() {
        deviceNo = 0;
        deviceName = "";
        deviceType = "";
        devicePrice = 0.0;
    }

    public DeviceDetails(int deviceNo, double devicePrice) {
        this.deviceNo = deviceNo;
        this.devicePrice = devicePrice;
        this.deviceName = "";
        this.deviceType = "";
	System.out.println();
    }


    void getDeviceDetails() {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter device number: ");
        deviceNo = scanner.nextInt();
        scanner.nextLine();  

        System.out.print("Enter device name: ");
        deviceName = scanner.nextLine();

        System.out.print("Enter device type: ");
        deviceType = scanner.nextLine();

        System.out.print("Enter device price: ");
        devicePrice = scanner.nextDouble();
    }


    void displayDetails() {
        System.out.println("Device number: " + deviceNo);
        if (deviceName.isEmpty()) {
            System.out.println("Device name is not provided.");
        } else {
            System.out.println("Device name: " + deviceName);
        }

        if (deviceType.isEmpty()) {
            System.out.println("Device type is not provided.");
        } else {
            System.out.println("Device type: " + deviceType);
        }

        System.out.println("Device price: $" + devicePrice);
    }
	
}

public class DeviceDetailsProgram {
    public static void main(String[] args) {
        System.out.println("*********Device Information*********");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 to input all details of a device or 2 to input only device number and price: ");
        int choice = scanner.nextInt();

        DeviceDetails device;

        if (choice == 1) {
            device = new DeviceDetails();
            device.getDeviceDetails();
        }
        else if (choice == 2) {
            device = new DeviceDetails();
            System.out.print("Enter device number: ");
            int deviceNo = scanner.nextInt();
            System.out.print("Enter device price: ");
            double devicePrice = scanner.nextDouble();
            device = new DeviceDetails(deviceNo, devicePrice);
        }
        else {
            System.out.println("Invalid choice!");
		return;
         
        }
        device.displayDetails();
    }
}
