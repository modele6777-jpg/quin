package defpackage;

import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xdd implements sdd, sg8 {
    public final /* synthetic */ sg8 a;
    public final aw2 b;
    public bv7 e;
    public bv7 f;
    public final vz9 c = q1c.f(Boolean.FALSE);
    public final tdd d = new tdd(this);
    public final sz9 g = new sz9(0);
    public final i79 v = new i79();
    public final lsd w = new lsd();
    public int x = -1;

    public xdd(sg8 sg8Var, aw2 aw2Var) {
        this.a = sg8Var;
        this.b = aw2Var;
    }

    @Override // defpackage.sg8
    public final bv7 a(bv7 bv7Var) {
        return this.a.a(bv7Var);
    }

    @Override // defpackage.sg8
    public final long c(bv7 bv7Var, bv7 bv7Var2) {
        return this.a.c(bv7Var, bv7Var2);
    }

    public final boolean e() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final void f() {
        boolean z;
        Collection<hcd> collectionValues = this.w.e().c.values();
        loop0: while (true) {
            z = false;
            for (hcd hcdVar : collectionValues) {
                hcdVar.f();
                if (z || (hcdVar.a() && (hcdVar.d() || hcdVar.e()))) {
                    z = true;
                }
            }
            break loop0;
        }
        if (z != e()) {
            this.c.setValue(Boolean.valueOf(z));
            if (z) {
                return;
            }
            for (hcd hcdVar2 : collectionValues) {
                if (hcdVar2.c().size() > 1) {
                    List listC = hcdVar2.c();
                    int i = jcd.a;
                    int size = listC.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            if (((icd) listC.get(i2)).e().b()) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    }
                }
                gp3 gp3Var = hcdVar2.c;
                gp3Var.f = p0e.a;
                gp3Var.a = ((sz9) gp3Var.e).j();
                ((vz9) gp3Var.d).setValue(mf9.a);
            }
        }
    }
}
