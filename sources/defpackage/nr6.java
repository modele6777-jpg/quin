package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nr6 implements r37 {
    public static final ssg e;
    public static final ssg f;
    public static final ssg g;
    public static final ssg h;
    public static final ssg i;
    public static final ssg j;
    public boolean a;
    public boolean b;
    public boolean c;
    public boolean d;

    static {
        mjg mjgVarE = ssg.E();
        mjgVarE.K('A', 'Z');
        mjgVarE.K('a', 'z');
        ssg ssgVar = new ssg(mjgVarE);
        e = ssgVar;
        f = ssgVar;
        mjg mjgVarL = ssgVar.L();
        mjgVarL.K('0', '9');
        mjgVarL.E('-');
        g = new ssg(mjgVarL);
        mjg mjgVarL2 = ssgVar.L();
        mjgVarL2.E('_');
        mjgVarL2.E(':');
        ssg ssgVar2 = new ssg(mjgVarL2);
        h = ssgVar2;
        mjg mjgVarL3 = ssgVar2.L();
        mjgVarL3.K('0', '9');
        mjgVarL3.E('.');
        mjgVarL3.E('-');
        i = new ssg(mjgVarL3);
        mjg mjgVarE2 = ssg.E();
        mjgVarE2.E(' ');
        mjgVarE2.E('\t');
        mjgVarE2.E('\n');
        mjgVarE2.E((char) 11);
        mjgVarE2.E('\f');
        mjgVarE2.E('\r');
        mjgVarE2.E('\"');
        mjgVarE2.E('\'');
        mjgVarE2.E('=');
        mjgVarE2.E('<');
        mjgVarE2.E('>');
        mjgVarE2.E('`');
        j = new ssg(mjgVarE2);
    }

    public static fz3 b(xg3 xg3Var, una unaVar) {
        String strE = xg3Var.e(unaVar, xg3Var.n()).e();
        mr6 mr6Var = new mr6();
        mr6Var.g = strE;
        return new fz3(28, mr6Var, xg3Var.n());
    }

    /* JADX WARN: Code duplicated, block: B:133:0x0090 A[EDGE_INSN: B:133:0x0090->B:35:0x0090 BREAK  A[LOOP:1: B:30:0x007c->B:40:0x009a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084  */
    /* JADX WARN: Code duplicated, block: B:40:0x009a A[LOOP:1: B:30:0x007c->B:40:0x009a, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0097 -> B:6:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.r37
    public final defpackage.fz3 a(defpackage.x37 r10) {
        /*
            Method dump skipped, instruction units count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nr6.a(x37):fz3");
    }
}
