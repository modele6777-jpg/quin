package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x8e implements u8e, Serializable {
    private static final long serialVersionUID = 0;
    final Object instance;

    public x8e(Object obj) {
        this.instance = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x8e) {
            return ok8.t(this.instance, ((x8e) obj).instance);
        }
        return false;
    }

    @Override // defpackage.u8e
    public final Object get() {
        return this.instance;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.instance});
    }

    public final String toString() {
        return "Suppliers.ofInstance(" + this.instance + ")";
    }
}
