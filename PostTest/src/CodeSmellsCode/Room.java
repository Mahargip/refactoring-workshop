package CodeSmellsCode;

class Room {
    private int roomNumber;
    private String roomType; // "Single", "Double", "Suite"
    private double price;

    public Room(int roomNumber, String roomType) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        switch (roomType) {
            case "Single":
                this.price = 100.0;
                break;
            case "Double":
                this.price = 150.0;
                break;
            case "Suite":
                this.price = 300.0;
                break;
            default:
                this.price = 0.0;
                break;
        }
    }

    public double getPrice() {
        return price;
    }

    public String getRoomType() {
        return roomType;
    }
}
