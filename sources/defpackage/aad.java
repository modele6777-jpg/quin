package defpackage;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aad extends gbe implements l26 {
    final /* synthetic */ e8d $format;
    final /* synthetic */ int $pageIndex;
    final /* synthetic */ gbd $shareType;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ bad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aad(bad badVar, e8d e8dVar, gbd gbdVar, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = badVar;
        this.$format = e8dVar;
        this.$shareType = gbdVar;
        this.$pageIndex = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new aad(this.this$0, this.$format, this.$shareType, this.$pageIndex, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ba A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            bad badVar = this.this$0;
            e8d e8dVar = this.$format;
            gbd gbdVar = this.$shareType;
            this.label = 1;
            obj = badVar.a(e8dVar, gbdVar, this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            if (i != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        String str = (String) obj;
        if (str != null) {
            bad badVar2 = this.this$0;
            gbd gbdVar2 = this.$shareType;
            badVar2.getClass();
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 29 && gbdVar2 == gbd.a && i2 < 29 && bp.c(badVar2.a, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                this.this$0.i.setValue(new l7a(new n7a(this.$format, this.$shareType, str), null));
                this.this$0.o(false);
                this.this$0.h.invoke();
                return wefVar;
            }
            w7d w7dVarA = this.this$0.d.a(this.$pageIndex);
            bad badVar3 = this.this$0;
            gbd gbdVar3 = this.$shareType;
            if (w7dVarA == null) {
                String strV = w6c.v(gbdVar3);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 2;
                if (badVar3.e(str, strV, this) == bw2Var) {
                    return bw2Var;
                }
            } else {
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (badVar3.g(w7dVarA, gbdVar3, str, this) == bw2Var) {
                    return bw2Var;
                }
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((aad) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
