/**
 * Project name(项目名称)：作业 super关键字
 * Package(包名): PACKAGE_NAME
 * Class(类名): superTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/12
 * Time(创建时间)： 18:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class superTest
{
    public static void main(String[] args)
    {
        // 实例化一个Student类的对象s，为Student对象s中的school赋值，打印输出信息
        /********* begin *********/
        Student s = new Student("张三", 18);
        s.setSchool("哈佛大学");
        System.out.println("姓名：" + s.getName() + "，年龄：" + s.getAge() + "，学校：" + s.getSchool());
        /********* end *********/
    }
}

class Person
{
    /********* begin *********/
    private String name;
    private int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }


    /********* end *********/
}

class Student extends Person
{
    private String school;

    Student(String name, int age)
    {
        super(name, age);
    }

    public String getSchool()
    {
        return school;
    }

    public void setSchool(String school)
    {
        this.school = school;
    }
    /********* begin *********/

    /********* end *********/
}

