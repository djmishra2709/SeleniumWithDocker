package com.docker.Base;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import remoteTesting.dockerValidation.startDocker;
import remoteTesting.dockerValidation.stopDocker;

import java.io.File;
import java.io.IOException;

public class BaseTest {

    @BeforeSuite
    public void startDockerScale() throws IOException, InterruptedException
    {
        File fi =new File("output.txt");
        if(fi.delete())
        {
            System.out.println("file deleted successfully");
        }
        startDocker s=new startDocker();
        s.startFile();
    }

    @AfterSuite
    public void stopDockerDeleteFile() throws IOException, InterruptedException
    {
        stopDocker d=new stopDocker();
        d.stopFile();
    }
}
