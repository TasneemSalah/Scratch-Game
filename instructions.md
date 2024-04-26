# Home Assignment: Scratch Game #


## Requirements ##

- JDK >= 1.8
- Maven or Gradle
- feel free to choose any libraries for serialize/deserialize JSON and testing
- not recommended to add any additional libraries/frameworks, like spring or other high level frameworks

## Description ##
All mandatory requirements for the Scratch Game assignment have been successfully implemented and tested. 
The solution adheres to the specified guidelines and functionalities outlined in the assignment description.

### Details
- **Implementation**: Implemented functionalities include:
  - Generating a matrix of symbols based on provided probabilities.
  - Evaluating winning combinations against user bets.
  - Calculating rewards based on winning combinations and bonus symbols.
- **Testing**: Unit tests have been developed to ensure correctness and reliability of the solution.
- **CLI Support**: The solution is testable through the CLI using the provided command format.

## Instructions ##

Project can be run from CLI using the following command from the target directory containing the config file.

```bash
 java -jar <your-jar-file> --config config.json --betting-amount 100
```
Project can be run from IDE by replacing the following lines:
```
ScratchGameMain.java
configFile -> replace with configResources highlighted in the code as 'Run from IDE vars'.
bettingAmount -> replace with bet highlighted in the code as 'Run from IDE vars'.
JsonReader.java
writeJsonOutput -> replace with path highlighted as 'Switch path when running from IDE'. 
```
