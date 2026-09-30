package defpackage;

import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y6 implements u48 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00b2  */
    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        int i = this.a;
        boolean z = true;
        boolean z2 = false;
        byte b = 0;
        byte b2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a26) obj).d(f48Var);
                return;
            case 1:
                yj yjVar = (yj) obj;
                Handler handler = yjVar.f;
                int i2 = xj.a[f48Var.ordinal()];
                if (i2 == 1) {
                    if (yjVar.v) {
                        return;
                    }
                    handler.post(new tj(yjVar, z, b == true ? 1 : 0));
                    return;
                } else {
                    if (i2 == 2 && !yjVar.v) {
                        handler.post(new tj(yjVar, z2, b2 == true ? 1 : 0));
                        return;
                    }
                    return;
                }
            case 2:
                q06 q06Var = (q06) obj;
                int i3 = s06.a[f48Var.ordinal()];
                if (i3 == 1) {
                    if (q06Var.g) {
                        return;
                    }
                    q06Var.f = true;
                    return;
                } else {
                    if (i3 == 2 && !q06Var.g && q06Var.f) {
                        q06Var.f = false;
                        if (q06Var.e) {
                            q06Var.b.invoke();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 3:
                gj6 gj6Var = (gj6) obj;
                if (f48Var == f48.ON_RESUME && gj6Var.d == ej6.c) {
                    gj6Var.d = ej6.a;
                    return;
                }
                return;
            case 4:
                ma9 ma9Var = (ma9) obj;
                ma9Var.q = f48Var.a();
                if (ma9Var.c != null) {
                    for (da9 da9Var : s72.l1(ma9Var.f)) {
                        da9Var.getClass();
                        fa9 fa9Var = da9Var.v;
                        fa9Var.getClass();
                        fa9Var.a.d = f48Var.a();
                        fa9Var.d = f48Var.a();
                        fa9Var.b();
                    }
                    return;
                }
                return;
            case 5:
                jdc jdcVar = (jdc) obj;
                if (f48Var == f48.ON_START) {
                    jdcVar.h = true;
                    return;
                } else {
                    if (f48Var == f48.ON_STOP) {
                        jdcVar.h = false;
                        return;
                    }
                    return;
                }
            case 6:
                mmb mmbVar = (mmb) obj;
                int i4 = cad.a[f48Var.ordinal()];
                if (i4 == 1) {
                    Object obj2 = mmbVar.element;
                    if (obj2 == null) {
                        pa7.g0("controller");
                        throw null;
                    }
                    bad badVar = (bad) obj2;
                    zk8 zk8Var = badVar.k;
                    String str = badVar.n;
                    if (str == null || !str.equals((String) zk8Var.d)) {
                        return;
                    }
                    zk8Var.b = true;
                    return;
                }
                if (i4 != 2) {
                    return;
                }
                Object obj3 = mmbVar.element;
                if (obj3 == null) {
                    pa7.g0("controller");
                    throw null;
                }
                bad badVar2 = (bad) obj3;
                zk8 zk8Var2 = badVar2.k;
                String str2 = badVar2.n;
                if (str2 != null && str2.equals((String) zk8Var2.d)) {
                    if (zk8Var2.b && zk8Var2.a) {
                        zk8Var2.c = true;
                    }
                    zk8Var2.b = false;
                }
                String str3 = badVar2.n;
                if (str3 == null) {
                    str3 = null;
                } else {
                    if (!str3.equals((String) zk8Var2.d) || !zk8Var2.a || !zk8Var2.c) {
                        str3 = null;
                    }
                    if (str3 == null) {
                        str3 = null;
                    } else {
                        zk8Var2.c = false;
                    }
                }
                if (str3 == null) {
                    return;
                }
                ynb.V(badVar2.j, null, null, new l9d(badVar2, str3, null), 3);
                return;
            case 7:
                bhe bheVar = (bhe) obj;
                if (f48Var == f48.ON_RESUME) {
                    bheVar.b();
                    return;
                }
                return;
            default:
                vad vadVar = (vad) obj;
                int i5 = udf.a[f48Var.ordinal()];
                if (i5 != 1) {
                    if (i5 != 2) {
                        return;
                    }
                    zy1 zy1Var = vadVar.d;
                    if (((Long) zy1Var.c) == null) {
                        zy1Var.c = (Long) wad.a.invoke();
                        return;
                    }
                    return;
                }
                zy1 zy1Var2 = vadVar.d;
                Long l = (Long) zy1Var2.c;
                if (l != null) {
                    long jLongValue = l.longValue();
                    long j = zy1Var2.b;
                    long jLongValue2 = ((Number) wad.a.invoke()).longValue() - jLongValue;
                    if (jLongValue2 < 0) {
                        jLongValue2 = 0;
                    }
                    zy1Var2.b = j + jLongValue2;
                    zy1Var2.c = null;
                    return;
                }
                return;
        }
    }
}
