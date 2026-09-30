package defpackage;

import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ft4 extends mh3 {
    public final /* synthetic */ nx0 O;

    public ft4(nx0 nx0Var) {
        this.O = nx0Var;
    }

    @Override // defpackage.mh3
    public final void O(Throwable th) {
        ((jt4) this.O.a).f(th);
    }

    @Override // defpackage.mh3
    public final void P(szc szcVar) {
        nx0 nx0Var = this.O;
        nx0Var.c = szcVar;
        szc szcVar2 = (szc) nx0Var.c;
        jt4 jt4Var = (jt4) nx0Var.a;
        nx0Var.b = new ta0(szcVar2, jt4Var.g, jt4Var.i, Build.VERSION.SDK_INT >= 34 ? pt4.a() : od4.s());
        jt4 jt4Var2 = (jt4) nx0Var.a;
        ArrayList arrayList = new ArrayList();
        jt4Var2.a.writeLock().lock();
        try {
            jt4Var2.c = 1;
            arrayList.addAll(jt4Var2.b);
            jt4Var2.b.clear();
            jt4Var2.a.writeLock().unlock();
            jt4Var2.d.post(new qa1(arrayList, jt4Var2.c, (Throwable) null));
        } catch (Throwable th) {
            jt4Var2.a.writeLock().unlock();
            throw th;
        }
    }
}
