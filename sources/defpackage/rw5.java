package defpackage;

import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import java.util.LinkedHashMap;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;
import tech.chatmind.api.seasonal.model.SeasonalStatus;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rw5 implements hf8 {
    public static final /* synthetic */ int f = 0;
    public final fab a;
    public final q9b b;
    public final lqc c;
    public final LinkedHashMap d;
    public final s0e e;

    public rw5(fab fabVar, q9b q9bVar, lqc lqcVar) {
        this.a = fabVar;
        this.b = q9bVar;
        this.c = lqcVar;
        mx4 mx4Var = mic.f;
        int iF = bm8.F(t72.u(mx4Var, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF < 16 ? 16 : iF);
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            Object next = l2Var.next();
            linkedHashMap.put(next, t0e.a(h(((eab) this.b).b())));
        }
        this.d = linkedHashMap;
        this.e = t0e.a(ax5.a);
    }

    public static ax5 c(yic yicVar) {
        int i = yicVar.a;
        String wireValue = yicVar.b.getWireValue();
        wireValue.getClass();
        SeasonalQaFixtureState seasonalQaFixtureStateP = v2c.p();
        if (seasonalQaFixtureStateP != null) {
            if (!v2c.x(seasonalQaFixtureStateP, i, wireValue)) {
                seasonalQaFixtureStateP = null;
            }
            if (seasonalQaFixtureStateP != null) {
                String status = seasonalQaFixtureStateP.getStatus();
                wnc.a.getClass();
                wnc wncVarF = eu4.f(status);
                if (wncVarF != null) {
                    int iOrdinal = wncVarF.ordinal();
                    if (iOrdinal == 0) {
                        return ax5.a;
                    }
                    if (iOrdinal == 1) {
                        return ax5.b;
                    }
                    if (iOrdinal == 2) {
                        return ax5.c;
                    }
                    if (iOrdinal == 3) {
                        return ax5.e;
                    }
                    ap.c();
                    return null;
                }
            }
        }
        return null;
    }

    public static ax5 h(QuotaUsage quotaUsage) {
        ax5 ax5Var = ax5.a;
        return (quotaUsage != null && y41.w(quotaUsage)) ? ax5.b : ax5Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:34:0x00af  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum a(yic yicVar, zn2 zn2Var) {
        mw5 mw5Var;
        mic micVarB;
        ax5 ax5VarC;
        mic micVar;
        rw5 rw5Var;
        QuotaUsage quotaUsage;
        mic micVar2;
        int i;
        ax5 ax5VarH;
        if (zn2Var instanceof mw5) {
            mw5Var = (mw5) zn2Var;
            int i2 = mw5Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mw5Var.label = i2 - Integer.MIN_VALUE;
            } else {
                mw5Var = new mw5(this, zn2Var);
            }
        } else {
            mw5Var = new mw5(this, zn2Var);
        }
        Object obj = mw5Var.result;
        int i3 = mw5Var.label;
        bw2 bw2Var = bw2.a;
        if (i3 == 0) {
            jzb.q(obj);
            micVarB = yicVar.b();
            if (micVarB == null) {
                qc0.j("Required value was null.");
                return null;
            }
            ax5VarC = c(yicVar);
            if (ax5VarC == null) {
                mw5Var.L$0 = yicVar;
                mw5Var.L$1 = micVarB;
                mw5Var.L$2 = this;
                mw5Var.label = 1;
                Object objB = ((rab) this.a).b(mw5Var);
                if (objB != bw2Var) {
                    micVar = micVarB;
                    obj = objB;
                    rw5Var = this;
                }
                return bw2Var;
            }
            s0e s0eVar = (s0e) ((h89) bm8.B(this.d, micVarB));
            s0eVar.getClass();
            s0eVar.n(null, ax5VarC);
            return ax5VarC;
        }
        if (i3 == 1) {
            rw5 rw5Var2 = (rw5) mw5Var.L$2;
            mic micVar3 = (mic) mw5Var.L$1;
            yic yicVar2 = (yic) mw5Var.L$0;
            jzb.q(obj);
            rw5Var = rw5Var2;
            yicVar = yicVar2;
            micVar = micVar3;
        } else {
            if (i3 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            quotaUsage = (QuotaUsage) mw5Var.L$3;
            rw5Var = (rw5) mw5Var.L$2;
            micVar2 = (mic) mw5Var.L$1;
            jzb.q(obj);
        }
        i = lw5.a[((SeasonalReadingResponse) obj).getStatus().ordinal()];
        if (i != 1) {
            ax5VarH = ax5.e;
        } else if (i != 2) {
            ax5VarH = ax5.c;
        } else if (i != 3) {
            rw5Var.getClass();
            ax5VarH = h(quotaUsage);
        } else {
            ax5VarH = ax5.d;
        }
        ax5VarC = ax5VarH;
        micVarB = micVar2;
        s0e s0eVar2 = (s0e) ((h89) bm8.B(this.d, micVarB));
        s0eVar2.getClass();
        s0eVar2.n(null, ax5VarC);
        return ax5VarC;
        if (obj == null) {
            qc0.p("Seasonal quota request failed");
            return null;
        }
        QuotaUsage quotaUsage2 = (QuotaUsage) obj;
        lqc lqcVar = rw5Var.c;
        int i4 = yicVar.a;
        SolarTerm solarTerm = yicVar.b;
        mw5Var.L$0 = null;
        mw5Var.L$1 = micVar;
        mw5Var.L$2 = rw5Var;
        mw5Var.L$3 = quotaUsage2;
        mw5Var.label = 2;
        Object objB2 = lqcVar.b(i4, solarTerm, mw5Var);
        if (objB2 != bw2Var) {
            obj = objB2;
            quotaUsage = quotaUsage2;
            micVar2 = micVar;
            i = lw5.a[((SeasonalReadingResponse) obj).getStatus().ordinal()];
            if (i != 1) {
                ax5VarH = ax5.e;
            } else if (i != 2) {
                ax5VarH = ax5.c;
            } else if (i != 3) {
                rw5Var.getClass();
                ax5VarH = h(quotaUsage);
            } else {
                ax5VarH = ax5.d;
            }
            ax5VarC = ax5VarH;
            micVarB = micVar2;
            s0e s0eVar3 = (s0e) ((h89) bm8.B(this.d, micVarB));
            s0eVar3.getClass();
            s0eVar3.n(null, ax5VarC);
            return ax5VarC;
        }
        return bw2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(yic yicVar, zn2 zn2Var) {
        ow5 ow5Var;
        mic micVarB;
        h89 h89Var;
        h89 h89Var2;
        if (zn2Var instanceof ow5) {
            ow5Var = (ow5) zn2Var;
            int i = ow5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ow5Var.label = i - Integer.MIN_VALUE;
            } else {
                ow5Var = new ow5(this, zn2Var);
            }
        } else {
            ow5Var = new ow5(this, zn2Var);
        }
        Object objF = ow5Var.result;
        int i2 = ow5Var.label;
        bw2 bw2Var = bw2.a;
        if (i2 != 0) {
            if (i2 == 1) {
                h89Var = (h89) ow5Var.L$2;
                micVarB = (mic) ow5Var.L$1;
                jzb.q(objF);
            } else {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                h89Var2 = (h89) ow5Var.L$4;
                h89Var = (h89) ow5Var.L$2;
                jzb.q(objF);
            }
            ((s0e) h89Var2).m(objF);
            return ((s0e) h89Var).getValue();
        }
        jzb.q(objF);
        micVarB = yicVar.b();
        if (micVarB == null) {
            return ax5.a;
        }
        h89 h89Var3 = (h89) bm8.B(this.d, micVarB);
        ax5 ax5VarC = c(yicVar);
        if (ax5VarC != null) {
            s0e s0eVar = (s0e) h89Var3;
            s0eVar.getClass();
            s0eVar.n(null, ax5VarC);
            return ax5VarC;
        }
        ow5Var.L$0 = null;
        ow5Var.L$1 = micVarB;
        ow5Var.L$2 = h89Var3;
        ow5Var.label = 1;
        Object objB = ((rab) this.a).b(ow5Var);
        if (objB != bw2Var) {
            objF = objB;
            h89Var = h89Var3;
        }
        return bw2Var;
        QuotaUsage quotaUsage = (QuotaUsage) objF;
        if (quotaUsage == null) {
            return ((s0e) h89Var).getValue();
        }
        ax5 ax5VarH = h(quotaUsage);
        ow5Var.L$0 = null;
        ow5Var.L$1 = null;
        ow5Var.L$2 = h89Var;
        ow5Var.L$3 = null;
        ow5Var.L$4 = h89Var;
        ow5Var.label = 2;
        objF = f(micVarB, ax5VarH, ow5Var);
        if (objF != bw2Var) {
            h89Var2 = h89Var;
            ((s0e) h89Var2).m(objF);
            return ((s0e) h89Var).getValue();
        }
        return bw2Var;
    }

    public final void e(yic yicVar) {
        mic micVarB = yicVar.b();
        if (micVarB == null) {
            return;
        }
        h89 h89Var = (h89) bm8.B(this.d, micVarB);
        ax5 ax5VarC = c(yicVar);
        if (ax5VarC == null) {
            ax5VarC = h(((eab) this.b).b());
        }
        s0e s0eVar = (s0e) h89Var;
        s0eVar.getClass();
        s0eVar.n(null, ax5VarC);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum f(mic micVar, ax5 ax5Var, zn2 zn2Var) {
        pw5 pw5Var;
        if (zn2Var instanceof pw5) {
            pw5Var = (pw5) zn2Var;
            int i = pw5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                pw5Var.label = i - Integer.MIN_VALUE;
            } else {
                pw5Var = new pw5(this, zn2Var);
            }
        } else {
            pw5Var = new pw5(this, zn2Var);
        }
        Object objG = pw5Var.result;
        int i2 = pw5Var.label;
        if (i2 == 0) {
            jzb.q(objG);
            pw5Var.L$0 = null;
            pw5Var.L$1 = ax5Var;
            pw5Var.label = 1;
            objG = g(micVar, pw5Var);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ax5Var = (ax5) pw5Var.L$1;
            jzb.q(objG);
        }
        SeasonalStatus seasonalStatus = (SeasonalStatus) objG;
        int i3 = seasonalStatus == null ? -1 : lw5.a[seasonalStatus.ordinal()];
        if (i3 == 1) {
            return ax5.e;
        }
        if (i3 != 2) {
            return i3 != 3 ? ax5Var : ax5.d;
        }
        return ax5.c;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Enum g(mic micVar, zn2 zn2Var) {
        qw5 qw5Var;
        if (zn2Var instanceof qw5) {
            qw5Var = (qw5) zn2Var;
            int i = qw5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qw5Var.label = i - Integer.MIN_VALUE;
            } else {
                qw5Var = new qw5(this, zn2Var);
            }
        } else {
            qw5Var = new qw5(this, zn2Var);
        }
        Object objE = qw5Var.result;
        int i2 = qw5Var.label;
        if (i2 == 0) {
            jzb.q(objE);
            int iB = micVar.b();
            SolarTerm solarTermC = micVar.c();
            qw5Var.L$0 = null;
            qw5Var.label = 1;
            objE = this.c.e(iB, solarTermC, qw5Var);
            bw2 bw2Var = bw2.a;
            if (objE == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objE);
        }
        SeasonalReadingResponse seasonalReadingResponse = (SeasonalReadingResponse) objE;
        if (seasonalReadingResponse != null) {
            return seasonalReadingResponse.getStatus();
        }
        return null;
    }
}
