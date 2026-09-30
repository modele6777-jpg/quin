package io.sentry.android.replay.capture;

import defpackage.gu7;
import defpackage.wef;
import defpackage.x16;
import io.sentry.android.replay.b0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends gu7 implements x16 {
    final /* synthetic */ Object $oldValue;
    final /* synthetic */ String $propertyName = "";
    final /* synthetic */ Object $value;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Object obj, Object obj2, i iVar) {
        super(0);
        this.$oldValue = obj;
        this.$value = obj2;
        this.this$0 = iVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Object obj = this.$oldValue;
        b0 b0Var = (b0) this.$value;
        if (b0Var != null) {
            io.sentry.android.replay.k kVar = this.this$0.h;
            if (kVar != null) {
                kVar.u("config.height", String.valueOf(b0Var.b));
            }
            io.sentry.android.replay.k kVar2 = this.this$0.h;
            if (kVar2 != null) {
                kVar2.u("config.width", String.valueOf(b0Var.a));
            }
            io.sentry.android.replay.k kVar3 = this.this$0.h;
            if (kVar3 != null) {
                kVar3.u("config.frame-rate", String.valueOf(b0Var.e));
            }
            io.sentry.android.replay.k kVar4 = this.this$0.h;
            if (kVar4 != null) {
                kVar4.u("config.bit-rate", String.valueOf(b0Var.f));
            }
        }
        return wef.a;
    }
}
