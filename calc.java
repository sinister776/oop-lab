class calc {

    public static void main(String[] args) {

    	int num1, num2,deci;
        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);
        deci=Integer.parseInt(args[2]);
        int output;

        switch(deci)
        {
            case 1:
            	output = num1 + num2;
                break;

            case 2:
            	output = num1 - num2;
                break;

            case 3:
            	output = num1 * num2;
                break;

            case 4:
            	output = num1 / num2;
                break;
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(output);
    }
}