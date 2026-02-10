function reverseString(input) {
  let reversed = "";
  for (let i = (input.length - 1); i >= 0; i--) {
    reversed = reversed + input[i];
  }
  return reversed;
}

const input = process.argv[2] || "Harshit";
console.log(reverseString(input));

// console.log(reverseString(input));
