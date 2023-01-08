package String;

import java.security.Principal;
import java.util.Scanner;

public class Check_string_is_rotated_to_goal {
    public static String check(String s , String goal){
        return (s.length() == goal.length() && (s + s).contains(goal));
    }

