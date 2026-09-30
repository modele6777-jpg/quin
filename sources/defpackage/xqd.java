package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xqd extends gbe implements l26 {
    final /* synthetic */ float $initialVelocity;
    final /* synthetic */ a26 $onRemainingScrollOffsetUpdate;
    final /* synthetic */ fhc $this_fling;
    Object L$0;
    int label;
    final /* synthetic */ ard this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xqd(ard ardVar, float f, a26 a26Var, fhc fhcVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = ardVar;
        this.$initialVelocity = f;
        this.$onRemainingScrollOffsetUpdate = a26Var;
        this.$this_fling = fhcVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xqd(this.this$0, this.$initialVelocity, this.$onRemainingScrollOffsetUpdate, this.$this_fling, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [wqd] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        final jmb jmbVar;
        xqd xqdVar;
        int i = this.label;
        final int i2 = 1;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            float fA = this.this$0.a.a(this.$initialVelocity, lmg.R(this.this$0.b, 0.0f, this.$initialVelocity));
            if (Float.isNaN(fA)) {
                l37.c("calculateApproachOffset returned NaN. Please use a valid value.");
            }
            jmbVar = new jmb();
            float fSignum = Math.signum(this.$initialVelocity) * Math.abs(fA);
            jmbVar.element = fSignum;
            this.$onRemainingScrollOffsetUpdate.d(new Float(fSignum));
            ard ardVar = this.this$0;
            fhc fhcVar = this.$this_fling;
            float f = jmbVar.element;
            float f2 = this.$initialVelocity;
            final a26 a26Var = this.$onRemainingScrollOffsetUpdate;
            final int i3 = 0;
            ?? r12 = new a26() { // from class: wqd
                @Override // defpackage.a26
                public final Object d(Object obj2) {
                    int i4 = i3;
                    wef wefVar = wef.a;
                    a26 a26Var2 = a26Var;
                    jmb jmbVar2 = jmbVar;
                    float fFloatValue = ((Float) obj2).floatValue();
                    switch (i4) {
                        case 0:
                            float f3 = jmbVar2.element - fFloatValue;
                            jmbVar2.element = f3;
                            a26Var2.d(Float.valueOf(f3));
                            break;
                        default:
                            float f4 = jmbVar2.element - fFloatValue;
                            jmbVar2.element = f4;
                            a26Var2.d(Float.valueOf(f4));
                            break;
                    }
                    return wefVar;
                }
            };
            this.L$0 = jmbVar;
            this.label = 1;
            obj = ardVar.d(fhcVar, f, f2, r12, this);
            xqdVar = this;
            if (obj != bw2Var) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jmbVar = (jmb) this.L$0;
        jzb.q(obj);
        xqdVar = this;
        wz wzVar = (wz) obj;
        float fB = xqdVar.this$0.a.b(((Number) wzVar.c()).floatValue());
        if (Float.isNaN(fB)) {
            l37.c("calculateSnapOffset returned NaN. Please use a valid value.");
        }
        jmbVar.element = fB;
        fhc fhcVar2 = xqdVar.$this_fling;
        wz wzVarD = g21.D(wzVar, 0.0f, 0.0f, 30);
        vz vzVar = xqdVar.this$0.c;
        final a26 a26Var2 = xqdVar.$onRemainingScrollOffsetUpdate;
        a26 a26Var3 = new a26() { // from class: wqd
            @Override // defpackage.a26
            public final Object d(Object obj2) {
                int i4 = i2;
                wef wefVar = wef.a;
                a26 a26Var4 = a26Var2;
                jmb jmbVar2 = jmbVar;
                float fFloatValue = ((Float) obj2).floatValue();
                switch (i4) {
                    case 0:
                        float f3 = jmbVar2.element - fFloatValue;
                        jmbVar2.element = f3;
                        a26Var4.d(Float.valueOf(f3));
                        break;
                    default:
                        float f4 = jmbVar2.element - fFloatValue;
                        jmbVar2.element = f4;
                        a26Var4.d(Float.valueOf(f4));
                        break;
                }
                return wefVar;
            }
        };
        xqdVar.L$0 = null;
        xqdVar.label = 2;
        Object objW = ynb.w(fhcVar2, fB, fB, wzVarD, vzVar, a26Var3, xqdVar);
        return objW == bw2Var ? bw2Var : objW;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xqd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
