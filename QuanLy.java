/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_cova;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author WINDOWS 10 PRO _D565
 */
public class QuanLy {
    static Scanner sc = new Scanner(System.in);
    public ArrayList<Bao> listBao = new ArrayList<>();
    public ArrayList<Sach> listSach = new ArrayList<>();
    public ArrayList<TapChi> listTapChi = new ArrayList<>();
    
    public void nhapSach(){
        System.out.println("\n------------Nhap Sach------------");
        String matailieu = nhapmatailieu();
        String nhasanxuat = nhapnhaxuatban();
        String sobanphathanh = nhapsobanphathanh();
        System.out.println("Nhap ten tac gia");
        String tacgia = new Scanner(System.in).nextLine();
        System.out.println("Nhap so trang");
        int sotrang = new Scanner(System.in).nextInt();
        System.out.println("Nhap ten sach");
        String tensach = new Scanner(System.in).nextLine();
        Sach sach = new Sach(matailieu, nhasanxuat, sobanphathanh, tacgia, tensach, sotrang);
        listSach.add(sach);
    }
    
    public void hienThiSach(){
        System.out.println("\n-----------Thong tin sach-----------");
        for(Sach sach : listSach){
            System.out.printf("\nma tai lieu:       %s",sach.maTaiLieu);
            System.out.printf("\nnha xuat ban:      %s",sach.nhaXuatBan);
            System.out.printf("\nso ban phat hanh:  %s",sach.soBanPhatHanh);
            System.out.printf("\nten tac gia:       %s",sach.getTenTacGia());
            System.out.printf("\nten sach:          %s",sach.getTenSach());
            System.out.printf("\nso trang:          %s",sach.getSoTrang());
        }
    }
    
    public void xoaSach(){
        System.out.println("\n-----------Nhap ma sach can xoa-----------");
        String xoa = sc.nextLine();
        int size = listSach.size();
        for(int i=0;i< size;i++){
            if(xoa.equals(listSach.get(i).maTaiLieu)){
                listSach.remove(listSach.get(i));
            }
        }
    }
    
    public void suaSach(){
        System.out.println("\n-----------Nhap ma sach can sua-----------");
        String sua = sc.nextLine();
        int size = listSach.size();
        for(int i=0 ; i<size ; i++){
            if(sua.equals(listSach.get(i).maTaiLieu)){
                System.out.println("-----------Nhap thong lai thong tin sach-----------");
                String suamatailieu = nhapmatailieu();
                listSach.get(i).maTaiLieu = listSach.get(i).maTaiLieu.replace(listSach.get(i).maTaiLieu,suamatailieu);
                String suanhasanxuat = nhapnhaxuatban();
                listSach.get(i).nhaXuatBan = listSach.get(i).nhaXuatBan.replace(listSach.get(i).nhaXuatBan,suanhasanxuat);
                String suasobanphathanh = nhapsobanphathanh();
                listSach.get(i).soBanPhatHanh = listSach.get(i).soBanPhatHanh.replace(listSach.get(i).soBanPhatHanh,suasobanphathanh);
                System.out.println("Nhap ten tac gia");
                String suatacgia = new Scanner(System.in).nextLine();
                listSach.get(i).setTenTacGia(suatacgia); 
                System.out.println("Nhap so trang");
                int suasotrang = new Scanner(System.in).nextInt();
                listSach.get(i).setSoTrang(suasotrang);
                System.out.println("Nhap ten sach");
                String suatensach = new Scanner(System.in).nextLine();
                listSach.get(i).setTenSach(suatensach);
            }
        }
    }
    /*-----------------------------------------------*/
    public void nhapTapChi(){
        System.out.println("\n------------Nhap Tap Chi------------");
        String matailieu = nhapmatailieu();
        String nhasanxuat = nhapnhaxuatban();
        String sobanphathanh = nhapsobanphathanh();
        System.out.println("Nhap thang phat hanh");
        int thangphathanh = new Scanner(System.in).nextInt();
        System.out.println("Nhap so phat hanh");
        String sophathanh = new Scanner(System.in).nextLine();
        TapChi tapchi = new TapChi(matailieu,nhasanxuat,sobanphathanh,sophathanh,thangphathanh);
        listTapChi.add(tapchi);
    }
    
