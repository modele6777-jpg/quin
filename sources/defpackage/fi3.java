package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fi3 extends czb implements l26 {
    final /* synthetic */ n69 $boxRotation$delegate;
    final /* synthetic */ gh6 $haptic;
    final /* synthetic */ x16 $reportRotationOnce;
    final /* synthetic */ aw2 $scope;
    final /* synthetic */ hi3 $spinAnim;
    float F$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi3(hi3 hi3Var, aw2 aw2Var, n69 n69Var, x16 x16Var, gh6 gh6Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$spinAnim = hi3Var;
        this.$scope = aw2Var;
        this.$boxRotation$delegate = n69Var;
        this.$reportRotationOnce = x16Var;
        this.$haptic = gh6Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        fi3 fi3Var = new fi3(this.$spinAnim, this.$scope, this.$boxRotation$delegate, this.$reportRotationOnce, this.$haptic, xn2Var);
        fi3Var.L$0 = obj;
        return fi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0099 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00bb  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        float fJ;
        a26 a26Var;
        ctf ctfVar;
        oia oiaVar;
        long j;
        wg wgVar;
        ctf ctfVar2;
        mbe mbeVar = (mbe) this.L$0;
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            this.L$0 = mbeVar;
            this.label = 1;
            obj = ffe.b(mbeVar, this, 2);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            jzb.q(obj);
        } else {
            if (i == 2) {
                fJ = this.F$0;
                ctf ctfVar3 = (ctf) this.L$3;
                a26 a26Var2 = (a26) this.L$2;
                jzb.q(obj);
                ctfVar = ctfVar3;
                a26Var = a26Var2;
                oiaVar = (oia) obj;
                if (oiaVar == null) {
                    return wefVar;
                }
                j = oiaVar.a;
                wgVar = new wg(ctfVar, this.$haptic, a26Var, this.$boxRotation$delegate, 7);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = a26Var;
                this.L$3 = ctfVar;
                this.L$4 = null;
                this.F$0 = fJ;
                this.label = 3;
                if (rk4.l(mbeVar, j, wgVar, this) != bw2Var) {
                    ctfVar2 = ctfVar;
                }
                return bw2Var;
            }
            if (i != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ctfVar2 = (ctf) this.L$3;
            a26 a26Var3 = (a26) this.L$2;
            jzb.q(obj);
            a26Var = a26Var3;
        }
        ctfVar2.getClass();
        float fB = zsf.b(ctfVar2.a(q7c.j(Float.MAX_VALUE, Float.MAX_VALUE)));
        float fJ2 = ((qz9) this.$boxRotation$delegate).j();
        float f = (fB * 0.4f * 0.18f) + fJ2;
        this.$spinAnim.a = ynb.V(this.$scope, null, null, new ei3(fJ2, f, this.$haptic, a26Var, this.$boxRotation$delegate, null), 3);
        return wefVar;
        oia oiaVar2 = (oia) obj;
        lyd lydVar = this.$spinAnim.a;
        if (lydVar != null) {
            lydVar.h(null);
        }
        fJ = ((qz9) this.$boxRotation$delegate).j();
        tc2 tc2Var = new tc2(fJ, this.$reportRotationOnce, 1);
        ctf ctfVar4 = new ctf();
        long j2 = oiaVar2.a;
        i1 i1Var = new i1(14, ctfVar4);
        this.L$0 = mbeVar;
        this.L$1 = null;
        this.L$2 = tc2Var;
        this.L$3 = ctfVar4;
        this.F$0 = fJ;
        this.label = 2;
        obj = rk4.d(mbeVar, j2, i1Var, this);
        if (obj != bw2Var) {
            a26Var = tc2Var;
            ctfVar = ctfVar4;
            oiaVar = (oia) obj;
            if (oiaVar == null) {
                return wefVar;
            }
            j = oiaVar.a;
            wgVar = new wg(ctfVar, this.$haptic, a26Var, this.$boxRotation$delegate, 7);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = a26Var;
            this.L$3 = ctfVar;
            this.L$4 = null;
            this.F$0 = fJ;
            this.label = 3;
            if (rk4.l(mbeVar, j, wgVar, this) != bw2Var) {
                ctfVar2 = ctfVar;
                ctfVar2.getClass();
                float fB2 = zsf.b(ctfVar2.a(q7c.j(Float.MAX_VALUE, Float.MAX_VALUE)));
                float fJ3 = ((qz9) this.$boxRotation$delegate).j();
                float f2 = (fB2 * 0.4f * 0.18f) + fJ3;
                this.$spinAnim.a = ynb.V(this.$scope, null, null, new ei3(fJ3, f2, this.$haptic, a26Var, this.$boxRotation$delegate, null), 3);
                return wefVar;
            }
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fi3) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
