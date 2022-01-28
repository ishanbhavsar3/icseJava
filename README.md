

# All Java programs for CISCE students
[![LICENSE](https://img.shields.io/badge/license-MIT-blue.svg)](t.ly/u6LW)
<img src="https://madewithlove.now.sh/in?text=+India" alt="Made with love in  India">
[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/ishanbhavsar3/icseJava/commit-activity)
![Maintainer](https://img.shields.io/badge/maintainer-Ishan-blue)
[![GitHub commits](https://badgen.net/github/commits/ishanbhavsar3/icseJava)](https://GitHub.com/ishanbhavsar3/icseJava/commit/)



This repository is aimed at providing the students of computer applications at a school affiliated with the CISCE board in India, UAE, Singapore, Thailand & Indonesia, with all the types of java programs  which are included in the syllabus for learning / educational purposes. The programs can be commented upon and edited by simple pull requests which shall be approved by the administrator.


## For the geeky users.
To run java code on your device you shall need the JDK, JRE and JVM installed and running on the computer.

Most of the modern day devices come with th [JDK ( Java Development Kit )](https://www.geeksforgeeks.org/jdk-in-java/) installed which consists of the [Java Runtime Environment ( JRE )](https://geeksforgeeks.org/jre-in-java/) and [Java Virtual Machine ( JVM )](https://www.geeksforgeeks.org/jvm-works-jvm-architecture/) built into it, but if your device does not contain it, or is quite old & you're unaware about it, you can click the link [here](https://www.oracle.com/java/technologies/downloads/) to get redirected to a download page from where you can download and install the JDK for your device, based on your device's architecture which you can find in the system info.

## how to use the programs: 
 
You can simply search up a program you need, open up the source code, copy the same and  further paste it into a text editor. It should be noted that you have to save the file with the following file extension:

```java
.java
```

You need to get to the 'save as' of the text editor & save the file with this extension only to be able to run it with the help of Windows CMD / Linux Terminal / Mac Terminal.



## execution:  how to

for me, in Linux Mint,  the user **ishan@MintyIsh**, the execution of the java code begins with first going to the directory in which the java file is stored.

I have a file called **Fibonacci.java**, stored in the **LinDev** folder on my **Desktop**.

```java
public class Fibonacci
{
    public static void main(String[] args)
    {
        int n = 10;
        int n1 = 0;
        int n2 = 1;
        System.out.print("First " + n + " terms: ");

        for (int i = 1; i <= n; ++i)
        {
            System.out.println(n1);

            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
```



So, to navigate to my desktop in the terminal I shall use the following command called **cd** .
```console
ishan@MintyIsh:~$ cd Desktop
```
Further, I will get into my folder LinDev. 
```console
ishan@MintyIsh:~/Desktop$ cd LinDev
```

Once that is done, I write the **javac Fibonacci.java** statement in Bash to tell the terminal to get my Fibonacci.java file compiled into a **.class** file. 
```console
ishan@MintyIsh:~/Desktop/LinDev$ javac Fibonacci.java
```
Now you can wait for a while and then type **java Fibonacci** to see your file running in the Linux Terminal. 
```console
ishan@MintyIsh:~/Desktop/LinDev$ java Fibonacci
```

**The same javac and java statements can be used in Windows' CMD and MacOs' terminal. However, if you still have a doubt, please refer to the following videos.**

[![macOS](https://svgshare.com/i/ZjP.svg)](https://svgshare.com/i/ZjP.svg)

[ click here to see how to run the files in MacOS ](https://www.youtube.com/watch?v=NcaqTKrVGHo)

[![Windows](https://badgen.net/badge/icon/windows?icon=windows&label)](https://microsoft.com/windows/)

[ click here to see how to run the files in Windows  ](https://www.youtube.com/watch?v=zBF1M8dTftk)


***Before executing the programs, please check if the String argument of java.lang class is present in the main() method else it will will not run. ***

##  BlueJ (as prescribed in the syllabus)

For [BlueJ](https://bluej.org/) , you can go to the following videos to learn how to deal with the programs.

[ Downloading BlueJ ](https://www.youtube.com/watch?v=97CGA0yJduw)

[ Running the first program in BlueJ ](https://www.youtube.com/watch?v=z6PjSOw21_E)

It must be noted that the class name that you put while making the class and while writing the following statement shall be same and not different in any circumstance.

```java
// name is user-defined
public class [name]
```


## Contribution
Pull requests are welcome. For major changes or additions , please open an issue first to discuss what you would like to change or add into the repository

## License
[MIT](https://choosealicense.com/licenses/mit/)

                           

