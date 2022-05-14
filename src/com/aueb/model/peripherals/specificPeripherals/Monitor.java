package com.aueb.model.peripherals.specificPeripherals;

public class Monitor {

    int choice1 = 0;

    void setChoice(int choice1) {
        this.choice1 = choice1;
    }

    enum Memory {
        MONITOR, PORTABLE_MONITOR, TV_MONITOR;

        public String getMemory() {

            switch (this) {
                case MONITOR:
                    return "monitor";

                case PORTABLE_MONITOR:
                    return "portable monitor";

                case TV_MONITOR:
                    return "Tv monitor";

                default:
                    return null;
            }
        }
    }

    enum Port {
        DISPLAY_PORT, HDMI, USB_C;

        public String getPort() {
            switch (this) {
                case DISPLAY_PORT:
                    return "Display port";

                case HDMI:
                    return "HDMI";

                case USB_C:
                    return "USB_C";

                default:
                    return null;

            }

        }
    }

    public String toString() {
        if (choice1 == 0) {
            return "Type of memory is " + Memory.MONITOR.getMemory();
        }
        if (choice1 == 1) {
            return "Type of memory is " + Memory.PORTABLE_MONITOR.getMemory();
        }
        if (choice1 == 2) {
            return "Type of memory is " + Memory.TV_MONITOR.getMemory();
        }
        return null;
    }

    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        monitor.setChoice(2);
        System.out.println(monitor);


    }
}



