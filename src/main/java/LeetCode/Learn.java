package LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.*;

public class Learn {


    public String toSentence(String[] stringArrayInput)
    {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < stringArrayInput.length; i++) {
            stringBuilder.append(stringArrayInput[i]);
            if (stringArrayInput.length  == 2)
            {
                if (i != stringArrayInput.length - 1)
                {
                    stringBuilder.append(" and ");
                }
            }
            else
            {
                if (i == stringArrayInput.length - 2)
                {
                    //Alice, Bob and Carol

                    stringBuilder.append(" and ");
                }

                else if (i < stringArrayInput.length - 1)
                {
                    stringBuilder.append(", ");
                }


                else
                {
                    if (i != stringArrayInput.length - 1) {
                        stringBuilder.append(" ");
                    }
                }
            }
            if (stringArrayInput[i] == "" || stringArrayInput[i] == null) {stringBuilder.append("");}




        }

        String holder = new String(stringBuilder);
        System.out.println(holder);
        return holder;
    }



}

