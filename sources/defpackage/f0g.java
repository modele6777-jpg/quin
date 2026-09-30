package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f0g extends fb7 {
    public final jb7 b;
    public final WeakReference c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0g(jb7 jb7Var, f6c f6cVar) {
        super(f6cVar.a);
        f6cVar.getClass();
        this.b = jb7Var;
        this.c = new WeakReference(f6cVar);
    }

    @Override // defpackage.fb7
    public final void a(Set set) {
        set.getClass();
        fb7 fb7Var = (fb7) this.c.get();
        if (fb7Var != null) {
            fb7Var.a(set);
            return;
        }
        jb7 jb7Var = this.b;
        ReentrantLock reentrantLock = jb7Var.d;
        reentrantLock.lock();
        try {
            cl9 cl9Var = (cl9) jb7Var.c.remove(this);
            reentrantLock.unlock();
            if (cl9Var != null) {
                j5f j5fVar = jb7Var.b;
                int[] iArr = cl9Var.b;
                j5fVar.getClass();
                iArr.getClass();
                if (j5fVar.h.b(iArr)) {
                    d8c.r(new hb7(jb7Var, null));
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
