package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ah8 extends gu7 implements x16 {
    final /* synthetic */ eh8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah8(eh8 eh8Var) {
        super(0);
        this.this$0 = eh8Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        float f = 0.0f;
        if (((uh8) this.this$0.w.getValue()) != null) {
            float fFloatValue = ((Number) this.this$0.f.getValue()).floatValue();
            eh8 eh8Var = this.this$0;
            if (fFloatValue < 0.0f) {
                if (eh8Var.e.getValue() != null) {
                    r3.f();
                    return null;
                }
            } else {
                if (eh8Var.e.getValue() != null) {
                    r3.f();
                    return null;
                }
                f = 1.0f;
            }
        }
        return Float.valueOf(f);
    }
}
