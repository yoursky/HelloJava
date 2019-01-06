package language.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/**
 * https://blog.csdn.net/zjd934784273/article/details/50499025
 */
public class TestWeakReference {
    HashMap<Object ,Object> map = new HashMap<>();
    ReferenceQueue<byte[]> queue = new ReferenceQueue();
    public void initHM() {
        Object value = new Object();
        for (int i = 0; i< 1000; i++) {
            WeakReference<byte[]> wf = new WeakReference<>(new byte[10000], queue);
            map.put(wf, value);
        }

        System.out.println("map.size()=" + map.size());
    }

//    public void test() {
//        Thread t = new Thread(
//            public void run() {
//            try {
//                    int cnt = 0;
//                    WeakReference<byte[]> wf;
//                    while((wf = queue.remove()) != null) {
//                        System.out.println((cnt ++) + " collected " + wf);
//                    }
//                } catch (InterruptedException e) {
//
//                }
//            })
//
//        t.setDaemon(true);
//        t.start();
//    }
}
