package com.epam.collections.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String> list = Stream.concat(firstList.stream(),secondList.stream())
                .collect(Collectors.toList());
        PriorityQueue<String> priorityQueue= new PriorityQueue<>(Comparator.reverseOrder());
        priorityQueue.addAll(list);

        return priorityQueue;

    }
}
