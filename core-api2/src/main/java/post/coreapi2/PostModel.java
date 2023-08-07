package post.coreapi2;



public class PostModel {
    private String postId;
    private String clientId;
    private String postRecipientId;
    private String postItem;
    private String status;

    public Object getPostId() {
        return postId;
    }

    public Object getClientId() {
        return clientId;
    }

    public Object getPostRecipientId() {
        return postRecipientId;
    }

    public void setClientId(Object clientId) {
    }

    public void setPostRecipientId(Object postRecipientId) {
    }

    public Object getPostItem() {
        return postItem;
    }

    public Object getStatus() {
        return status;
    }

    public void setPostItem(Object postItem) {
    }

    public void setStatus(Object status) {
    }
}
