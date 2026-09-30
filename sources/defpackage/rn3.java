package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rn3 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ sn3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rn3(sn3 sn3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sn3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        rn3 rn3Var = new rn3(this.this$0, xn2Var);
        rn3Var.L$0 = obj;
        return rn3Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:14:0x0035, B:22:0x0051, B:24:0x0059, B:19:0x0040), top: B:68:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x006e  */
    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:37:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:40:0x0116  */
    /* JADX WARN: Code duplicated, block: B:43:0x0128 A[LOOP:2: B:41:0x0122->B:43:0x0128, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x0152 A[LOOP:3: B:45:0x014c->B:47:0x0152, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0177 A[PHI: r10
  0x0177: PHI (r10v34 java.lang.Object) = (r10v33 java.lang.Object), (r10v0 java.lang.Object) binds: [B:49:0x0174, B:10:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x017f  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a2 A[LOOP:0: B:55:0x019a->B:57:0x01a2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1 A[SYNTHETIC] */
    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object dzbVar;
        sn3 sn3Var;
        Throwable thA;
        SharedPreferences.Editor editorEdit;
        Iterator it;
        rw5 rw5Var;
        Iterator it2;
        boolean zHasNext;
        ax5 ax5Var;
        o9 o9Var;
        gd8 gd8Var;
        uz6 uz6Var;
        vyb vybVar;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            switch (i) {
                case 0:
                    jzb.q(obj);
                    d56 d56Var = this.this$0.f;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 1;
                    obj = d56Var.h(this);
                    if (obj != bw2Var) {
                        vybVar = (vyb) ((qyb) obj).b;
                        if (vybVar != null) {
                            vybVar.close();
                            dzbVar = wefVar;
                        } else {
                            dzbVar = null;
                        }
                        sn3Var = this.this$0;
                        thA = ezb.a(dzbVar);
                        if (thA != null) {
                            sn3Var.d().h("Failed to call signout API", thA);
                        }
                        jk9.a.a();
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 2;
                        if (bsa.e(this) != bw2Var) {
                            y93 y93Var = y93.a;
                            Context context = this.this$0.g;
                            this.L$0 = null;
                            this.label = 3;
                            y93Var.b(context, ya3.Today);
                            y93Var.b(context, ya3.Tomorrow);
                            if (wefVar != bw2Var) {
                                isa isaVar = xqa.z.a;
                                qn2 qn2Var = lw2.a;
                                ynb.V(qn2Var, null, null, new bn3(isaVar, "", null), 3);
                                ynb.V(qn2Var, null, null, new en3(xqa.B.a, "", null), 3);
                                hs3 hs3Var = xqa.Q;
                                Boolean bool = Boolean.FALSE;
                                ynb.V(qn2Var, null, null, new hn3(hs3Var.a, bool, null), 3);
                                ynb.V(qn2Var, null, null, new kn3(xqa.P.a, bool, null), 3);
                                ynb.V(qn2Var, null, null, new nn3(xqa.s0.a, "", null), 3);
                                ynb.V(qn2Var, null, null, new qn3(xqa.t0.a, "", null), 3);
                                List list = g6g.a;
                                Context context2 = this.this$0.g;
                                editorEdit = context2.getSharedPreferences("daily_fortune_widget", 0).edit();
                                for (String str : t72.I("", "next_")) {
                                    for (String str2 : g6g.a) {
                                        List list2 = g6g.a;
                                        editorEdit.remove(g6g.g(str, str2));
                                    }
                                }
                                editorEdit.apply();
                                g6g.e(context2);
                                x1f x1fVar = x1f.a;
                                it = ((List) x1f.g.getValue()).iterator();
                                while (it.hasNext()) {
                                    ((o05) it.next()).reset();
                                }
                                ((rab) this.this$0.a).a();
                                qv5 qv5Var = qv5.a;
                                Context context3 = this.this$0.g;
                                this.L$0 = null;
                                this.label = 4;
                                obj = qv5Var.b(context3, this);
                                if (obj != bw2Var) {
                                    if (!((Boolean) obj).booleanValue()) {
                                        this.this$0.d().b("Seasonal reminder preference cleanup failed during sign out");
                                    }
                                    rw5Var = this.this$0.e;
                                    it2 = rw5Var.d.values().iterator();
                                    while (true) {
                                        zHasNext = it2.hasNext();
                                        ax5Var = ax5.a;
                                        if (!zHasNext) {
                                            s0e s0eVar = (s0e) ((h89) it2.next());
                                            s0eVar.getClass();
                                            s0eVar.n(null, ax5Var);
                                        } else {
                                            s0e s0eVar2 = rw5Var.e;
                                            s0eVar2.getClass();
                                            s0eVar2.n(null, ax5Var);
                                            o9Var = this.this$0.c;
                                            this.L$0 = null;
                                            this.label = 5;
                                            if (o9Var.a(this) != bw2Var) {
                                                gd8Var = this.this$0.b;
                                                this.L$0 = null;
                                                this.label = 6;
                                                if (gd8Var.c(this) != bw2Var) {
                                                    uz6Var = this.this$0.d;
                                                    this.L$0 = null;
                                                    this.label = 7;
                                                    if (uz6Var.a(this) == bw2Var) {
                                                        return wefVar;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return bw2Var;
                case 1:
                    jzb.q(obj);
                    vybVar = (vyb) ((qyb) obj).b;
                    if (vybVar != null) {
                        vybVar.close();
                        dzbVar = wefVar;
                    } else {
                        dzbVar = null;
                    }
                    sn3Var = this.this$0;
                    thA = ezb.a(dzbVar);
                    if (thA != null) {
                        sn3Var.d().h("Failed to call signout API", thA);
                    }
                    jk9.a.a();
                    this.L$0 = null;
                    this.L$1 = null;
                    this.label = 2;
                    if (bsa.e(this) != bw2Var) {
                        y93 y93Var2 = y93.a;
                        Context context4 = this.this$0.g;
                        this.L$0 = null;
                        this.label = 3;
                        y93Var2.b(context4, ya3.Today);
                        y93Var2.b(context4, ya3.Tomorrow);
                        if (wefVar != bw2Var) {
                            isa isaVar2 = xqa.z.a;
                            qn2 qn2Var2 = lw2.a;
                            ynb.V(qn2Var2, null, null, new bn3(isaVar2, "", null), 3);
                            ynb.V(qn2Var2, null, null, new en3(xqa.B.a, "", null), 3);
                            hs3 hs3Var2 = xqa.Q;
                            Boolean bool2 = Boolean.FALSE;
                            ynb.V(qn2Var2, null, null, new hn3(hs3Var2.a, bool2, null), 3);
                            ynb.V(qn2Var2, null, null, new kn3(xqa.P.a, bool2, null), 3);
                            ynb.V(qn2Var2, null, null, new nn3(xqa.s0.a, "", null), 3);
                            ynb.V(qn2Var2, null, null, new qn3(xqa.t0.a, "", null), 3);
                            List list3 = g6g.a;
                            Context context5 = this.this$0.g;
                            editorEdit = context5.getSharedPreferences("daily_fortune_widget", 0).edit();
                            while (r1.hasNext()) {
                                while (r6.hasNext()) {
                                    List list4 = g6g.a;
                                    editorEdit.remove(g6g.g(str, str2));
                                }
                            }
                            editorEdit.apply();
                            g6g.e(context5);
                            x1f x1fVar2 = x1f.a;
                            it = ((List) x1f.g.getValue()).iterator();
                            while (it.hasNext()) {
                                ((o05) it.next()).reset();
                            }
                            ((rab) this.this$0.a).a();
                            qv5 qv5Var2 = qv5.a;
                            Context context6 = this.this$0.g;
                            this.L$0 = null;
                            this.label = 4;
                            obj = qv5Var2.b(context6, this);
                            if (obj != bw2Var) {
                                if (!((Boolean) obj).booleanValue()) {
                                    this.this$0.d().b("Seasonal reminder preference cleanup failed during sign out");
                                }
                                rw5Var = this.this$0.e;
                                it2 = rw5Var.d.values().iterator();
                                while (true) {
                                    zHasNext = it2.hasNext();
                                    ax5Var = ax5.a;
                                    if (!zHasNext) {
                                        s0e s0eVar3 = (s0e) ((h89) it2.next());
                                        s0eVar3.getClass();
                                        s0eVar3.n(null, ax5Var);
                                    } else {
                                        s0e s0eVar4 = rw5Var.e;
                                        s0eVar4.getClass();
                                        s0eVar4.n(null, ax5Var);
                                        o9Var = this.this$0.c;
                                        this.L$0 = null;
                                        this.label = 5;
                                        if (o9Var.a(this) != bw2Var) {
                                            gd8Var = this.this$0.b;
                                            this.L$0 = null;
                                            this.label = 6;
                                            if (gd8Var.c(this) != bw2Var) {
                                                uz6Var = this.this$0.d;
                                                this.L$0 = null;
                                                this.label = 7;
                                                if (uz6Var.a(this) == bw2Var) {
                                                    return wefVar;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return bw2Var;
                case 2:
                    jzb.q(obj);
                    y93 y93Var3 = y93.a;
                    Context context7 = this.this$0.g;
                    this.L$0 = null;
                    this.label = 3;
                    y93Var3.b(context7, ya3.Today);
                    y93Var3.b(context7, ya3.Tomorrow);
                    if (wefVar != bw2Var) {
                        isa isaVar3 = xqa.z.a;
                        qn2 qn2Var3 = lw2.a;
                        ynb.V(qn2Var3, null, null, new bn3(isaVar3, "", null), 3);
                        ynb.V(qn2Var3, null, null, new en3(xqa.B.a, "", null), 3);
                        hs3 hs3Var3 = xqa.Q;
                        Boolean bool3 = Boolean.FALSE;
                        ynb.V(qn2Var3, null, null, new hn3(hs3Var3.a, bool3, null), 3);
                        ynb.V(qn2Var3, null, null, new kn3(xqa.P.a, bool3, null), 3);
                        ynb.V(qn2Var3, null, null, new nn3(xqa.s0.a, "", null), 3);
                        ynb.V(qn2Var3, null, null, new qn3(xqa.t0.a, "", null), 3);
                        List list5 = g6g.a;
                        Context context8 = this.this$0.g;
                        editorEdit = context8.getSharedPreferences("daily_fortune_widget", 0).edit();
                        while (r1.hasNext()) {
                            while (r6.hasNext()) {
                                List list6 = g6g.a;
                                editorEdit.remove(g6g.g(str, str2));
                            }
                        }
                        editorEdit.apply();
                        g6g.e(context8);
                        x1f x1fVar3 = x1f.a;
                        it = ((List) x1f.g.getValue()).iterator();
                        while (it.hasNext()) {
                            ((o05) it.next()).reset();
                        }
                        ((rab) this.this$0.a).a();
                        qv5 qv5Var3 = qv5.a;
                        Context context9 = this.this$0.g;
                        this.L$0 = null;
                        this.label = 4;
                        obj = qv5Var3.b(context9, this);
                        if (obj != bw2Var) {
                            if (!((Boolean) obj).booleanValue()) {
                                this.this$0.d().b("Seasonal reminder preference cleanup failed during sign out");
                            }
                            rw5Var = this.this$0.e;
                            it2 = rw5Var.d.values().iterator();
                            while (true) {
                                zHasNext = it2.hasNext();
                                ax5Var = ax5.a;
                                if (!zHasNext) {
                                    s0e s0eVar5 = (s0e) ((h89) it2.next());
                                    s0eVar5.getClass();
                                    s0eVar5.n(null, ax5Var);
                                } else {
                                    s0e s0eVar6 = rw5Var.e;
                                    s0eVar6.getClass();
                                    s0eVar6.n(null, ax5Var);
                                    o9Var = this.this$0.c;
                                    this.L$0 = null;
                                    this.label = 5;
                                    if (o9Var.a(this) != bw2Var) {
                                        gd8Var = this.this$0.b;
                                        this.L$0 = null;
                                        this.label = 6;
                                        if (gd8Var.c(this) != bw2Var) {
                                            uz6Var = this.this$0.d;
                                            this.L$0 = null;
                                            this.label = 7;
                                            if (uz6Var.a(this) == bw2Var) {
                                                return wefVar;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return bw2Var;
                case 3:
                    jzb.q(obj);
                    isa isaVar4 = xqa.z.a;
                    qn2 qn2Var4 = lw2.a;
                    ynb.V(qn2Var4, null, null, new bn3(isaVar4, "", null), 3);
                    ynb.V(qn2Var4, null, null, new en3(xqa.B.a, "", null), 3);
                    hs3 hs3Var4 = xqa.Q;
                    Boolean bool4 = Boolean.FALSE;
                    ynb.V(qn2Var4, null, null, new hn3(hs3Var4.a, bool4, null), 3);
                    ynb.V(qn2Var4, null, null, new kn3(xqa.P.a, bool4, null), 3);
                    ynb.V(qn2Var4, null, null, new nn3(xqa.s0.a, "", null), 3);
                    ynb.V(qn2Var4, null, null, new qn3(xqa.t0.a, "", null), 3);
                    List list7 = g6g.a;
                    Context context10 = this.this$0.g;
                    editorEdit = context10.getSharedPreferences("daily_fortune_widget", 0).edit();
                    while (r1.hasNext()) {
                        while (r6.hasNext()) {
                            List list8 = g6g.a;
                            editorEdit.remove(g6g.g(str, str2));
                        }
                    }
                    editorEdit.apply();
                    g6g.e(context10);
                    x1f x1fVar4 = x1f.a;
                    it = ((List) x1f.g.getValue()).iterator();
                    while (it.hasNext()) {
                        ((o05) it.next()).reset();
                    }
                    ((rab) this.this$0.a).a();
                    qv5 qv5Var4 = qv5.a;
                    Context context11 = this.this$0.g;
                    this.L$0 = null;
                    this.label = 4;
                    obj = qv5Var4.b(context11, this);
                    if (obj != bw2Var) {
                        if (!((Boolean) obj).booleanValue()) {
                            this.this$0.d().b("Seasonal reminder preference cleanup failed during sign out");
                        }
                        rw5Var = this.this$0.e;
                        it2 = rw5Var.d.values().iterator();
                        while (true) {
                            zHasNext = it2.hasNext();
                            ax5Var = ax5.a;
                            if (!zHasNext) {
                                s0e s0eVar7 = (s0e) ((h89) it2.next());
                                s0eVar7.getClass();
                                s0eVar7.n(null, ax5Var);
                            } else {
                                s0e s0eVar8 = rw5Var.e;
                                s0eVar8.getClass();
                                s0eVar8.n(null, ax5Var);
                                o9Var = this.this$0.c;
                                this.L$0 = null;
                                this.label = 5;
                                if (o9Var.a(this) != bw2Var) {
                                    gd8Var = this.this$0.b;
                                    this.L$0 = null;
                                    this.label = 6;
                                    if (gd8Var.c(this) != bw2Var) {
                                        uz6Var = this.this$0.d;
                                        this.L$0 = null;
                                        this.label = 7;
                                        if (uz6Var.a(this) == bw2Var) {
                                            return wefVar;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return bw2Var;
                case 4:
                    jzb.q(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        this.this$0.d().b("Seasonal reminder preference cleanup failed during sign out");
                    }
                    rw5Var = this.this$0.e;
                    it2 = rw5Var.d.values().iterator();
                    while (true) {
                        zHasNext = it2.hasNext();
                        ax5Var = ax5.a;
                        if (!zHasNext) {
                            s0e s0eVar9 = rw5Var.e;
                            s0eVar9.getClass();
                            s0eVar9.n(null, ax5Var);
                            o9Var = this.this$0.c;
                            this.L$0 = null;
                            this.label = 5;
                            if (o9Var.a(this) != bw2Var) {
                                gd8Var = this.this$0.b;
                                this.L$0 = null;
                                this.label = 6;
                                if (gd8Var.c(this) != bw2Var) {
                                    uz6Var = this.this$0.d;
                                    this.L$0 = null;
                                    this.label = 7;
                                    if (uz6Var.a(this) == bw2Var) {
                                        return wefVar;
                                    }
                                }
                            }
                            return bw2Var;
                        }
                        s0e s0eVar10 = (s0e) ((h89) it2.next());
                        s0eVar10.getClass();
                        s0eVar10.n(null, ax5Var);
                    }
                    break;
                case 5:
                    jzb.q(obj);
                    gd8Var = this.this$0.b;
                    this.L$0 = null;
                    this.label = 6;
                    if (gd8Var.c(this) != bw2Var) {
                        uz6Var = this.this$0.d;
                        this.L$0 = null;
                        this.label = 7;
                        if (uz6Var.a(this) == bw2Var) {
                            return wefVar;
                        }
                    }
                    return bw2Var;
                case 6:
                    jzb.q(obj);
                    uz6Var = this.this$0.d;
                    this.L$0 = null;
                    this.label = 7;
                    if (uz6Var.a(this) == bw2Var) {
                        return bw2Var;
                    }
                    return wefVar;
                case 7:
                    jzb.q(obj);
                    return wefVar;
                default:
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
            }
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rn3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
