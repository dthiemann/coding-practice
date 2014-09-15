def space_replace(sentence):
	return sentence.replace(" ", "%20")

def space_replace2(sentence):
	newString = ""
	for element in sentence:
		if element == " ":
			newString += "%20"
		else:
			newString += element
	return newString

print(space_replace2("Hello from space :-)"))