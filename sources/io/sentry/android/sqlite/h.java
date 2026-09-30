package io.sentry.android.sqlite;

import defpackage.gu7;
import defpackage.j9e;
import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends gu7 implements x16 {
    final /* synthetic */ j9e $query;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, j9e j9eVar) {
        super(0);
        this.this$0 = iVar;
        this.$query = j9eVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return this.this$0.a.w(this.$query);
    }
}
