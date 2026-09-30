package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.BillingSessionOwner;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g4 extends gcg {
    public static final /* synthetic */ int O0 = 0;
    public boolean E0;
    public long F0;
    public v6a G0;
    public final LinkedHashSet H0;
    public final LinkedHashMap I0;
    public final LinkedHashMap J0;
    public dg7 K0;
    public boolean L0;
    public final boolean M0;
    public vb2 N0;
    public String X;
    public String Y;
    public String Z;
    public final t7 d;
    public final hwa e;
    public final vz9 f;
    public String g;
    public boolean v;
    public boolean w;
    public njd x;
    public final vz9 y;
    public boolean z;

    public g4(t7 t7Var, hwa hwaVar) {
        t7Var.getClass();
        this.d = t7Var;
        this.e = hwaVar;
        this.f = q1c.f(Boolean.FALSE);
        this.y = q1c.f(f0e.a);
        this.H0 = new LinkedHashSet();
        this.I0 = new LinkedHashMap();
        this.J0 = new LinkedHashMap();
        this.M0 = true;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:25:0x007f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (defpackage.vfh.q(r10, r0) == r6) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0094 -> B:30:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object F(defpackage.g4 r9, long r10, defpackage.a26 r12, defpackage.zn2 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.w3
            if (r0 == 0) goto L13
            r0 = r13
            w3 r0 = (defpackage.w3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            w3 r0 = new w3
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 0
            r4 = 2
            r5 = 1
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L53
            if (r1 == r5) goto L43
            if (r1 != r4) goto L3d
            int r9 = r0.I$0
            long r10 = r0.J$0
            java.lang.Object r12 = r0.L$2
            java.lang.Object r1 = r0.L$1
            a26 r1 = (defpackage.a26) r1
            java.lang.Object r7 = r0.L$0
            g4 r7 = (defpackage.g4) r7
            defpackage.jzb.q(r13)
            r13 = r12
            r12 = r1
            r1 = r7
            goto L97
        L3d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            return r3
        L43:
            int r9 = r0.I$0
            long r10 = r0.J$0
            java.lang.Object r12 = r0.L$1
            a26 r12 = (defpackage.a26) r12
            java.lang.Object r1 = r0.L$0
            g4 r1 = (defpackage.g4) r1
            defpackage.jzb.q(r13)
            goto L72
        L53:
            defpackage.jzb.q(r13)
            r13 = r2
            r1 = r3
        L58:
            r7 = 3
            if (r13 >= r7) goto L9f
            r0.L$0 = r9
            r0.L$1 = r12
            r0.L$2 = r3
            r0.J$0 = r10
            r0.I$0 = r13
            r0.label = r5
            java.lang.Object r1 = r9.i(r0)
            if (r1 != r6) goto L6e
            goto L96
        L6e:
            r8 = r1
            r1 = r9
            r9 = r13
            r13 = r8
        L72:
            if (r13 == 0) goto L7f
            java.lang.Object r7 = r12.d(r13)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L80
        L7f:
            r7 = r2
        L80:
            if (r7 != 0) goto L9d
            r0.L$0 = r1
            r0.L$1 = r12
            r0.L$2 = r13
            r0.J$0 = r10
            r0.I$0 = r9
            r0.I$1 = r7
            r0.label = r4
            java.lang.Object r7 = defpackage.vfh.q(r10, r0)
            if (r7 != r6) goto L97
        L96:
            return r6
        L97:
            int r9 = r9 + r5
            r8 = r13
            r13 = r9
            r9 = r1
            r1 = r8
            goto L58
        L9d:
            r9 = r1
            r1 = r13
        L9f:
            m8b r9 = r9.d()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "User subscription info updated: "
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            r9.e(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.F(g4, long, a26, zn2):java.lang.Object");
    }

    public static boolean J(g4 g4Var, boolean z) {
        if (!g4Var.L0) {
            return false;
        }
        g4Var.L0 = false;
        g4Var.B(z);
        return true;
    }

    public void E(String str) {
        str.getClass();
    }

    public boolean G(String str, String str2) {
        str.getClass();
        return true;
    }

    public final void H(bwa bwaVar, String str) {
        String strA;
        bwaVar.getClass();
        str.getClass();
        String strP = ym8.P(bwaVar);
        if (q()) {
            return;
        }
        if (this.w) {
            jcc.k(1, Integer.valueOf(R.string.chat_mind_pricing_google_billing_unavailable));
            this.v = false;
            K(false);
            this.X = null;
            A(strP, "service_disconnected");
            return;
        }
        njd njdVar = this.x;
        if (njdVar == null) {
            this.v = false;
            K(false);
            this.X = null;
            A(strP, "pay_unavailable");
            return;
        }
        String strH = h(njdVar);
        if (strH != null) {
            this.v = false;
            K(false);
            this.X = null;
            A(strP, strH);
            return;
        }
        K(true);
        this.v = true;
        this.X = strP;
        this.Y = bwaVar.getType().b();
        if (bwaVar instanceof z6e) {
            strA = ((z6e) bwaVar).a();
        } else {
            if (!(bwaVar instanceof n07)) {
                ap.c();
                return;
            }
            strA = ((n07) bwaVar).a();
        }
        if (v4e.Q(strA)) {
            strA = null;
        }
        this.Z = strA;
        this.E0 = false;
        this.F0++;
        f(new x3(njdVar, bwaVar, str, this, null));
    }

    public final void I() {
        njd njdVar = this.x;
        if (njdVar == null || this.v || q()) {
            return;
        }
        dg7 dg7Var = this.K0;
        if (dg7Var == null || !dg7Var.b()) {
            y();
            f(new y3(this, null, njdVar));
            this.K0 = (dg7) this.b.getValue();
        }
    }

    public final void K(boolean z) {
        this.f.setValue(Boolean.valueOf(z));
    }

    public final void L(int i, l46 l46Var) {
        l46Var.h0(-951510064);
        int i2 = (l46Var.i(this) ? 4 : 2) | i;
        int i3 = 1;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            Context context = (Context) l46Var.k(uq.b);
            boolean zI = l46Var.i(context) | l46Var.i(this);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new a4(context, this, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i1(this, i, i3);
        }
    }

    public void M(vb2 vb2Var) {
        vb2Var.getClass();
        this.N0 = vb2Var;
        SharedPreferences sharedPreferences = vb2Var.getApplicationContext().getSharedPreferences("pending_purchase_attributions", 0);
        sharedPreferences.getClass();
        this.G0 = new v6a(sharedPreferences);
        njd njdVar = this.x;
        if (njdVar != null) {
            t(njdVar);
            return;
        }
        hr7 hr7Var = af8.Z;
        if (hr7Var == null) {
            qc0.p("KoinApplication has not been started");
            return;
        }
        njd njdVar2 = (njd) ((nfc) hr7Var.c.e).g(job.a.b(njd.class), db6.A0(vb2Var), null);
        ynb.V(hwf.a(this), null, null, new d4(this, null, njdVar2), 3);
        t(njdVar2);
        this.x = njdVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object N(zn2 zn2Var) {
        e4 e4Var;
        Object obj;
        if (zn2Var instanceof e4) {
            e4Var = (e4) zn2Var;
            int i = e4Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4Var.label = i - Integer.MIN_VALUE;
            } else {
                e4Var = new e4(this, zn2Var);
            }
        } else {
            e4Var = new e4(this, zn2Var);
        }
        Object objF = e4Var.result;
        int i2 = e4Var.label;
        if (i2 == 0) {
            jzb.q(objF);
            q3 q3Var = new q3(this, 1);
            e4Var.label = 1;
            objF = F(this, 3000L, q3Var, e4Var);
            bw2 bw2Var = bw2.a;
            if (objF == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objF);
        }
        boolean z = false;
        if (objF != null && r(objF)) {
            z = true;
        }
        C(objF);
        if (z) {
            this.z = true;
            obj = g0e.a;
        } else {
            obj = e0e.a;
        }
        this.y.setValue(obj);
        return wef.a;
    }

    @Override // defpackage.ewf
    public final void e() {
        BillingSession billingSession;
        K(false);
        this.w = false;
        njd njdVar = this.x;
        if (njdVar != null) {
            GooglePay googlePay = (GooglePay) njdVar;
            googlePay.d().e("Billing stop.");
            BillingSessionOwner billingSessionOwner = googlePay.e;
            synchronized (billingSessionOwner.b) {
                billingSessionOwner.c++;
                billingSession = billingSessionOwner.d;
                billingSessionOwner.d = null;
            }
            if (billingSession != null) {
                billingSessionOwner.a(billingSession.a);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object g(zn2 zn2Var) {
        s3 s3Var;
        long j;
        if (zn2Var instanceof s3) {
            s3Var = (s3) zn2Var;
            int i = s3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                s3Var.label = i - Integer.MIN_VALUE;
            } else {
                s3Var = new s3(this, zn2Var);
            }
        } else {
            s3Var = new s3(this, zn2Var);
        }
        Object obj = s3Var.result;
        int i2 = s3Var.label;
        wef wefVar = wef.a;
        if (i2 == 0) {
            jzb.q(obj);
            if (!this.E0) {
                long j2 = this.F0;
                K(true);
                q3 q3Var = new q3(this, 0);
                s3Var.J$0 = j2;
                s3Var.label = 1;
                Object objF = F(this, 3000L, q3Var, s3Var);
                bw2 bw2Var = bw2.a;
                if (objF == bw2Var) {
                    return bw2Var;
                }
                j = j2;
            }
            return wefVar;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = s3Var.J$0;
        jzb.q(obj);
        if (j == this.F0) {
            K(false);
        }
        return wefVar;
    }

    public final String h(njd njdVar) {
        t7 t7Var = this.d;
        String strA = ((mo3) t7Var).a();
        vb2 vb2Var = this.N0;
        if (vb2Var == null) {
            d().b("no activityContext");
            return "activity_unavailable";
        }
        if (!y41.N(t7Var, vb2Var, null, 6)) {
            return "sign_in_required";
        }
        if (pa7.t(this.g, strA)) {
            return null;
        }
        GooglePay googlePay = (GooglePay) njdVar;
        googlePay.getClass();
        strA.getClass();
        googlePay.b = strA;
        return null;
    }

    public abstract Object i(zn2 zn2Var);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(o07 o07Var, zn2 zn2Var) {
        t3 t3Var;
        if (zn2Var instanceof t3) {
            t3Var = (t3) zn2Var;
            int i = t3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                t3Var.label = i - Integer.MIN_VALUE;
            } else {
                t3Var = new t3(this, zn2Var);
            }
        } else {
            t3Var = new t3(this, zn2Var);
        }
        Object objF = t3Var.result;
        int i2 = t3Var.label;
        Object obj = null;
        if (i2 == 0) {
            jzb.q(objF);
            this.z = false;
            if (n()) {
                K(true);
                q3 q3Var = new q3(this, 2);
                t3Var.L$0 = o07Var;
                t3Var.label = 1;
                objF = F(this, 3000L, q3Var, t3Var);
                bw2 bw2Var = bw2.a;
                if (objF == bw2Var) {
                    return bw2Var;
                }
            }
            this.y.setValue(g0e.a);
            u(obj, t72.H(o07Var));
            return wef.a;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o07Var = (o07) t3Var.L$0;
        jzb.q(objF);
        K(false);
        obj = objF;
        this.y.setValue(g0e.a);
        u(obj, t72.H(o07Var));
        return wef.a;
    }

    public String l() {
        return null;
    }

    public String m() {
        return null;
    }

    public boolean n() {
        return this.M0;
    }

    public final o0e o() {
        return (o0e) this.y.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x030c, code lost:
    
        if (k(r1, r3) == r4) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0163, code lost:
    
        if (k(r1, r3) == r4) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01cf, code lost:
    
        if (k(r1, r3) == r4) goto L139;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(defpackage.j3a r19, defpackage.zn2 r20) {
        /*
            Method dump skipped, instruction units count: 801
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4.p(j3a, zn2):java.lang.Object");
    }

    public final boolean q() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public abstract boolean r(Object obj);

    public abstract boolean s(Object obj);

    public final void t(njd njdVar) {
        d().e("Load subscriptions prices");
        this.y.setValue(f0e.a);
        y();
        f(new v3(this, null, njdVar));
        this.K0 = (dg7) this.b.getValue();
    }

    public void x(String str, List list) {
        str.getClass();
    }

    public abstract void z();

    public void v() {
    }

    public void y() {
    }

    public void A(String str, String str2) {
    }

    public void u(Object obj, List list) {
    }

    public void B(boolean z) {
    }

    public void C(Object obj) {
    }

    public void D(ArrayList arrayList) {
    }

    public void w(ArrayList arrayList) {
    }
}
