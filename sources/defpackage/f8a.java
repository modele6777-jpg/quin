package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f8a {
    public static final f8a a = new f8a();

    public static Object a(String str, qn9 qn9Var) {
        if (v4e.Q(str)) {
            qc0.j("Failed requirement.");
            return null;
        }
        return ypa.a.a(new e8a(new v7a(str, null), null), qn9Var);
    }

    public static PendingUserProfile c() {
        Object dzbVar;
        hs3 hs3Var = xqa.h;
        String str = (String) z5c.I(nu4.a, new d8a(hs3Var.a, hs3Var.b, null));
        if (v4e.Q(str)) {
            return null;
        }
        try {
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            dzbVar = (PendingUserProfile) xh7Var.b(PendingUserProfile.Companion.serializer(), str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return (PendingUserProfile) (dzbVar instanceof dzb ? null : dzbVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(PendingUserProfile pendingUserProfile, a26 a26Var, zn2 zn2Var) {
        x7a x7aVar;
        imb imbVar;
        if (zn2Var instanceof x7a) {
            x7aVar = (x7a) zn2Var;
            int i = x7aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                x7aVar.label = i - Integer.MIN_VALUE;
            } else {
                x7aVar = new x7a(this, zn2Var);
            }
        } else {
            x7aVar = new x7a(this, zn2Var);
        }
        Object obj = x7aVar.result;
        int i2 = x7aVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            imb imbVar2 = new imb();
            y7a y7aVar = new y7a(pendingUserProfile, a26Var, imbVar2, null);
            x7aVar.L$0 = null;
            x7aVar.L$1 = null;
            x7aVar.L$2 = imbVar2;
            x7aVar.label = 1;
            Object objA = ypa.a.a(new e8a(y7aVar, null), x7aVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
            imbVar = imbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            imbVar = (imb) x7aVar.L$2;
            jzb.q(obj);
        }
        return Boolean.valueOf(imbVar.element);
    }
}
