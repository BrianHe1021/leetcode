def reverse(x):
	"""
	:type x: int
	:rtype: int
	"""
	if x ==0:
		return x

	positive = 1
	if x < 0:
		positive = 0
		x = -x
	stringx = str(x)
	stringx = stringx[0:][::-1]
	result = int(stringx)
	if result >  0x7fffffff:
		result = 0
	if positive == 0:
		result = -result
	return result
		
	print(result)
		
reverse(123)