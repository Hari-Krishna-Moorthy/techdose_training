



### Q1.
**Average case time complexity of quicksort?**

 - [ ] A.  O(n)
 - [ ] B.  O(n log n)  
 - [ ] C.  O(n^2)  
 - [ ] D.  O(n^3)

----------

### Q2.
**Worst case time complexity of quicksort?**

 - [ ] A.  O(n)  
 - [ ] B.  O(nlogn)  
 - [ ] C.  O(n2)  
 - [ ] D.  O(n3)

----------

### Q3.

**Time complexity of binary search?**

 - [ ] A.  O(1)  
 - [ ] B.  O(logn)  
 - [ ] C.  O((log n)^2)  
 - [ ] D.  O(n)

----------

### Q4.

```
def f()
	ans = 0
	for i = 1 to n:
		for j = 1 to log(i):
			ans += 1
	print(ans)
```

**Time Complexity of this program:**

 - [ ] A.  O(n)  
 - [ ] B.  O(n log n)  
 - [ ] C.  O(n^2)
 - [ ] D.  O(n^3)

----------

### Q5.

```
def f():
	a = 0
	for i = 1 to n:
		a += i;
	b = 0
	for i = 1 to m:
		b += i;

```

**Time Complexity of this program:**

 - [ ] A.  O(n) 
 - [ ] B.  O(m) 
 - [ ] C.  O(n + m)
 - [ ] D.  O(n * m)

----------

### Q6.

```
def f():
	a = 0
	for i = 1 to n:
		a += random.randint();			
		b = 0
		for j = 1 to m:
			b += random.randint();

```

**Time Complexity of this program:**

 - [ ] A.  O(n)  
 - [ ] B.  O(m)
 - [ ] C.  O(n + m)  
 - [ ] D.  O(n * m)

----------

### Q7.

```
def f():
	int a[n][n]
	// Finding sum of elements of a matrix that are above or on the diagonal.
	sum = 0
	for i = 1 to n:
		for j = i to n:
			sum += a[i][j]
	print(sum)

```

**Time Complexity of this program:**

 - [ ] A.  O(n)  
 - [ ] B.  O(n log n)  
 - [ ] C.  O(n^2)  
 - [ ] D.  O(n^3)

----------

### Q8.

```
def f():
	int a[n][n]
	sum = 0
	// Finding sum of elements of a matrix that are strictly above the diagonal.
	for i = 1 to n:
		for j = i to n:
			sum += a[i][j]
	print(sum)
	
	for i = 1 to n:
		sum -= a[i][i]

```

**Time Complexity of this program:**

 - [ ] A.  O(n)
 - [ ] B.  O(n log n) 
 - [ ] C.  O(n^2)
 - [ ] D.  O(n^3)

----------

### Q9.

```
def f():
	ans = 0
	for i = 1 to n:
		for j = n to i:
			ans += (i * j)
	print(ans)

```

**Time Complexity of this program:**

 - [ ] A.  O(n)
 - [ ] B.  O(n log n)
 - [ ] C.  O(n^2)  
 - [ ] D.  O(n^3)

----------

### Q10.

```
def f():
	int a[N + 1][M + 1][K + 1]
	sum = 0
	for i = 1 to N:
		for j = i to M:
			for k = j to K:
				sum += a[i][j]
	print(sum)

```

**Time Complexity of this program:**

 - [ ] A.  O(N + M + K)
 - [ ] B.  O(N * M * K)
 - [ ] C.  O(N * M + K)
 - [ ] D.  O(N + M * K)

----------

### Q11.

```
def f(n):
	ans = 0
	while (n > 0):
		ans += n
		n /= 2;
	print(ans)

```

**Time Complexity of this program:**

 - [ ] A.  O(log n) 
 - [ ] B.  O(n)  
 - [ ] B.  O(n log n)  
 - [ ] C.  O(n^2)

----------

### Q12.

```
// Find the sum of digits of a number in its decimal representation.
def f(n):
	ans = 0
	while (n > 0):
		ans += n % 10
		n /= 10;
	print(ans)

```

