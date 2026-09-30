package defpackage;

import android.renderscript.Allocation;
import android.renderscript.ScriptIntrinsicBlur;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yqb extends gbe implements l26 {
    final /* synthetic */ float $blurRadius;
    final /* synthetic */ crb $rs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqb(crb crbVar, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$rs = crbVar;
        this.$blurRadius = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yqb(this.$rs, this.$blurRadius, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        crb crbVar = this.$rs;
        float f = this.$blurRadius;
        Allocation allocation = crbVar.e;
        ScriptIntrinsicBlur scriptIntrinsicBlur = crbVar.c;
        if (!crbVar.h) {
            if (f > 25.0f) {
                f = 25.0f;
            }
            scriptIntrinsicBlur.setRadius(f);
            scriptIntrinsicBlur.forEach(allocation);
            if (!crbVar.h) {
                allocation.copyTo(crbVar.f);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        yqb yqbVar = (yqb) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        yqbVar.r(wefVar);
        return wefVar;
    }
}
