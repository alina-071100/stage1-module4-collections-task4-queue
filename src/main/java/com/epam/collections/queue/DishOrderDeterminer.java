package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayDeque<Integer> queue = IntStream.range(1,numberOfDishes+1).boxed().collect(Collectors.toCollection(ArrayDeque::new));
        List<Integer> list = new ArrayList<>();
        int ind = 1;
        while (!queue.isEmpty()){
            if (ind == everyDishNumberToEat){
                list.add(queue.remove());
                ind = 1;
            }
            else
            {
                ind++;
                queue.add(queue.remove());
            }
        }
        return list;
        }
    }

