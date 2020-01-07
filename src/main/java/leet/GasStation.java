package leet;

//https://leetcode.com/problems/gas-station/
//There are N gas stations along a circular route, where the amount of gas at station i is gas[i].
//
//You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from station i to its next station (i+1). You begin the journey with an empty tank at one of the gas stations.
//
//Return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1.

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int startingIndex = 0;
        int startingPoint = startingPoint(startingIndex, gas, cost);

        if(startingPoint == -1){
            return -1;
        }

        int ans = LoopingCode(startingPoint, gas, cost);

        while(ans == -1 && startingPoint < gas.length){
            startingPoint++;
            ans = LoopingCode(startingPoint, gas, cost);
        }

        if(ans < gas.length){
            return ans;
        } else {
            return -1;
        }
    }

    public static int startingPoint(int startingIndex, int[] gas, int[] cost){
        for(int i = startingIndex; i < gas.length; i++){
            if(gas[i] >= cost[i]){
                return i;
            }
        }
        return -1;
    }

    public static int LoopingCode(int startingPoint, int[] gas, int[]cost){
        int index = startingPoint;
        int next = index + 1;

        if(next >= gas.length){
            next = 0;
        }
        if(index >= gas.length){
            index = 0;
        }

        int gasTank = gas[index];

        for(int i = 0; i < gas.length; i++){
            if(next >= gas.length){
                next = 0;
            }
            if(index >= gas.length){
                index = 0;
            }

            if(gasTank - cost[index] < 0){
                return -1;
            } else {
                gasTank = gasTank - cost[index] + gas[next];
                next++;
                index++;
            }
        }

        return startingPoint;
    }
}
