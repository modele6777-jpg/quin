package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lea extends gu7 implements a26 {
    final /* synthetic */ long $color;
    final /* synthetic */ h0e $contentAlpha$delegate;
    final /* synthetic */ iea $highlight;
    final /* synthetic */ e89 $highlightProgress$delegate;
    final /* synthetic */ nmb $lastLayoutDirection;
    final /* synthetic */ nmb $lastOutline;
    final /* synthetic */ nmb $lastSize;
    final /* synthetic */ dy9 $paint;
    final /* synthetic */ h0e $placeholderAlpha$delegate;
    final /* synthetic */ x4d $shape;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lea(dy9 dy9Var, nmb nmbVar, x4d x4dVar, long j, iea ieaVar, nmb nmbVar2, nmb nmbVar3, k3f k3fVar, k3f k3fVar2, e89 e89Var) {
        super(1);
        this.$paint = dy9Var;
        this.$lastOutline = nmbVar;
        this.$shape = x4dVar;
        this.$color = j;
        this.$highlight = ieaVar;
        this.$lastLayoutDirection = nmbVar2;
        this.$lastSize = nmbVar3;
        this.$contentAlpha$delegate = k3fVar;
        this.$placeholderAlpha$delegate = k3fVar2;
        this.$highlightProgress$delegate = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        im2 im2Var = (im2) obj;
        im2Var.getClass();
        float fFloatValue = ((Number) this.$contentAlpha$delegate.getValue()).floatValue();
        if (0.01f <= fFloatValue && fFloatValue <= 0.99f) {
            ((rt) this.$paint).d(((Number) this.$contentAlpha$delegate.getValue()).floatValue());
            dy9 dy9Var = this.$paint;
            vv7 vv7Var = (vv7) im2Var;
            xl1 xl1Var = vv7Var.a;
            vl1 vl1VarP = xl1Var.b.p();
            vl1VarP.l(z5c.g(0L, xl1Var.f()), dy9Var);
            vv7Var.a();
            vl1VarP.o();
        } else if (((Number) this.$contentAlpha$delegate.getValue()).floatValue() >= 0.99f) {
            ((vv7) im2Var).a();
        }
        float fFloatValue2 = ((Number) this.$placeholderAlpha$delegate.getValue()).floatValue();
        if (0.01f <= fFloatValue2 && fFloatValue2 <= 0.99f) {
            ((rt) this.$paint).d(((Number) this.$placeholderAlpha$delegate.getValue()).floatValue());
            dy9 dy9Var2 = this.$paint;
            nmb nmbVar = this.$lastOutline;
            x4d x4dVar = this.$shape;
            long j = this.$color;
            iea ieaVar = this.$highlight;
            nmb nmbVar2 = this.$lastLayoutDirection;
            nmb nmbVar3 = this.$lastSize;
            e89 e89Var = this.$highlightProgress$delegate;
            xl1 xl1Var2 = ((vv7) im2Var).a;
            vl1 vl1VarP2 = xl1Var2.b.p();
            vl1VarP2.l(z5c.g(0L, xl1Var2.f()), dy9Var2);
            nmbVar.a = rs0.x(im2Var, x4dVar, j, ieaVar, ((Number) e89Var.getValue()).floatValue(), (vs9) nmbVar.a, (cv7) nmbVar2.a, (ald) nmbVar3.a);
            vl1VarP2.o();
        } else if (((Number) this.$placeholderAlpha$delegate.getValue()).floatValue() >= 0.99f) {
            this.$lastOutline.a = rs0.x(im2Var, this.$shape, this.$color, this.$highlight, ((Number) this.$highlightProgress$delegate.getValue()).floatValue(), (vs9) this.$lastOutline.a, (cv7) this.$lastLayoutDirection.a, (ald) this.$lastSize.a);
        }
        vv7 vv7Var2 = (vv7) im2Var;
        this.$lastSize.a = new ald(vv7Var2.a.f());
        this.$lastLayoutDirection.a = vv7Var2.getLayoutDirection();
        return wef.a;
    }
}
