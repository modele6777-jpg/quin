package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l7b implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q7b b;
    public final /* synthetic */ cb9 c;

    public /* synthetic */ l7b(cb9 cb9Var, q7b q7bVar) {
        this.a = 2;
        this.c = cb9Var;
        this.b = q7bVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        q7b q7bVar = this.b;
        cb9 cb9Var = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                ((Integer) obj3).getClass();
                ((da9) obj).getClass();
                a26 a26VarF = qka.f(hc9.a, q7bVar, l46Var);
                boolean zG = l46Var.g(q7bVar) | l46Var.i(cb9Var) | l46Var.g(a26VarF);
                Object objR = l46Var.R();
                if (zG || objR == i8cVar) {
                    objR = new o7b(q7bVar, cb9Var, a26VarF, 0);
                    l46Var.p0(objR);
                }
                l26 l26Var = (l26) objR;
                jr2 jr2Var = q7bVar.b;
                boolean zG2 = l46Var.g(jr2Var);
                Object objR2 = l46Var.R();
                if (zG2 || objR2 == i8cVar) {
                    dba dbaVar = new dba(0, jr2Var, jr2.class, "launchNewConversation", "launchNewConversation(Ljava/lang/String;)V", 0, 2);
                    l46Var.p0(dbaVar);
                    objR2 = dbaVar;
                }
                x16 x16Var = (x16) objR2;
                boolean zI = l46Var.i(cb9Var);
                Object objR3 = l46Var.R();
                if (zI || objR3 == i8cVar) {
                    objR3 = new r14(cb9Var, 13);
                    l46Var.p0(objR3);
                }
                z7f.e(l26Var, x16Var, (x16) objR3, l46Var, 0);
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                ((Integer) obj3).getClass();
                ((da9) obj).getClass();
                jr2 jr2Var2 = q7bVar.b;
                boolean zG3 = l46Var2.g(jr2Var2);
                Object objR4 = l46Var2.R();
                if (zG3 || objR4 == i8cVar) {
                    dba dbaVar2 = new dba(0, jr2Var2, jr2.class, "launchNewConversation", "launchNewConversation(Ljava/lang/String;)V", 0, 3);
                    l46Var2.p0(dbaVar2);
                    objR4 = dbaVar2;
                }
                x16 x16Var2 = (x16) objR4;
                boolean zI2 = l46Var2.i(cb9Var);
                Object objR5 = l46Var2.R();
                if (zI2 || objR5 == i8cVar) {
                    objR5 = new n7b(cb9Var, 5);
                    l46Var2.p0(objR5);
                }
                m93.l(0, x16Var2, (x16) objR5, l46Var2, null);
                break;
            default:
                l46 l46Var3 = (l46) obj2;
                ((Integer) obj3).getClass();
                ((da9) obj).getClass();
                boolean zI3 = l46Var3.i(cb9Var) | l46Var3.g(q7bVar);
                Object objR6 = l46Var3.R();
                if (zI3 || objR6 == i8cVar) {
                    objR6 = new ek9(23, cb9Var, q7bVar);
                    l46Var3.p0(objR6);
                }
                x16 x16Var3 = (x16) objR6;
                boolean zI4 = l46Var3.i(cb9Var);
                Object objR7 = l46Var3.R();
                if (zI4 || objR7 == i8cVar) {
                    objR7 = new n7b(cb9Var, 21);
                    l46Var3.p0(objR7);
                }
                urg.g(x16Var3, (x16) objR7, l46Var3, 0);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ l7b(q7b q7bVar, cb9 cb9Var, int i) {
        this.a = i;
        this.b = q7bVar;
        this.c = cb9Var;
    }
}
