package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hcd {
    public final String a;
    public final xdd b;
    public final gp3 c = new gp3(this);
    public final vz9 d;
    public final vz9 e;
    public final jx f;
    public boolean g;
    public final fcd h;
    public final gcd i;

    public hcd(String str, xdd xddVar) {
        this.a = str;
        this.b = xddVar;
        pu4 pu4Var = pu4.a;
        this.d = q1c.f(pu4Var);
        this.e = q1c.f(pu4Var);
        this.f = new jx(new hl9(0L), xo1.l, null, 12);
        this.h = new fcd(this);
        this.i = new gcd(this);
    }

    public final boolean a() {
        gp3 gp3Var = this.c;
        return gp3Var.e().b() || gp3Var.e().d() || ((p0e) gp3Var.f) == p0e.b;
    }

    public final List b() {
        return (List) this.d.getValue();
    }

    public final List c() {
        return (List) this.e.getValue();
    }

    public final boolean d() {
        List listC = c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (((icd) listC.get(i)).e().d()) {
                return true;
            }
        }
        return false;
    }

    public final boolean e() {
        List listC = c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            scd scdVarB = ((icd) listC.get(i)).b();
            if (scdVarB != null && scdVarB.d()) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        this.b.getClass();
        List listB = b();
        ArrayList arrayList = new ArrayList();
        int size = listB.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            icd icdVar = (icd) listB.get(i);
            if (icdVar.k()) {
                arrayList.add(icdVar);
                if (icdVar.e().b()) {
                    z = true;
                }
            }
        }
        this.e.setValue(arrayList);
        gp3 gp3Var = this.c;
        hcd hcdVar = (hcd) gp3Var.c;
        sz9 sz9Var = (sz9) gp3Var.e;
        if (hcdVar.c().size() > 1 && z) {
            gp3Var.f = p0e.b;
            sz9Var.k(gp3Var.a + 1);
        } else if (!hcdVar.b.e()) {
            gp3Var.f = p0e.a;
            gp3Var.a = sz9Var.j();
            ((vz9) gp3Var.d).setValue(mf9.a);
        } else if (!z) {
            gp3Var.f = p0e.c;
            sz9Var.k(gp3Var.a + 1);
        }
        gp3Var.f();
    }
}
