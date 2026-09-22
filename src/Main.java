void main() {
int startingBalance = 5000;
double interestRate = 0.17;
double interestMonth1 = 0;
double interestMonth2 = 0;
double month1Cost = 0;
double month2Cost = 0;

interestMonth1 = interestRate * startingBalance;
month1Cost = startingBalance + interestMonth1;
interestMonth2 = interestRate * month1Cost;
month2Cost = month1Cost + interestMonth2;

System.out.println("The balance after one month will be " + month1Cost + " and then after two months it will be " + month2Cost);


}
