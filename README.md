# J2ME HelloWorld Project

Đây là một dự án mẫu sử dụng **Java 2 Micro Edition (J2ME)** để tạo ứng dụng "Hello World" đơn giản. Dự án được xây dựng bằng **Gradle** và tích hợp công cụ **preverify** từ **Sun Wireless Toolkit (WTK)**.

## Yêu cầu hệ thống

- **JDK**: Phiên bản 1.4 hoặc 5 (khuyến nghị JDK 1.4 để tương thích với J2ME).
- **Gradle**: Phiên bản 7.x trở lên.
- **Sun Wireless Toolkit (WTK)**: Phiên bản 2.5.2 hoặc tương đương.
- **IDE**: IntelliJ IDEA (khuyến nghị) hoặc bất kỳ IDE nào hỗ trợ Gradle.

## Cấu trúc dự án
```
j2me-helloworld/
├── build.gradle // Cấu hình Gradle
├── src/
│ ├── main/
│ │ ├── java/ // Mã nguồn Java
│ │ │ └── com/
│ │ │ └── example/
│ │ │ └── HelloWorld.java
│ │ └── resources/ // Tài nguyên (manifest, hình ảnh, v.v.)
│ │ └── META-INF/
│ │ └── MANIFEST.MF
│ └── test/ // Test cases (nếu có)
├── libs/ // Các Thư viện J2ME (midpapi20.jar, vv)
└── README.md // Tài liệu dự án
```
## Hướng dẫn cài đặt

1. **Clone dự án**:
   ```bash
   git clone https://github.com/your-username/j2me-helloworld.git
   cd j2me-helloworld
   ```
2. **Cài Đặt WTK**:
    * Tải và cài đặt WTK từ [Oracle Archive.](https://www.oracle.com/java/technologies/java-archive-downloads-javame-downloads.html)
3. **Build dự án:**:
    * Config các cấu hình của file jar trong MANIFEST.MF
    * chạy task toJar
    * File JAR sẽ được tạo trong thư mục build/libs/.