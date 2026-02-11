// 3. Count vowels or characters

function countVowel(str){
    let count=0; 
    for(i=0; i<str.length; i++){
        let ch = str[i];
        if(ch==='a'||ch==='e'||ch==='i'||ch==='0'||ch==='u'){
            count++;
        }
    }
    return "The Vowel count is "+count;
}

const input = "aeiou"
console.log(countVowel(input));
console.log(countVowel("harshit"));