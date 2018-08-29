package student;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class StudentTest {
        @Test
         public void testInfo() {
            Student andy = new Student("Andy", 23);

            String expected = "Student {" +
                    "name = '" + "Andy'"  +
                    ", age = " + "23" +
                    '}';
            String result = andy.getInformation();
            assertEquals(expected, result);

        }
        @Test
        public void testAdd() {
           Student andy = new Student("AndySon", 23);
           StudentManager studentManager = new StudentManager();
           studentManager.add(andy);

            String expected = "Student {" +
                    "name = '" + "AndySon'"  +
                    ", age = " + "23" +
                    '}';
            String result = andy.getInformation();
            assertEquals(expected, result);
        }

        @Test
         public void testDislayAll1() {
            Student andy = new Student("Andy", 23);
            StudentManager studentManager = new StudentManager();
            studentManager.add(andy);
            System.out.println("added " + andy.getInformation());
            studentManager.displayAll();

            int expected = 1;
            int result = studentManager.getSize();
            assertEquals(expected, result);
        }

        @Test
        public void testDisplayAll() {
            StudentManager studentManager = new StudentManager();
            studentManager.displayAll();

            Student andy = new Student("Andy", 23);
            studentManager.add(andy);
            System.out.println("added " + andy.getInformation());
            studentManager.displayAll();

            Student booby = new Student("Booby", 25);
            studentManager.add(booby);
            System.out.println("added " + booby.getInformation());
            studentManager.displayAll();

            Student samy = new Student("Samy", 22);
            studentManager.add(samy);
            System.out.println("added " + samy.getInformation());
            studentManager.displayAll();

            int expected = 3;
            int result = studentManager.getSize();
            assertEquals(expected, result);
        }

        @Test
        public void testFind() {
            StudentManager studentManager = new StudentManager();
            Student andy = new Student("Andy", 23);
            studentManager.add(andy);
            System.out.println("added " + andy.getInformation());
            studentManager.displayAll();

            Student booby = new Student("Booby", 25);
            studentManager.add(booby);
            System.out.println("added " + booby.getInformation());
            studentManager.displayAll();

            Student samy = new Student("Samy", 22);
            studentManager.add(samy);
            System.out.println("added " + samy.getInformation());
            studentManager.displayAll();
            studentManager.find("Andy");

            String expected = "2";
            String result = "2";
            assertEquals(expected, result);
        }

    }
