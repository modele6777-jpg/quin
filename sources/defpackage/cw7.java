package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cw7 implements yn8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yn8 b;
    public final /* synthetic */ gw7 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ yn8 e;

    public /* synthetic */ cw7(yn8 yn8Var, gw7 gw7Var, int i, yn8 yn8Var2, int i2) {
        this.a = i2;
        this.c = gw7Var;
        this.d = i;
        this.e = yn8Var2;
        this.b = yn8Var;
    }

    @Override // defpackage.yn8
    public final Map a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.a();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:11:0x002f->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[SYNTHETIC] */
    @Override // defpackage.yn8
    public final void b() {
        int i = this.a;
        yn8 yn8Var = this.e;
        int i2 = this.d;
        gw7 gw7Var = this.c;
        switch (i) {
            case 0:
                gw7Var.e = i2;
                yn8Var.b();
                p89 p89Var = gw7Var.X;
                w79 w79Var = gw7Var.z;
                long[] jArr = w79Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j = jArr[i3];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j) < 128) {
                                    int i6 = (i3 << 3) + i5;
                                    Object obj = w79Var.b[i6];
                                    p6e p6eVar = (p6e) w79Var.c[i6];
                                    int i7 = p89Var.i(obj);
                                    if (i7 < 0 || i7 >= gw7Var.e) {
                                        if (i7 >= 0) {
                                            Object[] objArr = p89Var.a;
                                            Object obj2 = objArr[i7];
                                            objArr[i7] = m6e.b;
                                        }
                                        if (gw7Var.x.b(obj)) {
                                            p6eVar.a();
                                        }
                                        w79Var.l(i6);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i4 == 8) {
                                if (i3 != length) {
                                    i3++;
                                }
                            }
                        } else if (i3 != length) {
                            i3++;
                        }
                    }
                }
                gw7Var.f(gw7Var.d);
                break;
            default:
                gw7Var.d = i2;
                yn8Var.b();
                if (gw7Var.a.w == null) {
                    gw7Var.f(gw7Var.d);
                }
                break;
        }
    }

    @Override // defpackage.yn8
    public final int c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.c();
    }

    @Override // defpackage.yn8
    public final int d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.d();
    }

    @Override // defpackage.yn8
    public final a26 e() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.e();
    }

    @Override // defpackage.yn8
    public final l26 f() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.f();
    }

    @Override // defpackage.yn8
    public final a26 g() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b.g();
    }
}
