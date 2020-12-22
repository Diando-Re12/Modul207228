/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Entity.Diando07228_ManusiaEntity;
import Entity.Diando07228_JurusanEntity;
import Entity.Diando07228_MahasiswaEntity;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author User
 */
public class Diando07228_MahasiswaModel implements Diando07228_ModelInterfaces{
    private ArrayList<Diando07228_MahasiswaEntity> mahasiswaEntityArrayList;
    
    public Diando07228_MahasiswaModel() {
        mahasiswaEntityArrayList = new ArrayList<Diando07228_MahasiswaEntity>();
    }
    
    public Diando07228_MahasiswaEntity getProfileMahasiswa(int index) {
        return mahasiswaEntityArrayList.get(index);
    }
    
    @Override
    public void view() {
        int i=0;
        for (Diando07228_MahasiswaEntity profileMahasiswa : mahasiswaEntityArrayList) {
            System.out.println(i+". NPM : " + profileMahasiswa.getNpm() +
                                "\n   Nama : " + profileMahasiswa.getNama() +
                                "\n   Jurusan : " + Diando07228_JurusanEntity.jurusan[profileMahasiswa.getIndex_jurusan()] +
                                "\n   Tanggal Lahir : " + profileMahasiswa.getTglLahir() +
                                "\n   No. Telp : " + profileMahasiswa.getNo_telp() +
                                "\n   Password : " + profileMahasiswa.getPassword());
            i++;
        }
    }
    
    public void insertMahasiswaModel(Diando07228_MahasiswaEntity profileMahasiswa) {
        mahasiswaEntityArrayList.add(profileMahasiswa);
    }
    
    public void editMahasiswaModel(int index, String data, String ubah) {
        switch(ubah) {
            case "npm" :
                mahasiswaEntityArrayList.get(index).setNpm(data);
                break;
            case "nama" :
                mahasiswaEntityArrayList.get(index).setNama(data);
                break;
            case "noTelp" :
                mahasiswaEntityArrayList.get(index).setNo_telp(data);
                break;
            case "password" :
                mahasiswaEntityArrayList.get(index).setPassword(data);
                break;
        }
    }
    
    public void editMahasiswaModel(int index, Date data) {
        mahasiswaEntityArrayList.get(index).setTglLahir(data);
    }
    
    public void editMahasiswaModel(int index, int data) {
        mahasiswaEntityArrayList.get(index).setIndex_jurusan(data);
    }
    
    public void hapusMahasiswaModel(int index) {
        mahasiswaEntityArrayList.remove(mahasiswaEntityArrayList.get(index));
    }
}
