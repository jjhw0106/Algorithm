package dstructure;

public class MyBST {
	Node rootNode = null;

	// 노드 추가
	void insert(int element) {
		if (rootNode == null) { // 루트는 첫 입력값으로 고정됨
			rootNode = new Node(element);
		} else {
			Node head = rootNode; // while문 돌면서 head는 항상 rootNode부터 탐색할 수 있게끔
			Node currentNode;
			while (true) {
				currentNode = head;
				if (head.value > element) {
					System.out.println("cur1: " + currentNode);
					head = head.left;
					System.out.println("cur2: " + currentNode);

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

	void preOrderPrint(Node root) {
		Traversal traversal = new Traversal();
		traversal.preOrderTraversal(root);
	}

	void postOrderPrint(Node root) {
		Traversal traversal = new Traversal();
		traversal.postOrderTraversal(root);
	}
}
