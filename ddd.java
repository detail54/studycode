class CodeRunner{

	public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        
        int[] num = new int[50];
        int sum = 0;
        
        for (int i = 0; i < num.length; i++){
            System.out.print("�迭�� ���� �� �Է�");
            int input = sc.nextInt();
            if(input == -1){
                break;
            } else {
                num[i] = input;   
            }
        }
        System.out.println("[���� ��]");
        System.out.println(Arrays.toString(num));
        
        System.out.println("[���� ��]");
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        
        for (int i = 0; i< num.length; i++){
            sum += num[i];
        }
        System.out.println("�հ�: "+sum);
	}
}

//[������]

//num[0]=23  num[1]=45  num[2]=13  num[3]=50  num[4]=25
//[������]
//num[0]=13  num[1]=23  num[2]=25  num[3]=45  num[4]=50
//�� = xx
