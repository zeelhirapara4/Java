import org.gvp.dcs.ds.queue;
import org.gvp.dcs.shapes.cube;
import org.gvp.dcs.shapes.sphere;
import org.gvp.dcs.ds.stack;

import java.util.*;

public class PR16 {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        int choice, size;
        x:while (true) {

            System.out.println("1.stack operations");
            System.out.println("2.Queue operations");
            System.out.println("3.Sphere operations");
            System.out.println("4.Cube operations");

            System.out.println("Enter your choice:");
            choice = sn.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter size of array");
                    size = sn.nextInt();
                    stack s = new stack(size);

                    while (true) {

                        System.out.println("1.Push");
                        System.out.println("2.Pop");
                        System.out.println("3.Display");
                        System.out.println("4.Exit");
                        choice = sn.nextInt();

                        switch (choice)
                         {
                            case 1:

                                System.out.println("Enter value:");
                                int value = sn.nextInt();
                                s.push(value);
                                break;
                            case 2:
                                  s.pop();
                                  break;
                            case 3:
                                 s.traverse();
                                 break;
                            case 4:
                                  continue x;

                            default:
                                break;
                        }
                     }
                case 2:
             
                    System.out.println("Enter size of queue");
                    size = sn.nextInt();
                    queue q=new queue(size);

                    while (true) {

                        System.out.println("1.Insert");
                        System.out.println("2.Remove");
                        System.out.println("3.Display");
                        System.out.println("4.Exit");
                        choice = sn.nextInt();

                        switch (choice)
                        {
                            case 1:

                                System.out.println("Enter value:");
                                int value = sn.nextInt();
                                q.insert(value);
                                break;
                            case 2:
                                q.rem();
                                break;
                            case 3:
                                q.display();
                                break;
                            case 4:
                                continue x;

                            default:
                                break;
                        }
                    }
                
                case 3:
              
                    System.out.println("Enter size of radius");
                    size = sn.nextInt();
                    sphere sp=new sphere(size);

                    while (true) {

                        System.out.println("1.Volum");
                        System.out.println("2.Diameter");
                        System.out.println("3.Surfacearea");
                        System.out.println("4.Exit");
                        choice = sn.nextInt();

                        switch (choice)
                        {
                            case 1:
                                System.out.println("Volum of Sphere:"+sp.volume());
                                break;
                            case 2:
                                System.out.println("Diameter of Sphere:"+sp.diameter()); 
                                break;
                            case 3:
                                System.out.println("Surface Area of Sphere:"+ sp.surfacearea());
                                break;
                            case 4:
                                continue x;

                            default:
                                break;
                        }
                    }

                case 4:
              
                    System.out.println("Enter value of 'a' ");
                    size = sn.nextInt();
                    cube cb=new cube(size);

                    while (true) {

                        System.out.println("1.Volum");
                        System.out.println("2.Surface Area");
                        System.out.println("3.Exit");
                    
                        choice = sn.nextInt();

                        switch (choice)
                        {
                            case 1:
                                System.out.println("volum of cube:"+cb.volum());
                                break;
                            case 2:
                                System.out.println("Surface Area of cube:"+cb.surfacearea()); 
                                break;
                            case 3:
                                continue x;

                            default:
                                break;
                        }
                    }
                    
                    

                    default:
                        break;
                }
            }

        }
    }