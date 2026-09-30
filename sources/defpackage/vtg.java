package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class vtg extends olg implements Set {
    public static final /* synthetic */ int e = 0;
    public transient qtg d;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof vtg) && (this instanceof cvg) && (((vtg) obj) instanceof cvg) && ((cvg) this).g != obj.hashCode()) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        try {
            return size() == set.size() && containsAll(set);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return z7c.t(this);
    }

    public qtg m() {
        qtg qtgVar = this.d;
        if (qtgVar != null) {
            return qtgVar;
        }
        qtg qtgVarN = n();
        this.d = qtgVarN;
        return qtgVarN;
    }

    public qtg n() {
        Object[] array = toArray(olg.c);
        wsg wsgVar = qtg.d;
        return qtg.o(array.length, array);
    }
}
