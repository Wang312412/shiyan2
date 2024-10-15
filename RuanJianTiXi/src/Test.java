
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        String filePath = "input.txt";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("请选择要演示的软件体系结构风格：");
            System.out.println("1. 主程序-子程序");
            System.out.println("2. 面向对象");
            System.out.println("3. 事件系统");
            System.out.println("4. 管道-过滤器");
            System.out.print("请输入您的选择（1-4）：");

            int choice = scanner.nextInt();
            System.out.println("输入的文件内容");

            try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    System.out.println(line); // 打印每一行
                }
            } catch (IOException e) {
                System.out.println("发生错误：" + e.getMessage());
            }
            System.out.println("经过处理后的文件内容");
            switch (choice) {
                case 1:
                    try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
                        String line2;
                        while ((line2 = reader.readLine()) != null) {
                            System.out.println(line2); // 打印每一行
                        }
                    } catch (IOException e) {
                        System.out.println("发生错误：" + e.getMessage());
                    }
                    break;
                case 2:
                    try (BufferedReader reader = new BufferedReader(new FileReader("output2.txt"))) {
                        String line3;
                        while ((line3 = reader.readLine()) != null) {
                            System.out.println(line3); // 打印每一行
                        }
                    } catch (IOException e) {
                        System.out.println("发生错误：" + e.getMessage());
                    }
                    break;
                case 3:
                    try (BufferedReader reader = new BufferedReader(new FileReader("output3.txt"))) {
                        String line4;
                        while ((line4 = reader.readLine()) != null) {
                            System.out.println(line4); // 打印每一行
                        }
                    } catch (IOException e) {
                        System.out.println("发生错误：" + e.getMessage());
                    }
                    break;
                case 4:
                    try (BufferedReader reader = new BufferedReader(new FileReader("output4.txt"))) {
                        String line5;
                        while ((line5 = reader.readLine()) != null) {
                            System.out.println(line5); // 打印每一行
                        }
                    } catch (IOException e) {
                        System.out.println("发生错误：" + e.getMessage());
                    }
                    break;
            }
            processInput(choice);
            System.out.println("输出0退出系统，输入1继续演示");

            int temp = scanner.nextInt();
            if(temp == 0){
                break;
            };
        } while (true);
    }

    private static void processInput(int choice) {
        switch (choice) {
            case 1:
                System.out.println("主程序-子程序风格是最简单的结构，其中主程序调用子程序来执行特定的任务");
                break;
            case 2:
                System.out.println("面向对象风格使用类和对象来模拟现实世界，强调数据和操作数据的方法的封装。");
                break;
            case 3:
                System.out.println("事件系统风格依赖于事件的生成、侦听和响应。这种风格常用于图形用户界面编程。");
                break;
            case 4:
                System.out.println("管道-过滤器风格由一系列过滤器组成，每个过滤器接受输入，处理它，并将结果传递给下一个过滤器。");
                break;
        }
    }
}


