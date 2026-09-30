package com.google.firebase.abt.component;

import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.kb2;
import defpackage.l81;
import defpackage.lb2;
import defpackage.ml;
import defpackage.x5;
import defpackage.xb2;
import defpackage.xw3;
import defpackage.z7f;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ x5 lambda$getComponents$0(xb2 xb2Var) {
        return new x5((Context) xb2Var.a(Context.class), xb2Var.e(ml.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<lb2> getComponents() {
        kb2 kb2VarB = lb2.b(x5.class);
        kb2VarB.a = LIBRARY_NAME;
        kb2VarB.a(xw3.c(Context.class));
        kb2VarB.a(xw3.a(ml.class));
        kb2VarB.f = new l81(5);
        return Arrays.asList(kb2VarB.b(), z7f.B(LIBRARY_NAME, "21.1.1"));
    }
}
