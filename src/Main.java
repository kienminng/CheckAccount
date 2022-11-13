import Account.Account;
import xuLiAccount.accountManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        accountManager accountManager = new accountManager();

        int choose =-1;

        while (choose!= 0) {


            System.out.println("Menu");
            System.out.println("1.Hiển thị tài khoản");
            System.out.println("2.Thêm tài khoản");
            System.out.println("3.Sửa password theo username.");
            System.out.println("4.Xóa tài khoản theo username.");
            System.out.println("5.Tìm tài khoản theo username.");
            System.out.println("0.exit");


            choose = scanner.nextInt();

            switch (choose) {
                case 1:
                    accountManager.show();
                    break;
                case 2:
                    accountManager.add(accountManager.createAcc());
                    break;
                case 3:
                    System.out.println("nhập tên muốn truy cập");
                    scanner.nextLine();
                    String editName = scanner.nextLine();
                    accountManager.edit(editName);
                    break;
                case 4:
                    System.out.println("nhập tên muốn xoá");
                    scanner.nextLine();
                    String deleteName = scanner.nextLine();
                    accountManager.delete(deleteName);
                    break;
                case 5:
                    System.out.println("nhập tên tài khoản muốn tìm");
                    scanner.nextLine();
                    String findName = scanner.nextLine();
                    System.out.println(accountManager.findName(findName));

                    break;
                default:
                    System.out.println("nhập lại ");
                    break;

            }
        }
    }
}