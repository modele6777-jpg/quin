package defpackage;

import android.content.Context;
import android.os.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s83 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ s83(a93 a93Var, aw2 aw2Var, e89 e89Var, d83 d83Var, Context context, gpf gpfVar, o9 o9Var, x16 x16Var, e89 e89Var2) {
        this.a = 0;
        this.b = a93Var;
        this.c = aw2Var;
        this.d = e89Var;
        this.f = d83Var;
        this.g = context;
        this.v = gpfVar;
        this.w = o9Var;
        this.x = x16Var;
        this.e = e89Var2;
    }

    /* JADX WARN: Code duplicated, block: B:278:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x019c A[LOOP:4: B:82:0x0163->B:97:0x019c, LOOP_END] */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        boolean zD;
        wef wefVar;
        int i;
        ird u3fVar;
        long j;
        boolean z;
        switch (this.a) {
            case 0:
                a93 a93Var = (a93) this.b;
                aw2 aw2Var = (aw2) this.c;
                e89 e89Var = (e89) this.d;
                d83 d83Var = (d83) this.f;
                Context context = (Context) this.g;
                gpf gpfVar = (gpf) this.v;
                o9 o9Var = (o9) this.w;
                x16 x16Var = (x16) this.x;
                e89 e89Var2 = (e89) this.e;
                vh9 vh9Var = (vh9) obj;
                vh9Var.getClass();
                if (vh9Var.a) {
                    z83.d(a93Var, aw2Var, e89Var, d83Var, context, gpfVar, o9Var, x16Var, e89Var2);
                }
                return wef.a;
            case 1:
                z67 z67Var = (z67) this.b;
                j91 j91Var = (j91) this.c;
                n91 n91Var = (n91) this.d;
                a26 a26Var = (a26) this.e;
                c91 c91Var = (c91) this.f;
                Long l = (Long) this.g;
                ne3 ne3Var = (ne3) this.v;
                euc eucVar = (euc) this.w;
                ke3 ke3Var = (ke3) this.x;
                bx9 bx9Var = vf3.a;
                v08.Y((v08) obj, ((z67Var.b - z67Var.a) + 1) * 12, null, new dd2(new kf3(j91Var, n91Var, a26Var, c91Var, l, ne3Var, eucVar, ke3Var), true, 72599078), 6);
                return wef.a;
            default:
                wef wefVar2 = wef.a;
                xjb xjbVar = (xjb) this.b;
                x79 x79Var = (x79) this.c;
                x79 x79Var2 = (x79) this.d;
                List list = (List) this.e;
                List list2 = (List) this.f;
                x79 x79Var3 = (x79) this.g;
                List list3 = (List) this.v;
                x79 x79Var4 = (x79) this.w;
                Set set = (Set) this.x;
                long jLongValue = ((Long) obj).longValue();
                s0e s0eVar = xjb.z;
                synchronized (xjbVar.c) {
                    zD = xjbVar.D();
                }
                char c = 2;
                if (zD) {
                    Trace.beginSection("Recomposer:animation");
                    try {
                        ((a82) xjbVar.a.c).B(new ac(jLongValue, 2));
                        synchronized (qrd.c) {
                            x79 x79Var5 = qrd.j.h;
                            z = x79Var5 != null && x79Var5.d();
                        }
                        if (z) {
                            qrd.c();
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        Trace.endSection();
                        throw th;
                    }
                }
                Trace.beginSection("Recomposer:recompose");
                try {
                    xjbVar.O();
                    synchronized (xjbVar.c) {
                        try {
                            p89 p89Var = xjbVar.i;
                            Object[] objArr = p89Var.a;
                            int i2 = p89Var.c;
                            int i3 = 0;
                            while (i3 < i2) {
                                list.add((rg2) objArr[i3]);
                                i3++;
                                c = c;
                            }
                            xjbVar.i.g();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    x79Var.f();
                    x79Var2.f();
                    while (true) {
                        if (list.isEmpty() && list2.isEmpty()) {
                            ird irdVarH = qrd.h();
                            if (irdVarH instanceof c89) {
                                u3fVar = new t3f((c89) irdVarH, null, null, true, false);
                                i = 0;
                            } else {
                                i = 0;
                                u3fVar = new u3f(irdVarH, null, true, false);
                            }
                            try {
                                ird irdVarJ = u3fVar.j();
                                try {
                                    if (!list3.isEmpty()) {
                                        try {
                                            int size = list3.size();
                                            for (int i4 = i; i4 < size; i4++) {
                                                x79Var4.e((rg2) list3.get(i4));
                                            }
                                            int size2 = list3.size();
                                            for (int i5 = i; i5 < size2; i5++) {
                                                ((rg2) list3.get(i5)).f();
                                            }
                                            list3.clear();
                                        } catch (Throwable th3) {
                                            try {
                                                xjbVar.N(th3, null);
                                                wjb.x(xjbVar, list, list2, list3, x79Var3, x79Var4, x79Var, x79Var2);
                                                list3.clear();
                                                ird.q(irdVarJ);
                                                u3fVar.c();
                                                Trace.endSection();
                                                return wefVar2;
                                            } catch (Throwable th4) {
                                                list3.clear();
                                                throw th4;
                                            }
                                        }
                                    }
                                    if (x79Var3.d()) {
                                        try {
                                            x79Var4.k(x79Var3);
                                            Object[] objArr2 = x79Var3.b;
                                            long[] jArr = x79Var3.a;
                                            int length = jArr.length - 2;
                                            if (length >= 0) {
                                                int i6 = 0;
                                                j = 255;
                                                while (true) {
                                                    long j2 = jArr[i6];
                                                    Object[] objArr3 = objArr2;
                                                    wefVar = wefVar2;
                                                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                                        for (int i8 = 0; i8 < i7; i8++) {
                                                            if ((j2 & 255) < 128) {
                                                                try {
                                                                    ((rg2) objArr3[(i6 << 3) + i8]).h();
                                                                } catch (Throwable th5) {
                                                                    th = th5;
                                                                    try {
                                                                        xjbVar.N(th, null);
                                                                        wjb.x(xjbVar, list, list2, list3, x79Var3, x79Var4, x79Var, x79Var2);
                                                                        x79Var3.f();
                                                                        ird.q(irdVarJ);
                                                                        u3fVar.c();
                                                                        Trace.endSection();
                                                                        return wefVar;
                                                                    } catch (Throwable th6) {
                                                                        x79Var3.f();
                                                                        throw th6;
                                                                    }
                                                                }
                                                            }
                                                            j2 >>= 8;
                                                        }
                                                        if (i7 == 8) {
                                                            if (i6 != length) {
                                                                i6++;
                                                                wefVar2 = wefVar;
                                                                objArr2 = objArr3;
                                                            }
                                                        }
                                                    } else if (i6 != length) {
                                                        i6++;
                                                        wefVar2 = wefVar;
                                                        objArr2 = objArr3;
                                                    }
                                                }
                                            } else {
                                                wefVar = wefVar2;
                                                j = 255;
                                            }
                                            x79Var3.f();
                                        } catch (Throwable th7) {
                                            th = th7;
                                            wefVar = wefVar2;
                                        }
                                    } else {
                                        wefVar = wefVar2;
                                        j = 255;
                                    }
                                    if (x79Var4.d()) {
                                        try {
                                            Object[] objArr4 = x79Var4.b;
                                            long[] jArr2 = x79Var4.a;
                                            int length2 = jArr2.length - 2;
                                            if (length2 >= 0) {
                                                int i9 = 0;
                                                while (true) {
                                                    long j3 = jArr2[i9];
                                                    Object[] objArr5 = objArr4;
                                                    long[] jArr3 = jArr2;
                                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                        for (int i11 = 0; i11 < i10; i11++) {
                                                            if ((j3 & j) < 128) {
                                                                ((rg2) objArr5[(i9 << 3) + i11]).i();
                                                            }
                                                            j3 >>= 8;
                                                            break;
                                                        }
                                                        if (i10 == 8) {
                                                        }
                                                    }
                                                    if (i9 != length2) {
                                                        i9++;
                                                        objArr4 = objArr5;
                                                        jArr2 = jArr3;
                                                    }
                                                }
                                            }
                                            x79Var4.f();
                                        } catch (Throwable th8) {
                                            try {
                                                xjbVar.N(th8, null);
                                                wjb.x(xjbVar, list, list2, list3, x79Var3, x79Var4, x79Var, x79Var2);
                                                x79Var4.f();
                                                ird.q(irdVarJ);
                                                u3fVar.c();
                                                Trace.endSection();
                                                return wefVar;
                                            } catch (Throwable th9) {
                                                x79Var4.f();
                                                throw th9;
                                            }
                                        }
                                    }
                                    ird.q(irdVarJ);
                                    u3fVar.c();
                                    synchronized (xjbVar.c) {
                                        if (xjbVar.C() != null) {
                                            wf2.a("unexpected to get continuation here");
                                            break;
                                        }
                                    }
                                    qrd.h().m();
                                    x79Var2.f();
                                    x79Var.f();
                                    xjbVar.q = null;
                                } catch (Throwable th10) {
                                    ird.q(irdVarJ);
                                    throw th10;
                                }
                            } catch (Throwable th11) {
                                u3fVar.c();
                                throw th11;
                            }
                        } else {
                            wefVar = wefVar2;
                            try {
                                int size3 = list.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    rg2 rg2Var = (rg2) list.get(i12);
                                    rg2 rg2VarM = xjbVar.M(rg2Var, x79Var);
                                    if (rg2VarM != null) {
                                        list3.add(rg2VarM);
                                    }
                                    x79Var2.e(rg2Var);
                                }
                                list.clear();
                                if (x79Var.d() || xjbVar.i.c != 0) {
                                    synchronized (xjbVar.c) {
                                        try {
                                            List listH = xjbVar.H();
                                            int size4 = listH.size();
                                            for (int i13 = 0; i13 < size4; i13++) {
                                                rg2 rg2Var2 = (rg2) listH.get(i13);
                                                if (!x79Var2.a(rg2Var2) && rg2Var2.x(set)) {
                                                    list.add(rg2Var2);
                                                }
                                            }
                                            p89 p89Var2 = xjbVar.i;
                                            int i14 = p89Var2.c;
                                            int i15 = 0;
                                            int i16 = 0;
                                            while (true) {
                                                Object[] objArr6 = p89Var2.a;
                                                if (i15 < i14) {
                                                    rg2 rg2Var3 = (rg2) objArr6[i15];
                                                    if (!x79Var2.a(rg2Var3) && !list.contains(rg2Var3)) {
                                                        list.add(rg2Var3);
                                                        i16++;
                                                    } else if (i16 > 0) {
                                                        Object[] objArr7 = p89Var2.a;
                                                        objArr7[i15 - i16] = objArr7[i15];
                                                    }
                                                    i15++;
                                                } else {
                                                    int i17 = i14 - i16;
                                                    Arrays.fill(objArr6, i17, i14, (Object) null);
                                                    p89Var2.c = i17;
                                                }
                                            }
                                        } catch (Throwable th12) {
                                            throw th12;
                                        }
                                    }
                                }
                                if (list.isEmpty()) {
                                    try {
                                        wjb.A(list2, xjbVar);
                                        while (!list2.isEmpty()) {
                                            List listL = xjbVar.L(list2, x79Var);
                                            x79Var3.getClass();
                                            Iterator it = listL.iterator();
                                            while (it.hasNext()) {
                                                x79Var3.l(it.next());
                                            }
                                            wjb.A(list2, xjbVar);
                                        }
                                    } catch (Throwable th13) {
                                        xjbVar.N(th13, null);
                                        wjb.x(xjbVar, list, list2, list3, x79Var3, x79Var4, x79Var, x79Var2);
                                    }
                                }
                                wefVar2 = wefVar;
                            } catch (Throwable th14) {
                                try {
                                    xjbVar.N(th14, null);
                                    wjb.x(xjbVar, list, list2, list3, x79Var3, x79Var4, x79Var, x79Var2);
                                    list.clear();
                                } catch (Throwable th15) {
                                    list.clear();
                                    throw th15;
                                }
                            }
                        }
                        Trace.endSection();
                        return wefVar;
                    }
                } catch (Throwable th16) {
                    Trace.endSection();
                    throw th16;
                }
        }
    }

    public /* synthetic */ s83(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.v = obj7;
        this.w = obj8;
        this.x = obj9;
    }
}
