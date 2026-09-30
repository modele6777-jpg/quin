package defpackage;

import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l1h implements xch, kn9, an9, wm9 {
    public final /* synthetic */ int a;
    public final Executor b;
    public final Object c;
    public final Object d;

    public l1h(Executor executor, wm9 wm9Var) {
        this.a = 0;
        this.c = new Object();
        this.b = executor;
        this.d = wm9Var;
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        ((gfh) this.d).p(obj);
    }

    @Override // defpackage.xch
    public final void b(Task task) {
        boolean z = false;
        byte b = 0;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                if (task.k()) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new jfg(10, this));
                    return;
                }
                return;
            case 1:
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new lwg(this, task, b == true ? 1 : 0, 24));
                return;
            case 2:
                if (task.m() || task.k()) {
                    return;
                }
                synchronized (this.c) {
                    break;
                }
                this.b.execute(new n6h(b2 == true ? 1 : 0, this, task));
                return;
            case 3:
                if (task.m()) {
                    synchronized (this.c) {
                        break;
                    }
                    this.b.execute(new lwg(this, task, z, 28));
                    return;
                }
                return;
            default:
                this.b.execute(new fah(1, this, task));
                return;
        }
    }

    @Override // defpackage.wm9
    public void c() {
        ((gfh) this.d).s();
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        ((gfh) this.d).r(exc);
    }

    public l1h(Executor executor, xm9 xm9Var) {
        this.a = 1;
        this.c = new Object();
        this.b = executor;
        this.d = xm9Var;
    }

    public l1h(Executor executor, an9 an9Var) {
        this.a = 2;
        this.c = new Object();
        this.b = executor;
        this.d = an9Var;
    }

    public l1h(Executor executor, kn9 kn9Var) {
        this.a = 3;
        this.c = new Object();
        this.b = executor;
        this.d = kn9Var;
    }

    public l1h(Executor executor, j8e j8eVar, gfh gfhVar) {
        this.a = 4;
        this.b = executor;
        this.c = j8eVar;
        this.d = gfhVar;
    }
}
