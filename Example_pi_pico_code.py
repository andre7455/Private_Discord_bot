# Import the necessary modules
from machine import Pin
import utime
from network import WLAN
from socket import socket, AF_INET, SOCK_STREAM

# Set the pin to use as the listener
pin = Pin(0, Pin.IN)

# Function to read the pin and return the value
def read_pin():
  return pin.value()

# Function to start the HTTP listener
def start_listener():
  # Create a new WLAN connection
  wlan = WLAN()

  # Enable the WLAN connection
  wlan.active(True)

  # Connect to the specified WiFi network
  wlan.connect("SSID", "password")

  # Wait for the connection to be established
  while not wlan.isconnected():
    utime.sleep(1)

  # Print the IP address of the Pico
  print("IP address:", wlan.ifconfig()[0])

  # Create a new socket to listen for incoming connections
  sock = socket(AF_INET, SOCK_STREAM)

  # Bind the socket to the specified port
  sock.bind(("", 80))

  # Start listening for incoming connections
  sock.listen(1)

  # Main loop
  while True:
    # Accept an incoming connection
    conn, addr = sock.accept()

    # Print the address of the connecting client
    print("Connected by", addr)

    # Read data from the connection
    data = conn.recv(1024)

    # Print the received data
    print("Received:", data)

    # Send a response to the client
    conn.send("HTTP/1.0 200 OK\r\n\r\n")
    conn.send("Hello World!")

    # Close the connection
    conn.close()

# Start the HTTP listener
start_listener()