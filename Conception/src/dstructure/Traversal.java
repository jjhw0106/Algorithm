package dstructure;

public class Traversal {

	void preOrderTraversal() {
	}

	void inOrderTraversal(Node node) {
		if (node == null) {
			return;
		}
		inOrderTraversal(node.left);
		System.out.println(node.value);
		inOrderTraversal(node.right);
	}

	void postOrderTraversal() {

	}
}
