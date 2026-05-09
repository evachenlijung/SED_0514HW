import java.util.*;
import java.lang.Thread;

public class ThreadPool{
    private static ThreadPool instance = null;
    private static final int N = 4;
    private List<Thread> threads;

    private ThreadPool(){
        threads = new ArrayList<>();
        for(int i = 0; i < N; i++){
            Thread t = new MyThread();
            threads.add(t);
            t.start();
        }
    }

    public static ThreadPool getInstance(){
        if(instance == null){
            synchronized(ThreadPool.class){
                if(instance == null){
                    instance = new ThreadPool();
                }
            }
        }
        return instance;
    }
}