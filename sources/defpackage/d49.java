package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d49 extends lg9 {
    public final vd9 f;
    public final r41 g;
    public lyd h;

    public d49(gic gicVar, vd9 vd9Var, q12 q12Var, sw3 sw3Var) {
        super(gicVar, q12Var, sw3Var);
        this.f = vd9Var;
        this.g = urg.a(Integer.MAX_VALUE, null, null, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public static final Object e(d49 d49Var, mmb mmbVar, jmb jmbVar, gic gicVar, mmb mmbVar2, long j, zn2 zn2Var) {
        a49 a49Var;
        jmb jmbVar2;
        gic gicVar2;
        mmb mmbVar3;
        boolean z;
        if (zn2Var instanceof a49) {
            a49Var = (a49) zn2Var;
            int i = a49Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                a49Var.label = i - Integer.MIN_VALUE;
            } else {
                a49Var = new a49(zn2Var);
            }
        } else {
            a49Var = new a49(zn2Var);
        }
        Object objS = a49Var.result;
        int i2 = a49Var.label;
        if (i2 == 0) {
            jzb.q(objS);
            if (j < 0) {
                return Boolean.FALSE;
            }
            b49 b49Var = new b49(d49Var, null);
            a49Var.L$0 = d49Var;
            a49Var.L$1 = mmbVar;
            a49Var.L$2 = jmbVar;
            a49Var.L$3 = gicVar;
            a49Var.L$4 = mmbVar2;
            a49Var.label = 1;
            objS = rs0.S(j, b49Var, a49Var);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
                return bw2Var;
            }
            jmbVar2 = jmbVar;
            gicVar2 = gicVar;
            mmbVar3 = mmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmb mmbVar4 = (mmb) a49Var.L$4;
            gic gicVar3 = (gic) a49Var.L$3;
            jmbVar2 = (jmb) a49Var.L$2;
            mmb mmbVar5 = (mmb) a49Var.L$1;
            d49 d49Var2 = (d49) a49Var.L$0;
            jzb.q(objS);
            mmbVar3 = mmbVar4;
            gicVar2 = gicVar3;
            mmbVar = mmbVar5;
            d49Var = d49Var2;
        }
        x39 x39Var = (x39) objS;
        if (x39Var != null) {
            boolean z2 = ((x39) mmbVar.element).c;
            long j2 = x39Var.a;
            mmbVar.element = new x39(j2, x39Var.b, z2);
            jmbVar2.element = gicVar2.j(gicVar2.f(j2));
            mmbVar3.element = g21.a(0.0f, 0.0f, 30);
            w84 w84Var = d49Var.e;
            long j3 = x39Var.b;
            long j4 = x39Var.a;
            ((btf) w84Var.b).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
            ((btf) w84Var.c).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
            z = !abg.I(jmbVar2.element);
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static x39 g(r41 r41Var) {
        x39 x39Var = null;
        dyc dycVarI = dec.i(new og9(new w39(r41Var, 0), null));
        while (dycVarI.hasNext()) {
            x39 x39VarA = (x39) dycVarI.next();
            if (x39Var != null) {
                x39VarA = x39Var.a(x39VarA);
            }
            x39Var = x39VarA;
        }
        return x39Var;
    }

    public final float c(dic dicVar, float f) {
        gic gicVar = this.a;
        long jI = gicVar.i(gicVar.e(f));
        gic gicVar2 = dicVar.a;
        return gicVar.h(gicVar.f(gicVar2.d(gicVar2.k, jI, 1)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    public final Object d(gic gicVar, x39 x39Var, float f, float f2, zn2 zn2Var) {
        y39 y39Var;
        wef wefVar;
        Object obj;
        jmb jmbVar;
        float f3;
        gic gicVar2;
        if (zn2Var instanceof y39) {
            y39Var = (y39) zn2Var;
            int i = y39Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                y39Var.label = i - Integer.MIN_VALUE;
            } else {
                y39Var = new y39(this, zn2Var);
            }
        } else {
            y39Var = new y39(this, zn2Var);
        }
        y39 y39Var2 = y39Var;
        Object obj2 = y39Var2.result;
        int i2 = y39Var2.label;
        w84 w84Var = this.e;
        wef wefVar2 = wef.a;
        Object obj3 = bw2.a;
        if (i2 == 0) {
            mmb mmbVarD = ks0.d(obj2);
            mmbVarD.element = x39Var;
            wefVar = wefVar2;
            long j = x39Var.b;
            long j2 = x39Var.a;
            ((btf) w84Var.b).a(j, Float.intBitsToFloat((int) (j2 >> 32)));
            ((btf) w84Var.c).a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
            x39 x39VarG = g(this.g);
            if (x39VarG != null) {
                long j3 = x39VarG.b;
                long j4 = x39VarG.a;
                ((btf) w84Var.b).a(j3, Float.intBitsToFloat((int) (j4 >> 32)));
                ((btf) w84Var.c).a(j3, Float.intBitsToFloat((int) (j4 & 4294967295L)));
                mmbVarD.element = ((x39) mmbVarD.element).a(x39VarG);
            }
            jmb jmbVar2 = new jmb();
            float fH = gicVar.h(gicVar.f(((x39) mmbVarD.element).a));
            jmbVar2.element = fH;
            if (!abg.I(fH)) {
                mmb mmbVar = new mmb();
                mmbVar.element = g21.a(0.0f, 0.0f, 30);
                obj = obj3;
                l26 z39Var = new z39(jmbVar2, mmbVar, mmbVarD, f, this, f2, gicVar, null);
                y39Var2.L$0 = gicVar;
                y39Var2.L$1 = jmbVar2;
                y39Var2.F$0 = f2;
                y39Var2.label = 1;
                if (b(z39Var, y39Var2) != obj) {
                    jmbVar = jmbVar2;
                    f3 = f2;
                    gicVar2 = gicVar;
                }
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jzb.q(obj2);
                return wefVar2;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        f3 = y39Var2.F$0;
        jmbVar = (jmb) y39Var2.L$1;
        gicVar2 = (gic) y39Var2.L$0;
        jzb.q(obj2);
        obj = obj3;
        wefVar = wefVar2;
        long j5 = q7c.j(((btf) w84Var.b).c(Float.MAX_VALUE), ((btf) w84Var.c).c(Float.MAX_VALUE));
        if (j5 == 0) {
            float fE = gicVar2.e(Math.signum(jmbVar.element)) * Math.min(Math.abs(jmbVar.element) / 100.0f, f3) * 1000.0f;
            if (fE == 0.0f) {
                j5 = 0;
            } else {
                j5 = gicVar2.d == ks9.b ? q7c.j(fE, 0.0f) : q7c.j(0.0f, fE);
            }
        }
        zsf zsfVar = new zsf(j5);
        y39Var2.L$0 = null;
        y39Var2.L$1 = null;
        y39Var2.label = 2;
        return this.b.z(zsfVar, y39Var2) == obj ? obj : wefVar;
    }

    public final boolean f(hia hiaVar) {
        long j;
        sw3 sw3Var = this.c;
        ViewConfiguration viewConfiguration = (ViewConfiguration) this.f.b;
        int i = Build.VERSION.SDK_INT;
        float f = -(i > 26 ? viewConfiguration.getScaledVerticalScrollFactor() : sw3Var.p0(64.0f));
        float f2 = -(i > 26 ? viewConfiguration.getScaledHorizontalScrollFactor() : sw3Var.p0(64.0f));
        List list = hiaVar.a;
        hl9 hl9Var = new hl9(0L);
        int size = list.size();
        boolean zD = false;
        int i2 = 0;
        while (true) {
            j = hl9Var.a;
            if (i2 >= size) {
                break;
            }
            hl9Var = new hl9(hl9.g(j, ((oia) list.get(i2)).j));
            i2++;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)) * f2)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) * f)) & 4294967295L);
        gic gicVar = this.a;
        float fJ = gicVar.j(gicVar.f(jFloatToRawIntBits));
        if (fJ != 0.0f) {
            zhc zhcVar = gicVar.a;
            zD = fJ > 0.0f ? zhcVar.d() : zhcVar.c();
        }
        if (zD) {
            return !(this.g.d(new x39(jFloatToRawIntBits, ((oia) s72.v0(hiaVar.a)).b, false)) instanceof qw1);
        }
        return this.d;
    }
}
