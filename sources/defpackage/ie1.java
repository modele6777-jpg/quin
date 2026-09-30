package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ie1 extends he1 {
    public final /* synthetic */ int a;
    public final Object b;

    public ie1(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            he1 he1Var = (he1) it.next();
            if (!(he1Var instanceof je1)) {
                ((ArrayList) this.b).add(he1Var);
            }
        }
    }

    @Override // defpackage.he1
    public void a(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((he1) it.next()).a(i);
                }
                break;
        }
    }

    @Override // defpackage.he1
    public void b(int i, oe1 oe1Var) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((he1) it.next()).b(i, oe1Var);
                }
                return;
            case 1:
            default:
                return;
            case 2:
                yu8 yu8Var = (yu8) this.b;
                synchronized (yu8Var.a) {
                    try {
                        if (yu8Var.e) {
                            return;
                        }
                        yu8Var.w.put(oe1Var.i(), new pe1(oe1Var));
                        yu8Var.g();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            case 3:
                zxf zxfVar = (zxf) ((WeakReference) this.b).get();
                if (zxfVar != null) {
                    Iterator it2 = zxfVar.a.iterator();
                    while (it2.hasNext()) {
                        zzc zzcVar = ((oif) it2.next()).p;
                        Iterator it3 = zzcVar.g.d.iterator();
                        while (it3.hasNext()) {
                            ((he1) it3.next()).b(i, new xj0(-1L, oe1Var, zzcVar.g.e));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.he1
    public void c(int i, m8c m8cVar) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((he1) it.next()).c(i, m8cVar);
                }
                break;
        }
    }

    @Override // defpackage.he1
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((he1) it.next()).d(i, i2);
                }
                break;
            case 1:
                ((ah6) ok8.w()).execute(new hw(this, i2, 3));
                break;
        }
    }

    @Override // defpackage.he1
    public void e(int i) {
        switch (this.a) {
            case 0:
                Iterator it = ((ArrayList) this.b).iterator();
                while (it.hasNext()) {
                    ((he1) it.next()).e(i);
                }
                break;
            case 1:
                ((ah6) ok8.w()).execute(new j1(16, this));
                break;
        }
    }

    public ie1(zxf zxfVar) {
        this.a = 3;
        this.b = new WeakReference(zxfVar);
    }

    public /* synthetic */ ie1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
