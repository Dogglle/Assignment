function DescendingSort(arr) {
    const len = arr.length;
  
    for (let i = 0; i < len - 1; i++) {
      for (let j = 0; j < len - 1 - i; j++) {
        if (arr[j] < arr[j + 1]) {
          // Swap elements if they are in the wrong order
          const temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }
  
  const inputArray = [5, 2, 4, 1, 5, 6,10];
  DescendingSort(inputArray);
  console.log(inputArray); // Output: [10, 6,  5, 5, 4, 2, 1]
  