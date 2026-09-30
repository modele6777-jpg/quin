package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j03 extends gu7 implements l26 {
    final /* synthetic */ ze5 $animationSpec;
    final /* synthetic */ n26 $content;
    final /* synthetic */ Object $stateForContent;
    final /* synthetic */ n3f $this_Crossfade;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j03(n3f n3fVar, ze5 ze5Var, Object obj, n26 n26Var) {
        super(2);
        this.$this_Crossfade = n3fVar;
        this.$animationSpec = ze5Var;
        this.$stateForContent = obj;
        this.$content = n26Var;
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
        Object objA;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            n3f n3fVar = this.$this_Crossfade;
            h03 h03Var = new h03(this.$animationSpec);
            Object obj3 = this.$stateForContent;
            y6f y6fVar = xo1.g;
            boolean zH = n3fVar.h();
            s3f s3fVar = n3fVar.a;
            i8c i8cVar = sf2.a;
            if (zH) {
                l46Var.f0(1666827533);
                l46Var.r(false);
                objA = s3fVar.a();
            } else {
                l46Var.f0(1666573488);
                boolean zG = l46Var.g(n3fVar);
                objA = l46Var.R();
                if (zG || objA == i8cVar) {
                    ird irdVarJ = iqf.j();
                    a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
                    ird irdVarL = iqf.l(irdVarJ);
                    try {
                        Object objA2 = s3fVar.a();
                        iqf.p(irdVarJ, irdVarL, a26VarE);
                        l46Var.p0(objA2);
                        objA = objA2;
                    } catch (Throwable th) {
                        iqf.p(irdVarJ, irdVarL, a26VarE);
                        throw th;
                    }
                }
                l46Var.r(false);
            }
            l46Var.f0(1378811975);
            float f = pa7.t(objA, obj3) ? 1.0f : 0.0f;
            l46Var.r(false);
            Float fValueOf = Float.valueOf(f);
            boolean zG2 = l46Var.g(n3fVar);
            Object objR = l46Var.R();
            if (zG2 || objR == i8cVar) {
                objR = zrd.b(new i03(n3fVar, 0));
                l46Var.p0(objR);
            }
            Object value = ((h0e) objR).getValue();
            l46Var.f0(1378811975);
            float f2 = pa7.t(value, obj3) ? 1.0f : 0.0f;
            l46Var.r(false);
            Float fValueOf2 = Float.valueOf(f2);
            boolean zG3 = l46Var.g(n3fVar);
            Object objR2 = l46Var.R();
            if (zG3 || objR2 == i8cVar) {
                objR2 = zrd.b(new i03(n3fVar, 1));
                l46Var.p0(objR2);
            }
            k3f k3fVarH = g21.H(n3fVar, fValueOf, fValueOf2, (ze5) h03Var.m(((h0e) objR2).getValue(), l46Var, 0), y6fVar, l46Var, 0);
            boolean zG4 = l46Var.g(k3fVarH);
            Object objR3 = l46Var.R();
            if (zG4 || objR3 == i8cVar) {
                objR3 = new g03(k3fVarH);
                l46Var.p0(objR3);
            }
            j09 j09VarX = bzd.x(g09.a, (a26) objR3);
            n26 n26Var = this.$content;
            Object obj4 = this.$stateForContent;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarX);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.h(l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            n26Var.m(obj4, l46Var, 0);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
