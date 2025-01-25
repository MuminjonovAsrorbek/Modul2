package OOP.Lesson1.Homework.Example1;


public class Main {
    public static void main(String[] args) {

        {   //iPhone object

            {   // iPhone14 object
                iPhone14 iPhone14 = new iPhone14();

                iPhone14.setModel("iPhone 14 Pro");
                iPhone14.setNomi("iPhone 14");
                iPhone14.setSpu("A16 Bionic");
                iPhone14.setBattery("3200 mAh");
                iPhone14.setIosVersion("iOS 17");
                iPhone14.setYil(2022);
                iPhone14.setCamera(48);
                iPhone14.setYom(98);
                iPhone14.setTypeC(false);

                iPhone14.showInfo();
            }

            {   //iPhone15 object
                iPhone15 iPhone15 = new iPhone15();

                iPhone15.setModel("iPhone 15 Pro");
                iPhone15.setNomi("iPhone 15");
                iPhone15.setSpu("A16 Bionic");
                iPhone15.setBattery("3340 mAh");
                iPhone15.setIosVersion("iOS 17");
                iPhone15.setYil(2023);
                iPhone15.setCamera(48);
                iPhone15.setYom(100);
                iPhone15.setTypeC(true);

                iPhone15.showInfo();
            }
        }



        {   //Samsung object
            Samsung samsung24 = new Samsung();
            samsung24.setModel("Samsung S24 ULTRA");
            samsung24.setNomi("Samsung");
            samsung24.setYil(2024);
            samsung24.setCamera(200);
            samsung24.setBattery("5000 mAh");
            samsung24.setAndroidVersion("Android 14");
            samsung24.setSpu("Snapdragon 8 Gen 3");
            samsung24.setPen(true);

            samsung24.showInfo();
        }

        {   //Redmi object
            Redmi redmi = new Redmi();
            redmi.setModel("Redmi K40");
            redmi.setNomi("Redmi");
            redmi.setYil(2021);
            redmi.setCamera(48);
            redmi.setBattery("4520 mAh");
            redmi.setSpu("Qualcomm Snapdragon 870");
            redmi.setAndroidVersion("Android 14");
            redmi.setPen(false);

            redmi.showInfo();
        }
    }
}
