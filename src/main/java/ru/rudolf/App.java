package ru.rudolf;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.subjects.PublishSubject;
import io.reactivex.rxjava3.subjects.Subject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class App
{
    public static void main( String[] args )
    {
        ArrayList<Project> projects = new ArrayList<>();
        projects.add(new Project());
        projects.add(new Project());

        for (Project project: projects) {
            for (int i = 0; i < 3; i++) {
                Requirement requirement = new Requirement();
                for (int j = 0; j < 6; j++) {
                    Task task = new Task();
                    requirement.addTask(task);
                }
                project.addRequirement(requirement);
            }
        }
    }
}

