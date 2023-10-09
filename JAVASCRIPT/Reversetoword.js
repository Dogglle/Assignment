function reverseWordsInSentence(sentence) {
    
    const words = sentence.split(' ');
  
    // Reverse each word and store them in an array
    const reversedWords = words.map(word => {
      
      return word.split('').reverse().join('');
    });
  
    const reversedSentence = reversedWords.join(' ');
  
    return reversedSentence;
  }
  
 
  const inputSentence = "This is a sunny day";
  const reversedSentence = reverseWordsInSentence(inputSentence);
  console.log(reversedSentence); // Output: "sihT si a ynnus yad"
  