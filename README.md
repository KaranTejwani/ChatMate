# ChatMate 💬

**ChatMate** is a Java-based local chat application that enables real-time communication between devices connected to the same Wi-Fi network. Built using socket programming, this project includes user authentication and chat history persistence.

---

## 🚀 Features

- 📡 Chat across multiple devices over the same Wi-Fi
- 🔐 User authentication system
- 💾 Chat history saving and reloading on revisit
- 💬 Real-time messaging via Java sockets

---

## 🛠️ Technologies Used

- Java (Core)
- Socket Programming (TCP/IP)
- File I/O for chat persistence
- Basic GUI (Swing and awt)

---

## 🧠 How It Works

1. The **server** runs and listens for incoming client connections.
2. Each **client** connects to the server and logs in via a username/password.
3. Messages sent by any client are broadcast to all connected clients.
4. Chat messages are saved locally and reloaded when the app is revisited.

---

## 📝 How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/chatMate.git
   cd chatMate
2. **Compile and run Server**:
   ```bash
   javac ServerSide.java
   java ServerSide
3. **Compile and run the client (on same or different devices on same Wi-Fi)**:
   ```bash
   javac ClientSide.java
   java ClientSide

Make sure firewall settings and ports are correctly configured on all devices.

