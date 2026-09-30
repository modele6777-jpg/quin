package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c5d implements wm2 {
    public final boolean a;
    public final Path.FillType b;
    public final kx c;
    public final kx d;
    public final boolean e;

    public c5d(String str, boolean z, Path.FillType fillType, kx kxVar, kx kxVar2, boolean z2) {
        this.a = z;
        this.b = fillType;
        this.c = kxVar;
        this.d = kxVar2;
        this.e = z2;
    }

    @Override // defpackage.wm2
    public final zl2 a(oi8 oi8Var, uh8 uh8Var, eu0 eu0Var) {
        return new pe5(oi8Var, eu0Var, this);
    }

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.a + '}';
    }
}
