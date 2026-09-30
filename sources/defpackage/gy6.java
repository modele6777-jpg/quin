package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gy6 implements Serializable {
    private static final long serialVersionUID = 0;
    final Object[] elements;

    public gy6(Object[] objArr) {
        this.elements = objArr;
    }

    public Object readResolve() {
        return jy6.p(this.elements);
    }
}
