package hacker;

class CompleteTreeNode {
    public Integer value;
    public CompleteTreeNode left;
    public CompleteTreeNode right;

    public CompleteTreeNode(Integer value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public CompleteTreeNode(Integer value, CompleteTreeNode left, CompleteTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "CompleteTreeNode{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
