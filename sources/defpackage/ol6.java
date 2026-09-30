package defpackage;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ol6 extends ewf implements hf8 {
    public boolean X;
    public final whb Y;
    public final tc4 b;
    public final g6b c;
    public final s7 d;
    public final qk6 e;
    public String f;
    public String g;
    public final s0e v;
    public final s0e w;
    public lyd x;
    public final ConcurrentHashMap.KeySetView y;
    public final ConcurrentHashMap.KeySetView z;

    public ol6(tc4 tc4Var, g6b g6bVar, s7 s7Var) {
        qk6 qk6Var = new qk6(0);
        this.b = tc4Var;
        this.c = g6bVar;
        this.d = s7Var;
        this.e = qk6Var;
        this.g = "";
        this.v = t0e.a(Boolean.TRUE);
        this.w = t0e.a(Boolean.FALSE);
        this.y = ConcurrentHashMap.newKeySet();
        this.z = ConcurrentHashMap.newKeySet();
        a62 a62VarA = hwf.a(this);
        js3 js3Var = ga4.a;
        ynb.V(a62VarA, hr3.c, null, new hl6(null, this), 2);
        this.Y = if9.F(am5.a(s7.b(), new ml6(null, this)), hwf.a(this), new xzd(3000L, Long.MAX_VALUE), dl6.a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, boolean z, zn2 zn2Var) {
        ll6 ll6Var;
        if (zn2Var instanceof ll6) {
            ll6Var = (ll6) zn2Var;
            int i = ll6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ll6Var.label = i - Integer.MIN_VALUE;
            } else {
                ll6Var = new ll6(this, zn2Var);
            }
        } else {
            ll6Var = new ll6(this, zn2Var);
        }
        Object obj = ll6Var.result;
        int i2 = ll6Var.label;
        wef wefVar = wef.a;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return wefVar;
            }
            jzb.q(obj);
            if (!z && !this.X && pa7.t(str, this.g)) {
                ConcurrentHashMap.KeySetView keySetView = this.y;
                keySetView.getClass();
                Set setO1 = s72.o1(keySetView);
                ConcurrentHashMap.KeySetView keySetView2 = this.z;
                keySetView2.getClass();
                Set setO2 = s72.o1(keySetView2);
                ll6Var.L$0 = str;
                ll6Var.L$1 = null;
                ll6Var.L$2 = null;
                ll6Var.Z$0 = z;
                ll6Var.label = 1;
                Object objA = this.b.a(str, setO1, setO2, ll6Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            }
            return wefVar;
        } catch (Exception e) {
            d().h("completeCloudSyncSession failed for accountId=" + str, e);
        }
    }
}
