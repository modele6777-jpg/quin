package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uy6 implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<Object> comparator;
    final Object[] elements;

    public uy6(Comparator comparator, Object[] objArr) {
        this.comparator = comparator;
        this.elements = objArr;
    }

    public Object readResolve() {
        ty6 ty6Var = new ty6(this.comparator);
        ty6Var.c(this.elements);
        return ty6Var.i();
    }
}
