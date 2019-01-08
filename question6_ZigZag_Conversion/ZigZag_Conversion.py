def convert(s, numRows):
	"""
	:type s: str
	:type numRows: int
	:rtype: str
	"""
	if numRows == 1 or numRows >= len(s):
		return s

	resultlist = [""] * numRows
	listlength = len(s)
	#direction = 0 means going down, 1 means going up
	direction = 0
	i=0
	for y in s:
		if i == 0:
			direction = 0
		elif i == numRows-1:
			direction = 1
		resultlist[i]+= y
		if direction == 0:
			i += 1
		elif direction == 1:
			i += -1
	#print(resultlist)
	result = ''.join(resultlist)
	return result

convert("PAYPALISHIRING",3)
convert("PAYPALISHIRING",4)