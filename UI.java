package com.mycompany.mavenproject3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UI {
    public Map<String, String> getUserInput() {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> facts = new HashMap<>();
        
        System.out.println("Halo! Selamat Datang pada sisatem pakar risiko longsor di wilayah sekitar lereng gunung");
        System.out.println("Tolong jawab dengan memberikan nomor sesuai dengan yang nomor jawaban anda");
        
        //pertanyaan biasa 1
        System.out.print("Kemiringan Lereng (Seberapa miring lereng di daerah anda)\n");
        System.out.print("1.Sangat Rendah(0-5°)\n 2.Rendah(6-15°)\n 3.Sedang(16-30°)\n 4.Tinggi(31-45°)\n 5.Sangat Tinggi(>45°)):\n");
        facts.put("Kemiringan Lereng", scanner.nextLine());
        // pertanyaan kepercayaan 1
        System.out.print("Apakah anda yakin dengan jawaban anda tersebut?\n 1.yakin\n 2.ragu-ragu\n 3.tidak yakin:\n");
        facts.put("Kepercayaan Kemiringan Lereng", scanner.nextLine());
        
        //pertanyaan biasa 2
        System.out.print("Curah Hujan (Seberapa Tinggi tingkat hujan yang terjadi akhir-akhir ini)\n");
        System.out.print("1.Rendah(Tidak Hujan/Hujan Gerimis)\n 2.Sedang(Hujan Lebat)\n 3.Tinggi(Hujan Lebat adanya genangan atau banjir)\n 4.Ekstrem(Hujan Badai adanya banjir):\n");
        facts.put("Curah Hujan", scanner.nextLine());
        // pertanyaan kepercayaan 2
        System.out.print("Apakah anda yakin dengan jawaban anda tersebut?\n 1.yakin\n 2.ragu-ragu\n 3.tidak yakin:\n");
        facts.put("Kepercayaan Curah Hujan", scanner.nextLine());
        
        //pertanyaan biasa 3
        System.out.print("Apakah jenis batuan di lereng (Ada beberapa jenis batuan yang lebih rentan pada longsor):\n");
        System.out.print("1.Stabil(karpur dan marmer)\n 2.Kurang Stabil(Neogen dan Ofiolit)\n 3.Rentan Longsor(flysch):\n");
        facts.put("Jenis Batuan", scanner.nextLine());
        // pertanyaan kepercayaan 3
        System.out.print("Apakah anda yakin dengan jawaban anda tersebut?\n 1.yakin\n 2.ragu-ragu\n 3.tidak yakin:\n");
        facts.put("Kepercayaan Jenis Batuan", scanner.nextLine());
        
        //pertanyaan biasa 4
        System.out.print("Kondisi vegetasi di lereng (Apakah lereng di daerah anda memiliki kondisi sebagai berikut)\n");        
        System.out.print("1.Wilayah vegetasi masih tinggi)\n 2.Pertanian(Wilayah sudah digunakan untuk pertanian dan vegetasinya sedang)\n 3.Lahan Terbuka(Wilayah sudah gundul dan vegetasi rendah):\n");
        facts.put("Penggunaan Lahan", scanner.nextLine());
        // pertanyaan kepercayaan 4
        System.out.print("Apakah anda yakin dengan jawaban anda tersebut?\n 1.yakin\n 2.ragu-ragu\n 3.tidak yakin:\n");
        facts.put("Kepercayaan Penggunaan Lahan", scanner.nextLine());
        
        //pertanyaan biasa 5
        System.out.print("Kedekatan dengan Jalan (Kedekatan lereng dengan jalan raya)\n");
        System.out.print("1.Dekat(0-50 meter)\n 2.Jauh(>50 meter):\n");
        facts.put("Kedekatan dengan Jalan", scanner.nextLine());
        // pertanyaan kepercayaan 5
        System.out.print("Apakah anda yakin dengan jawaban anda tersebut?\n 1.yakin\n 2.ragu-ragu\n 3.tidak yakin:\n");
        facts.put("Kepercayaan Kedekatan dengan Jalan", scanner.nextLine());
        
        //pertanyaan biasa 6
        System.out.print("Berapa tingkat kedalaman Tanah (Kedalaman tanah memengaruhi seberapa banyak air yang bisa diserap dan seberapa stabil tanah tersebut)\n");
        System.out.print("1.Dangkal(<20 meter)\n 2.Sedang(20-80 meter)\n 3.Dalam(>80 meter):\n");
        facts.put("Kedalaman Tanah", scanner.nextLine());
        // pertanyaan kepercayaan 6
        System.out.print("Apakah anda yakin dengan jawaban anda tersebut?\n 1.yakin\n 2.ragu-ragu\n 3.tidak yakin:\n");
        facts.put("Kepercayaan Kedalaman Tanah", scanner.nextLine());

        return facts;
    }
}