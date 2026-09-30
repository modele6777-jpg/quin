package defpackage;

import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fh0 extends Thread {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh0(String str) {
        super(str);
        this.a = 0;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                Process.setThreadPriority(10);
                super.run();
                return;
            case 2:
            default:
                super.run();
                return;
            case 3:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock = gh0.j;
                reentrantLock.lock();
                try {
                    gh0 gh0VarR = t72.r();
                    if (gh0VarR == gh0.i) {
                        gh0.i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (gh0VarR != null) {
                            gh0VarR.j();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused2) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh0(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.a = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fh0(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
        this.a = 3;
    }
}