**Time Complexity of this program:**

 - [ ] A.  O(log_2 n) 
 - [ ] B.  O(log_3 n)  
 - [ ] C.  O(log_(10)  
 - [ ] D.  O(n)

----------

### Q13.

```
def f():
	ans = 0
	for (i = n; i >= 1; i /= 2):
		for j = m to i:
			ans += (i * j)
	print(ans)

```

**Time Complexity of this program:**

 - [ ] A.  O(n + m)
 - [ ] B.  O(n * m)  
 - [ ] C.  O(m log n)  
 - [ ] D.  O(n log m)

----------

### Q14.

```
def f():
	ans = 0
	for (i = n; i >= 1; i /= 2):
		for (j = 1; j <= m; j *= 2)
			ans += (i * j)
	print(ans)

```

**Time Complexity of this program:**

 - [ ] A.  O(n * m)  
 - [ ] B.  O(log m log n) 
 - [ ] C.  O(m log n)
 - [ ] D.  O(n log m)

----------

### Q15.

```
// Finding gcd of two numbers a, b.
def gcd(a, b):
	if (a < b) swap(a, b)
	if (b == 0) return a;
	else return gcd(b, a % b)

```

**Time Complexity of this program:**

Let  n = max(a, b)  n=max(a,b)

 - [ ] A.  O(1)
 - [ ] B.  O(log n)  
 - [ ] C.  O(n)  
 - [ ] D.  O(n^2)

----------

### Q16.

```
// Binary searching in sorted array for finding whether an element exists or not.
def exists(a, x):
	// Check whether the number x exists in the array a.
	lo = 0, hi = len(a) - 1
	while (lo <= hi):
		mid = (lo + hi) / 2
		if (a[mid] == x): return x;
		else if (a[mid] > x): hi = mid - 1;
		else lo = mid + 1;
	return -1; // Not found.

```

**Time Complexity of this program:**

Let  n = len(a)n=len(a)

 - [ ] A.  O(1)  
 - [ ] B.  O(log n)  
 - [ ] C.  O(n)  
 - [ ] D.  O(n^2)

----------

### Q17.

**// Given a sorted array a, find the number of occurrence of number x in the entire array.**

```
def count_occurrences(a, x, lo, hi):
	if lo > hi: return 0
	mid = (lo + hi) / 2;
	if a[mid] < x: return count_occurrences(a, x, mid + 1, hi)
	if a[mid] > x: return count_occurrences(a, x, lo, mid - 1)
	return 1 + count_occurrences(a, x, lo, mid - 1) + count_occurrences(a, x, mid + 1, hi)

// in the main function, we call it as
count_occurrences(a, x, 0, len(a) - 1)

```

**Time Complexity of this program:**

Let  n = len(a)n=len(a)

 - [ ] A.  O(1)
 - [ ] B.  O(log n)
 - [ ] C.  O(n)  
 - [ ] D.  O(n^2)
	
----------

### Q18.

```
// Finding fibonacci numbers.
def f(n):
	if n == 0 or n == 1: return 1
	return f(n - 1) + f(n - 2)

```

**Time Complexity of this program:**

 - [ ] A.  O(logn)  
 - [ ] B.  O(n)  
 - [ ] C.  O(n2)  
 - [ ] D.  O(2n)

----------

### Q19.

```
Create array memo[n + 1]

// Finding fibonacci numbers with memoization.

def f(n):
	if memo[n] != -1: return memo[n]
	if n == 0 or n == 1: ans = 1
	else: ans = f(n - 1) + f(n - 2)
	memo[n] = ans
	return ans

// In the main function.
Fill the memo array with all values equal to -1.
ans = f(n)

```

**Time Complexity of this program:**

 - [ ] A.  O(logn)  
 - [ ] B.  O(n)  
 - [ ] C.  O(n2)  
 - [ ] D.  O(2n)

----------

### Q20.

```
def f(a):
	n = len(a)
	j = 0
	for i = 0 to n - 1:
		while (j < n and a[i] < a[j]):
			j += 1

```

**Time Complexity of this program:**

 - [ ] A.  O(logn)  
 - [ ] B.  O(n)  
 - [ ] C.  O(nlogn)  
 - [ ] D.  O(n2)

----------

### Q21.

```
def f():
	ans = 0
	for i = 1 to n:
		for j = i; j <= n; j += i:
			ans += 1
	print(ans)

```

**Time Complexity of this program:**

 - [ ] A.  O(logn)   
 - [ ] B.  O(n)   
 - [ ] C.  O(nlogn)   
 - [ ] D.  O(n2)

-----

### ANSWER

 - 1 b   
 - 2 c   
 - 3 b  
 - 4 b   
 - 5 c   
 - 6 d   
 - 7 c  
 - 8 c  
 - 9 c  
 - 10 b
 - 11 a  
 - 12 c   
 - 13 c   
 - 14 b   
 - 15 b   
 - 16 b   
 - 17 b   
 - 18 d   
 - 19 b   
 - 20 b   
 - 21 a
