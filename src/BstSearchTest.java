import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BstSearchTest {

    private BinaryTreeNode<Integer> buildTree() {

        BinaryTreeNode<Integer> root = new BinaryTreeNode<>(8);

        root.left = new BinaryTreeNode<>(3);
        root.right = new BinaryTreeNode<>(10);

        root.left.left = new BinaryTreeNode<>(1);
        root.left.right = new BinaryTreeNode<>(6);

        root.right.right = new BinaryTreeNode<>(14);

        return root;
    }

    @Test
    public void testContainsLeftSide() {
        BinaryTreeNode<Integer> root = buildTree();
        assertTrue(BstSearch.contains(root, 6));
    }

    @Test
    public void testContainsRightSide() {
        BinaryTreeNode<Integer> root = buildTree();
        assertTrue(BstSearch.contains(root, 14));
    }

    @Test
    public void testContainsRoot() {
        BinaryTreeNode<Integer> root = buildTree();
        assertTrue(BstSearch.contains(root, 8));
    }

    @Test
    public void testValueNotFound() {
        BinaryTreeNode<Integer> root = buildTree();
        assertFalse(BstSearch.contains(root, 7));
    }

    @Test
    public void testEmptyTree() {
        assertFalse(BstSearch.contains(null, 5));
    }

    @Test
    public void testNullTarget() {
        BinaryTreeNode<Integer> root = buildTree();

        assertThrows(NullPointerException.class, () -> {
            BstSearch.contains(root, null);
        });
    }
}