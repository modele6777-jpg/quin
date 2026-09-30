package defpackage;

import ai.askquin.R;
import ai.askquin.ui.account.component.AuthOption;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.User;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qmf extends ewf implements hf8 {
    public static final /* synthetic */ int Z = 0;
    public final tz9 X;
    public lyd Y;
    public final ht6 b;
    public final fab c;
    public final shd d = new shd();
    public final vz9 e;
    public final vz9 f;
    public final use g;
    public final vz9 v;
    public final vz9 w;
    public final zv1 x;
    public final vz9 y;
    public final vz9 z;

    public qmf(ht6 ht6Var, fab fabVar) {
        this.b = ht6Var;
        this.c = fabVar;
        List listI = feg.I();
        AuthOption authOption = AuthOption.Phone;
        this.e = q1c.f(((ArrayList) listI).contains(authOption) ? authOption : AuthOption.Email);
        Boolean bool = Boolean.FALSE;
        this.f = q1c.f(bool);
        this.g = new use((String) null, 3);
        this.v = q1c.f(null);
        this.w = q1c.f(bool);
        int i = -2;
        this.x = new zv1(urg.a(-2, null, null, 6), false);
        List listK0 = qd0.k0(new awe[]{af1.W(if8.a, cn1.z()), af1.W(if8.b, cn1.z()), af1.W(if8.c, cn1.z())});
        ArrayList<awe> arrayList = (ArrayList) listK0;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(t72.u(listK0, 10));
            for (awe aweVar : arrayList) {
                arrayList2.add(new ilf(aweVar.c(), aweVar));
            }
            int i2 = am5.a;
            ok8.C(new kl5(new dw1(arrayList2, nu4.a, i, i41.a, 1), new dlf(this, null), 1), hwf.a(this));
        }
        ca2.a.getClass();
        this.y = q1c.f(Boolean.valueOf(ca2.c));
        this.z = q1c.f(null);
        this.X = new tz9(60L);
    }

    public static void m(qmf qmfVar) {
        lyd lydVar = qmfVar.Y;
        if (lydVar != null) {
            lydVar.h(null);
        }
        qmfVar.Y = ynb.V(hwf.a(qmfVar), null, null, new bmf(60L, qmfVar, null), 3);
    }

    @Override // defpackage.ewf
    public final void e() {
        lyd lydVar = this.Y;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.Y = null;
    }

    public final Object f(User user, a26 a26Var, zn2 zn2Var) {
        ca2.a.getClass();
        return af1.P(user, pa7.t(ca2.d, "strict"), new llf(2, null), new ehf(9), new dne(1, x1f.a, x1f.class, "identify", "identify(Ljava/lang/String;)V", 0, 7), new zkf(this, 1), a26Var, zn2Var);
    }

    public final AuthOption g() {
        return (AuthOption) this.e.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0157  */
    /* JADX WARN: Code duplicated, block: B:59:0x0185  */
    /* JADX WARN: Code duplicated, block: B:61:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:66:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:79:0x0216 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x0218  */
    /* JADX WARN: Code duplicated, block: B:83:0x023a A[PHI: r1 r2 r5
  0x023a: PHI (r1v25 xgd) = (r1v0 xgd), (r1v28 xgd) binds: [B:81:0x0237, B:13:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x023a: PHI (r2v7 ai.askquin.ui.account.component.AuthOption) = (r2v0 ai.askquin.ui.account.component.AuthOption), (r2v13 ai.askquin.ui.account.component.AuthOption) binds: [B:81:0x0237, B:13:0x004b] A[DONT_GENERATE, DONT_INLINE]
  0x023a: PHI (r5v11 boolean) = (r5v9 boolean), (r5v14 boolean) binds: [B:81:0x0237, B:13:0x004b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x0252 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:86:0x0253  */
    /* JADX WARN: Code duplicated, block: B:89:0x0268  */
    /* JADX WARN: Code duplicated, block: B:92:0x0292  */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0209, code lost:
    
        if (r18.d.a(r14, r4) == r10) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(defpackage.xgd r19, ai.askquin.ui.account.component.AuthOption r20, defpackage.igd r21, defpackage.zn2 r22) {
        /*
            Method dump skipped, instruction units count: 680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmf.h(xgd, ai.askquin.ui.account.component.AuthOption, igd, zn2):java.lang.Object");
    }

    public final void i(vb2 vb2Var, if8 if8Var) {
        if8Var.getClass();
        k(true);
        awe aweVarW = af1.W(if8Var, vb2Var);
        if (aweVarW == null) {
            jcc.k(1, Integer.valueOf(R.string.auth_login_code_send_unknown_error));
        } else {
            aweVarW.a(vb2Var);
            k(false);
        }
    }

    public final void k(boolean z) {
        this.w.setValue(Boolean.valueOf(z));
    }

    public final void l(ql0 ql0Var) {
        this.v.setValue(ql0Var);
    }

    public final void n(String str, AuthOption authOption) {
        authOption.getClass();
        if (authOption == AuthOption.Google) {
            return;
        }
        use useVar = this.g;
        n3d.g(useVar);
        if (!v4e.Q(str)) {
            une uneVarH = useVar.h();
            try {
                uneVarH.append(str);
                xdc.s(uneVarH);
                useVar.a(uneVarH);
                useVar.c();
            } catch (Throwable th) {
                useVar.c();
                throw th;
            }
        }
        this.e.setValue(authOption);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object o(User user, zn2 zn2Var) {
        dmf dmfVar;
        if (zn2Var instanceof dmf) {
            dmfVar = (dmf) zn2Var;
            int i = dmfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmfVar.label = i - Integer.MIN_VALUE;
            } else {
                dmfVar = new dmf(this, zn2Var);
            }
        } else {
            dmfVar = new dmf(this, zn2Var);
        }
        Object obj = dmfVar.result;
        int i2 = dmfVar.label;
        Object obj2 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            d().e("updateUserData: " + user);
            a26 emfVar = new emf(1, null);
            dmfVar.L$0 = user;
            dmfVar.label = 1;
            if (f(user, emfVar, dmfVar) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return obj;
        }
        user = (User) dmfVar.L$0;
        jzb.q(obj);
        dmfVar.L$0 = null;
        dmfVar.label = 2;
        Object objP = p(user, dmfVar);
        return objP == obj2 ? obj2 : objP;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008b A[PHI: r11
  0x008b: PHI (r11v1 tech.chatmind.api.User) = (r11v0 tech.chatmind.api.User), (r11v4 tech.chatmind.api.User) binds: [B:21:0x0063, B:26:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0 A[PHI: r1 r11
  0x00a0: PHI (r1v6 tech.chatmind.api.User) = (r1v4 tech.chatmind.api.User), (r1v9 tech.chatmind.api.User) binds: [B:31:0x009d, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r11v6 int) = (r11v3 int), (r11v11 int) binds: [B:31:0x009d, B:18:0x004a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[PHI: r1 r11
  0x00b5: PHI (r1v7 tech.chatmind.api.User) = (r1v6 tech.chatmind.api.User), (r1v11 tech.chatmind.api.User) binds: [B:37:0x00b2, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b5: PHI (r11v7 int) = (r11v6 int), (r11v12 int) binds: [B:37:0x00b2, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007c, code lost:
    
        if (r12 == r8) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(tech.chatmind.api.User r11, defpackage.zn2 r12) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qmf.p(tech.chatmind.api.User, zn2):java.lang.Object");
    }
}
