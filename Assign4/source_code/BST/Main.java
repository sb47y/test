package BST;

public class Main<T extends Comparable> implements BSTInterface<T> {
	private class Node<T extends Comparable> {
		private T value;
		private Node<T> left, right;

		public Node() {
			left = null;
			right = null;
		}
	}

	public static final int INORDER = 0;
	public static final int PREORDER = 1;
	public static final int POSTORDER = 2;
	private LinkedQueue<T> inOrderQueue, preOrderQueue, postOrderQueue;
	private Node<T> root;

	public Main() {
		root = null;
	}

	@Override
	public boolean isEmpty() {
		return (root == null);
	}

	@Override
	public boolean isFull() {
		return false;
	}

	@Override
	public int size() {
		return recSize(root);
	}

	private int recSize(Node root) {
		if (root == null) {
			return 0;
		} else {
			return recSize(root.left) + recSize(root.right) + 1;
		}
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public void add(T element) {
		root = recAdd(element, root);

	}

	private Node recAdd(T element, Node root) {
		if (root == null) {
			root = new Node<T>();
			root.value = element;
		}
		else if (element.compareTo(root.value) > 0)
				return recAdd(element, root.right);
		else
			return recAdd(element, root.right);
		return root;
	}

	@Override
	public boolean contains(T element) {
		return recContains(element, root);
	}

	private boolean recContains(T element, Main<T>.Node<T> root2) {
		if (root == null) return false;
		else if (element.compareTo(root.value) < 0)
			return recContains(element, root.left);
		else if (element.compareTo(root.value) > 0)
			return recContains(element, root.right);
		else return false;
	}

	@Override
	public void remove(T element) {
		// TODO Auto-generated method stub

	}

	@Override
	public void reset(int order) {
		// TODO Auto-generated method stub

	}

	@Override
	public T getNext(int order) {
		// TODO Auto-generated method stub
		return null;
	}

}
