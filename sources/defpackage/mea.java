package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mea extends gu7 implements n26 {
    final /* synthetic */ long $color;
    final /* synthetic */ n26 $contentFadeTransitionSpec;
    final /* synthetic */ iea $highlight;
    final /* synthetic */ n26 $placeholderFadeTransitionSpec;
    final /* synthetic */ x4d $shape;
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mea(n26 n26Var, n26 n26Var2, iea ieaVar, boolean z, long j, x4d x4dVar) {
        super(3);
        this.$placeholderFadeTransitionSpec = n26Var;
        this.$contentFadeTransitionSpec = n26Var2;
        this.$highlight = ieaVar;
        this.$visible = z;
        this.$color = j;
        this.$shape = x4dVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        j09 j09Var = (j09) obj;
        l46 l46Var = (l46) obj2;
        ((Number) obj3).intValue();
        j09Var.getClass();
        l46Var.g0(-1214629560);
        l46Var.g0(804161266);
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = new nmb();
            l46Var.p0(objR);
        }
        nmb nmbVar = (nmb) objR;
        l46Var.r(false);
        l46Var.g0(804161321);
        Object objR2 = l46Var.R();
        if (objR2 == i8cVar) {
            objR2 = new nmb();
            l46Var.p0(objR2);
        }
        nmb nmbVar2 = (nmb) objR2;
        l46Var.r(false);
        l46Var.g0(804161379);
        Object objR3 = l46Var.R();
        if (objR3 == i8cVar) {
            objR3 = new nmb();
            l46Var.p0(objR3);
        }
        nmb nmbVar3 = (nmb) objR3;
        l46Var.r(false);
        l46Var.g0(804161492);
        Object objR4 = l46Var.R();
        if (objR4 == i8cVar) {
            objR4 = q1c.f(Float.valueOf(0.0f));
            l46Var.p0(objR4);
        }
        e89 e89Var = (e89) objR4;
        l46Var.r(false);
        l46Var.g0(804161591);
        boolean z = this.$visible;
        Object objR5 = l46Var.R();
        if (objR5 == i8cVar) {
            objR5 = new o89(Boolean.valueOf(z));
            l46Var.p0(objR5);
        }
        o89 o89Var = (o89) objR5;
        l46Var.r(false);
        o89Var.f(Boolean.valueOf(this.$visible));
        n3f n3fVarH0 = g21.h0(o89Var, "placeholder_crossfade", l46Var, 48);
        n26 n26Var = this.$placeholderFadeTransitionSpec;
        y6f y6fVar = xo1.g;
        s3f s3fVar = n3fVarH0.a;
        vz9 vz9Var = n3fVarH0.d;
        boolean zBooleanValue = ((Boolean) s3fVar.a()).booleanValue();
        l46Var.g0(-2085173843);
        float f = zBooleanValue ? 1.0f : 0.0f;
        l46Var.r(false);
        Float fValueOf = Float.valueOf(f);
        boolean zBooleanValue2 = ((Boolean) vz9Var.getValue()).booleanValue();
        l46Var.g0(-2085173843);
        float f2 = zBooleanValue2 ? 1.0f : 0.0f;
        l46Var.r(false);
        k3f k3fVarH = g21.H(n3fVarH0, fValueOf, Float.valueOf(f2), (ze5) n26Var.m(n3fVarH0.f(), l46Var, 0), y6fVar, l46Var, 196608);
        n26 n26Var2 = this.$contentFadeTransitionSpec;
        boolean zBooleanValue3 = ((Boolean) n3fVarH0.a.a()).booleanValue();
        l46Var.g0(992792551);
        float f3 = zBooleanValue3 ? 0.0f : 1.0f;
        l46Var.r(false);
        Float fValueOf2 = Float.valueOf(f3);
        boolean zBooleanValue4 = ((Boolean) vz9Var.getValue()).booleanValue();
        l46Var.g0(992792551);
        float f4 = zBooleanValue4 ? 0.0f : 1.0f;
        l46Var.r(false);
        k3f k3fVarH2 = g21.H(n3fVarH0, fValueOf2, Float.valueOf(f4), (ze5) n26Var2.m(n3fVarH0.f(), l46Var, 0), y6fVar, l46Var, 196608);
        iea ieaVar = this.$highlight;
        l27 l27Var = ieaVar != null ? ((ved) ieaVar).b : null;
        l46Var.g0(804162378);
        if (l27Var != null && (this.$visible || ((Number) k3fVarH.getValue()).floatValue() >= 0.01f)) {
            e89Var.setValue(Float.valueOf(((Number) af1.w(af1.c0(null, l46Var, 1), 0.0f, 1.0f, l27Var, null, l46Var, 4536, 8).c.getValue()).floatValue()));
        }
        l46Var.r(false);
        l46Var.g0(804162715);
        Object objR6 = l46Var.R();
        if (objR6 == i8cVar) {
            objR6 = urg.h();
            l46Var.p0(objR6);
        }
        dy9 dy9Var = (dy9) objR6;
        l46Var.r(false);
        l46Var.g0(804162740);
        boolean zF = l46Var.f(this.$color) | l46Var.g(this.$shape) | l46Var.g(this.$highlight);
        x4d x4dVar = this.$shape;
        long j = this.$color;
        iea ieaVar2 = this.$highlight;
        Object objR7 = l46Var.R();
        if (zF || objR7 == i8cVar) {
            objR7 = b21.u(j09Var, new lea(dy9Var, nmbVar3, x4dVar, j, ieaVar2, nmbVar2, nmbVar, k3fVarH2, k3fVarH, e89Var));
            l46Var.p0(objR7);
        }
        j09 j09Var2 = (j09) objR7;
        l46Var.r(false);
        l46Var.r(false);
        return j09Var2;
    }
}
