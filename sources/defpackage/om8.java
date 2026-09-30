package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class om8 extends ms5 {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public om8(gye gyeVar, Object obj, Object obj2) {
        super(gyeVar);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.ms5, defpackage.gye
    public final int b(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.ms5, defpackage.gye
    public final eye f(int i, eye eyeVar, boolean z) {
        this.b.f(i, eyeVar, z);
        if (Objects.equals(eyeVar.b, this.d) && z) {
            eyeVar.b = e;
        }
        return eyeVar;
    }

    @Override // defpackage.ms5, defpackage.gye
    public final Object l(int i) {
        Object objL = this.b.l(i);
        return Objects.equals(objL, this.d) ? e : objL;
    }

    @Override // defpackage.ms5, defpackage.gye
    public final fye m(int i, fye fyeVar, long j) {
        this.b.m(i, fyeVar, j);
        if (Objects.equals(fyeVar.a, this.c)) {
            fyeVar.a = fye.o;
        }
        return fyeVar;
    }
}
