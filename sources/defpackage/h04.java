package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h04 {
    public static final Set b = n3d.p(yr7.CLASS);
    public static final Set c = qd0.I0(new yr7[]{yr7.FILE_FACADE, yr7.MULTIFILE_CLASS_PART});
    public static final fv8 d;
    public static final fv8 e;
    public tz3 a;

    static {
        new fv8(new int[]{1, 1, 2}, false);
        d = new fv8(new int[]{1, 1, 11}, false);
        e = new fv8(new int[]{1, 1, 13}, false);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001d  */
    public final p04 a(kw9 kw9Var, cob cobVar) {
        String[] strArr;
        iy9 iy9VarI;
        cobVar.getClass();
        zr7 zr7Var = cobVar.b;
        fv8 fv8Var = zr7Var.b;
        String[] strArr2 = zr7Var.c;
        if (strArr2 == null) {
            strArr2 = zr7Var.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!c.contains(zr7Var.a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = zr7Var.e) != null) {
            try {
                try {
                    iy9VarI = sl7.i(strArr2, strArr);
                } catch (ab7 e2) {
                    throw new IllegalStateException("Could not read data from ".concat(cobVar.a()), e2);
                }
            } catch (Throwable th) {
                c().c.getClass();
                fv8 fv8VarE = e();
                fv8VarE.getClass();
                fv8 fv8Var2 = fv8Var.f ? fv8.g : fv8.h;
                int i = fv8Var2.b;
                int i2 = fv8VarE.b;
                if (i > i2 || (i >= i2 && fv8Var2.c > fv8VarE.c)) {
                    fv8VarE = fv8Var2;
                }
                int i3 = fv8Var.c;
                int i4 = fv8Var.b;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = fv8VarE.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > fv8VarE.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                iy9VarI = null;
            }
            if (iy9VarI != null) {
                wk7 wk7Var = (wk7) iy9VarI.a();
                hza hzaVar = (hza) iy9VarI.b();
                d(cobVar);
                yk7 yk7Var = new yk7(cobVar, hzaVar, wk7Var, f(cobVar), b(cobVar));
                return new p04(kw9Var, hzaVar, wk7Var, fv8Var, yk7Var, c(), "scope for " + yk7Var + " in " + kw9Var, tq0.x);
            }
        }
        return null;
    }

    public final e04 b(cob cobVar) {
        c().c.getClass();
        int i = cobVar.b.g;
        return ((i & 16) == 0 || (i & 32) != 0) ? e04.a : e04.b;
    }

    public final tz3 c() {
        tz3 tz3Var = this.a;
        if (tz3Var != null) {
            return tz3Var;
        }
        pa7.g0("components");
        throw null;
    }

    public final w07 d(cob cobVar) {
        c().c.getClass();
        zr7 zr7Var = cobVar.b;
        fv8 fv8Var = zr7Var.b;
        fv8 fv8Var2 = zr7Var.b;
        fv8 fv8VarE = e();
        fv8VarE.getClass();
        fv8 fv8Var3 = fv8Var2.f ? fv8.g : fv8.h;
        int i = fv8Var3.b;
        int i2 = fv8VarE.b;
        if (i > i2 || (i >= i2 && fv8Var3.c > fv8VarE.c)) {
            fv8VarE = fv8Var3;
        }
        int i3 = fv8Var2.c;
        int i4 = fv8Var2.b;
        boolean z = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = fv8VarE.b;
            if (i4 > i5 || (i4 >= i5 && i3 > fv8VarE.c)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        fv8 fv8Var4 = fv8.g;
        fv8 fv8VarE2 = e();
        fv8 fv8VarE3 = e();
        boolean z2 = fv8Var.f;
        fv8VarE3.getClass();
        fv8 fv8Var5 = z2 ? fv8Var4 : fv8.h;
        int i6 = fv8Var5.b;
        int i7 = fv8VarE3.b;
        return new w07(fv8Var, fv8Var4, fv8VarE2, (i6 <= i7 && (i6 < i7 || fv8Var5.c <= fv8VarE3.c)) ? fv8VarE3 : fv8Var5, cobVar.a());
    }

    public final fv8 e() {
        c().c.getClass();
        return fv8.g;
    }

    public final boolean f(cob cobVar) {
        c().c.getClass();
        c().c.getClass();
        zr7 zr7Var = cobVar.b;
        return (zr7Var.g & 2) != 0 && zr7Var.b.equals(d);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    public final a22 g(cob cobVar) {
        String[] strArr;
        iy9 iy9VarF;
        zr7 zr7Var = cobVar.b;
        fv8 fv8Var = zr7Var.b;
        String[] strArr2 = zr7Var.c;
        if (strArr2 == null) {
            strArr2 = zr7Var.d;
        }
        if (strArr2 == null) {
            strArr2 = null;
        } else if (!b.contains(zr7Var.a)) {
            strArr2 = null;
        }
        if (strArr2 != null && (strArr = zr7Var.e) != null) {
            try {
                try {
                    iy9VarF = sl7.f(strArr2, strArr);
                } catch (ab7 e2) {
                    throw new IllegalStateException("Could not read data from ".concat(cobVar.a()), e2);
                }
            } catch (Throwable th) {
                c().c.getClass();
                fv8 fv8VarE = e();
                fv8VarE.getClass();
                fv8 fv8Var2 = fv8Var.f ? fv8.g : fv8.h;
                int i = fv8Var2.b;
                int i2 = fv8VarE.b;
                if (i > i2 || (i >= i2 && fv8Var2.c > fv8VarE.c)) {
                    fv8VarE = fv8Var2;
                }
                int i3 = fv8Var.c;
                int i4 = fv8Var.b;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = fv8VarE.b;
                    if (i4 > i5 || (i4 >= i5 && i3 > fv8VarE.c)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                iy9VarF = null;
            }
            if (iy9VarF != null) {
                wk7 wk7Var = (wk7) iy9VarF.a();
                nya nyaVar = (nya) iy9VarF.b();
                d(cobVar);
                return new a22(wk7Var, nyaVar, fv8Var, new ls7(cobVar, new apa(f(cobVar)), b(cobVar)));
            }
        }
        return null;
    }
}
