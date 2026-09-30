package defpackage;

import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bz extends gbe implements l26 {
    final /* synthetic */ Drawable $baseDrawable;
    final /* synthetic */ x16 $onEnd;
    final /* synthetic */ x16 $onStart;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bz(Drawable drawable, x16 x16Var, x16 x16Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$baseDrawable = drawable;
        this.$onStart = x16Var;
        this.$onEnd = x16Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bz(this.$baseDrawable, this.$onStart, this.$onEnd, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ((AnimatedImageDrawable) this.$baseDrawable).registerAnimationCallback(new zqf(this.$onStart, this.$onEnd));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        bz bzVar = (bz) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        bzVar.r(wefVar);
        return wefVar;
    }
}
