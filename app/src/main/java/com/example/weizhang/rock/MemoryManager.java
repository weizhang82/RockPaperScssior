package com.example.csis.pace.edu.project;

import android.util.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by dwy on 10/31/15.
 */
public class MemoryManager {

    public static void getTotalMemory() {
        String str1 = "/proc/meminfo";
        String str2 = "";

        try {
            FileReader fr = new FileReader(str1);
            BufferedReader localBufferedReader = new BufferedReader(fr, 8192);
            while ((str2 = localBufferedReader.readLine()) != null) {
                Log.i("Memory State", "---" + str2);
            }
        } catch (IOException e) {

        }
    }

    public static void getMemoryFree(){
        String str1 = "/proc/meminfo";
        String str2 = "";
        try {
            FileReader fr = new FileReader(str1);
            BufferedReader localBufferedReader = new BufferedReader(fr, 8192);
            while ((str2 = localBufferedReader.readLine()) != null) {
                if(str2.contains("MemFree")){
                    Log.i("Memory Free Information", "---" + str2);
                    break;
                }
            }
        } catch (IOException e) {

        }
    }
}
