package defpackage;

import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zc6 implements wm2 {
    public final int a;
    public final Path.FillType b;
    public final kx c;
    public final kx d;
    public final kx e;
    public final kx f;
    public final boolean g;

    public zc6(String str, int i, Path.FillType fillType, kx kxVar, kx kxVar2, kx kxVar3, kx kxVar4, boolean z) {
        this.a = i;
        this.b = fillType;
        this.c = kxVar;
        this.d = kxVar2;
        this.e = kxVar3;
        this.f = kxVar4;
        this.g = z;
    }

    @Override // defpackage.wm2
    public final zl2 a(oi8 oi8Var, uh8 uh8Var, eu0 eu0Var) {
        return new ad6(oi8Var, uh8Var, eu0Var, this);
    }
}
