package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e5d implements wm2 {
    public final String a;
    public final List b;
    public final boolean c;

    public e5d(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.wm2
    public final zl2 a(oi8 oi8Var, uh8 uh8Var, eu0 eu0Var) {
        return new km2(oi8Var, eu0Var, this, uh8Var);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
