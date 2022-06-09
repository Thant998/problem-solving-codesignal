package com.minthant;

/*

Problem:
You are playing an RPG game. Currently your experience points (XP) total is equal to experience. To reach the next level your XP should be at least at threshold. 
If you kill the monster in front of you, you will gain more experience points in the amount of the reward.

 */

public class NextLevel {
    public static boolean reachNextLevel(int experience,int threshold,int reward){
        int total=experience+reward;
        if ((total>threshold) || (total==threshold)){
            return true;
        }else if (experience>threshold){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int exp=235;
        int thre=293;
        int rew=4;
        System.out.println(reachNextLevel(exp,thre,rew));
    }
}
