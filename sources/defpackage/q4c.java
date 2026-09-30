package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q4c {
    public static final pr4 a = new pr4(0, new zib(19));
    public static final long b = w6c.l(8);

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public static final void a(defpackage.o4c r29, defpackage.dd2 r30, defpackage.l46 r31, int r32) {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q4c.a(o4c, dd2, l46, int):void");
    }

    public static final o4c b(c4c c4cVar, l46 l46Var) {
        c4cVar.getClass();
        return (o4c) l46Var.k(a);
    }

    public static final o4c c(o4c o4cVar) {
        o4cVar.getClass();
        wue wueVar = o4cVar.a;
        wue wueVar2 = new wue(wueVar != null ? wueVar.a : b);
        l26 l26Var = o4cVar.b;
        if (l26Var == null) {
            l26Var = t72.n;
        }
        l26 l26Var2 = l26Var;
        h88 h88Var = o4cVar.c;
        if (h88Var == null) {
            h88Var = h88.f;
        }
        hl4 hl4Var = zr5.d;
        wue wueVar3 = h88Var.a;
        wue wueVar4 = new wue(wueVar3 != null ? wueVar3.a : zr5.a);
        wue wueVar5 = h88Var.b;
        wue wueVar6 = new wue(wueVar5 != null ? wueVar5.a : zr5.b);
        wue wueVar7 = h88Var.c;
        wue wueVar8 = new wue(wueVar7 != null ? wueVar7.a : zr5.c);
        a26 a26Var = h88Var.d;
        if (a26Var == null) {
            a26Var = zr5.d;
        }
        a26 a26Var2 = h88Var.e;
        if (a26Var2 == null) {
            a26Var2 = zr5.e;
        }
        h88 h88Var2 = new h88(wueVar4, wueVar6, wueVar8, a26Var, a26Var2);
        f01 f01Var = o4cVar.d;
        if (f01Var == null) {
            f01Var = h01.a;
        }
        f01 f01Var2 = f01Var;
        t62 t62Var = o4cVar.e;
        if (t62Var == null) {
            t62Var = t62.e;
        }
        mue mueVar = s62.a;
        t62 t62Var2 = t62Var;
        mue mueVar2 = t62Var2.a;
        if (mueVar2 == null) {
            mueVar2 = s62.a;
        }
        j09 j09Var = t62Var2.b;
        if (j09Var == null) {
            j09Var = s62.c;
        }
        wue wueVar9 = t62Var2.c;
        wue wueVar10 = new wue(wueVar9 != null ? wueVar9.a : s62.d);
        Boolean bool = t62Var2.d;
        t62 t62Var3 = new t62(mueVar2, j09Var, wueVar10, Boolean.valueOf(bool != null ? bool.booleanValue() : true));
        ude udeVar = o4cVar.f;
        if (udeVar == null) {
            udeVar = ude.e;
        }
        mue mueVar3 = qde.a;
        ude udeVar2 = udeVar;
        mue mueVar4 = udeVar2.a;
        if (mueVar4 == null) {
            mueVar4 = qde.a;
        }
        wue wueVar11 = udeVar2.b;
        wue wueVar12 = new wue(wueVar11 != null ? wueVar11.a : qde.b);
        y72 y72Var = udeVar2.c;
        y72 y72Var2 = new y72(y72Var != null ? y72Var.a : qde.c);
        Float f = udeVar2.d;
        ude udeVar3 = new ude(mueVar4, wueVar12, y72Var2, Float.valueOf(f != null ? f.floatValue() : 1.0f));
        s27 s27Var = o4cVar.g;
        if (s27Var == null) {
            s27Var = s27.d;
        }
        bx9 bx9Var = r27.a;
        s27 s27Var2 = s27Var;
        xw9 xw9Var = s27Var2.a;
        if (xw9Var == null) {
            xw9Var = r27.a;
        }
        n26 n26Var = s27Var2.b;
        if (n26Var == null) {
            n26Var = r27.b;
        }
        n26 n26Var2 = s27Var2.c;
        if (n26Var2 == null) {
            n26Var2 = r27.c;
        }
        s27 s27Var3 = new s27(xw9Var, n26Var, n26Var2);
        n4c n4cVar = o4cVar.h;
        if (n4cVar == null) {
            n4cVar = n4c.i;
        }
        return new o4c(wueVar2, l26Var2, h88Var2, f01Var2, t62Var3, udeVar3, s27Var3, n4cVar.a());
    }
}
