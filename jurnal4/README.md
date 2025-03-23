## PRODI CONDITION:
- 10301 = IF
- 10302 = SE 
- 10303 = IT 
- 10305 = DS

## `hitungIPK` Logic: 
- Lakukan setiap iterasi dalam Array AmbilMK untuk mendapatkan datanya
- Lakukan pengecekan validasi apakah Tahun Ajarannya Sama
- Lakukan hitung IPK dengan ketentuan sebagai berikut
  - IP_MK = [sks] * [nilai indeks]
  - Konversi indeks:
    - A = 4
    - AB = 3.5
    - B = 3
    - BC = 2.5
    - C = 2
    - D = 1
- Terakhir lakukan perhitungan akhir dengan "Math.round((ipk/sks)*100.00)/100.00" untuk mendapatkan hasil akhir IPK