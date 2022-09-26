# PROG5001 A1

## Pseudocode
### Algorithm 1

#### F1
- Read textfile
- Store the first line of the csv as unitName
- Ignore the next line as it are the column names
- Loop through remaining lines
- Create a column array to store the column values
- Split all the lines by their comma delimiter, ensure to save empty values as empty strings so they can be filtered out or replaced.
- Store the first 2 values as the studentName
- Store the third value as the studentID
- Store value 3-6 as mark1-3, replace empty strings with 0.0 score

#### F2
- Create function totalMark that adds up three values specified in the arguments for the function.
- Print list of students with their name, student id, assessment marks and the total mark

#### F3
- Get marks threshold from scanner
- Print lines if totalMarks < threshold

#### F4
- For this step I’d have everything stored in a list of arrays or array of arrays and then run

### Algorithm 2
#### F5
- print instructions
- Initiate scanner for user input
- Check if user input is an integer and not higher than 3
- If input is an integer and not higher than 3 execute the correct function depending on user input