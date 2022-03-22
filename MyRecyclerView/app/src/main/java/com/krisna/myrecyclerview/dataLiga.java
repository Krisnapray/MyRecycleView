package com.krisna.myrecyclerview;

import java.util.ArrayList;

class dataLiga {
    private static String[] namaClub = {
            "Bali United",
            "Persib Bandung",
            "Bhayangkara FC",
            "Persebaya Surabaya",
            "Arema FC",
            "Borneo FC",
            "Persija Jakarta",
            "PSIS Semarang",
            "Persita",
            "Madura United FC"
    };

    private static String[] clubDetails = {
            "Bali United merupakan club yang masih menduduki peringkat pertama pada liga 1 Indonesia.",
            "Persib Bandung merupakan club yang masih puasa 5 gelar selama musim liga 1 berlanjut",
            "Bhayangkara dengan julukan the guardians, sebuah tim sepak bola Indonesia yang dimiliki oleh Polri yang berbasis di Jakarta Selatan. Klub ini bermain di Liga 1.",
            "Persebaya Surabaya atau biasa disebut Persebaya adalah sebuah klub sepak bola profesional di Indonesia yang berbasis di Surabaya dan berdiri pada 18 Juni 1927 dengan nama asalnya adalah Soerabajasche Indonesische Voetbal Bond.",
            "Arema Football Club, biasa disebut dengan Arema adalah sebuah klub sepak bola profesional yang berasal dari Malang, Jawa Timur, Indonesia. ",
            "Borneo FC adalah klub sepak bola Indonesia yang berasal dari Samarinda, Kalimantan Timur, Indonesia.",
            "Persija singkatan dari Persatuan Sepak Bola Indonesia Jakarta adalah klub sepak bola Indonesia yang berbasis di Jakarta.",
            "Persatuan Sepak Bola Indonesia Semarang atau biasa disingkat PSIS Semarang adalah klub sepak bola profesional yang berbasis di Kota Semarang, Jawa Tengah, Indonesia dengan bermarkas di Stadion Jatidiri, Semarang.",
            "Persatuan Sepak bola Indonesia Tangerang adalah sebuah klub sepak bola Indonesia yang bermarkas di Kabupaten Tangerang. Tim berjuluk Pendekar Cisadane yang identik dengan jersey berwarna violet.",
            "Madura United FC merupakan klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura. Klub ini sebelumnya bernama Pelita Jaya dan Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia. "
    };

    private static int[] clubimage = {
            R.drawable.bali_united,
            R.drawable.persib_bandung,
            R.drawable.bhayangkara_fc,
            R.drawable.persebaya_fc,
            R.drawable.arema_fc,
            R.drawable.borneo_fc,
            R.drawable.persija_jakarta,
            R.drawable.psis_semarang,
            R.drawable.persita_tangerang,
            R.drawable.madura_united
    };

    static ArrayList<liga> getListData() {
        ArrayList<liga> list = new ArrayList<>();
        for (int position = 0; position < namaClub.length; position++) {
            liga liga = new liga();
            liga.setName(namaClub[position]);
            liga.setDetail(clubDetails[position]);
            liga.setPhoto(clubimage[position]);
            list.add(liga);
        }
        return list;
    }
}