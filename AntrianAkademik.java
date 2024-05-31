package TUBES;

import java.util.LinkedList;
import java.util.Queue;

public class AntrianAkademik {
    protected Queue<String> queue;

    public AntrianAkademik() {
        queue = new LinkedList<>();
    }

    public Queue<String> getQueue() {
        return queue;
    }

    public void setQueue(Queue<String> queue) {
        this.queue = queue;
      }
}