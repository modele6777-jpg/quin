package defpackage;

import android.content.Context;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class te9 {
    public static te9 f;
    public final Executor a;
    public final CopyOnWriteArrayList b;
    public final Object c;
    public int d;
    public boolean e;

    public te9(Context context) {
        Executor executorA = rs0.A();
        this.a = executorA;
        this.b = new CopyOnWriteArrayList();
        this.c = new Object();
        this.d = 0;
        executorA.execute(new xu8(2, this, context));
    }

    public static synchronized te9 a(Context context) {
        te9 te9Var;
        te9Var = f;
        if (te9Var == null) {
            te9Var = new te9(context);
            f = te9Var;
        }
        return te9Var;
    }

    public final int b() {
        int i;
        synchronized (this.c) {
            i = this.d;
        }
        return i;
    }

    public final void c(int i) {
        CopyOnWriteArrayList<se9> copyOnWriteArrayList = this.b;
        for (se9 se9Var : copyOnWriteArrayList) {
            if (se9Var.a.get() == null) {
                copyOnWriteArrayList.remove(se9Var);
            }
        }
        synchronized (this.c) {
            try {
                if (this.e && this.d == i) {
                    return;
                }
                this.e = true;
                this.d = i;
                for (se9 se9Var2 : this.b) {
                    se9Var2.b.execute(new m45(11, se9Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
