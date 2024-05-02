Copy code
document.getElementById('scientificForm').addEventListener('submit', function(event) {
  event.preventDefault();
  var input = document.getElementById('scientificNumber').value;
  var result = document.getElementById('result');

  if (isScientificNumber(input)) {
    result.textContent = "Yes, it is a scientific number.";
  } else {
    result.textContent = "No, it is not a scientific number.";
  }
});

function isScientificNumber(input) {
  var scientificNumberRegex = /^[-+]?[0-9]*\.?[0-9]+([eE][-+]?[0-9]+)?$/;
  return scientificNumberRegex.test(input);
}