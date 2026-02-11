// 4. Remove duplicate characters

function removeDuplicate(str){
    let result = "";
    for(let i = 0; i < str.length; i++){
        if(!result.includes(str[i])){
            result += str[i];
        }
    }
    return result;
}

const input = "hhaarrssiitt"
console.log(removeDuplicate(input));
console.log(removeDuplicate("aabbccdd")); 