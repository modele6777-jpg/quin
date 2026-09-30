package defpackage;

import com.adjust.sdk.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jie {
    public final ycg a;
    public final jx b = qk2.d(0.0f);
    public final vz9 c;
    public final vz9 d;
    public final sz9 e;
    public final qz9 f;

    public jie(int i, int i2) {
        this.a = new ycg(i2, i2 >> 31);
        ArrayList arrayList = new ArrayList(i);
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(Integer.valueOf(i3));
        }
        this.c = q1c.f(arrayList);
        this.d = q1c.f(kie.a);
        this.e = new sz9(0);
        this.f = new qz9(0.0f);
    }

    /* JADX WARN: Code duplicated, block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object a(yv9 yv9Var, yv9 yv9Var2, zn2 zn2Var) {
        iie iieVar;
        int iMax;
        int iMin;
        x16 x16Var;
        x16 x16Var2;
        bw2 bw2Var;
        int i;
        int i2;
        x16 x16Var3;
        Float f;
        x6f x6fVarT;
        if (zn2Var instanceof iie) {
            iieVar = (iie) zn2Var;
            int i3 = iieVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iieVar.label = i3 - Integer.MIN_VALUE;
            } else {
                iieVar = new iie(this, zn2Var);
            }
        } else {
            iieVar = new iie(this, zn2Var);
        }
        iie iieVar2 = iieVar;
        Object obj = iieVar2.result;
        int i4 = iieVar2.label;
        jx jxVar = this.b;
        sz9 sz9Var = this.e;
        kie kieVar = kie.a;
        vz9 vz9Var = this.d;
        wef wefVar = wef.a;
        bw2 bw2Var2 = bw2.a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    iMin = iieVar2.I$1;
                    int i5 = iieVar2.I$0;
                    x16 x16Var4 = (x16) iieVar2.L$1;
                    x16 x16Var5 = (x16) iieVar2.L$0;
                    jzb.q(obj);
                    iMax = i5;
                    x16Var2 = x16Var4;
                    x16Var = x16Var5;
                } else if (i4 == 2) {
                    int i6 = iieVar2.I$1;
                    i = iieVar2.I$0;
                    x16 x16Var6 = (x16) iieVar2.L$1;
                    jzb.q(obj);
                    i2 = i6;
                    x16Var3 = x16Var6;
                    bw2Var = bw2Var2;
                    vz9Var.setValue(kie.c);
                    f = new Float(0.0f);
                    x6fVarT = b21.T(420, 0, gs4.c, 2);
                    iieVar2.L$0 = null;
                    iieVar2.L$1 = x16Var3;
                    iieVar2.I$0 = i;
                    iieVar2.I$1 = i2;
                    iieVar2.label = 3;
                    if (jx.b(jxVar, f, x6fVarT, null, null, iieVar2, 12) == bw2Var) {
                        return bw2Var;
                    }
                } else {
                    if (i4 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    x16Var3 = (x16) iieVar2.L$1;
                    jzb.q(obj);
                }
                this.c.setValue(s72.Q0(s72.r0(b(), sz9Var.j()), s72.c1(b(), sz9Var.j())));
                vz9Var.setValue(kieVar);
                x16Var3.invoke();
                vz9Var.setValue(kieVar);
                return wefVar;
            }
            jzb.q(obj);
            if (((kie) vz9Var.getValue()) != kieVar || b().size() < 2) {
                return wefVar;
            }
            iMax = Math.max(1, b().size() / 4);
            iMin = Math.min(t72.E(b()), b().size() - (b().size() / 4));
            ycg ycgVar = this.a;
            sz9Var.k(iMax < iMin ? ycgVar.d(iMax, iMin) : 1);
            this.f.k((ycgVar.b() * 2.0f) + 5.0f);
            Float f2 = new Float(0.0f);
            x16Var = yv9Var;
            iieVar2.L$0 = x16Var;
            x16Var2 = yv9Var2;
            iieVar2.L$1 = x16Var2;
            iieVar2.I$0 = iMax;
            iieVar2.I$1 = iMin;
            iieVar2.label = 1;
            if (jxVar.g(iieVar2, f2) == bw2Var2) {
                return bw2Var2;
            }
            vz9Var.setValue(kie.b);
            x16Var.invoke();
            Float f3 = new Float(1.0f);
            x6f x6fVarT2 = b21.T(Constants.MINIMAL_ERROR_STATUS_CODE, 0, new q03(0.2f, 0.9f, 0.3f, 1.0f), 2);
            iieVar2.L$0 = null;
            iieVar2.L$1 = x16Var2;
            iieVar2.I$0 = iMax;
            iieVar2.I$1 = iMin;
            iieVar2.label = 2;
            bw2Var = bw2Var2;
            jxVar = jxVar;
            if (jx.b(jxVar, f3, x6fVarT2, null, null, iieVar2, 12) == bw2Var) {
                return bw2Var;
            }
            i = iMax;
            i2 = iMin;
            x16Var3 = x16Var2;
            vz9Var.setValue(kie.c);
            f = new Float(0.0f);
            x6fVarT = b21.T(420, 0, gs4.c, 2);
            iieVar2.L$0 = null;
            iieVar2.L$1 = x16Var3;
            iieVar2.I$0 = i;
            iieVar2.I$1 = i2;
            iieVar2.label = 3;
            if (jx.b(jxVar, f, x6fVarT, null, null, iieVar2, 12) == bw2Var) {
                return bw2Var;
            }
            this.c.setValue(s72.Q0(s72.r0(b(), sz9Var.j()), s72.c1(b(), sz9Var.j())));
            vz9Var.setValue(kieVar);
            x16Var3.invoke();
            vz9Var.setValue(kieVar);
            return wefVar;
        } catch (Throwable th) {
            vz9Var.setValue(kieVar);
            throw th;
        }
    }

    public final List b() {
        return (List) this.c.getValue();
    }
}
