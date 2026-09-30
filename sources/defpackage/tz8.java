package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tz8 implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ tz8(String str, List list, boolean z, x16 x16Var, a26 a26Var, a26 a26Var2, x16 x16Var2) {
        this.b = str;
        this.e = list;
        this.c = z;
        this.d = x16Var;
        this.f = a26Var;
        this.g = a26Var2;
        this.v = x16Var2;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.v;
        Object obj3 = this.g;
        Object obj4 = this.f;
        x16 x16Var = this.d;
        boolean z = this.c;
        Object obj5 = this.e;
        String str = this.b;
        switch (i) {
            case 0:
                ted tedVar = (ted) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                aw2 aw2Var = (aw2) obj2;
                hxc hxcVar = (hxc) obj;
                if (z) {
                    fn6 fn6Var = new fn6(9, x16Var);
                    wn7[] wn7VarArr = exc.a;
                    hxcVar.c(swc.v, new f6(str, fn6Var));
                    ued uedVarC = tedVar.c();
                    ued uedVar = ued.c;
                    if (uedVarC == uedVar) {
                        hxcVar.c(swc.t, new f6(str2, new n25(tedVar, aw2Var, tedVar, 14)));
                    } else if (tedVar.d.d().a.containsKey(uedVar)) {
                        hxcVar.c(swc.u, new f6(str3, new jf6(23, tedVar, aw2Var)));
                    }
                }
                break;
            default:
                List list = (List) obj5;
                a26 a26Var = (a26) obj4;
                a26 a26Var2 = (a26) obj3;
                x16 x16Var2 = (x16) obj2;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                if (str != null) {
                    v08.W(v08Var, "title", new dd2(new a3g(str, 1), true, 1318528000), 2);
                    v08.W(v08Var, "change_button", new dd2(new n(13, x16Var), true, -1757228247), 2);
                }
                v08Var.X(0, new qqf(10, new znd(29)), new qqf(11), new dd2(new id2(a26Var), true, 802480018));
                v08Var.X(list.size(), new gj(new ule(0), list), new gj(16, list, false), new dd2(new a07(list, a26Var2, 3), true, 802480018));
                if (z) {
                    v08.W(v08Var, "more_button", new dd2(new n(14, x16Var2), true, 1867466875), 2);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ tz8(boolean z, ted tedVar, String str, String str2, String str3, x16 x16Var, aw2 aw2Var) {
        this.c = z;
        this.e = tedVar;
        this.b = str;
        this.f = str2;
        this.g = str3;
        this.d = x16Var;
        this.v = aw2Var;
    }
}
