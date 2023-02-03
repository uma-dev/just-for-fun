package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class HanoiTower {
    private int movs;
    private Stack<Integer> fromTower;
    private Stack<Integer> bufferTower;
    private Stack<Integer> toTower;
    private List<Stack<Integer>> towers;

    public HanoiTower(int nDiscos) {
        /* Inicializacion de la lista de stacks */
        movs = 0;
        fromTower = new Stack<>();
        bufferTower = new Stack<>();
        toTower = new Stack<>();
        towers = new ArrayList<Stack<Integer>>();

        for (int i = 1; i <= nDiscos; i++) {
            fromTower.push(i);
        }

        towers.add(fromTower);
        towers.add(bufferTower);
        towers.add(toTower);
    }

    private final void print() {
        movs++;
        System.out.println("------------------------------");
        System.out.println("Movimiento: " + movs + " ");
        System.out.println("Origen, stack: " + towers.get(0));
        System.out.println("Buffer, stack: " + towers.get(1));
        System.out.println("Destino, stack:" + towers.get(2));
    }

    private final int getNext(int oldFrom) {
        return towers.get(oldFrom).peek() % 2 == 0
                ? (oldFrom + 1) % 3
                : (oldFrom + 2) % 3;
    }

    public final void move(int from, int to) {
        int toTemp;
        /* Condicion de paro */
        if (fromTower.empty() && bufferTower.empty()) {
            return;
        }
        /* Actualizar from en caso de ser necesario */
        if (towers.get(from).empty()) {
            from = getNext(to);
        } else {
            toTemp = getNext(from);
            if (!towers.get(toTemp).empty() && towers.get(from).peek() < towers.get(toTemp).peek()) {
                from = toTemp;
            }
        }
        /* Actualizar to */
        to = getNext(from);
        towers.get(to).push(towers.get(from).pop());
        print();
        move(from, to);
    }
}
