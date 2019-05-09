import java.util.Scanner;
import java.util.ArrayList;

public class yazilimproject
{
    ArrayList<Integer> marks=new ArrayList();
    float result=0;
    public yazilimproject(ArrayList<Integer> ornek)
    {
        marks=ornek;
        float result= calculateAverage();
        System.out.println("sonuc"+result);
    }
    public yazilimproject()
    {

    }
    public float calculateAverage() {
        result=0;
        int sum=0;
        if(!marks.isEmpty()) {
            for (Integer mark : marks) {
                sum += mark;
            }
            return result=(float) (sum/ marks.size());
        }
        return result;
    }
    public float sonucDon()
    {
        return  result;
    }
    public static void main(String[] args)
    {
        ArrayList<Integer> exampleList = new ArrayList<Integer>();
        String answer = "";
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Please enter your number: ");
            exampleList.add(scanner.nextInt());
            System.out.println("Do you want to continue yes/no?");
            answer = scanner.next();
        } while (answer.equals("yes"));

        yazilimproject example= new yazilimproject(exampleList);

    }
}