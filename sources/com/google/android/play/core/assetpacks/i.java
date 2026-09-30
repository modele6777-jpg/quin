package com.google.android.play.core.assetpacks;

import defpackage.igg;
import defpackage.jgg;
import defpackage.lgg;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements lgg {
    public final /* synthetic */ k a;
    public final /* synthetic */ int b;

    public /* synthetic */ i(k kVar, int i) {
        this.a = kVar;
        this.b = i;
    }

    @Override // defpackage.lgg
    public final Object a() {
        k kVar = this.a;
        int i = this.b;
        jgg jggVarA = kVar.a(i);
        b bVar = kVar.a;
        int i2 = jggVarA.b;
        igg iggVar = jggVarA.c;
        int i3 = iggVar.d;
        long j = iggVar.b;
        String str = iggVar.a;
        if (i3 != 5 && i3 != 6 && i3 != 4) {
            throw new g(String.format("Could not safely delete session %d because it is not in a terminal state.", Integer.valueOf(i)), i);
        }
        if (bVar.c(i2, j, str).exists()) {
            b.f(bVar.c(i2, j, str));
        }
        int i4 = iggVar.d;
        if ((i4 != 5 && i4 != 6) || !bVar.h(i2, j, str).exists()) {
            return null;
        }
        b.f(bVar.h(i2, j, str));
        return null;
    }
}
