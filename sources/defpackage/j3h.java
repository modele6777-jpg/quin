package defpackage;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j3h extends Thread {
    public final Object a;
    public final BlockingQueue b;
    public boolean c = false;
    public final /* synthetic */ m3h d;

    public j3h(m3h m3hVar, String str, BlockingQueue blockingQueue) {
        this.d = m3hVar;
        oa7.A(blockingQueue);
        this.a = new Object();
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        m3h m3hVar = this.d;
        synchronized (m3hVar.x) {
            try {
                if (!this.c) {
                    m3hVar.y.release();
                    m3hVar.x.notifyAll();
                    if (this == m3hVar.d) {
                        m3hVar.d = null;
                    } else if (this == m3hVar.e) {
                        m3hVar.e = null;
                    } else {
                        w0h w0hVar = ((w3h) m3hVar.b).f;
                        w3h.h(w0hVar);
                        w0hVar.g.a("Current scheduler thread is neither worker nor network");
                    }
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.d.y.acquire();
                z = true;
            } catch (InterruptedException e) {
                w0h w0hVar = ((w3h) this.d.b).f;
                w3h.h(w0hVar);
                w0hVar.x.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.b;
                h3h h3hVar = (h3h) blockingQueue.poll();
                if (h3hVar != null) {
                    Process.setThreadPriority(true != h3hVar.b ? 10 : threadPriority);
                    h3hVar.run();
                } else {
                    Object obj = this.a;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.d.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                w0h w0hVar2 = ((w3h) this.d.b).f;
                                w3h.h(w0hVar2);
                                w0hVar2.x.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.d.x) {
                        if (this.b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
