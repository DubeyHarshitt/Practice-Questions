// 5. Capitalize words

// Input: "hello world harshit"
// Output: "Hello World Harshit"

// ✅ Lowercase → Uppercase
// upper = charCode - 32

// ✅ Uppercase → Lowercase
// lower = charCode + 32

// Char	ASCII
// Space " "	32

// "b".charCodeAt(0);     // 98
// String.fromCharCode(65); // "A"

function capitalizeWords(str) {
    let result = "";
    let isNewWord = true;

    for (let i = 0; i < str.length; i++) {
        let ch = str[i];

        // If space, next character will start a new word
        if (ch === " ") {
            result += ch;
            isNewWord = true;
        } 
        else {
            // Capitalize first letter of each word manually
            if (isNewWord && ch >= 'a' && ch <= 'z') {
                let capitalChar = String.fromCharCode(ch.charCodeAt(0) - 32);
                result += capitalChar;
                isNewWord = false;
            } 
            else {
                result += ch;
                isNewWord = false;
            }
        }
    }

    return result;
}


const input =  "hello world harshit";
console.log(capitalizeWords(input));