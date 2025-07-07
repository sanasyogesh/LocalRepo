public interface Playable {
    public void pay();
    public void receive();
    public void generateTransactionId(String productId);
    public void generateTransactionId(String productName);
}
