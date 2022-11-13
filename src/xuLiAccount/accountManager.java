package xuLiAccount;


import Account.Account;

import java.util.Scanner;

public class accountManager {
    Account[] accounts = new Account[0];
    Scanner scanner = new Scanner(System.in);
    public void  show(){
        for (int i  = 0; i  < accounts.length; i ++) {
            System.out.println(accounts[i]);
        }
    }

    public void add(Account account){

        Account[] accounts1 = new Account[accounts.length+1] ;
        for (int i = 0; i < accounts1.length-1; i++) {
            accounts1[i]=accounts[i];
        }

        accounts1[accounts1.length-1] =account;
        accounts=accounts1;
    }

    public Account createAcc() {
        System.out.println("nhập tên người dùng");
        String name = scanner.nextLine();
        System.out.println("nhập tên tài khoản");
        String id = scanner.nextLine();
        System.out.println("nhập mật khẩu");
        String passWord = scanner.nextLine();


        return new Account(name,id,passWord);
    }

    public int findName(String name) {
        for (int i = 0; i < accounts.length; i++) {
            if (name.equals(accounts[i].getName()))
                return i;
        }
        return -1;
    }

    public void delete(String name) {
        int index = findName(name);
        if (index!=-1){
            Account[] accounts1 = new Account[accounts.length-1];
            for (int i = 0; i <accounts1.length ; i++) {
                if (i<index){
                    accounts1[i]=accounts[i];
                } else {
                    accounts1[i]=accounts[i+1];
                }
            }
            accounts=accounts1;
        }
    }

    public void edit(String name){
        int index = findName(name);

        if (index!=-1) {
            System.out.println("nhập password mới");
            String newPass = scanner.nextLine();

            String newName = accounts[index].getName();
            String newId = accounts[index].getAccount();


            accounts[index] =  new Account(newName,newId,newPass);
        }
    }
}
