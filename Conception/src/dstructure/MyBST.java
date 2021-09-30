package dstructure;

public class MyBST {
	Node rootNode = null;

	// 노드 추가
	void insert(int element) {
		if (rootNode == null) {				// 루트는 첫 입력값으로 고정됨
			rootNode = new Node(element);
		} else {
			Node head = rootNode;			// while문 돌면서 head는 항상 rootNode부터 탐색할 수 있게끔
			Node currentNode;				
			while (true) {
<<<<<<< HEAD
				currentNode = head;
				if (head.value > element) {
					System.out.println("cur1: "+currentNode);
					head = head.left;
					System.out.println("cur2: "+currentNode);
					
					if (head == null) {
=======
				currentNode = head;			// q. currentNode가 head의 주소를 가리키면 head가 head.left로 변경했을 시
				if (head.value > element) {	// currentNode도 head.left의 주소를 가리키게 되는 것이 아닌지?
					head = head.left;		// a. (추측) currentNode = head에서 head의 주소를 복사하여 대입받은 것이기 때문에, 
					if (head == null) {		// head가 head.left로 변경되더라도 currentNode는 그 주소를 따라가지 않는다.
>>>>>>> bde1cbd29957b0d93fc76c988a30473d4625aeae
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
