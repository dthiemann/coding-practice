
class Node:
	def __init__(self, value=None):
		self.contents = value
		self.next = None
		self.previous = None

	def get_contents(self):
		return self.contents

	def __string__(self):
		return str(self.contents)

class DoublyLinkedList:
	def __init__(self):
		self.head = None
		self.tail = None
		self.size = 0

	def addNode(self, content):
		node = Node(content)
		if self.tail == None:
			self.head = node
			self.tail = node
		else:
			self.tail.next = node
			node.previous = self.tail.next
			self.tail = node
		self.size += 1

	def print_list(self):
		if self.size == 0:
			print("Linked List is empty")
		else:
			currentNode = self.head
			while(currentNode != None):
				print(currentNode.contents)
				currentNode = currentNode.next

	def deleteNode(value):
		

def testList():
	linkedList = DoublyLinkedList()
	linkedList.addNode("dylan")
	linkedList.addNode("Erin")
	linkedList.addNode("asdfa")
	linkedList.print_list()

testList()