package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f98 {
    public final Thread a;
    public final jce b;
    public final d98 c;
    public final CopyOnWriteArraySet d;
    public final ArrayDeque e;
    public final ArrayDeque f;
    public final Object g;
    public boolean h;
    public final boolean i;

    public f98(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, Thread thread, ece eceVar, d98 d98Var, boolean z) {
        this.a = thread;
        this.d = copyOnWriteArraySet;
        this.c = d98Var;
        this.g = new Object();
        this.e = new ArrayDeque();
        this.f = new ArrayDeque();
        if (looper == null || eceVar == null || d98Var == null) {
            this.b = null;
        } else {
            this.b = eceVar.a(looper, new b98(0, this));
        }
        this.i = z;
    }

    public final void a(Object obj) {
        obj.getClass();
        synchronized (this.g) {
            try {
                if (this.h) {
                    return;
                }
                this.d.add(new e98(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        if (this.i) {
            pa7.J(Thread.currentThread() == this.a);
        }
        ArrayDeque arrayDeque = this.f;
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (this.c != null) {
            jce jceVar = this.b;
            jceVar.getClass();
            Handler handler = jceVar.a;
            if (!handler.hasMessages(1)) {
                ice iceVarA = jceVar.a(1);
                Message message = iceVarA.a;
                message.getClass();
                handler.sendMessageAtFrontOfQueue(message);
                iceVarA.a();
            }
        }
        ArrayDeque arrayDeque2 = this.e;
        boolean zIsEmpty = arrayDeque2.isEmpty();
        arrayDeque2.addAll(arrayDeque);
        arrayDeque.clear();
        if (zIsEmpty) {
            while (!arrayDeque2.isEmpty()) {
                ((Runnable) arrayDeque2.peekFirst()).run();
                arrayDeque2.removeFirst();
            }
        }
    }

    public final void c(int i, c98 c98Var) {
        if (this.i) {
            pa7.J(Thread.currentThread() == this.a);
        }
        this.f.add(new fe1(new CopyOnWriteArraySet(this.d), i, c98Var, 4));
    }

    public final void d() {
        if (this.i) {
            pa7.J(Thread.currentThread() == this.a);
        }
        synchronized (this.g) {
            this.h = true;
        }
        for (e98 e98Var : this.d) {
            d98 d98Var = this.c;
            e98Var.d = true;
            if (d98Var != null && e98Var.c) {
                e98Var.c = false;
                d98Var.g(e98Var.a, e98Var.b.b());
            }
        }
        this.d.clear();
    }

    public final void e(int i, c98 c98Var) {
        c(i, c98Var);
        b();
    }

    public f98(Thread thread) {
        this(new CopyOnWriteArraySet(), null, thread, null, null, true);
    }
}
