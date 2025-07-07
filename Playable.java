public interface Playable {
    public void pay();
    public void receive();
    public void generateTransactionId(int productId);
    public void generateTransactionId(String productName);
}
