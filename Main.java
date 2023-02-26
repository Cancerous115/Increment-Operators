class Main{
  public static void main(String[]args){
    int score= 0;
    int turns=50;
    int space=10;

    score++;
    turns --;
    System.out.println(score);
    System.out.println(turns);
    //We can put ++ to add 1,but we will bneed to print again to get the addition answer.We can use (space++) and print again (space) for 11, or just put (++space) so it adds and we get the answer immediately. 
    System.out.println(++space);
    System.out.println(space); 
  }
}