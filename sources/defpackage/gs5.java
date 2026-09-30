package defpackage;

import android.media.Image;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class gs5 implements iw6 {
    public final iw6 b;
    public final Object a = new Object();
    public final HashSet c = new HashSet();

    public gs5(iw6 iw6Var) {
        this.b = iw6Var;
    }

    public final void b(fs5 fs5Var) {
        synchronized (this.a) {
            this.c.add(fs5Var);
        }
    }

    @Override // defpackage.iw6
    public int c() {
        return this.b.c();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.b.close();
        synchronized (this.a) {
            hashSet = new HashSet(this.c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((fs5) it.next()).a(this);
        }
    }

    @Override // defpackage.iw6
    public int d() {
        return this.b.d();
    }

    @Override // defpackage.iw6
    public final int getFormat() {
        return this.b.getFormat();
    }

    @Override // defpackage.iw6
    public final Image r() {
        return this.b.r();
    }

    @Override // defpackage.iw6
    public vv6 u0() {
        return this.b.u0();
    }

    @Override // defpackage.iw6
    public final m6c[] v() {
        return this.b.v();
    }
}