    public void hienThiTapChi(){
        System.out.println("\n-----------Thong tin tap chi-----------");
        for(TapChi tapchi : listTapChi){
            System.out.printf("\nMa tai lieu:              %s",tapchi.maTaiLieu);
            System.out.printf("\nNha xuat ban:             %s",tapchi.nhaXuatBan);
            System.out.printf("\nSo ban phat hanh:         %s",tapchi.soBanPhatHanh);
            System.out.printf("\nSo phat hanh:             %s",tapchi.getSoPhatHanh());
            System.out.printf("\nThang phat hanh:          %s",tapchi.getThangPhatHanh());
        }
    }
    public void xoaTapChi(){
        System.out.println("\n-----------Nhap ma tap chi can xoa-----------");
        String xoa = sc.nextLine();
        int size = listTapChi.size();
        for(int i=0;i< size;i++){
            if(xoa.equals(listTapChi.get(i).maTaiLieu)){
                listTapChi.remove(listTapChi.get(i));
            }
        }
    }
    public void suaTapChi(){
        System.out.println("\n-----------Nhap ma tap chi can sua-----------");
        String sua = sc.nextLine();
        int size = listTapChi.size();
        for(int i=0 ; i<size ; i++){
            if(sua.equals(listTapChi.get(i).maTaiLieu)){
                System.out.println("-----------Nhap thong lai thong tin sach-----------");
                String suamatailieu = nhapmatailieu();
                listTapChi.get(i).maTaiLieu = listTapChi.get(i).maTaiLieu.replace(listTapChi.get(i).maTaiLieu,suamatailieu);
                String suanhasanxuat = nhapnhaxuatban();
                listTapChi.get(i).nhaXuatBan = listTapChi.get(i).nhaXuatBan.replace(listTapChi.get(i).nhaXuatBan,suanhasanxuat);
                String suasobanphathanh = nhapsobanphathanh();
                listTapChi.get(i).soBanPhatHanh = listTapChi.get(i).soBanPhatHanh.replace(listTapChi.get(i).soBanPhatHanh,suasobanphathanh);
                System.out.println("Nhap so phat hanh");
                String suasophathanh = new Scanner(System.in).nextLine();
                listTapChi.get(i).setSoPhatHanh(suasobanphathanh); 
                System.out.println("Nhap thang phat hanh");
                int suathangphathanh = new Scanner(System.in).nextInt();
                listTapChi.get(i).setSoPhatHanh(suasophathanh);
            }
        }
    }
    /*-----------------------------------------------*/
    public void nhapBao(){
        System.out.println("\n------------Nhap Bao------------");
        String matailieu = nhapmatailieu();
        String nhasanxuat = nhapnhaxuatban();
        String sobanphathanh = nhapsobanphathanh();
        System.out.println("Nhap ngay phat hanh");
        String ngayphathanh = new Scanner(System.in).nextLine();
        Bao bao = new Bao(matailieu,nhasanxuat,sobanphathanh,ngayphathanh);
        listBao.add(bao);
    }
    
    public void hienThiBao(){
        System.out.println("\n-----------Thong tin bao-----------");
        for(Bao bao : listBao){
            System.out.printf("\nMa tai lieu:          %s",bao.maTaiLieu);
            System.out.printf("\nNha xuat ban:         %s",bao.nhaXuatBan);
            System.out.printf("\nSo ban phat hanh:     %s",bao.soBanPhatHanh);
            System.out.printf("\nNgay phat hanh:       %s",bao.getNgayPhatHanh());
        }
    }
    public void xoaBao(){
        System.out.println("\n-----------Nhap ma sach can xoa-----------");
        String xoa = sc.nextLine();
        int size = listBao.size();
        for(int i=0;i< size;i++){
            if(xoa.equals(listBao.get(i).maTaiLieu)){
                listBao.remove(listBao.get(i));
            }
        }
    }
    public void suaBao(){
        System.out.println("\n-----------Nhap ma tap chi can sua-----------");
        String sua = sc.nextLine();
        int size = listBao.size();
        for(int i=0 ; i<size ; i++){
            if(sua.equals(listBao.get(i).maTaiLieu)){
                System.out.println("-----------Nhap thong lai thong tin sach-----------");
                String suamatailieu = nhapmatailieu();
                listBao.get(i).maTaiLieu = listBao.get(i).maTaiLieu.replace(listBao.get(i).maTaiLieu,suamatailieu);
                String suanhasanxuat = nhapnhaxuatban();
                listBao.get(i).nhaXuatBan = listBao.get(i).nhaXuatBan.replace(listBao.get(i).nhaXuatBan,suanhasanxuat);
                String suasobanphathanh = nhapsobanphathanh();
                listBao.get(i).soBanPhatHanh = listBao.get(i).soBanPhatHanh.replace(listBao.get(i).soBanPhatHanh,suasobanphathanh);
                System.out.println("Nhap ngay phat hanh");
                String suangayphathanh = new Scanner(System.in).nextLine();
                listBao.get(i).setNgayPhatHanh(suasobanphathanh); 
            }
        }
    }
/*----------------------------------*/
    private String nhapmatailieu() {
        System.out.println("Nhap ma tai lieu");
        return sc.nextLine();
    }

    private String nhapnhaxuatban() {
        System.out.println("Nhap ten nha xuat ban");
        return sc.nextLine();
    }

    private String nhapsobanphathanh() {
        System.out.println("Nhap so ban phat hanh");
        return sc.nextLine();
    }

}

