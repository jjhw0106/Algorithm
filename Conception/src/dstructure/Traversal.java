package dstructure;

public class Traversal {

	void preOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		System.out.print(node.value+" ");
		preOrderTraversal(node.left);
		preOrderTraversal(node.right);

	}

	void inOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.left);
		System.out.print(node.value+" ");
		inOrderTraversal(node.right);
	}

	void postOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		postOrderTraversal(node.left);
		postOrderTraversal(node.right);
		System.out.print(node.value+" ");
	}
}
