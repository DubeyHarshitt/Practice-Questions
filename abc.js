const input = "10:20:3@";

function ans(h, m, s) {
  return h + ":" + m + ":" + s;
}

function fixClock(input) {
  let second = input.substr(6, 2);
  let minute = input.substr(3, 2);
  let hour = input.substr(0, 2);

  let minAns = "";
  let maxAns = "";

  if (second[1] === "@") {
    minAns = ans(hour, minute, second.replace("@", "0"));
    maxAns = ans(hour, minute, second.replace("@", "9"));
  }
  console.log(minAns);
  console.log(maxAns);
}

fixClock(input);
