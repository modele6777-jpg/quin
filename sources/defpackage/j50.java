package defpackage;

import ai.askquin.R;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j50 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ a26 d;
    public final /* synthetic */ s69 e;
    public final /* synthetic */ dd2 f;

    public /* synthetic */ j50(String str, boolean z, a26 a26Var, s69 s69Var, dd2 dd2Var, int i) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = a26Var;
        this.e = s69Var;
        this.f = dd2Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    y02 y02Var = g21.f;
                    g09 g09Var = g09.a;
                    j09 j09VarO = tm7.o(oa7.E(g09Var, y02Var), ((e8b) l46Var.k(l8b.a)).e, y02Var);
                    Integer numValueOf = Integer.valueOf(((sz9) this.e).j());
                    a26 a26Var = this.d;
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new k50(a26Var, 0);
                        l46Var.p0(objR);
                    }
                    j09 j09VarZ = dj6.z(56, (l26) objR, j09VarO, numValueOf, this.b, this.c, false, false);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarZ);
                    lf2.q.getClass();
                    l46Var.j0();
                    boolean z = l46Var.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf2);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    feg.j(od4.A(R.drawable.bg_draw_card, 0, l46Var), null, d31.a.b(g09Var), null, an2.g, 0.0f, null, l46Var, 24632, 104);
                    j09 j09VarD0 = ynb.d0(0.0f, 48.0f, 0.0f, 20.0f, 5, ynb.b0(20.0f, 0.0f, g09Var, 2));
                    c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    this.f.m(g09Var, l46Var, 6);
                    od4.b(null, l46Var, 0);
                    l46Var.r(true);
                    l46Var.r(true);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    g21.s(392.0f, af1.b0(-1953934726, new j50(this.b, this.c, this.d, this.e, this.f, 0), l46Var2), l46Var2, 54);
                }
                break;
        }
        return wefVar;
    }
}
