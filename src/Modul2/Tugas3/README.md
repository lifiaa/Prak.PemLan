# 🛒 Aplikasi Keranjang Belanja Java

Program ini merupakan implementasi dari **Tugas 3 Modul 2** mata kuliah *Pemrograman Lanjut (PrakPemLan)*.  
Aplikasi ini mensimulasikan sistem **keranjang belanja sederhana** di mana pengguna dapat menambahkan item ke dalam keranjang, menghitung subtotal, pajak, dan total akhir pembayaran.

---

## 📂 Struktur Project

```
Modul2/
├── Tugas3/
├── Item.java
├── ItemKeranjang.java
├── KeranjangBelanja.java
└── MainChart.java
```


---

## 💡 Fitur Utama

- Menambahkan item baru ke keranjang belanja.
- Memperbarui kuantitas item jika sudah ada (tanpa duplikasi).
- Menghitung subtotal seluruh item dalam keranjang.
- Menghitung pajak (10%) dan total akhir.
- Menampilkan rincian pembelian secara rapi di console.

---

## 🧠 Konsep Refactoring yang Diterapkan

| Teknik Refactoring | Implementasi |
|--------------------|--------------|
| **Encapsulate Field** | Semua atribut dibuat `private` dan diakses dengan getter/setter. |
| **Introduce Constant** | Konstanta `PAJAK_RATE` ditambahkan di kelas `keranjangBelanja`. |
| **Extract Method** | `hitungSubtotal()`, `hitungPajak()`, dan `hitungTotalAkhir()` dipisahkan agar lebih modular. |
| **Rename Method** | `tampilkanRincianBelanja()` digunakan agar lebih deskriptif. |
| **Introduce Parameter Object** | `ItemKeranjang` menyimpan `Item` dan kuantitas untuk tiap baris belanja. |

---

## 🧾 Contoh Output Program

```
--- Proses Penambahan Item ---
Biji Kopi Arabica (2 unit) berhasil ditambahkan.
Daun Teh Premium (1 unit) berhasil ditambahkan.
Gula Pasir 1kg (3 unit) berhasil ditambahkan.
Kuantitas 'Biji Kopi Arabica' diperbarui menjadi 3

======================================================================
RINCIAN KERANJANG BELANJA
Biji Kopi Arabica (x3) @ Rp 85000.00 = Rp 255000.00
Daun Teh Premium (x1) @ Rp 45000.00 = Rp 45000.00
Gula Pasir 1kg (x3) @ Rp 14000.00 = Rp 42000.00
----------------------------------------------------------------------
Subtotal            : Rp 342000.00
Pajak (10%)         : Rp 34200.00
======================================================================
Total Akhir         : Rp 376200.00
======================================================================
```


---

## ⚙️ Cara Menjalankan Program

1. Buka project di **IntelliJ IDEA**
2. Jalankan file `MainChart.java`
3. Lihat hasil perhitungan belanja di **console output**

---

## 🧰 Teknologi yang Digunakan

- **Java 17+**
- **IntelliJ IDEA**
- **Git & GitHub** untuk version control dan manajemen branch pengembangan fitur

---

## 📦 Struktur Kelas

| Kelas | Deskripsi |
|--------|------------|
| `Item` | Representasi data produk (nama dan harga). |
| `ItemKeranjang` | Menghubungkan produk dengan kuantitas pembelian. |
| `keranjangBelanja` | Mengelola daftar item, menghitung subtotal, pajak, dan total akhir. |
| `MainChart` | Class utama untuk menjalankan program dan menampilkan hasil. |

---

## 🧩 Rencana Pengembangan (Branch Git)

- **branch: `feature-discount`** → Tambahkan fitur diskon 5% jika total > Rp100.000
- **branch: `feature-remove-item`** → Tambahkan fitur untuk menghapus item dari keranjang
- **branch: `feature-user-input`** → Menambahkan interaksi pengguna dengan `Scanner`

Gunakan `git branch` dan `git checkout` untuk berpindah antar fitur, lalu merge ke `main` setelah diuji.

---

## 👨‍💻 Pembuat

**Nama:** Alifia Nadia Ruksana  
**NIM:** 202410370110334  
**Kelas:** Pemrograman Lanjut F - 2025/2026  
**Universitas Muhammadiyah Malang**

---

## 🏷️ Lisensi

Proyek ini dibuat untuk keperluan pembelajaran di mata kuliah Pemrograman Lanjut.  
Tidak untuk penggunaan komersial.
