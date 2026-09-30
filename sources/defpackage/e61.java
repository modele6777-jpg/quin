package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e61 extends is9 implements Serializable {
    private static final long serialVersionUID = 0;
    final i26 function;
    final is9 ordering;

    public e61(i26 i26Var, is9 is9Var) {
        this.function = i26Var;
        this.ordering = is9Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.ordering.compare(this.function.apply(obj), this.function.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e61) {
            e61 e61Var = (e61) obj;
            if (this.function.equals(e61Var.function) && this.ordering.equals(e61Var.ordering)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.function, this.ordering});
    }

    public final String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }
}
