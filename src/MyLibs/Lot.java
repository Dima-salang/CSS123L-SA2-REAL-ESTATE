package MyLibs;

public class Lot {
    String lotNumber;
    Block blockNum;
    double lotSize;
    double lotPrice;
    Status lotStatus;

    public String getLotNumber() {
        return lotNumber;
    }

    public void setLotNumber(String lotNumber) {
        this.lotNumber = lotNumber;
    }

    public Block getBlockNum() {
        return blockNum;
    }

    public void setBlockNum(Block blockNum) {
        this.blockNum = blockNum;
    }

    public double getLotSize() {
        return lotSize;
    }

    public void setLotSize(double lotSize) {
        this.lotSize = lotSize;
    }

    public double getLotPrice() {
        return lotPrice;
    }

    public void setLotPrice(double lotPrice) {
        this.lotPrice = lotPrice;
    }

    public Status getLotStatus() {
        return lotStatus;
    }

    public void setLotStatus(Status lotStatus) {
        this.lotStatus = lotStatus;
    }

   
}
