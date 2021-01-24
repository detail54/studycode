class CodeRunner{

	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[50];
        int sum = 0;
        
        for (int i = 0; i < num.length; i++){
            System.out.print("배열에 넣을 수 입력");
            int input = sc.nextInt();
            if(input == -1){
                break;
            } else {
                num[i] = input;   
            }
        }
        System.out.println("[정렬 전]");
        System.out.println(Arrays.toString(num));
        
        System.out.println("[정렬 후]");
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        
        for (int i = 0; i< num.length; i++){
            sum += num[i];
        }
        System.out.println("합계: "+sum);
	}
}

//[정렬전]

//num[0]=23  num[1]=45  num[2]=13  num[3]=50  num[4]=25
//[정렬후]
//num[0]=13  num[1]=23  num[2]=25  num[3]=45  num[4]=50
//합 = xx
