Saat kita membuat projek springboot otomatis aka terdapat sprig-boot-plugin di project maven
plugin ini dapat digunakan untuk mempermudah menjalankan aplikasi spring kita
kita dapat menggunakan perintah:
"""mvn spring-boot:run"""
untuk menjalankan aplikasi spring kita dan pastikan hanya ada satu main class jika lebih akan error

perintah untuk menghapus
"""mvn clean"""

detail spring-boot-plugin dapat dilihat di pom.xml pada bagian bawah terdapat <plugin> 
"""mvn spring-boot:run"""
hanya untuk dalam mode development, untuk production harus membuat distribution filenya

Springboot plugin dapat digunakan untuk menyediakan cara membuat distribution file aplikasi kita
jadi plugin ini akan mendeteksi main class project kita lalu membundle aplikasi kita beserta depedency 
yang dibutuhkan dalam satu file jar
pastikan hanya satu main class
untuk membuat bundle ini cukup jalankan
"""mvn package"""
secara otomatis akan terbuat single jar application. file akan masuk ke folder target

jika ingin me running production atau bundle tersebut dapat dengan menjalankan perintah
""java -jar lokasi\file argument"""
argument Optional