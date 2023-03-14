public class ADAlab6_699
{
    public static void main(String[] args) {
        int i = 1, n = 10;
        char[] node = new char[] {' ', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J'};
        System.out.printf("DFS in-Order :"); inOrder(1, n, node); System.out.printf("\n");
        System.out.printf("DFS pre-Order :"); preOrder(1, n, node); System.out.printf("\n");
        System.out.printf("DFS post-Order :"); postOrder(1, n, node); System.out.printf("\n");
        
    }
    
    public static int inOrder(int i, int n, char[] node){
        if(i != -1) {
            inOrder(leftChild(i, n), n, node);
            System.out.printf("%c ", node[i]);
            inOrder(rightChild(i, n), n, node);
            return 1;
        } else {
            return -1;
        }
    }
    
    public static int preOrder(int i, int n, char[] node){
        if(i != -1) {
            System.out.printf("%c ", node[i]);
            preOrder(leftChild(i, n), n, node);
            preOrder(rightChild(i, n), n, node);
            return 1;
        } else {
            return -1;
        }
    }
    
    public static int postOrder(int i, int n, char[] node){
        if(i != -1) {
            postOrder(leftChild(i, n), n, node);
            postOrder(rightChild(i, n), n, node);
            System.out.printf("%c ", node[i]);
            return 1;
        } else {
            return -1;
        }
    }
    
    public static int leftChild(int i, int n){
        if(2*i<=n) return 2*i; else return -1;
    }
    
    public static int rightChild(int i, int n){
        if(2*i+1<=n) return 2*i+1; else return -1;
    }
}
