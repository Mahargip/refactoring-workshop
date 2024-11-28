package RefactoredCode.model;

public class Room {
    private int roomNumber;
    private String roomType; 
    private double price;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = calculatePrice(roomType);
    }

    private double calculatePrice(String roomType) {
        switch (roomType) {
            case "Single":
                return 100.0;
            case "Double":
                return 150.0;
            case "Suite":
                return 300.0;
            default:
                throw new IllegalArgumentException("Invalid room type: " + roomType);
        }
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }

    public int getRoomNumber() {
        return roomNumber;
    }
}