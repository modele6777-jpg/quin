package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0c extends is9 implements Serializable {
    private static final long serialVersionUID = 0;
    final is9 forwardOrder;

    public l0c(is9 is9Var) {
        this.forwardOrder = is9Var;
    }

    @Override // defpackage.is9
    public final is9 a() {
        return this.forwardOrder;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.forwardOrder.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l0c) {
            return this.forwardOrder.equals(((l0c) obj).forwardOrder);
        }
        return false;
    }

    public final int hashCode() {
        return -this.forwardOrder.hashCode();
    }

    public final String toString() {
        return this.forwardOrder + ".reverse()";
    }
}
