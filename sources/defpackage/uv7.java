package defpackage;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uv7 {
    public final dj a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public dj h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public uv7(dj djVar, int i) {
        this.j = i;
        this.a = djVar;
    }

    public final void a(zi ziVar, int i, yf9 yf9Var) {
        float f = i;
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(f)) << 32;
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(f)) & 4294967295L;
        while (true) {
            long jM = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        ew9 ew9Var = yf9Var.k1;
                        if (ew9Var != null) {
                            ne6 ne6Var = (ne6) ew9Var;
                            float[] fArrB = ne6Var.b();
                            if (!ne6Var.H0) {
                                jM = zm8.b(jM, fArrB);
                            }
                        }
                        jM = qn4.M(jM, yf9Var.W0);
                        break;
                    default:
                        ng8 ng8VarF1 = yf9Var.f1();
                        ng8VarF1.getClass();
                        long j = ng8VarF1.K0;
                        jM = hl9.g((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32), jM);
                        break;
                }
                yf9Var = yf9Var.N0;
                yf9Var.getClass();
                if (yf9Var.equals(this.a.d())) {
                    int iRound = Math.round(ziVar instanceof oq6 ? Float.intBitsToFloat((int) (jM & 4294967295L)) : Float.intBitsToFloat((int) (jM >> 32)));
                    HashMap map = this.i;
                    if (map.containsKey(ziVar)) {
                        int iIntValue = ((Number) bm8.B(map, ziVar)).intValue();
                        oq6 oq6Var = cj.a;
                        iRound = ((Number) ziVar.a.z(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(ziVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!b(yf9Var).containsKey(ziVar));
            float fC = c(yf9Var, ziVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(yf9 yf9Var) {
        switch (this.j) {
            case 0:
                return yf9Var.B0().a();
            default:
                ng8 ng8VarF1 = yf9Var.f1();
                ng8VarF1.getClass();
                return ng8VarF1.B0().a();
        }
    }

    public final int c(yf9 yf9Var, zi ziVar) {
        switch (this.j) {
            case 0:
                return yf9Var.W(ziVar);
            default:
                ng8 ng8VarF1 = yf9Var.f1();
                ng8VarF1.getClass();
                return ng8VarF1.W(ziVar);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        dj djVar = this.a;
        dj djVarG = djVar.g();
        if (djVarG == null) {
            return;
        }
        if (this.c) {
            djVarG.U();
        } else if (this.e || this.d) {
            djVarG.requestLayout();
        }
        if (this.f) {
            djVar.U();
        }
        if (this.g) {
            djVar.requestLayout();
        }
        djVarG.a().f();
    }

    public final void g() {
        HashMap map = this.i;
        map.clear();
        c1 c1Var = new c1(8, this);
        dj djVar = this.a;
        djVar.D(c1Var);
        map.putAll(b(djVar.d()));
        this.b = false;
    }

    public final void h() {
        uv7 uv7VarA;
        uv7 uv7VarA2;
        boolean zD = d();
        dj djVar = this.a;
        if (!zD) {
            dj djVarG = djVar.g();
            if (djVarG == null) {
                return;
            }
            djVar = djVarG.a().h;
            if (djVar == null || !djVar.a().d()) {
                dj djVar2 = this.h;
                if (djVar2 == null || djVar2.a().d()) {
                    return;
                }
                dj djVarG2 = djVar2.g();
                if (djVarG2 != null && (uv7VarA2 = djVarG2.a()) != null) {
                    uv7VarA2.h();
                }
                dj djVarG3 = djVar2.g();
                djVar = (djVarG3 == null || (uv7VarA = djVarG3.a()) == null) ? null : uv7VarA.h;
            }
        }
        this.h = djVar;
    }
}
