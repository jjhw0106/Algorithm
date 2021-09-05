# 1. 선택 정렬
## ㅇ **Concept** 
- 주어진 배열에서 특정 기준값(MAX or MIN)을 탐색 후  배열의 끝에서부터 정렬
- 평균 : O(n^2),  최악 : O(n^2),  안정성 : X
## ㅇ **구현 Steps**
1. for문의 현재위치 i부터 arr.length 중 가장 작은 값을 찾음
2. i번 째 배열요소와 arr[minIdx]의 요소를 swap해줌
## ㅇ **Code**
```java
void selectionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        int minIdx = utils.findMinIdx(nums, i);
        utils.swap(nums, i, minIdx);
    }
}
```
___
<BR><BR>


# 2. 삽입 정렬
## ㅇ **Concept**
- 주어진 배열의 요소를 제 위치에 삽입하고 그 뒤의 요소들을 한 칸씩 뒤로 이동
- 평균 : O(n^2),  최악 : O(n^2),  안정성 : O
## ㅇ **구현 Steps**
1. 첫 번째 배열 요소는 비교 대상이 없으므로 0번째 idx에 위치
1. for문의 현재위치 i를 target에 저장한다.
1. while문을 돌며 arr[target]과 arr[target-1]을 비교하여 target의 값이 더 작으면 swap하고 target-- 한다.
1. arr[target]>=arr[target-1]일 경우 while문 break 하고 for문의 다음을 수행한다.
## ㅇ **Code**
```java
void insertionSort(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        int target = i;
        while (target != 0 && nums[target] < nums[target - 1]) {
            utils.swap(nums, target - 1, target);
            target--;
        }
    }
}
```
___
<BR><BR>


# 3. 버블 정렬
## ㅇ **Concept**
- 컴퓨터적인 비교방식이며, 거품이 퍼져 나가듯 인접한 인자들 간의 반복 비교로 정렬을 한다.
- 배열의 끝에서부터 정렬이 된다.
- 평균 : O(n^2), 최악 : O(n^2), 안정성 : O
## ㅇ **구현 Steps**
1. 현재 위치 j의 값과 j+1의 값을 비교하여 정렬한다.
1. j++ 후 반복
1. 단, 내부 for문을 한바퀴 돌면 가장 큰 값이 배열의 끝에 위치하기 때문에 j의 범위는 [0 ~ arr.length-1-i] 까지이다.
## ㅇ **Code**
```java
void bubbleSort(int[] nums) {
    for (int i = 0; i < nums.length - 1; i++) {
        for (int j = 0; j < nums.length - i - 1; j++) {
            if (nums[j] > nums[j + 1]) {
                utils.swap(nums, j, j + 1);
            }
        }
    }
}
```
___
<BR><BR>


# 4. 퀵 정렬
## ㅇ **Concept**
- 보통의 경우 가장 빠르며 보편적으로 쓰이는 정렬
- pivot은 주로 첫번째값, 끝값, 중간값 중 선택
- pivot보다 작은 값은 왼쪽, 큰 값은 오른쪽으로 이동시키는 과정을 분할&반복하여 정렬
- 평균 : O(NlogN), 최악 : O(n^2), 안정성 : X
## ㅇ **구현 Steps**
1. pivot값 선정(주어진 배열의 가장 오른쪽 값)
1. 주어진 배열의 가장 왼쪽값 left를 변수 i에 담는다.
1. left부터 시작한 현재위치 j의 값과 pivot을 비교하여 arr[j]가 더 작으면 i의 값과 j의 값을 swap하고 i++
1. 주어진 배열의 끝(right)까지 위의 과정을 반복 후 pivotIdx에 i를 저장한다.
1. arr[pivotIdx]와 arr[right]를 swap하면 한바퀴 끝.
1. 분할된 각각의 배열에 대해 위 과정을 반복한다.
## ㅇ **Code**
```java
void quickSort(int[] nums, int left, int right) {
    int pivot = nums[right];

    int i = left;
    for (int j = left; j < right; j++) {
        if (nums[j] < pivot) {
            utils.swap(nums, i, j);
            i++;
        }
    }

    int pivotIdx = i;
    utils.swap(nums, pivotIdx, right);
    quickSort(nums, left, pivotIdx);
    quickSort(nums, pivotIdx, right);
}
```
___
<BR><BR>


# 5. 병합 정렬
## ㅇ **Concept**
- 정렬된 배열을 합치며 정렬
- 크기가 1인 배열은 이미 정렬된 배열이라 볼 수 있다.
- 평균 : 평균: O(NlogN), 최악 : O(NlogN), 안정성 : O
## ㅇ **구현 Steps**
1. 분할하여 정렬한 뒤 병합한 배열을 담을 배열을 선언해준다(전역으로 선언해야함)
1. 매개변수로 배열과 배열의 시작값, 중간값, 끝값을 받는다.
1. mergeSort()의 재귀호출을 통해 배열을 1/2씩 쪼개며 배열의 크기가 1이 될때까지 depth를 들어간다.
1. merge()를 하며 정렬된 두 배열을 병합하며 동시에 정렬을 시행한다.

## ㅇ **Code**
```java
int sorted[] = new int[Controller.nums.length];
void mergeSort(int[] nums, int m, int n) { // m = 시작값, n = 끝값
    if (m < n) {
        int middle = (m + n) / 2;
        mergeSort(nums, m, middle);
        mergeSort(nums, middle + 1, n);

        utils.merge(nums, m, middle, n); // 합병과 동시에 정렬
    }
}
public void merge(int arr[], int m, int middle, int n) {
    int i = m;
    int j = middle + 1;
    int k = m;

    while (i <= middle && j <= n) {
        if (arr[i] < arr[j]) {
            sorted[k] = arr[i];
            i++;
        } else {
            sorted[k] = arr[j];
            j++;
        }
        k++;
    }
    if (i > middle) {
        for (int t = j; t <= n; t++) {
            sorted[k++] = arr[t];
        } 
    } else {
        for(int t=i; t<=middle; t++) {
            sorted[k++] = arr[t];
        }
    }
    for(int t=m; t<=n; t++) {
        arr[t]=sorted[t];
    }
}
```
___
<BR><BR>


# 6. 힙 정렬
## ㅇ **Concept**
- 우선순위 큐를 위해 만들어진 정렬
- 힙에 배열을 넣었다가 빼면 정렬이 된 상태로 나온다.
- 트리 구조의 최상위 조상에 가장 큰 값이 오게끔 swap 후 해당 node를 빼서 배열의 끝부터 정렬한다.
- 평균 : 평균: O(NlogN), 최악 : O(NlogN), 안정성 : X
## ㅇ **구현 Steps**
1. 우선순위 큐(priorityQueue)에 전달받은 배열을 저장한다.
1. 임의의 배열 sorted[]에 poll()을 통해 값을 저장한다.<br>(배열의 끝부터 저장하지 않는 이유: priorityQueue의 우선순위가 다르기 때문)
1. 기존의 배열 arr에 sorted의 값을 저장
## ㅇ **Code**
```java
void heapSort(int[] nums) {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
    int[] sorted = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
        maxHeap.add(nums[i]);
    }
    for (int i = 0; i < nums.length; i++) {
        sorted[i] = maxHeap.poll();
    }
    for (int i = 0; i < nums.length; i++) {
        nums[i] = sorted[i];
    }
}
```
___
