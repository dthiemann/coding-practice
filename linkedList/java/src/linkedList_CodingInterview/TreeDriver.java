package linkedList_CodingInterview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Queue;
import java.util.LinkedList;
import java.util.List;

public class TreeDriver {
	
	public static void addNode(BinaryTreeNode root, int value) {
		if (root.value > value) {
			if (root.left == null)
				root.left = new BinaryTreeNode(value);
			else
				addNode(root.left, value);
		}
		else {
			if (root.right == null)
				root.right = new BinaryTreeNode(value);
			else
				addNode(root.right, value);
		}
	}
	
	public void printTreeLineByLine(BinaryTreeNode tempRoot) {
		Queue<BinaryTreeNode> currentLevel = new LinkedList<BinaryTreeNode>();
		Queue<BinaryTreeNode> nextLevel = new LinkedList<BinaryTreeNode>();
		
		currentLevel.add(tempRoot);
		
		while(!currentLevel.isEmpty()) {
			Iterator<BinaryTreeNode> itr = currentLevel.iterator();
			while (itr.hasNext()) {
				BinaryTreeNode temp = itr.next();
				if (temp.left != null)
					nextLevel.add(temp.left);
				if (temp.right != null)
					nextLevel.add(temp.right);
				System.out.print(temp.value + " ");
			}
			System.out.println();
			currentLevel = nextLevel;
			nextLevel = new LinkedList<BinaryTreeNode>();
		}
	}
	
	public int getTreeDepth(BinaryTreeNode root) {
		if (root == null)
			return 0;
		return Math.max(getTreeDepth(root.left), getTreeDepth(root.right)) + 1;
	}
	
	public boolean isBalanced(BinaryTreeNode root) {
		if (root == null) {
			return false;
		}
		
		int heightLeft = getTreeDepth(root.left);
		int heightRight = getTreeDepth(root.right);
		
		if (Math.abs(heightLeft - heightRight) <= 1) {
			return true;
		} else {
			return isBalanced(root.right) && isBalanced(root.left);
		}
	}
	
	public static BinaryTreeNode createTreeFromSortedList(ArrayList<Integer> myList) {
		return createTreeFromSortedListHelper(myList, 0, myList.size()-1);
	}
	
	public static BinaryTreeNode createTreeFromSortedListHelper(List<Integer> arr, int start, int end) {
		if (end < start) {
			return null;
		}
		
		int mid = (end + start) / 2;
		BinaryTreeNode newNode = new BinaryTreeNode(arr.get(mid));
		
		newNode.left = createTreeFromSortedListHelper(arr, 0, mid - 1);
		newNode.right = createTreeFromSortedListHelper(arr, mid + 1, end);
		
		return newNode;
	}
		

	public static void main(String[] args) {
		TreeDriver driver = new TreeDriver();
		// TODO Auto-generated method stub
		BinaryTreeNode root = new BinaryTreeNode(7);
		driver.addNode(root, 3);
		driver.addNode(root, 6);
		driver.addNode(root, 12);
		driver.addNode(root, 8);
		driver.addNode(root, 9);
		driver.addNode(root, 5);
		driver.addNode(root, 4);
		driver.addNode(root, 2);
		driver.addNode(root, 1);
		
		driver.printTreeLineByLine(root);
		System.out.println("Tree Depth: " + driver.getTreeDepth(root));
		
		System.out.println("Is balanced: " + driver.isBalanced(root));
		
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			myArray.add(i);
		}
		//driver.printTreeLineByLine(createTreeFromSortedList(myArray));
		
		System.out.println("DYNAMIC PROGRAMMING");
		DynamicProgrammingExamples.helper();
	}
}
