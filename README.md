# Java OOP Engineer Demo

Bu proje, **Java Nesne Yönelimli Programlama (OOP)** kavramlarını örneklemek için hazırlanmıştır.  
`Inheritance (kalıtım)` ve `Interface (arayüz)` kullanılarak farklı mühendis tipleri modellenmiştir.  

---

## 🎯 Amaç
- OOP’nin temel prensiplerini (Encapsulation, Inheritance, Polymorphism, Abstraction) göstermek
- `Base Class` kullanarak **ortak özellikleri** tek noktadan yönetmek
- `Interface` kullanarak tüm mühendisler için **zorunlu davranışları** tanımlamak
- Polimorfizm sayesinde farklı mühendis tiplerini **tek bir referans üzerinden** yönetebilmek

---

## 🛠 Kullanılan Yapılar
- **Base Class → `BaseMuhendis`**
  - Ortak alanlar: `isim`, `soyisim`, `tecrube`, `maas`, `diller`, `askerlikDurum`
  - Getter & Setter metodları

- **Interface → `IMuhendis`**
  - `bilgileriYazdir()`
  - `askerlikYapildimi(boolean deger)`

- **Concrete Classes**
  - `BilgisayarMühendisi`  
  - `MakineMühendisi`

- **Main Class**
  - Nesneler burada üretilir
  - Metodlar çağrılır
  - Polimorfizm örneği gösterilir

---

## 📂 Proje Yapısı
src/
├── BaseMuhendis.java
├── BilgisayarMühendisi.java
├── MakineMühendisi.java
├── IMuhendis.java
└── Main.java
