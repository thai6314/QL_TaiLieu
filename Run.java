package oop_cova;

import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO _D565
 */
public class Run {

    public static void main(String[] args) {
        QuanLy QL = new QuanLy();
        hienThi();
        
        boolean check = true;
        do{
            System.out.println("\n");
            System.out.println("=> Chon chuc nang");
            int chucNang = new Scanner(System.in).nextInt();
            switch(chucNang){
                case 1:{
                    QL.nhapSach();
                }break;
                case 2:{
                    QL.nhapTapChi();
                }break;
                case 3:{
                    QL.nhapBao();
                }break;
                case 4:{
                    QL.suaSach();
                }break;
                case 5:{
                    QL.suaTapChi();
                }break;
                case 6:{
                    QL.suaBao();
                }break;
                case 7:{
                    QL.xoaSach();
                }break;
                case 8:{
                    QL.xoaTapChi();
                }break;
                case 9:{
                    QL.xoaBao();
                }break;
                case 10:{
                    QL.hienThiSach();
                }break;
                case 11:{
                    QL.hienThiTapChi();
                }break;
                case 12:{
                    QL.hienThiBao();
                }break;
                default:{
                    System.out.println("BYE!!!");
                    check = false;
                    break;
                } 
            }
        }while(check);
    }

    private static void hienThi() {
        System.out.println("------------QUẢN LÝ TÀI LIỆU------------");
        System.out.println("1,Nhap sach");
        System.out.println("2,Nhap tap chi");
        System.out.println("3,Nhap bao");
        System.out.println("4,Sua sach");
        System.out.println("5,Sua tap chi");
        System.out.println("6,Sua bao");
        System.out.println("7,Xoa sach");
        System.out.println("8,Xoa tap chi");
        System.out.println("9,Xoa bao");
        System.out.println("10,Hien thi thong tin sach");
        System.out.println("11,Hien thi thong tin tap chi");
        System.out.println("12,Hien thi thong tin bao");
    }
}
