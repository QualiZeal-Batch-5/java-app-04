package com.qualizeal.javaapp04.operation;
public class TwoNonDecimalNumbersMultiplication {
public long multiply(int a,int b) {
int result = 0;
if(a<0 || b<0) {
result = -1; }
else if(a == 0 || b == 0) {
result = -2;
} else {
result = a * b; 
}
return result;
}
}