package dstructure;

public class MyBST {
	Node rootNode = null;

	// 노드 추가
	void insert(int element) {
		if (rootNode == null) {				// 루트는 첫 입력값으로 고정됨
			rootNode = new Node(element);
		} else {
			Node head = rootNode;
			Node currentNode;
			while (true) {
				currentNode = head;
				if (head.value > element) {
					head = head.left;
					if (head == null) {
						currentNode.left = new Node(element);
						break;
					}
				} else {
					head = head.right;
					if (head == null) {
						currentNode.right = new Node(element);
						break;
					}
				}
			}
		}
	}

	// 노드 제거
	void remove() {

	}

	// 노드가 트리에 있는지 확인
	void contains() {

	}

	void inOrderPrint(Node root) {
		Traversal traversal = new Traversal();
		traversal.inOrderTraversal(root);
	}
}
