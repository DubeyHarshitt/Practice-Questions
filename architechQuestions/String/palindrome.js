// 2. Check palindrome

function checkPalindrome(str){
    let i=0;
    let j= str.length-1;
    while(i<j){
        if(str[i] === str[j]){
            i++;
            j--;
        }
        else{
            return "The String not is Palindrome";
        }
    }
    return "The String is Palindrome";
}

const input = "madam"
console.log(checkPalindrome(input));
console.log(checkPalindrome("harshit"));
console.log(checkPalindrome("tot"));