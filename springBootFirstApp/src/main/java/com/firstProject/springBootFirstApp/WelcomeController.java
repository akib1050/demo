package com.firstProject.springBootFirstApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/welcome")
    public String welcome()
    {
        return "Welcome Akib!!! to SpringBoot world";
    }
    @GetMapping("/akib")
    public String akib()
    {
        return "Akib StringBoot pare na (: ";
    }

    @GetMapping("/person")
    public Person getPerson()
    {
        Person p = new Person();
        p.setName("Akib");
        p.setAge(24);
        return p;
    }

    class Person
    {
        private String name;
        private Integer age;
        public  String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name=name;
        }

        public Integer getAge()
        {
            return age;
        }

        public void setAge(Integer age)
        {
            this.age=age;
        }
    }

}
