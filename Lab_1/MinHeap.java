public class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;
    public MinHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        heap = new int[capacity];
    }
    private int parent(int i) {
        return (i - 1) / 2;
    }
    private int leftChild(int i) {
        return 2 * i + 1;
    }
    private int rightChild(int i) {
        return 2 * i + 2;
    }
        private void heapify(int i) {
        int smallest = i;
        int left = leftChild(i);
        int right = rightChild(i);
        if (left < size && heap[left] < heap[smallest]) {
            smallest = left;
        }
        if (right < size && heap[right] < heap[smallest]) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }
        public boolean insert(int value) {
        if (size == capacity) {
            return false; 
        }
        heap[size] = value;
        int index = size;
        size++;
        while (index > 0 && heap[parent(index)] > heap[index]) {
            swap(index, parent(index));
            index = parent(index);
        }
        return true;
    }
    public int extractMin() {
        if (size == 0) {
            return Integer.MAX_VALUE; 
        }
        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapify(0);

        return min;
    }
    public int getMin() {
        if (size == 0) {
            return Integer.MAX_VALUE; 
        }
        return heap[0];
    }
    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public void printHeap() {
        for (int i = 0; i < size; i++) {
            System.out.print(heap[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MinHeap minHeap = new MinHeap(10);
        System.out.println("Inserting 10: " + minHeap.insert(10)); 
        System.out.println("Inserting 20: " + minHeap.insert(20)); 
        System.out.println("Inserting 5: " + minHeap.insert(5)); 
        System.out.println("Inserting 30: " + minHeap.insert(30)); 
        System.out.println("Inserting 15: " + minHeap.insert(15)); 
        System.out.println("Inserting 40 (Heap full): " + minHeap.insert(40)); 
        System.out.println("Min Heap: ");
        minHeap.printHeap();
        System.out.println("Extracted Min: " + minHeap.extractMin());
        System.out.println("Min Heap after extraction: ");
        minHeap.printHeap();
        System.out.println("Current Min: " + minHeap.getMin());
        minHeap.extractMin();
        minHeap.extractMin();
        minHeap.extractMin();
        minHeap.extractMin();
        System.out.println("Extract from empty heap: " + minHeap.extractMin()); 
    }
}
