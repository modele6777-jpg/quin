package defpackage;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class opa implements npa, Serializable {
    private static final long serialVersionUID = 0;
    private final List<? extends npa> components;

    public opa(List list) {
        this.components = list;
    }

    @Override // defpackage.npa
    public final boolean apply(Object obj) {
        for (int i = 0; i < this.components.size(); i++) {
            if (!this.components.get(i).apply(obj)) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof opa) {
            return this.components.equals(((opa) obj).components);
        }
        return false;
    }

    public final int hashCode() {
        return this.components.hashCode() + 306654252;
    }

    public final String toString() {
        List<? extends npa> list = this.components;
        StringBuilder sb = new StringBuilder("Predicates.and(");
        boolean z = true;
        for (Object obj : list) {
            if (!z) {
                sb.append(',');
            }
            sb.append(obj);
            z = false;
        }
        sb.append(')');
        return sb.toString();
    }
}
