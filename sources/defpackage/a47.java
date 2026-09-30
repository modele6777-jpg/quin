package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a47 extends er8 {
    public final dr8 b;

    public a47(dr8 dr8Var) {
        dr8Var.getClass();
        this.b = dr8Var;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        int i = ez3.l & ez3Var.b;
        ez3 ez3Var2 = i == 0 ? null : new ez3(i, ez3Var.a);
        if (ez3Var2 == null) {
            return pu4.a;
        }
        Collection collectionA = this.b.a(ez3Var2, a26Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (obj instanceof z22) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set c() {
        return this.b.c();
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set d() {
        return this.b.d();
    }

    @Override // defpackage.er8, defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        y22 y22VarE = this.b.e(t99Var, lf9Var);
        if (y22VarE != null) {
            u09 u09Var = y22VarE instanceof u09 ? (u09) y22VarE : null;
            if (u09Var != null) {
                return u09Var;
            }
            if (y22VarE instanceof s04) {
                return (s04) y22VarE;
            }
        }
        return null;
    }

    @Override // defpackage.er8, defpackage.dr8
    public final Set g() {
        return this.b.g();
    }

    public final String toString() {
        return "Classes from " + this.b;
    }
}
