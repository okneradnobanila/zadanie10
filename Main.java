class Main {
  public static void main(String[] args) {
    //System.out.println("Hello world!");
    int[][] mass=new int[10][10];
     
    for (int i=0;i < mass.length;i++){
      for (int j=0;j < mass[i].length;j++){
        mass[i][j]=(int)(Math.random()*10);
      }
     }
      for (int i=0;i < mass.length;i++,System.out.println()){
        for (int j=0;j < mass[i].length;j++){
          System.out.print(mass[i][j]+" ");
        }
      }

    int max;
    max = (int)mass[0][0];
    int max1=0;
    int max2=0;

    for(int i=0; i<mass.length ;i++){
      if(mass[i][i]>max){
        max = (int)mass[i][i];
        max1=i+1;
        max2=i+1;
      }
    }
    if(max1==0 && max2==0){
      max1=1;
      max2=1;
    }
    System.out.print("\nМаксимальный элемент главной диагонали: "+max+", X: "+max1+", Y: "+max2+"\n\n");

    int sum=0;
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        sum=sum+(int)mass[j][i];
      }
      System.out.println("Сумма: "+(i+1)+"-ого столбца: "+sum);
      sum=0;
    }
  } 
}