package defpackage;

import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.Constants;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j38 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ yx9 b;

    public /* synthetic */ j38(yx9 yx9Var, int i) {
        this.a = i;
        this.b = yx9Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Float] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Long] */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
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
    @Override // defpackage.a26
    public final Object d(Object obj) {
        qx9 qx9Var;
        int i = this.a;
        qx9 qx9Var2 = null;
        wef wefVar = wef.a;
        yx9 yx9Var = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                l1fVar.getClass();
                l1fVar.a(((sz9) yx9Var.d.c).j() == 1 ? Constants.LONG : "short", "layout");
                l1fVar.a("save", "pathway");
                return wefVar;
            case 1:
                ?? ValueOf = (Float) obj;
                float fFloatValue = ValueOf.floatValue();
                long jD = kn2.D(yx9Var);
                float f = yx9Var.i + fFloatValue;
                long jM = ym8.M(f);
                yx9Var.i = f - jM;
                if (Math.abs(fFloatValue) >= 1.0E-4f) {
                    long j = jD + jM;
                    long jQ = mh3.q(j, yx9Var.h, yx9Var.g);
                    ?? r5 = j != jQ;
                    long j2 = jQ - jD;
                    float f2 = j2;
                    yx9Var.j = f2;
                    if (Math.abs(j2) != 0) {
                        yx9Var.E.setValue(Boolean.valueOf(f2 > 0.0f));
                        yx9Var.F.setValue(Boolean.valueOf(f2 < 0.0f));
                    }
                    int i2 = (int) j2;
                    int i3 = -i2;
                    qx9 qx9VarH = ((qx9) yx9Var.m.getValue()).h(i3);
                    if (qx9VarH == null || (qx9Var = yx9Var.b) == null) {
                        qx9Var2 = qx9VarH;
                    } else {
                        qx9 qx9VarH2 = qx9Var.h(i3);
                        if (qx9VarH2 != null) {
                            yx9Var.b = qx9VarH2;
                            qx9Var2 = qx9VarH;
                        }
                    }
                    if (qx9Var2 != null) {
                        yx9Var.h(qx9Var2, yx9Var.a, true);
                        yx9Var.A.setValue(wefVar);
                    } else {
                        hzc hzcVar = yx9Var.d;
                        yx9 yx9Var2 = (yx9) hzcVar.b;
                        qz9 qz9Var = (qz9) hzcVar.d;
                        qz9Var.k(qz9Var.j() + (yx9Var2.n() != 0 ? i2 / yx9Var2.n() : 0.0f));
                        LayoutNode layoutNode = (LayoutNode) yx9Var.x.getValue();
                        if (layoutNode != null) {
                            layoutNode.m();
                        }
                    }
                    if (r5 != false) {
                        ValueOf = Long.valueOf(j2);
                    }
                    fFloatValue = ValueOf.floatValue();
                }
                return Float.valueOf(fFloatValue);
            default:
                c08 c08Var = (c08) obj;
                ird irdVarJ = iqf.j();
                a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
                ird irdVarL = iqf.l(irdVarJ);
                try {
                    c08Var.a(yx9Var.e);
                    return wefVar;
                } finally {
                    iqf.p(irdVarJ, irdVarL, a26VarE);
                }
        }
    }
}
