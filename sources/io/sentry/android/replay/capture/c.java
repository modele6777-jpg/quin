package io.sentry.android.replay.capture;

import defpackage.gu7;
import defpackage.wef;
import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends gu7 implements x16 {
    final /* synthetic */ Object $oldValue;
    final /* synthetic */ String $propertyName = "segment.id";
    final /* synthetic */ String $propertyName$inlined = "segment.id";
    final /* synthetic */ Object $value;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Object obj, Integer num, i iVar) {
        super(0);
        this.$oldValue = obj;
        this.$value = num;
        this.this$0 = iVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Object obj = this.$value;
        io.sentry.android.replay.k kVar = this.this$0.h;
        if (kVar != null) {
            kVar.u(this.$propertyName$inlined, String.valueOf(obj));
        }
        return wef.a;
    }
}
