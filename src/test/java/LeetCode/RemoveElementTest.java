package LeetCode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {

    @Test
    @DisplayName("Test 3,2,2,3")
    public void testRemoveElementOne() {
        RemoveElement re = new RemoveElement();
        int[] nums = {3,2,2,3};
        int count = 2;
        int[] exectedNums = {2,2};
        Assertions.assertEquals(count, re.removeElement(nums, 3));
        for (int i = 0; i < count; i++) {
            Assertions.assertEquals(exectedNums[i], nums[i]);
        }

    }
    @Test
    @DisplayName("Test 0,1,2,2,3,0,4,2")
    public void testRemoveElementTwo() {
        RemoveElement re = new RemoveElement();
        int[] nums = {0,1,2,2,3,0,4,2};
        int count = 5;
        int[] exectedNums = {0,1,3,0,4};
        Assertions.assertEquals(count, re.removeElement(nums, 2));
        for (int i = 0; i < count; i++) {
            Assertions.assertEquals(exectedNums[i], nums[i]);
        }

    }

}