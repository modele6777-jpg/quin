package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.dy2;
import defpackage.oo0;
import defpackage.tu1;
import defpackage.x3f;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class CctBackendFactory {
    public x3f create(dy2 dy2Var) {
        Context context = ((oo0) dy2Var).a;
        oo0 oo0Var = (oo0) dy2Var;
        return new tu1(context, oo0Var.b, oo0Var.c);
    }
}
