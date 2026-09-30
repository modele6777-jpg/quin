package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class er8 implements dr8 {
    @Override // defpackage.dr8
    public Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return pu4.a;
    }

    @Override // defpackage.dr8
    public Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return pu4.a;
    }

    @Override // defpackage.dr8
    public Set c() {
        Collection collectionA = a(ez3.p, z03.N0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof hjd) {
                t99 name = ((hjd) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }

    @Override // defpackage.dr8
    public Set d() {
        return null;
    }

    @Override // defpackage.dr8
    public y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        return null;
    }

    @Override // defpackage.dr8
    public Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        return pu4.a;
    }

    @Override // defpackage.dr8
    public Set g() {
        Collection collectionA = a(ez3.q, z03.N0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : collectionA) {
            if (obj instanceof hjd) {
                t99 name = ((hjd) obj).getName();
                name.getClass();
                linkedHashSet.add(name);
            }
        }
        return linkedHashSet;
    }
}
